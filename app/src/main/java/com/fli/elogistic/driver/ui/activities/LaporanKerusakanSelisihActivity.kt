package com.fli.elogistic.driver.ui.activities

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.os.StrictMode
import android.provider.MediaStore
import android.util.Base64
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.core.content.FileProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.adapter.ImageAdapter
import com.fli.elogistic.driver.constants.CARGO_BASP
import com.fli.elogistic.driver.constants.IS_SUSPENDED
import com.fli.elogistic.driver.constants.MAX_IMAGE_SURAT_JALAN_DOKUMENTASI
import com.fli.elogistic.driver.databinding.ActivityLaporanKerusakanSelisihBinding
import com.fli.elogistic.driver.models.LocationAddressModel
import com.fli.elogistic.driver.models.shipment.DetailPerLocationModel
import com.fli.elogistic.driver.models.shipment.ReasonAllModel
import com.fli.elogistic.driver.models.shipment.ShipmentModel
import com.fli.elogistic.driver.util.isEmpty
import com.fli.elogistic.driver.viewmodel.ReasonAllViewModel
import com.fli.elogistic.driver.viewmodel.UploadBASPViewModel
import dmax.dialog.SpotsDialog
import id.zelory.compressor.Compressor
import kotlinx.coroutines.launch
import java.io.*
import java.util.*
import kotlin.collections.ArrayList

@Suppress("BlockingMethodInNonBlockingContext")
class LaporanKerusakanSelisihActivity : BaseActivity() {
    private val uploadBASPViewModel: UploadBASPViewModel by viewModels()
    private val reasonAllViewModel: ReasonAllViewModel by viewModels()
    lateinit var binding : ActivityLaporanKerusakanSelisihBinding
    lateinit var imageBarangBuktiAdapter : ImageAdapter
    lateinit var imageDokumentasiAdapter : ImageAdapter
    lateinit var fotoManager : LinearLayoutManager
    lateinit var dokumentasiManager : LinearLayoutManager
    lateinit var loadingDialog: AlertDialog
    lateinit var detailPerLocationModel: DetailPerLocationModel
    lateinit var orderModel: ShipmentModel
    lateinit var model: LocationAddressModel
    lateinit var mPath: String
    private var listImageBarangBukti: ArrayList<Any> = ArrayList()
    private var listImageBarangBuktiBase64: ArrayList<String> = ArrayList()
    private var listImageDokumentasi: ArrayList<Any> = ArrayList()
    private var listImageDokumentasiBase64: ArrayList<String> = ArrayList()
    private var listReasonAllModel: ArrayList<ReasonAllModel> = ArrayList()
    private var mUri: Uri? = null
    private var willBeSuspended = false

    private val OPERATION_CAPTURE_PHOTO_BARANG_BUKTI = 11
    private val OPERATION_CAPTURE_PHOTO_DOKUMENTASI = 22
    private val LIST_NAME_BARANG_BUKTI = "Barang Bukti"
    private val LIST_NAME_DOKUMENTASI = "Dokumentasi"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLaporanKerusakanSelisihBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val builder = StrictMode.VmPolicy.Builder()
        StrictMode.setVmPolicy(builder.build())
        buildLoadingDialog()

        detailPerLocationModel = intent.getSerializableExtra("DetailPerLocationModel") as DetailPerLocationModel
        orderModel = intent.getSerializableExtra("OrderModel") as ShipmentModel
        model = intent.getSerializableExtra("Model") as LocationAddressModel

        binding.txtNoKargo.text = orderModel.cargoTitle
        binding.txtNoPesanan.text = orderModel.shipmentTitle
        "${detailPerLocationModel.categoryName} - ${detailPerLocationModel.subCategoryName}".also { binding.tvCategory.text = it }

        getListReason()

        imageBarangBuktiAdapter = ImageAdapter(ArrayList(), LIST_NAME_BARANG_BUKTI)
        imageDokumentasiAdapter = ImageAdapter(ArrayList(), LIST_NAME_DOKUMENTASI)
        fotoManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        dokumentasiManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        binding.rvBarangBukti.adapter = imageBarangBuktiAdapter
        binding.rvBarangBukti.layoutManager = fotoManager
        binding.rvDokumentasi.adapter = imageDokumentasiAdapter
        binding.rvDokumentasi.layoutManager = dokumentasiManager
        binding.btnBack.setOnClickListener {
            onBackPressed()
        }

        binding.cameraBigBarangBukti.setOnClickListener {
            takePicture(OPERATION_CAPTURE_PHOTO_BARANG_BUKTI)
        }
        binding.cameraSmallBarangBukti.setOnClickListener {
            takePicture(OPERATION_CAPTURE_PHOTO_BARANG_BUKTI)
        }
        binding.cameraBigDokumentasi.setOnClickListener {
            takePicture(OPERATION_CAPTURE_PHOTO_DOKUMENTASI)
        }
        binding.cameraSmallDokumentasi.setOnClickListener {
            takePicture(OPERATION_CAPTURE_PHOTO_DOKUMENTASI)
        }

        binding.btnKirim.setOnClickListener {
            if(submissionValid()){
                uploadBASPViewModel.setPostBasp(
                    detailPerLocationModel.shipmentsId,
                    detailPerLocationModel.shipmentsDetailId,
                    detailPerLocationModel.locationId,
                    binding.spinner.selectedItem.toString(),
                    getIsNeedConfirm(binding.spinner.selectedItem.toString()),
                    "BASP",
                    binding.etAlasanKetBasp.text.toString(),
                    binding.etKetBasp.text.toString(),
                    detailPerLocationModel.picName!!,
                    listImageBarangBuktiBase64,
                    listImageDokumentasiBase64,
                    getTimeOffset()
                )

                uploadBASPViewModel.getPostBASPResult().observe(this, {
                    handleResponse(it, {
                        loadingDialog.cancel()
                        it.response?.data?.let { _ ->
                            Toast.makeText(
                                this@LaporanKerusakanSelisihActivity,
                                "Berhasil",
                                Toast.LENGTH_SHORT
                            ).show()
                            if (willBeSuspended){
                                sp.edit().putBoolean(IS_SUSPENDED, true).apply()
                                sp.edit().putString(CARGO_BASP, orderModel.shipmentTitle).apply()
                            }
                            onBackPressed()
                        }
                    }, {
                        loadingDialog.cancel()
                        createOkSnackbar(
                            binding.layout, it.message
                                ?: getString(R.string.gagal_memuat_naik_data), this
                        )
                    })
                })
            }
        }
    }

    private fun submissionValid(): Boolean {
        var isValid = false
        if (binding.spinner.selectedItemPosition == 0){
            createOkSnackbar(
                binding.layout, "Silahkan pilih alasan BASP terlebih dahulu", this
            )
        }else{
            if (binding.etAlasanKetBasp.isEmpty()){
                createOkSnackbar(
                    binding.layout, "Silahkan isi keterangan alasan BASP", this
                )
            }else {
                if (binding.rvDokumentasi.visibility == View.GONE ||
                        binding.rvBarangBukti.visibility == View.GONE){
                    createOkSnackbar(
                        binding.layout, "Silahkan ambil foto Bukti / Dokumentasi", this
                    )
                }else {
                    isValid = true
                }
            }
        }

        return isValid
    }

    private fun getTimeOffset(): Long {
        val mCalendar: Calendar = GregorianCalendar()
        val mTimeZone: TimeZone = mCalendar.timeZone
        val mGMTOffset: Long = mTimeZone.rawOffset.toLong()
        return java.util.concurrent.TimeUnit.HOURS.convert(
            mGMTOffset,
            java.util.concurrent.TimeUnit.MILLISECONDS
        )
    }

    private fun getIsNeedConfirm(reason: String): Boolean {
        var isNeedConfirm = false
        for (reasonAllModel : ReasonAllModel in listReasonAllModel){
            if (reason == reasonAllModel.reason){
                isNeedConfirm = reasonAllModel.needConfirm
                break
            }
        }
        willBeSuspended = isNeedConfirm
        return isNeedConfirm
    }

    private fun getListReason() {
        loadingDialog.show()
        reasonAllViewModel.setGetReasonBASP()
        reasonAllViewModel.getReasonBASP().observe(this, {
            handleResponse(it, {
                loadingDialog.cancel()
                it.response?.data?.let { data ->
                    listReasonAllModel = data.reasonAllModels
                    val reasonNames : ArrayList<String> = ArrayList()
                    reasonNames.add("Alasan BASP")
                    for (reasonAllModel : ReasonAllModel in listReasonAllModel){
                        reasonNames.add(reasonAllModel.reason)
                    }
                    populateSpinner(reasonNames.toTypedArray())
                }
            }, {
                loadingDialog.cancel()
                populateSpinner(resources.getStringArray(R.array.Alasan))
                createOkSnackbar(
                    binding.layout, it.message
                        ?: getString(R.string.gagal_mendapatkan_data), this
                )
            })
        })
    }

    private fun populateSpinner(reasonNames: Array<String>) {
        val adapter: ArrayAdapter<String>
        adapter = object : ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            reasonNames
        ) {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun getDropDownView(
                position: Int,
                convertView: View?,
                parent: ViewGroup
            ): View {
                val view: TextView = super.getDropDownView(
                    position,
                    convertView,
                    parent
                ) as TextView

                // make hint item color gray
                if (position == 0) {
                    view.setTextColor(getColor(R.color.textGrey82))
                }

                return view
            }

            override fun isEnabled(position: Int): Boolean {
                // disable first item
                // first item is display as hint
                return position != 0
            }
        }
        binding.spinner.adapter = adapter
        binding.spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                // by default spinner initial selected item is first item
                if (position == 0) (parent.getChildAt(0) as TextView).setTextColor(getColor(R.color.textGrey82))
                else parent.getItemAtPosition(position).toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // another interface callback
            }
        }
    }

    private fun takePicture(actionCode: Int) {
        if (actionCode == OPERATION_CAPTURE_PHOTO_BARANG_BUKTI) {
            if (listImageBarangBukti.size == MAX_IMAGE_SURAT_JALAN_DOKUMENTASI) {
                Toast.makeText(
                    this,
                    "Jumlah maksimal photo terpenuhi",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                captureImage(actionCode)
            }
        } else if (actionCode == OPERATION_CAPTURE_PHOTO_DOKUMENTASI) {
            if (listImageDokumentasi.size == MAX_IMAGE_SURAT_JALAN_DOKUMENTASI) {
                Toast.makeText(
                    this,
                    "Jumlah maksimal photo terpenuhi",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                captureImage(actionCode)
            }
        }
    }

    private fun buildLoadingDialog() {
        loadingDialog = SpotsDialog.Builder()
            .setContext(this)
            .setMessage(R.string.loading)
            .setCancelable(false).build()
        loadingDialog.setCancelable(false)
        loadingDialog.hide()
    }

    private fun createImageFile() : File{
        val root: File? = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        return File.createTempFile(
            "My_Captured_Photo",
            ".jpg", /* suffix */
            root /* directory */
        ).apply {
            mPath = absolutePath
        }
    }

    private fun captureImage(actionCode: Int) {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            takePictureIntent.resolveActivity(packageManager)?.also {
                val photoFile: File? = try {
                    createImageFile()
                } catch (ex: IOException) {
                    null
                }
                photoFile?.also {
                    val photoURI: Uri = FileProvider.getUriForFile(
                        this,
                        "com.fli.elogistic.driver.provider",
                        it
                    )
                    takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI)
                    when (actionCode) {
                        OPERATION_CAPTURE_PHOTO_BARANG_BUKTI ->startActivityForResult(
                            takePictureIntent,
                            OPERATION_CAPTURE_PHOTO_BARANG_BUKTI
                        )
                        OPERATION_CAPTURE_PHOTO_DOKUMENTASI -> startActivityForResult(
                            takePictureIntent,
                            OPERATION_CAPTURE_PHOTO_DOKUMENTASI
                        )
                    }
                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == OPERATION_CAPTURE_PHOTO_BARANG_BUKTI) {
            val originalFile = File(mPath)
            val oriSize: Int = java.lang.String.valueOf(originalFile.length() / 1024).toInt()
            var compressedSize: Int
            lifecycleScope.launch {
                val compressedImageFile =
                    Compressor.compress(this@LaporanKerusakanSelisihActivity, originalFile)
                val compressedImageBase64 = convertImagetoBase64(compressedImageFile)
                compressedSize =
                    java.lang.String.valueOf(compressedImageFile.length() / 1024).toInt()
                val bitmap = BitmapFactory.decodeFile(
                    compressedImageFile.path
                )
                val fullStringDocument = "data:image/jpg;base64,$compressedImageBase64"

                val capturedImage = File(externalCacheDir, "My_Compressed_Photo.jpg")
                if (capturedImage.exists()) {
                    capturedImage.delete()
                }

                val out = FileOutputStream(capturedImage)
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, out)
                out.flush()
                out.close()

                listImageBarangBukti.add(bitmap)
                listImageBarangBuktiBase64.add(fullStringDocument)
                imageBarangBuktiAdapter.addImage(bitmap)
                binding.rvBarangBukti.visibility = View.VISIBLE
                binding.cameraBigBarangBukti.visibility = View.GONE
                binding.cameraSmallBarangBukti.visibility = View.VISIBLE
                Toast.makeText(
                    this@LaporanKerusakanSelisihActivity,
                    "Original : $oriSize KB, Compressed: $compressedSize KB",
                    Toast.LENGTH_SHORT
                ).show()
            }
        } else if (resultCode == Activity.RESULT_OK && requestCode == OPERATION_CAPTURE_PHOTO_DOKUMENTASI) {
            val originalFile = File(mPath)
            val oriSize: Int = java.lang.String.valueOf(originalFile.length() / 1024).toInt()
            var compressedSize: Int
            lifecycleScope.launch {
                val compressedImageFile =
                    Compressor.compress(this@LaporanKerusakanSelisihActivity, originalFile)
                val compressedImageBase64 = convertImagetoBase64(compressedImageFile)
                compressedSize =
                    java.lang.String.valueOf(compressedImageFile.length() / 1024).toInt()
                val bitmap = BitmapFactory.decodeFile(
                    compressedImageFile.path
                )
                val fullStringDocument = "data:image/jpg;base64,$compressedImageBase64"

                val capturedImage = File(externalCacheDir, "My_Compressed_Photo.jpg")
                if (capturedImage.exists()) {
                    capturedImage.delete()
                }

                val out = FileOutputStream(capturedImage)
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, out)
                out.flush()
                out.close()

                listImageDokumentasi.add(bitmap)
                listImageDokumentasiBase64.add(fullStringDocument)
                imageDokumentasiAdapter.addImage(bitmap)
                binding.rvDokumentasi.visibility = View.VISIBLE
                binding.cameraBigDokumentasi.visibility = View.GONE
                binding.cameraSmallDokumentasi.visibility = View.VISIBLE
                Toast.makeText(
                    this@LaporanKerusakanSelisihActivity,
                    "Original : $oriSize KB, Compressed: $compressedSize KB",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    fun deleteImage(item: Any?, listName: String){
        val position : Int
        if (listName == LIST_NAME_BARANG_BUKTI){
            position = listImageBarangBukti.indexOf(item)
            listImageBarangBukti.removeAt(position)
            listImageBarangBuktiBase64.removeAt(position)
            if (listImageBarangBukti.size == 0){
                binding.cameraSmallBarangBukti.visibility = View.GONE
                binding.cameraBigBarangBukti.visibility = View.VISIBLE
                binding.rvBarangBukti.visibility = View.GONE
            }
        }else if (listName == LIST_NAME_DOKUMENTASI){
            position = listImageDokumentasi.indexOf(item)
            listImageDokumentasi.removeAt(position)
            listImageDokumentasiBase64.removeAt(position)
            binding.cameraSmallDokumentasi.visibility = View.GONE
            binding.cameraBigDokumentasi.visibility = View.VISIBLE
            binding.rvDokumentasi.visibility = View.GONE
        }
    }

    private fun convertImagetoBase64(compressedImageFile: File): String {
        val inputStream: InputStream =
            FileInputStream(compressedImageFile) // You can get an inputStream using any I/O API

        val bytes: ByteArray
        val buffer = ByteArray(8192)
        var bytesRead: Int
        val output = ByteArrayOutputStream()

        try {
            while (inputStream.read(buffer).also { bytesRead = it } != -1) {
                output.write(buffer, 0, bytesRead)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }

        bytes = output.toByteArray()

        return Base64.encodeToString(bytes, Base64.NO_WRAP)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, LokasiPenjemputanActivity::class.java)
        intent.putExtra("DetailPerLocationModel", detailPerLocationModel)
        intent.putExtra("OrderModel", orderModel)
        intent.putExtra("Model", model)
        intent.putExtra("isPenjemputan", false)
        startActivity(intent)
        finish()
    }
}