package com.fli.elogistic.driver.ui.activities

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.util.Base64
import android.widget.TextView
import androidx.activity.viewModels
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.databinding.ActivityPernyataanSerahTerimaBinding
import com.fli.elogistic.driver.models.LocationAddressModel
import com.fli.elogistic.driver.models.shipment.DetailPerLocationModel
import com.fli.elogistic.driver.models.shipment.ShipmentModel
import com.fli.elogistic.driver.services.LocationsService
import com.fli.elogistic.driver.viewmodel.UploadSignatureBastViewModel
import com.github.gcacace.signaturepad.views.SignaturePad
import dmax.dialog.SpotsDialog
import java.io.ByteArrayOutputStream
import java.util.*


class PernyataanSerahTerimaActivity : BaseActivity() {
    lateinit var binding: ActivityPernyataanSerahTerimaBinding
    lateinit var detailPerLocationModel: DetailPerLocationModel
    lateinit var orderModel: ShipmentModel
    lateinit var model: LocationAddressModel
    private var goTomain : Boolean = false
    private val uploadSignatureBastViewModel: UploadSignatureBastViewModel by viewModels()
    lateinit var loadingDialog: AlertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPernyataanSerahTerimaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        buildLoadingDialog()
        detailPerLocationModel = intent.getSerializableExtra("DetailPerLocationModel") as DetailPerLocationModel
        orderModel = intent.getSerializableExtra("OrderModel") as ShipmentModel
        model = intent.getSerializableExtra("Model") as LocationAddressModel
        goTomain = intent.getBooleanExtra("goToMain", false)

        binding.noPesanan.text = detailPerLocationModel.shipmentsTitle
        binding.txtKategori.text = detailPerLocationModel.categoryName
        binding.txtSubKategori.text = detailPerLocationModel.subCategoryName
        binding.txtNotes.text = detailPerLocationModel.goodsNote
        binding.txtNamaPenerima.text = detailPerLocationModel.picName
        binding.btnBack.setOnClickListener {
            onBackPressed()
        }

        binding.signaturePad.setOnSignedListener(object : SignaturePad.OnSignedListener {
            override fun onStartSigning() {
                //Event triggered when the pad is touched
            }

            override fun onSigned() {
                //Event triggered when the pad is signed
            }

            override fun onClear() {
                //Event triggered when the pad is cleared
            }
        })

        binding.btnKirim.setOnClickListener {
            if (!binding.signaturePad.isEmpty){
                uploadSignature(binding.signaturePad.signatureBitmap)

            }else{
                createOkSnackbar(binding.layout, getString(R.string.silahkan_tanda_tangan), this)
            }
        }

    }

    private fun uploadSignature(signatureBitmap: Bitmap?) {
        loadingDialog.show()
        val byteArrayOutputStream = ByteArrayOutputStream()
        signatureBitmap?.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)
        val byteArray: ByteArray = byteArrayOutputStream.toByteArray()
        val encoded: String = Base64.encodeToString(byteArray, Base64.NO_WRAP)
        val timeOffset: Long = getTimeOffset()
        val notes = binding.etSerahTerima.text.toString()
        uploadSignatureBastViewModel.setPostSignatureBast(
            timeOffset,
            detailPerLocationModel.shipmentsId,
            detailPerLocationModel.shipmentsDetailId,
            detailPerLocationModel.locationId,
            encoded,
            notes
        )

        uploadSignatureBastViewModel.getPostSignatureBastResult().observe(this, {
            handleResponse(it, {
                loadingDialog.cancel()
                it.response?.data?.let { _ ->
                    val dialog = Dialog(this)
                    dialog.setContentView(R.layout.dialog_image_title_content_button)
                    dialog.show()

                    val btnOK = dialog.findViewById<TextView>(R.id.btn_ok)

                    btnOK.setOnClickListener {
                        dialog.cancel()
                        if (!goTomain){
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)

                            val intentService = Intent(this, LocationsService::class.java)
                            intentService.action = "ACTION_STOP_FOREGROUND_SERVICE"
                            startService(intentService)
                        }
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

    private fun getTimeOffset(): Long {
        val mCalendar: Calendar = GregorianCalendar()
        val mTimeZone: TimeZone = mCalendar.timeZone
        val mGMTOffset: Long = mTimeZone.rawOffset.toLong()
        return java.util.concurrent.TimeUnit.HOURS.convert(
            mGMTOffset,
            java.util.concurrent.TimeUnit.MILLISECONDS
        )
    }

    private fun buildLoadingDialog() {
        loadingDialog = SpotsDialog.Builder()
            .setContext(this)
            .setMessage(R.string.loading)
            .setCancelable(false).build()
        loadingDialog.setCancelable(false)
        loadingDialog.hide()
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