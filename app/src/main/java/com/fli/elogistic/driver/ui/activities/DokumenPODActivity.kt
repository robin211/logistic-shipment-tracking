package com.fli.elogistic.driver.ui.activities

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.adapter.PODDocumentAdapter
import com.fli.elogistic.driver.constants.UPLOAD_POD_CODE
import com.fli.elogistic.driver.databinding.ActivityDokumenPODBinding
import com.fli.elogistic.driver.models.POD.PodDocumentModel
import com.fli.elogistic.driver.models.POD.PodSimpleModel
import com.fli.elogistic.driver.models.PodModel
import com.fli.elogistic.driver.viewmodel.SubmitPODViewModel
import dmax.dialog.SpotsDialog
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.collections.ArrayList

class DokumenPODActivity : BaseActivity() {
    lateinit var binding : ActivityDokumenPODBinding
    lateinit var model : PodSimpleModel
    private var listItem : ArrayList<PodDocumentModel> = ArrayList()
    lateinit var loadingDialog: AlertDialog
    private val submitPODViewModel: SubmitPODViewModel by viewModels()
    @SuppressLint("InflateParams")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDokumenPODBinding.inflate(layoutInflater)
        setContentView(binding.root)
        model = intent.getSerializableExtra("Model")as PodSimpleModel
        buildLoadingDialog()

        binding.txtNoKargo.text = model.title
        binding.btnUploadDokumen.setOnClickListener {
            val intent = Intent(this, UploadPODActivity::class.java)
            intent.putExtra("isUploadPOD", true)
            startActivityForResult(intent, UPLOAD_POD_CODE)
        }
//        val btnsheet = layoutInflater.inflate(R.layout.bottomsheet_notes, null)
//        val dialog = BottomSheetDialog(this)
//
//        binding.btnCatatanSuratJalan.setOnClickListener {
//            dialog.setContentView(btnsheet)
//            btnsheet.setOnClickListener {
//                dialog.dismiss()
//            }
//            dialog.show()
//        }

        binding.btnKirim.setOnClickListener {
            submitPOD()
        }
    }

    private fun submitPOD() {
        loadingDialog.show()

        val mCalendar: Calendar = GregorianCalendar()
        val mTimeZone: TimeZone = mCalendar.timeZone
        val mGMTOffset: Int = mTimeZone.rawOffset
        val tz = TimeUnit.HOURS.convert(mGMTOffset.toLong(), TimeUnit.MILLISECONDS)

        submitPODViewModel.setSubmitPOD(tz)
        submitPODViewModel.getSubmitPODResult().observe(this, {
            handleResponse(it, {
                loadingDialog.cancel()
                it.response?.data?.let { _ ->
//                    val intent = Intent()
//                    intent.putExtra("simpan", true)
//                    intent.putExtra("tipeDokumen", tipeDokumen)
//                    intent.putExtra("namaDokumen", binding.etNamaDokumen.text.toString())
//                    setResult(UPLOAD_POD_CODE, intent)
//                    finish()
                    createOkSnackbar(
                        binding.layout, "Sukses Submit POD", this
                    )
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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == UPLOAD_POD_CODE){
            if (data?.getBooleanExtra("simpan", false)!!){
                listItem.add(
                    PodDocumentModel(
                        data.getStringExtra("tipeDokumen"), data.getStringExtra(
                            "namaDokumen"
                        )
                    )
                )
                val adapter = PODDocumentAdapter(listItem)
                val manager = LinearLayoutManager(this)
                binding.rvPod.adapter = adapter
                binding.rvPod.layoutManager = manager
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

}