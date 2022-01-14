package com.fli.elogistic.driver.ui.activities

import android.app.Activity
import android.app.ActivityManager
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.StrictMode
import android.os.StrictMode.VmPolicy
import android.provider.MediaStore
import android.util.Base64
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.content.FileProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.adapter.ShipmentDetailPerLocationAdapter
import com.fli.elogistic.driver.constants.*
import com.fli.elogistic.driver.databinding.ActivityLokasiPenjemputanBinding
import com.fli.elogistic.driver.models.LocationAddressModel
import com.fli.elogistic.driver.models.shipment.DetailPerLocationModel
import com.fli.elogistic.driver.models.shipment.DetailPerLocationWithPictureModel
import com.fli.elogistic.driver.models.shipment.ShipmentModel
import com.fli.elogistic.driver.models.shipment.UpdateStatusRequest
import com.fli.elogistic.driver.viewmodel.DetailPerLocationViewModel
import com.fli.elogistic.driver.viewmodel.UpdateStatusViewModel
import com.fli.elogistic.driver.viewmodel.UploadPODViewModel
import com.google.android.gms.location.FusedLocationProviderClient
import dmax.dialog.SpotsDialog
import id.zelory.compressor.Compressor
import kotlinx.coroutines.launch
import java.io.*
import java.util.*
import kotlin.collections.ArrayList


@Suppress("BlockingMethodInNonBlockingContext")
class LokasiPenjemputanActivity : BaseActivity() {
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    lateinit var binding: ActivityLokasiPenjemputanBinding
    lateinit var model: LocationAddressModel
    lateinit var detailPerLocationModel: DetailPerLocationModel
    lateinit var loadingDialog: AlertDialog
    lateinit var shipmentDetailPerLocationAdapter: ShipmentDetailPerLocationAdapter
    private val detailPerLocationViewModel: DetailPerLocationViewModel by viewModels()
    private val suratJalanUpload: UploadPODViewModel by viewModels()
    private val dokumentasiUpload: UploadPODViewModel by viewModels()
    private val perintahPengirimanUpload: UploadPODViewModel by viewModels()
    private val updateStatusViewModel: UpdateStatusViewModel by viewModels()

    private var isUploadingSuratJalan = false
    private var isUploadingDokumentasi = false
    private var isUploadingPerintahPengiriman = false
    private var isAllowed = false
    private var counterForPic = 0
    private var counterForBAST = 0
    private var sizeShipment = 0

    private var isPenjemputan = true
    private var showPhoto = false
    lateinit var orderModel: ShipmentModel
    lateinit var mPath: String
    private var mUri: Uri? = null
    private val OPERATION_CAPTURE_PHOTO_SURAT_JALAN = 1
    private val OPERATION_CAPTURE_PHOTO_DOKUMENTASI = 2
    private val OPERATION_CAPTURE_PHOTO_PERINTAH_PENGIRIMAN = 3
    private var CURRENT_ITEM_POSITION = 0
    private var listImageSuratJalan: ArrayList<Any> = ArrayList()
    private var listImageSuratJalanBase64: ArrayList<String> = ArrayList()
    private var listImageDokumentasi: ArrayList<Any> = ArrayList()
    private var listImageDokumentasiBase64: ArrayList<String> = ArrayList()
    private var listImagePerintahPengiriman: ArrayList<Any> = ArrayList()
    private var listImagePerintahPengirimanBase64: ArrayList<String> = ArrayList()

    private val LIST_NAME_SURAT_JALAN = "Surat Jalan"
    private val LIST_NAME_DOKUMENTASI = "Dokumentasi"
    private val LIST_NAME_PERINTAH_PENGIRIMAN = "Perintah Pengiriman"

    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLokasiPenjemputanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val builder = VmPolicy.Builder()
        StrictMode.setVmPolicy(builder.build())
        buildLoadingDialog()

        model = intent.getSerializableExtra("Model") as LocationAddressModel
        orderModel = intent.getSerializableExtra("OrderModel") as ShipmentModel
        isPenjemputan = intent.getBooleanExtra("isPenjemputan", true)
        showPhoto = intent.getBooleanExtra("showPhoto", false)
        initView()
        getData()

        binding.btnDaftarBiaya.setOnClickListener {
            CURRENT_SHIPMENT_CARGO_ID = orderModel.id
            val intent = Intent(this, DaftarBiayaOngkirActivity::class.java)
            startActivity(intent)
        }
        binding.btnBiayaTambahan.setOnClickListener {
            CURRENT_SHIPMENT_CARGO_ID = orderModel.id
            val intent = Intent(this, BiayaTambahanActivity::class.java)
            startActivity(intent)
        }
        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
        binding.mapsInitial.setOnClickListener {
            goesToGoogleMaps(model.latitude, model.longitude, model.location!!)
        }

    }

    fun startPostSquence(status: String, lokasi: String, goesToBast: Boolean, updateRedis: Boolean, validate: Boolean) {
        var isUploading = false
        loadingDialog.show()
        if (validate){
            if (validateDriverPosition(model.radiusCalculation)){
                if (listImageSuratJalanBase64.size > 0) {
                    isUploading = true
                    uploadSuratJalan()
                }
                if (listImageDokumentasiBase64.size > 0) {
                    isUploading = true
                    handler.postDelayed({ uploadDokumentasi() }, 500)
                }
                if (listImagePerintahPengirimanBase64.size > 0) {
                    isUploading = true
                    handler.postDelayed({ uploadPerintahPengiriman() }, 1000)
                }

                handler.postDelayed(
                    { updateStatus(status, lokasi, isUploading, goesToBast, updateRedis, validate) },
                    1500
                )
            }else{
                loadingDialog.cancel()
                createOkSnackbar(
                    binding.layout, "Posisi terlalu jauh dari lokasi tujuan!", this
                )
            }
        }else {
            if (listImageSuratJalanBase64.size > 0) {
                isUploading = true
                uploadSuratJalan()
            }
            if (listImageDokumentasiBase64.size > 0) {
                isUploading = true
                handler.postDelayed({ uploadDokumentasi() }, 500)
            }
            if (listImagePerintahPengirimanBase64.size > 0) {
                isUploading = true
                handler.postDelayed({ uploadPerintahPengiriman() }, 1000)
            }

            handler.postDelayed(
                { updateStatus(status, lokasi, isUploading, goesToBast, updateRedis, validate) },
                1500
            )
        }
    }

    private fun uploadSuratJalan() {
        loadingDialog.setMessage("Mengirim Surat Jalan...")
        isUploadingSuratJalan = true
        val namaDokumen = "${orderModel.cargoTitle}-${model.locationId}-SuratJalan"
        suratJalanUpload.setPostDocumentPOD(
            namaDokumen,
            "FOTO_SURAT_JALAN",
            listImageSuratJalanBase64
        )
        suratJalanUpload.getPostDocumentPODResult().observe(this, {
            handleResponse(it, {
                it.response?.data?.let { _ ->
                    isUploadingSuratJalan = false
                }
            }, {
                loadingDialog.cancel()
                createOkSnackbar(
                    binding.layout, it.message
                        ?: "Gagal mengirim foto surat jalan", this
                )
            })
        })
    }

    private fun uploadDokumentasi() {
        isUploadingDokumentasi = true
        loadingDialog.setMessage("Mengirim Dokumentasi...")
        val namaDokumen = "${orderModel.cargoTitle}-${model.locationId}-Dokumentasi"
        val tipeDokumentasi = if (isPenjemputan) "FOTO_MUAT_BARANG"
        else "FOTO_BONGKAR_BARANG"
        handler.postDelayed({
            if (isUploadingSuratJalan) {
                uploadDokumentasi()
            } else {
                dokumentasiUpload.setPostDocumentPOD(
                    namaDokumen,
                    tipeDokumentasi,
                    listImageDokumentasiBase64
                )
                dokumentasiUpload.getPostDocumentPODResult().observe(this, {
                    handleResponse(it, {
                        it.response?.data?.let { _ ->
                            isUploadingDokumentasi = false
                        }
                    }, {
                        loadingDialog.cancel()
                        createOkSnackbar(
                            binding.layout, it.message
                                ?: "Gagal mengirim foto dokumentasi", this
                        )
                    })
                })
            }
        }, 500)

    }

    private fun uploadPerintahPengiriman() {
        isUploadingPerintahPengiriman = true
        loadingDialog.setMessage("Mengirim Perintah Pengiriman...")
        val namaDokumen = "${orderModel.cargoTitle}-${model.locationId}-PerintahPengiriman"

        handler.postDelayed({
            if (isUploadingDokumentasi) {
                uploadPerintahPengiriman()
            } else {
                perintahPengirimanUpload.setPostDocumentPOD(
                    namaDokumen,
                    "SURAT_PERINTAH_KIRIMAN",
                    listImagePerintahPengirimanBase64
                )
                perintahPengirimanUpload.getPostDocumentPODResult().observe(this, {
                    handleResponse(it, {
                        it.response?.data?.let { _ ->
                            isUploadingPerintahPengiriman = false
                        }
                    }, {
                        loadingDialog.cancel()
                        createOkSnackbar(
                            binding.layout, it.message
                                ?: "Gagal mengirim surat perintah pengiriman", this
                        )
                    })
                })
            }
        }, 500)


    }

    fun getMultipickSize(): Int {
        return orderModel.multiPick.size
    }

    fun getMultidropSize(): Int {
        return orderModel.multiDrop.size
    }

    fun getTotalSequence(): Long {
        return orderModel.totalSequence
    }

    fun goesToBast(goToMain: Boolean, detailPerLocationModel: DetailPerLocationModel) {
        orderModel.isCurrentSequenceFinish = true
        val intent = Intent(this, PernyataanSerahTerimaActivity::class.java)
        intent.putExtra("DetailPerLocationModel", detailPerLocationModel)
        intent.putExtra("OrderModel", orderModel)
        intent.putExtra("Model", model)
        intent.putExtra("goToMain", goToMain)
        startActivity(intent)
        finish()
    }

    fun goesToBasp() {
        val intent = Intent(this, LaporanKerusakanSelisihActivity::class.java)
        intent.putExtra("DetailPerLocationModel", detailPerLocationModel)
        intent.putExtra("OrderModel", orderModel)
        intent.putExtra("Model", model)
        startActivity(intent)
        finish()
    }

    private fun initView() {
        binding.noKargo.text = orderModel.cargoTitle
        binding.txtInitialLocation.text = model.location
        binding.txtInitialAddress.text = model.address

        if (TASK_PER_LOCATION_FINISHED){
            binding.btnAccident.visibility = View.GONE
        }else {
            binding.btnAccident.visibility = View.VISIBLE
            binding.btnAccident.setOnClickListener {
                val intent = Intent(this, AccidentActivity::class.java)
                startActivity(intent)
            }
        }

        if (isPenjemputan) {
            binding.title.text = resources.getString(R.string.tinjau_detil_penjemputan)
            binding.txtPengiriman.text = resources.getString(R.string.penjemputan)

            if ((orderModel.currentSequence == 1L && orderModel.isCurrentSequenceFinish) ||
                (orderModel.currentSequence > 1L &&
                        orderModel.currentSequence <= orderModel.multiPick.size &&
                        orderModel.isCurrentSequenceFinish)
            ) {
                binding.icInitial.setImageResource(R.drawable.ic_pingreen)

            } else if (orderModel.currentSequence > 1L && orderModel.currentSequence <= orderModel.multiPick.size.plus(
                    1
                ) && !orderModel.isCurrentSequenceFinish
            ) {
                binding.icInitial.setImageResource(R.drawable.ic_pingreen)

            }
        } else {
            binding.title.text = resources.getString(R.string.tinjau_detil_pengiriman)
            binding.txtPengiriman.text = resources.getString(R.string.pengiriman)
            binding.tempatAsal.text = resources.getString(R.string.lokasi_tujuan)
            binding.txtInitialLocation.text = model.location
            binding.txtInitialAddress.text = model.address
            binding.icInitial.setImageResource(R.drawable.ic_pinlocationred)

            if ((orderModel.currentSequence == orderModel.multiPick.size.plus(1L) && orderModel.isCurrentSequenceFinish) ||
                (orderModel.currentSequence > orderModel.multiPick.size.plus(1L) &&
                        orderModel.currentSequence <= orderModel.multiPick.size.plus(orderModel.multiDrop.size) &&
                        orderModel.isCurrentSequenceFinish)
            ) {
                binding.icInitial.setImageResource(R.drawable.ic_pinyellow)

            } else if ((orderModel.currentSequence > orderModel.multiPick.size.plus(1) &&
                        orderModel.currentSequence < orderModel.totalSequence && !orderModel.isCurrentSequenceFinish)
            )                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           {
                binding.icInitial.setImageResource(R.drawable.ic_pinyellow)

            }

        }
    }

    fun getLocationName(isOriginal: Boolean): String {
        return if (isOriginal) orderModel.originalLocation
        else orderModel.destinationLocation
    }

    fun updateStatus(
        status: String,
        lokasi: String,
        isUploading: Boolean,
        goesToBast: Boolean,
        updateRedis: Boolean,
        validate: Boolean
    ) {
        if (!loadingDialog.isShowing) loadingDialog.show()
        loadingDialog.setMessage("Memperbaharui Status pengiriman...")
        var updateRed = false
        if (sizeShipment == 1) updateRed = true
        else {
            if(counterForPic == sizeShipment-1) updateRed = true
        }
        if (validate){
            if (validateDriverPosition(model.radiusCalculation)){
                val timeOffset: Long = getTimeOffset()
                val updateStatusRequest = UpdateStatusRequest(
                    status,
                    lokasi,
                    timeOffset,
                    CURRENT_LOCATION_ID,
                    CURRENT_SHIPMENT_ID
                )
                if (isUploading) {
                    handler.postDelayed({
                        if (isUploadingSuratJalan || isUploadingPerintahPengiriman || isUploadingDokumentasi) {
                            updateStatus(status, lokasi, isUploading, goesToBast, updateRed, validate)
                        } else {
                            updateStatusViewModel.setPatchStatusConfirmation(updateStatusRequest)
                            updateStatusViewModel.getPatchStatusConfirmation().observe(this, {
                                handleResponse(it, {
                                    it.response?.data?.let { _ ->
                                        loadingDialog.cancel()
                                        Toast.makeText(this, "Berhasil", Toast.LENGTH_SHORT).show()
                                        if (updateRed) {
                                            if (orderModel.currentSequence == 0L) {
                                                orderModel.currentSequence = 1
                                            } else {
                                                if (orderModel.isCurrentSequenceFinish) {
                                                    orderModel.currentSequence += 1
                                                    orderModel.isCurrentSequenceFinish = false
                                                } else {
                                                    orderModel.isCurrentSequenceFinish = true
                                                }
                                            }
                                        }
                                        if (!goesToBast) {
                                            val intent = Intent(this, PengirimanDetailActivity::class.java)
                                            intent.putExtra("Model", orderModel)
                                            startActivity(intent)
                                            finish()
                                        } else {
                                            initView()
                                            getData()
                                        }
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
                    }, 500)
                } else {
                    updateStatusViewModel.setPatchStatusConfirmation(updateStatusRequest)
                    updateStatusViewModel.getPatchStatusConfirmation().observe(this, {
                        handleResponse(it, {
                            it.response?.data?.let { _ ->
                                loadingDialog.cancel()
                                Toast.makeText(this, "Berhasil", Toast.LENGTH_SHORT).show()
                                if (updateRed) {
                                    if (orderModel.currentSequence == 0L) {
                                        orderModel.currentSequence = 1
                                    } else {
                                        if (orderModel.isCurrentSequenceFinish) {
                                            orderModel.currentSequence += 1
                                            orderModel.isCurrentSequenceFinish = false
                                        } else {
                                            orderModel.isCurrentSequenceFinish = true
                                        }
                                    }
                                }
                                if (goesToBast) {
                                    initView()
                                    getData()
                                } else {
                                    val intent = Intent(this, PengirimanDetailActivity::class.java)
                                    intent.putExtra("Model", orderModel)
                                    startActivity(intent)
                                    finish()
                                }
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
            }else{
                loadingDialog.cancel()
                createOkSnackbar(
                    binding.layout, "Posisi terlalu jauh dari lokasi tujuan!", this
                )
            }
        }else{
            val timeOffset: Long = getTimeOffset()
            val updateStatusRequest = UpdateStatusRequest(
                status,
                lokasi,
                timeOffset,
                CURRENT_LOCATION_ID,
                CURRENT_SHIPMENT_ID
            )
            if (isUploading) {
                handler.postDelayed({
                    if (isUploadingSuratJalan || isUploadingPerintahPengiriman || isUploadingDokumentasi) {
                        updateStatus(status, lokasi, isUploading, goesToBast, updateRed, validate)
                    } else {
                        updateStatusViewModel.setPatchStatusConfirmation(updateStatusRequest)
                        updateStatusViewModel.getPatchStatusConfirmation().observe(this, {
                            handleResponse(it, {
                                it.response?.data?.let { _ ->
                                    loadingDialog.cancel()
                                    Toast.makeText(this, "Berhasil", Toast.LENGTH_SHORT).show()
                                    if (updateRed) {
                                        if (orderModel.currentSequence == 0L) {
                                            orderModel.currentSequence = 1
                                        } else {
                                            if (orderModel.isCurrentSequenceFinish) {
                                                orderModel.currentSequence += 1
                                                orderModel.isCurrentSequenceFinish = false
                                            } else {
                                                orderModel.isCurrentSequenceFinish = true
                                            }
                                        }
                                    }
                                    if (!goesToBast) {
                                        val intent = Intent(this, PengirimanDetailActivity::class.java)
                                        intent.putExtra("Model", orderModel)
                                        startActivity(intent)
                                        finish()
                                    } else {
                                        initView()
                                        getData()
                                    }
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
                }, 500)
            } else {
                updateStatusViewModel.setPatchStatusConfirmation(updateStatusRequest)
                updateStatusViewModel.getPatchStatusConfirmation().observe(this, {
                    handleResponse(it, {
                        it.response?.data?.let { _ ->
                            loadingDialog.cancel()
                            Toast.makeText(this, "Berhasil", Toast.LENGTH_SHORT).show()
                            if (updateRed) {
                                if (orderModel.currentSequence == 0L) {
                                    orderModel.currentSequence = 1
                                } else {
                                    if (orderModel.isCurrentSequenceFinish) {
                                        orderModel.currentSequence += 1
                                        orderModel.isCurrentSequenceFinish = false
                                    } else {
                                        orderModel.isCurrentSequenceFinish = true
                                    }
                                }
                            }
                            if (goesToBast) {
                                initView()
                                getData()
                            } else {
                                val intent = Intent(this, PengirimanDetailActivity::class.java)
                                intent.putExtra("Model", orderModel)
                                startActivity(intent)
                                finish()
                            }
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
        detailPerLocationViewModel.setGetDetailPerLocation()
        detailPerLocationViewModel.getDetailPerLocation().observe(this, {
            handleResponse(it, {
                loadingDialog.cancel()
                it.response?.data?.let { x ->
                    sizeShipment = x.size
                    detailPerLocationModel = x[0]
                    SHIPMENT_GROUP_ID = detailPerLocationModel.shipmentsGroupId
                    if (x.size > 0) {
                        var listButtonVisibility: ArrayList<Boolean> = ArrayList()
                        if (x.size > 1) {
                            listButtonVisibility = composeList(x)
                        } else {
                            listButtonVisibility.add(true)
                        }
                        var lisDetail : ArrayList<DetailPerLocationWithPictureModel> = ArrayList()
                        for (a in x){
                            val model = DetailPerLocationWithPictureModel(a, ArrayList(), ArrayList(), ArrayList())
                            lisDetail.add(model)
                            if (a.isPicTaken)counterForPic++
                            if (a.isBastTaken)counterForBAST++
                        }
                        shipmentDetailPerLocationAdapter = ShipmentDetailPerLocationAdapter(
                            lisDetail,
                            isPenjemputan,
                            orderModel.currentSequence,
                            orderModel.isCurrentSequenceFinish,
                            orderModel.isCurrentSequenceBASTSubmitted,
                            sp.getBoolean(IS_SUSPENDED, false),
                            listButtonVisibility,
                            showPhoto
                        )
                        val manager = LinearLayoutManager(this)
                        binding.rvShipment.adapter = shipmentDetailPerLocationAdapter
                        binding.rvShipment.layoutManager = manager
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

    private fun composeList(x: java.util.ArrayList<DetailPerLocationModel>): java.util.ArrayList<Boolean> {
        val list : ArrayList<Boolean> = ArrayList()
        val listNum : ArrayList<Int> = ArrayList()
        for (a in x){
            var status: String? = ""
            status = if (a.latestStatus == null) "a"
            else a.latestStatus
            when (a.latestStatus) {
                "TERKONFIRMASI" -> listNum.add(1)
                "PENJEMPUTAN" -> listNum.add(2)
                "DI_LOKASI_PENJEMPUTAN" -> listNum.add(3)
                "PENGIRIMAN" -> listNum.add(4)
                "DI_LOKASI_TUJUAN" -> listNum.add(5)
                "BARANG_DITERIMA_UTUH" -> listNum.add(6)
                "BARANG_DITERIMA_TIDAK_UTUH" -> listNum.add(6)
                else -> listNum.add(0)
            }
        }
        for (i in 0..listNum.size.minus(1)){
             var isTrue = true
            for (j in i.plus(1)..listNum.size.minus(1)){
                if (listNum[i] > listNum[j]) isTrue = false
            }
            list.add(isTrue)
        }
//        for (i in 0..listNum.size.minus(1)){
//            if (i < listNum.size.minus(1)){
//                if (listNum[i] <= listNum[i.plus(1)])list.add(true)
//                else if (listNum[i] > listNum[i.plus(1)])list.add(false)
//            }else{
//                if (listNum[i]> listNum[listNum.size.minus(2)])list.add(false)
//                else list.add(true)
//            }
//        }
        return list
    }

    fun showText(text : String){
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
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

    fun captureImage(actionCode: Int, position: Int) {
        CURRENT_ITEM_POSITION = position
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
                        OPERATION_CAPTURE_PHOTO_SURAT_JALAN ->startActivityForResult(
                            takePictureIntent,
                            OPERATION_CAPTURE_PHOTO_SURAT_JALAN
                        )
                        OPERATION_CAPTURE_PHOTO_DOKUMENTASI -> startActivityForResult(
                            takePictureIntent,
                            OPERATION_CAPTURE_PHOTO_DOKUMENTASI
                        )
                        else -> startActivityForResult(
                            takePictureIntent,
                            OPERATION_CAPTURE_PHOTO_PERINTAH_PENGIRIMAN
                        )
                    }
                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == OPERATION_CAPTURE_PHOTO_SURAT_JALAN) {
            val originalFile = File(mPath)
            val oriSize: Int = java.lang.String.valueOf(originalFile.length() / 1024).toInt()
            var compressedSize: Int
            lifecycleScope.launch {
                val compressedImageFile =
                    Compressor.compress(this@LokasiPenjemputanActivity, originalFile)
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

                listImageSuratJalan.add(bitmap)
                listImageSuratJalanBase64.add(fullStringDocument)

                shipmentDetailPerLocationAdapter.addImageSuratJalan(bitmap, CURRENT_ITEM_POSITION)

                Toast.makeText(
                    this@LokasiPenjemputanActivity,
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
                    Compressor.compress(this@LokasiPenjemputanActivity, originalFile)
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

                shipmentDetailPerLocationAdapter.addImageDokumentasi(bitmap, CURRENT_ITEM_POSITION)

                Toast.makeText(
                    this@LokasiPenjemputanActivity,
                    "Original : $oriSize KB, Compressed: $compressedSize KB",
                    Toast.LENGTH_SHORT
                ).show()
            }
        } else if (resultCode == Activity.RESULT_OK && requestCode == OPERATION_CAPTURE_PHOTO_PERINTAH_PENGIRIMAN) {
            val originalFile = File(mPath)
            val oriSize: Int = java.lang.String.valueOf(originalFile.length() / 1024).toInt()
            var compressedSize: Int
            lifecycleScope.launch {
                val compressedImageFile =
                    Compressor.compress(this@LokasiPenjemputanActivity, originalFile)
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

                listImagePerintahPengiriman.add(bitmap)
                listImagePerintahPengirimanBase64.add(fullStringDocument)
                shipmentDetailPerLocationAdapter.addImagePerintahPengiriman(bitmap, CURRENT_ITEM_POSITION)

                Toast.makeText(
                    this@LokasiPenjemputanActivity,
                    "Original : $oriSize KB, Compressed: $compressedSize KB",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    fun deleteImage(item: Any?, listName: String, itemPosition : Int) {
        CURRENT_ITEM_POSITION = itemPosition
        val position: Int
        when (listName) {
            LIST_NAME_SURAT_JALAN -> {
                position = listImageSuratJalan.indexOf(item)
                listImageSuratJalan.removeAt(position)
                listImageSuratJalanBase64.removeAt(position)
                shipmentDetailPerLocationAdapter.removeImageSuratJalan(item!!, CURRENT_ITEM_POSITION)
            }
            LIST_NAME_DOKUMENTASI -> {
                position = listImageDokumentasi.indexOf(item)
                listImageDokumentasi.removeAt(position)
                listImageDokumentasiBase64.removeAt(position)
                shipmentDetailPerLocationAdapter.removeImageDokumentasi(item!!, CURRENT_ITEM_POSITION)
            }
            LIST_NAME_PERINTAH_PENGIRIMAN -> {
                position = listImagePerintahPengiriman.indexOf(item)
                listImagePerintahPengiriman.removeAt(position)
                listImagePerintahPengirimanBase64.removeAt(position)
                shipmentDetailPerLocationAdapter.removeImagePerintahPengiriman(item!!, CURRENT_ITEM_POSITION)
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
        super.onBackPressed()
        val intent = Intent(this, PengirimanDetailActivity::class.java)
        intent.putExtra("Model", orderModel)
        startActivity(intent)
        finish()
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

    fun goesToGoogleMaps(lat: Double, lon: Double, label: String){
        val mapUri: Uri = Uri.parse("geo:$lat,$lon?q=$label")
        val mapIntent = Intent(Intent.ACTION_VIEW, mapUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        startActivity(mapIntent)
    }

    fun isMyServiceRunning(serviceClass: Class<*>): Boolean {
        val manager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        for (service in manager.getRunningServices(Int.MAX_VALUE)) {
            if (serviceClass.name == service.service.className) {
                return true
            }
        }
        return false
    }

    fun validateDriverPosition(radiusCalculation: Int): Boolean{
        val allowed = true
//        var allowed = false
//
//        fusedLocationClient = LocationServices.getFusedLocationProviderClient(applicationContext!!)
//        if (ActivityCompat.checkSelfPermission(
//                this,
//                Manifest.permission.ACCESS_FINE_LOCATION
//            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
//                this,
//                Manifest.permission.ACCESS_COARSE_LOCATION
//            ) != PackageManager.PERMISSION_GRANTED
//        ) {
//            Timber.d("Permission is not granted")
//        }else{
//            var latitude: Double
//            var longitude: Double
//            fusedLocationClient.lastLocation
//                .addOnSuccessListener { location ->
//                    latitude = location.latitude
//                    longitude = location.longitude
//
//                    val results = FloatArray(1)
//                    Location.distanceBetween(
//                        model.latitude, model.longitude,
//                        latitude, longitude, results
//                    )
//                    val distance = results[0]
//                    Timber.d(distance.toString())
//                    if (distance <= radiusCalculation){
//                        allowed = true
//                    }
//                }
//        }

        return allowed
    }

}
