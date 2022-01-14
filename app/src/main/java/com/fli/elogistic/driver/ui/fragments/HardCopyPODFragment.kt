package com.fli.elogistic.driver.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.adapter.PODAdapter
import com.fli.elogistic.driver.databinding.FragmentHardCopyPODBinding
import com.fli.elogistic.driver.viewmodel.SimplePODViewModel

class HardCopyPODFragment : BaseFragment() {
    lateinit var binding: FragmentHardCopyPODBinding
    private val simplePODViewModel : SimplePODViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHardCopyPODBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
    }

    private fun initData() {
        simplePODViewModel.setGetSimplePOD()
        simplePODViewModel.getSimplePOD().observe(
            viewLifecycleOwner, {
                handleResponse(it, {
//                    loadingDialog.cancel()
                    it.response?.data?.let { x ->
                        if (x.size > 0){
                            val adapter = PODAdapter(x)
                            val layoutManager = LinearLayoutManager(context)

                            binding.noData.visibility = View.GONE
                            binding.rvPod.visibility = View.VISIBLE

                            binding.rvPod.layoutManager = layoutManager
                            binding.rvPod.adapter = adapter
                        }else {
                            binding.noData.visibility = View.VISIBLE
                            binding.rvPod.visibility = View.GONE
                        }
                    }
                }, {
//                    loadingDialog.cancel()
                    binding.noData.visibility = View.VISIBLE
                    binding.rvPod.visibility = View.GONE
//                    createOkSnackbar(
//                        binding.layout, it.message
//                            ?: getString(R.string.gagal_mendapatkan_data),
//                        requireContext()
//                    )
                })
            }
        )
//        val listData: ArrayList<PodSimpleModel> = ArrayList()
//        val data1 = PodModel(
//            "KRGO123498765353",
//            "Pick Up",
//            "B1234CDA",
//            "27 Februari 2021",
//            "15:00",
//            "Kota Jakarta Barat (Jakarta Barat 1)",
//            "Pick 1 - Kota Jakarta Pusat (Jakarta Pusat 1)\nPick 2 - Kota Jakarta Pusat (Jakarta Pusat 2)",
//            "Drop 1 - Kota Bekasi (Bekasi 1)\nDrop 2 - Kota Bekasi (Bekasi 2)",
//            "Kota Bekasi(Cikarang 1)",
//            "belumkirim"
//        )
//        val data2 = PodModel(
//            "KRGO123498765354",
//            "Pick Up",
//            "B1234CDA",
//            "27 Februari 2021",
//            "15:00",
//            "Kota Jakarta Barat (Jakarta Barat 1)",
//            "Pick 1 - Kota Jakarta Pusat (Jakarta Pusat 1)\nPick 2 - Kota Jakarta Pusat (Jakarta Pusat 2)",
//            "Drop 1 - Kota Bekasi (Bekasi 1)\nDrop 2 - Kota Bekasi (Bekasi 2)",
//            "Kota Bekasi(Cikarang 1)",
//            "terkirim"
//        )
//        val data3 = PodModel(
//            "KRGO123498765355",
//            "Pick Up",
//            "B1234CDA",
//            "27 Februari 2021",
//            "15:00",
//            "Kota Jakarta Barat (Jakarta Barat 1)",
//            "Pick 1 - Kota Jakarta Pusat (Jakarta Pusat 1)\nPick 2 - Kota Jakarta Pusat (Jakarta Pusat 2)",
//            "Drop 1 - Kota Bekasi (Bekasi 1)\nDrop 2 - Kota Bekasi (Bekasi 2)",
//            "Kota Bekasi(Cikarang 1)",
//            "tidaklengkap"
//        )
//        val data4 = PodModel(
//            "KRGO123498765356",
//            "Pick Up",
//            "B1234CDA",
//            "27 Februari 2021",
//            "15:00",
//            "Kota Jakarta Barat (Jakarta Barat 1)",
//            "Pick 1 - Kota Jakarta Pusat (Jakarta Pusat 1)\nPick 2 - Kota Jakarta Pusat (Jakarta Pusat 2)",
//            "Drop 1 - Kota Bekasi (Bekasi 1)\nDrop 2 - Kota Bekasi (Bekasi 2)",
//            "Kota Bekasi(Cikarang 1)",
//            "lengkap"
//        )
//
//        listData.add(data1)
//        listData.add(data2)
//        listData.add(data3)
//        listData.add(data4)
//
//        val adapter = PODAdapter(listData)
//        val layoutManager = LinearLayoutManager(context)
//
//        binding.rvPod.layoutManager = layoutManager
//        binding.rvPod.adapter = adapter

    }

}