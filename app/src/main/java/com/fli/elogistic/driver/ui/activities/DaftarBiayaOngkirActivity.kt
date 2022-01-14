package com.fli.elogistic.driver.ui.activities

import android.app.AlertDialog
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.adapter.DaftarBiayaAdapter
import com.fli.elogistic.driver.databinding.ActivityDaftarBiayaOngkirBinding
import com.fli.elogistic.driver.models.biayaDanTambahanOngkir.BiayaOngkirModel
import com.fli.elogistic.driver.viewmodel.AdditionalShippingCostViewModel
import dmax.dialog.SpotsDialog

class DaftarBiayaOngkirActivity : BaseActivity() {
    lateinit var binding : ActivityDaftarBiayaOngkirBinding
    lateinit var loadingDialog: AlertDialog
    private val additionalShippingCostViewModel: AdditionalShippingCostViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaftarBiayaOngkirBinding.inflate(layoutInflater)
        setContentView(binding.root)
        buildLoadingDialog()
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
        loadingDialog.show()
        val listItem: ArrayList<BiayaOngkirModel> = ArrayList()
        var totalSudahDikirim = 0.0
        var totalBelumDikirim = 0.0

        additionalShippingCostViewModel.setShippingCost()
        additionalShippingCostViewModel.getShippingCost().observe(this, {
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
                    val adapter = DaftarBiayaAdapter(listItem, false)
                    val layoutManager = LinearLayoutManager(this)
                    binding.rvDaftarBiaya.layoutManager = layoutManager
                    binding.rvDaftarBiaya.adapter = adapter

                    binding.totalSudahDikirim.text = totalSudahDikirim.toString()
                    binding.totalBelumDikirim.text = totalBelumDikirim.toString()
                }
            }, {
                loadingDialog.cancel()
                if (it.statusCode != 404){
                    createOkSnackbar(
                        binding.layout, it.message
                            ?: getString(R.string.gagal_mendapatkan_data), this
                    )
                }
            })
        })

        binding.btnKirim.setOnClickListener {
            onBackPressed()
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}