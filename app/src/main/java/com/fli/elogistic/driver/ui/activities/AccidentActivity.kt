package com.fli.elogistic.driver.ui.activities

import android.Manifest
import android.app.AlertDialog
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.text.Editable
import android.text.TextWatcher
import android.util.Base64
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.app.ActivityCompat
import androidx.core.content.FileProvider
import androidx.core.view.get
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.adapter.ImageAdapter
import com.fli.elogistic.driver.constants.*
import com.fli.elogistic.driver.databinding.ActivityAccidentBinding
import com.fli.elogistic.driver.models.shipment.ReasonAllModel
import com.fli.elogistic.driver.viewmodel.ReasonAllViewModel
import com.fli.elogistic.driver.viewmodel.UploadAccidentViewModel
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import dmax.dialog.SpotsDialog
import id.zelory.compressor.Compressor
import kotlinx.coroutines.launch
import timber.log.Timber
import java.io.*


@Suppress("BlockingMethodInNonBlockingContext")
class AccidentActivity : BaseActivity() {
    lateinit var binding: ActivityAccidentBinding
    lateinit var loadingDialog: AlertDialog
    lateinit var imageBarangBuktiAdapter: ImageAdapter
    lateinit var fotoManager: LinearLayoutManager
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private val reasonAllViewModel: ReasonAllViewModel by viewModels()
    private val uploadAccidentViewModel: UploadAccidentViewModel by viewModels()
    private var listReasonAllModel: ArrayList<ReasonAllModel> = ArrayList()
    private val LIST_NAME_BARANG_BUKTI = "Barang Bukti"
    private val OPERATION_CAPTURE_PHOTO_BARANG_BUKTI = 21
    private var listImageBarangBukti: ArrayList<Any> = ArrayList()
    private var listImageBarangBuktiBase64: ArrayList<String> = ArrayList()
    private var mUri: Uri? = null
    private lateinit var mPath: String
    private var reason: String? = null
    private var needConfirm = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccidentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        buildLoadingDialog()
        getData()

        imageBarangBuktiAdapter = ImageAdapter(ArrayList(), LIST_NAME_BARANG_BUKTI)
        fotoManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        binding.rvBarangBukti.adapter = imageBarangBuktiAdapter
        binding.rvBarangBukti.layoutManager = fotoManager
        binding.btnBack.setOnClickListener {
            onBackPressed()
        }

        binding.cameraBigBarangBukti.setOnClickListener {
            takePicture()
        }
        binding.cameraSmallBarangBukti.setOnClickListener {
            takePicture()
        }
        binding.btnKirim.setOnClickListener {
            sendAccidentInfo()
        }
    }

    private fun takePicture() {
        if (listImageBarangBukti.size == MAX_IMAGE_SURAT_JALAN_DOKUMENTASI) {
            Toast.makeText(
                this,
                "Jumlah maksimal photo terpenuhi",
                Toast.LENGTH_SHORT
            ).show()
        } else {
            captureImage()
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

    private fun captureImage() {
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
                    startActivityForResult(takePictureIntent, OPERATION_CAPTURE_PHOTO_BARANG_BUKTI)
                }
            }
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK) {
            val originalFile = File(mPath)
            val oriSize: Int = java.lang.String.valueOf(originalFile.length() / 1024).toInt()
            var compressedSize: Int
            lifecycleScope.launch {
                val compressedImageFile =
                    Compressor.compress(this@AccidentActivity, originalFile)
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
                    this@AccidentActivity,
                    "Original : $oriSize KB, Compressed: $compressedSize KB",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun convertImagetoBase64(compressedImageFile: File): Any {
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

    fun deleteImage(item: Any?) {
        val position: Int = listImageBarangBukti.indexOf(item)
        listImageBarangBukti.removeAt(position)
        listImageBarangBuktiBase64.removeAt(position)
        if (listImageBarangBukti.size == 0) {
            binding.cameraSmallBarangBukti.visibility = View.GONE
            binding.cameraBigBarangBukti.visibility = View.VISIBLE
            binding.rvBarangBukti.visibility = View.GONE
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

    private fun getData() {
        loadingDialog.show()
        reasonAllViewModel.setGetReasonAccident()
        reasonAllViewModel.getReasonAccident().observe(this, {
            handleResponse(it, {
                loadingDialog.cancel()
                it.response?.data?.let { data ->
                    listReasonAllModel = data.reasonAllModels
                    val reasonRadio: ArrayList<RadioButton> = ArrayList()
                    for (reasonAllModel: ReasonAllModel in listReasonAllModel) {
                        val radio = RadioButton(this)
                        radio.layoutParams = RelativeLayout.LayoutParams(
                            ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT
                        )
                        radio.text = reasonAllModel.reason
                        radio.id = reasonRadio.size
                        reasonRadio.add(radio)
                    }
                    val radioGroup = RadioGroup(this)
                    val params = RelativeLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                    )
                    params.setMargins(16, 8, 16, 0)
                    radioGroup.layoutParams = params
                    val radioLainnya = RadioButton(this)
                    radioLainnya.layoutParams = RelativeLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                    )
                    radioLainnya.text = getString(R.string.lainnya)
                    radioLainnya.id = reasonRadio.size
                    reasonRadio.add(radioLainnya)

                    for (x in reasonRadio) {
                        radioGroup.addView(x)
                    }
                    binding.listItem.addView(radioGroup)

                    radioGroup.setOnCheckedChangeListener { group, checkedId ->
                        val radio = group[checkedId] as RadioButton
                        if (radio.text.toString() == "Lainnya") {
                            reason = null
                            needConfirm = false
                            binding.etLainnya.visibility = View.VISIBLE
                            binding.etLainnya.addTextChangedListener(object : TextWatcher {

                                override fun afterTextChanged(s: Editable) {}

                                override fun beforeTextChanged(
                                    s: CharSequence, start: Int,
                                    count: Int, after: Int
                                ) {
                                }

                                override fun onTextChanged(
                                    s: CharSequence, start: Int,
                                    before: Int, count: Int
                                ) {
                                    reason = if (s.isNotEmpty()) {
                                        s.toString()
                                    } else {
                                        null
                                    }
                                }
                            })
                        } else {
                            reason = radio.text.toString()
                            needConfirm = checkNeedConfirm(reason!!)
                            binding.etLainnya.visibility = View.GONE
                        }
                    }
                }
            }, {
                loadingDialog.cancel()
                createOkSnackbar(
                    binding.layout, it.message
                        ?: getString(R.string.gagal_mendapatkan_data), this
                )
            })
        })
    }

    private fun checkNeedConfirm(reason: String): Boolean {
        var needConfirm = false
        for (x in listReasonAllModel) {
            if (x.reason == reason) needConfirm = true
        }
        return needConfirm
    }

    private fun sendAccidentInfo() {
        if (submissionValid()) {
            fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
            if (ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                Timber.d("Permission is not granted")
            } else {
                var latitude: Double
                var longitude: Double

                fusedLocationClient.lastLocation
                    .addOnSuccessListener { location ->
                        latitude = location.latitude
                        longitude = location.longitude
                        listReasonAllModel
                        uploadAccidentViewModel.setPostAccident(
                            reason!!, needConfirm, null, latitude, longitude, null,
                            listImageBarangBuktiBase64
                        )
                        uploadAccidentViewModel.getPostAccidentResult().observe(this, {
                            handleResponse(it, {
                                loadingDialog.cancel()
                                it.response?.data?.let { _ ->
                                    Toast.makeText(
                                        this@AccidentActivity,
                                        "Berhasil",
                                        Toast.LENGTH_SHORT
                                    ).show()
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
    }

    private fun submissionValid(): Boolean {
        var isValid = true
        if (reason == null) {
            isValid = false
            createOkSnackbar(
                binding.layout, "Silahkan pilih alasan masalah terlebih dahulu", this
            )
        } else if (listImageBarangBukti.size == 0) {
            createOkSnackbar(
                binding.layout, "Silahkan ambil foto bukti masalah terlebih dahulu", this
            )
            isValid = false
        }
        return isValid
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}