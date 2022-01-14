package com.fli.elogistic.driver.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.adapter.KonfirmasiItemAdapter
import com.fli.elogistic.driver.constants.FINISH
import com.fli.elogistic.driver.databinding.FragmentSelesaiBinding
import com.fli.elogistic.driver.models.shipment.ShipmentModel
import com.fli.elogistic.driver.viewmodel.ShipmentViewModel

class SelesaiFragment : BaseFragment() {
    lateinit var binding: FragmentSelesaiBinding
    private val shipmentViewModel : ShipmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelesaiBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
    }

    private fun initData() {
//        loadingDialog.show()
        shipmentViewModel.setGetShipmentFinish()
        shipmentViewModel.getShipmentFinish().observe(
            viewLifecycleOwner, {
                handleResponse(it, {
//                    loadingDialog.hide()
                    it.response?.data?.let { x ->
                        if (x.shipmentModels.size > 0){
                            val dataList : ArrayList<ShipmentModel> = ArrayList()
                            for (shipmentModel in x.shipmentModels){
                                if (dataList.size == 0){
                                    dataList.add(shipmentModel)
                                }else {
                                    var exist = false
                                    for (data in dataList){
                                        if (data.id == shipmentModel.id){
                                            exist = true
                                        }
                                    }
                                    if (!exist) dataList.add(shipmentModel)
                                }
                            }

                            val adapter = KonfirmasiItemAdapter(dataList, FINISH)
                            val layoutManager = LinearLayoutManager(context)

                            binding.noData.visibility = View.GONE
                            binding.rvSelesai.visibility = View.VISIBLE

                            binding.rvSelesai.layoutManager = layoutManager
                            binding.rvSelesai.adapter = adapter
                        }else {
                            binding.noData.visibility = View.VISIBLE
                            binding.rvSelesai.visibility = View.GONE
                        }
                    }
                }, {
//                    loadingDialog.hide()
//                    createOkSnackbar(
//                        binding.selesaiLayout, it.message
//                            ?: getString(R.string.gagal_mendapatkan_data),
//                        requireContext()
//                    )
                })
            }
        )

    }
    override fun onResume() {
        super.onResume()
//        initData()
    }

}