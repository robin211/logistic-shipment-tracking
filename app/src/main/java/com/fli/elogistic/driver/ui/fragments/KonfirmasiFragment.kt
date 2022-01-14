package com.fli.elogistic.driver.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.adapter.KonfirmasiItemAdapter
import com.fli.elogistic.driver.constants.*
import com.fli.elogistic.driver.databinding.FragmentKonfirmasiBinding
import com.fli.elogistic.driver.models.shipment.ShipmentModel
import com.fli.elogistic.driver.viewmodel.ShipmentViewModel

class KonfirmasiFragment : BaseFragment() {
    lateinit var binding: FragmentKonfirmasiBinding
    lateinit var layoutManager: RecyclerView.LayoutManager
    private val shipmentViewModel : ShipmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentKonfirmasiBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.userName.text = sp.getString(USER_NAME, "")
        binding.ptName.text = sp.getString(CLIENT_NAME, "")
        val imgURL = sp.getString(USER_IMAGE, "")
        Glide.with(this).load(imgURL).placeholder(R.drawable.ic_profileblue).into(binding.profileImage)
        getData()
        if (sp.getBoolean(IS_SUSPENDED, false)){
            binding.statusSuspend.visibility = View.VISIBLE
        }

    }

    private fun getData() {
//        loadingDialog.show()
        shipmentViewModel.setGetShipmentNeedConfirmation()
        shipmentViewModel.getShipmentNeedConfirmation().observe(
            viewLifecycleOwner, {
                handleResponse(it, {
//                    loadingDialog.cancel()
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
                            val adapter = KonfirmasiItemAdapter(dataList, NEED_CONFIRMATION)
                            val layoutManager = LinearLayoutManager(context)

                            binding.noData.visibility = View.GONE
                            binding.rvKonfirmasi.visibility = View.VISIBLE

                            binding.rvKonfirmasi.layoutManager = layoutManager
                            binding.rvKonfirmasi.adapter = adapter
                        }else {
                            binding.noData.visibility = View.VISIBLE
                            binding.rvKonfirmasi.visibility = View.GONE
                        }
                    }
                }, {
//                    loadingDialog.cancel()
                    binding.noData.visibility = View.VISIBLE
                    binding.rvKonfirmasi.visibility = View.GONE
//                    createOkSnackbar(
//                        binding.needConfirmationLayout, it.message
//                            ?: getString(R.string.gagal_mendapatkan_data),
//                        requireContext()
//                    )
                })
            }
        )

    }

    override fun onResume() {
        super.onResume()
        getData()
    }

}