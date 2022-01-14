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
import android.text.InputType
import android.util.Base64
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.core.content.FileProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.adapter.ImageAdapter
import com.fli.elogistic.driver.constants.MAX_IMAGE_BIAYA_TAMBAHAN
import com.fli.elogistic.driver.constants.MAX_IMAGE_POD
import com.fli.elogistic.driver.constants.UPLOAD_BIAYA_TAMBAHAN_CODE
import com.fli.elogistic.driver.constants.UPLOAD_POD_CODE
import com.fli.elogistic.driver.databinding.ActivityUploadPODBinding
import com.fli.elogistic.driver.models.biayaDanTambahanOngkir.AdditionalCostModel
import com.fli.elogistic.driver.models.biayaDanTambahanOngkir.AdditionalCostPUTModel
import com.fli.elogistic.driver.models.biayaDanTambahanOngkir.BiayaOngkirDocumentModel
import com.fli.elogistic.driver.viewmodel.AdditionalShippingCostViewModel
import com.fli.elogistic.driver.viewmodel.UploadPODViewModel
import dmax.dialog.SpotsDialog
import id.zelory.compressor.Compressor
import kotlinx.coroutines.*
import java.io.*


@Suppress("BlockingMethodInNonBlockingContext")
class UploadPODActivity : BaseActivity() {
    lateinit var binding: ActivityUploadPODBinding
    lateinit var loadingDialog: AlertDialog
    lateinit var mPath: String
    private var tipeDokumen = ""
    private var jenisBiaya = ""
    private val uploadPODViewModel: UploadPODViewModel by viewModels()
    private val additionalShippingCostViewModel: AdditionalShippingCostViewModel by viewModels()

    private var maxImage = 1
    private var listImage: ArrayList<Any> = ArrayList()
    private var listImageFileBase64: ArrayList<String> = ArrayList()
    private var mUri: Uri? = null
    private val OPERATION_CAPTURE_PHOTO = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUploadPODBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val builder = StrictMode.VmPolicy.Builder()
        StrictMode.setVmPolicy(builder.build())
        buildLoadingDialog()

        determineLayout(intent.getBooleanExtra("isUploadPOD", true))
        binding.btnBatal.setOnClickListener {
            onBackPressed()
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

    private fun uploadDocumentPOD(tipeDokumen: String, namaDokumen: String) {
        loadingDialog.show()
        uploadPODViewModel.setPostDocumentPOD(namaDokumen, tipeDokumen, listImageFileBase64)
        uploadPODViewModel.getPostDocumentPODResult().observe(this, {
            handleResponse(it, {
                loadingDialog.cancel()
                it.response?.data?.let { _ ->
                    val intent = Intent()
                    intent.putExtra("simpan", true)
                    intent.putExtra("tipeDokumen", tipeDokumen)
                    intent.putExtra("namaDokumen", binding.etNamaDokumen.text.toString())
                    setResult(UPLOAD_POD_CODE, intent)
                    finish()
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


    private fun determineLayout(isUploadPOD: Boolean) {
        initSpinner(isUploadPOD)
        binding.btnAmbilGambar.setOnClickListener {
            takePicture()
        }
        if (isUploadPOD) {
            maxImage = MAX_IMAGE_POD

            binding.etNamaDokumen.visibility = View.GONE
            binding.namaDokumenTitle.visibility = View.GONE
            binding.spinnerLocationTitle.visibility = View.VISIBLE
            binding.lokasiDropdown.visibility = View.VISIBLE

            binding.spinnerTitle.text = resources.getString(R.string.tipe_dokumen)
            binding.title.text = resources.getString(R.string.upload_dokumen_pod)
            binding.catatanTitle.visibility = View.GONE
            binding.etCatatan.visibility = View.GONE
            binding.etNamaDokumen.inputType = InputType.TYPE_CLASS_TEXT
            binding.etNamaDokumen.hint = getString(R.string.max_character)
            binding.btnSimpan.setOnClickListener {
                if (tipeDokumen == "") {
                    createOkSnackbar(
                        binding.layout,
                        getString(R.string.silahkan_pilih_tipe_dokumen),
                        this
                    )
                } else {
                    if (binding.etNamaDokumen.text.toString() == "") {
                        createOkSnackbar(
                            binding.layout,
                            getString(R.string.silahkan_isi_nama_dokumen),
                            this
                        )
                    } else {
                        if (listImage.size == 0) {
                            createOkSnackbar(
                                binding.layout,
                                getString(R.string.silahkan_ambil_gambar),
                                this
                            )
                        } else {
                            val docType: String = getDocType(tipeDokumen)
                            uploadDocumentPOD(docType, binding.etNamaDokumen.text.toString())

                        }
                    }
                }
            }
        } else {
            maxImage = MAX_IMAGE_BIAYA_TAMBAHAN
            binding.title.text = resources.getString(R.string.biaya_tambahan)
            binding.spinnerTitle.text = getString(R.string.jenis_biaya_tambahan)
            binding.catatanTitle.visibility = View.VISIBLE
            binding.etCatatan.visibility = View.VISIBLE
            binding.namaDokumenTitle.text = getString(R.string.biaya_tambahan)
            binding.etNamaDokumen.hint = getString(R.string.jumlah_biaya)
            binding.etNamaDokumen.inputType = InputType.TYPE_CLASS_NUMBER
            binding.btnSimpan.setOnClickListener {
                if (jenisBiaya == "") {
                    createOkSnackbar(
                        binding.layout,
                        getString(R.string.silahkan_pilih_jenis_biaya),
                        this
                    )
                } else {
                    if (binding.etNamaDokumen.text.toString() == "") {
                        createOkSnackbar(
                            binding.layout,
                            getString(R.string.silahkan_isi_jumlah_biaya),
                            this
                        )
                    } else {
                        submitAdditionalCost()

                    }
                }
            }
        }
    }

    private fun submitAdditionalCost() {
        loadingDialog.show()
        val listDocument : ArrayList<BiayaOngkirDocumentModel> = ArrayList()
        for (image in listImageFileBase64){
            listDocument.add(BiayaOngkirDocumentModel(image))
        }
        val additionalShippingCost = AdditionalCostModel(
            jenisBiaya, binding.etNamaDokumen.text.toString().toDouble(), binding.etCatatan.text.toString(),
            listDocument
        )
        val list : ArrayList<AdditionalCostModel> = ArrayList()
        list.add(additionalShippingCost)
        val model = AdditionalCostPUTModel(list)
        additionalShippingCostViewModel.setPutAdditionalShippingCost(model)
        additionalShippingCostViewModel.getPutAdditionalShippingCost().observe(this, {
            handleResponse(it, {
                loadingDialog.cancel()
                it.response?.data?.let { _ ->
                    setResult(UPLOAD_BIAYA_TAMBAHAN_CODE, null)
                    finish()
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

    private fun getDocType(tipeDokumen: String): String {
        return when (tipeDokumen) {
            "Surat Jalan" -> "FOTO_SURAT_JALAN"
            "Surat Serah Terima" -> "FOTO_SURAT_SERAH_TERIMA"
            "Surat Perintah Kiriman" -> "SURAT_PERINTAH_KIRIMAN"
            "Foto Muat Barang" -> "FOTO_MUAT_BARANG"
            "Foto Bongkar Barang" -> "FOTO_BONGKAR_BARANG"
            "Foto BASP" -> "FOTO_BASP"
            "Foto Bukti BASP" -> "FOTO_BUKTI_BASP"
            "Foto BAST" ->"FOTO_BAST"
            else -> ""
        }
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

    private fun takePicture() {
        if (listImage.size == maxImage) {
            createOkSnackbar(
                binding.layout,
                getString(R.string.jumlah_maksimal_photo_terpenuhi),
                this
            )
        } else {
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
                        startActivityForResult(takePictureIntent, OPERATION_CAPTURE_PHOTO)
                    }
                }
            }
        }
    }

    private fun initSpinner(isUploadPOD: Boolean) {
        val adapter: ArrayAdapter<String>
        if (isUploadPOD) {
            adapter = object : ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                resources.getStringArray(R.array.TipeDokumen)
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
            binding.tipeDokumenSpinner.adapter = adapter

            binding.tipeDokumenSpinner.onItemSelectedListener = object :
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
                    else tipeDokumen = parent.getItemAtPosition(position).toString()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    // another interface callback
                }
            }
        } else {
            val listSpinner = getJenisBiaya()
            adapter = object : ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                listSpinner
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
            binding.tipeDokumenSpinner.adapter = adapter

            binding.tipeDokumenSpinner.onItemSelectedListener = object :
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
                    else jenisBiaya = parent.getItemAtPosition(position).toString()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    // another interface callback
                }
            }
        }
    }

    private fun getJenisBiaya(): Array<out String> {
        return resources.getStringArray(R.array.JenisBiaya)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == OPERATION_CAPTURE_PHOTO) {
            val originalFile = File(mPath)
            val oriSize: Int = java.lang.String.valueOf(originalFile.length() / 1024).toInt()
            var compressedSize : Int
            lifecycleScope.launch {
                val compressedImageFile = Compressor.compress(this@UploadPODActivity, originalFile)
                val compressedImageBase64 = convertImagetoBase64(compressedImageFile)
                
                val fullStringDocument = "data:image/jpg;base64,$compressedImageBase64"
                compressedSize = java.lang.String.valueOf(compressedImageFile.length() / 1024).toInt()
                val bitmap = BitmapFactory.decodeFile(
                    compressedImageFile.path
                )

                val capturedImage = File(externalCacheDir, "My_Compressed_Photo.jpg")
                if (capturedImage.exists()) {
                    capturedImage.delete()
                }

                val out = FileOutputStream(capturedImage)
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, out)
                out.flush()
                out.close()

                listImage.add(bitmap)
                listImageFileBase64.add(fullStringDocument)


                val adapter = ImageAdapter(listImage, "")
                val manager = LinearLayoutManager(
                    this@UploadPODActivity,
                    LinearLayoutManager.HORIZONTAL,
                    false
                )
                binding.rvPhoto.adapter = adapter
                binding.rvPhoto.layoutManager = manager
                Toast.makeText(
                    this@UploadPODActivity,
                    "Original : $oriSize KB, Compressed: $compressedSize KB",
                    Toast.LENGTH_SHORT
                ).show()
            }

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
//        super.onBackPressed()
        val intent = Intent()
        intent.putExtra("simpan", false)
        intent.putExtra("tipeDokumen", tipeDokumen)
        intent.putExtra("namaDokumen", binding.etNamaDokumen.text.toString())
        setResult(UPLOAD_POD_CODE, intent)
        finish()
    }

//    fun viewFullscreen(source: Bitmap?){
//        val intent = Intent(this, PhotoViewFullscreenActivity::class.java)
//        intent.putExtra("source", source)
//        startActivity(intent)
//    }
}