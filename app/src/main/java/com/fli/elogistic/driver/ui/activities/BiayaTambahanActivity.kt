package com.fli.elogistic.driver.ui.activities

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.adapter.DaftarBiayaAdapter
import com.fli.elogistic.driver.constants.TASK_PER_LOCATION_FINISHED
import com.fli.elogistic.driver.constants.UPLOAD_BIAYA_TAMBAHAN_CODE
import com.fli.elogistic.driver.databinding.ActivityBiayaTambahanBinding
import com.fli.elogistic.driver.models.biayaDanTambahanOngkir.BiayaOngkirModel
import com.fli.elogistic.driver.viewmodel.AdditionalShippingCostViewModel
import dmax.dialog.SpotsDialog

@Suppress("unused")
class BiayaTambahanActivity : BaseActivity() {
    lateinit var loadingDialog: AlertDialog
    lateinit var binding : ActivityBiayaTambahanBinding
//    lateinit var adapter : DaftarBiayaAdapter
    private val additionalShippingCostViewModel: AdditionalShippingCostViewModel by viewModels()
    var listItem : ArrayList<BiayaOngkirModel> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBiayaTambahanBinding.inflate(layoutInflater)
        setContentView(binding.root)
        buildLoadingDialog()
        if (TASK_PER_LOCATION_FINISHED){
            binding.btnUpload.visibility = View.GONE
        }else{
            binding.btnUpload.visibility = View.VISIBLE
            binding.btnUpload.setOnClickListener {
                val intent = Intent(this, UploadPODActivity::class.java)
                intent.putExtra("isUploadPOD", false)
                startActivityForResult(intent, UPLOAD_BIAYA_TAMBAHAN_CODE)
            }
        }
        initData()
        binding.btnBack.setOnClickListener {
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

    private fun initData() {
        var totalSudahDikirim = 0.0
        var totalBelumDikirim = 0.0
        loadingDialog.show()
        additionalShippingCostViewModel.setAdditionalShippingCost()
        additionalShippingCostViewModel.getAdditionalShippingCost().observe(this, {
            handleResponse(it, {
                loadingDialog.cancel()
                it.response?.data?.let { data ->
                    for (x in data){
                        if (listItem.size > 0){
                            var exist = false
                            for (item in listItem){
                                if (item.id == x.id.toInt()){
                                    exist = true
                                }
                            }
                            if (!exist){
                                listItem.add(BiayaOngkirModel(x.id.toInt(), x.shipmentsCargoId.toInt(), x.shippingCostName,
                                    x.amount, x.notes, x.status, x.documents))
                            }
                        }else {
                            listItem.add(BiayaOngkirModel(x.id.toInt(), x.shipmentsCargoId.toInt(), x.shippingCostName,
                                x.amount, x.notes, x.status, x.documents))
                        }

                    }
                    for (x in listItem){
                        if (x.status == "SUDAH_DIKIRIM"){
                            totalSudahDikirim += x.amount
                        }else {
                            totalBelumDikirim += x.amount
                        }
                    }
                    val adapter = DaftarBiayaAdapter(listItem, true)
                    val layoutManager = LinearLayoutManager(this)
                    binding.rvDaftarBiaya.layoutManager = layoutManager
                    binding.rvDaftarBiaya.adapter = adapter

                    binding.totalSudahDikirim.text = totalSudahDikirim.toString()
                    binding.totalBelumDikirim.text = totalBelumDikirim.toString()
                }
            }, {
                loadingDialog.cancel()
                if(it.statusCode != 404){
                    createOkSnackbar(
                        binding.layout, it.message
                            ?: getString(R.string.gagal_mendapatkan_data), this
                    )
                }
            })
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == UPLOAD_BIAYA_TAMBAHAN_CODE){
            listItem.clear()
            initData()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}