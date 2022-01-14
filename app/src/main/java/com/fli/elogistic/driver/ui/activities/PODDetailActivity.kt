package com.fli.elogistic.driver.ui.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.fli.elogistic.driver.adapter.LocationAddressDetilAdapter
import com.fli.elogistic.driver.databinding.ActivityPODDetailBinding
import com.fli.elogistic.driver.models.LocationAddressModel
import com.fli.elogistic.driver.models.POD.PodSimpleModel
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class PODDetailActivity : BaseActivity() {
    lateinit var binding : ActivityPODDetailBinding
    lateinit var model : PodSimpleModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPODDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        model = intent.getSerializableExtra("Model")as PodSimpleModel

        initView(model)
        binding.btnBack.setOnClickListener {
            onBackPressed()
        }

        binding.btnKirim.setOnClickListener {
            val intent = Intent(this, DokumenPODActivity::class.java)
            intent.putExtra("Model", model)
            ContextCompat.startActivity(this, intent, null)
        }
    }

    @SuppressLint("SimpleDateFormat")
    private fun initView(model: PodSimpleModel) {
        val dateFormatter = SimpleDateFormat("dd MMM yyyy")
        val hourFormatter = SimpleDateFormat("hh:mm")
        val dateString = dateFormatter.format(Date(model.pickupDate))
        val hourString = hourFormatter.format(Date(model.pickupDate))

        binding.btnDetilInitial.visibility = View.INVISIBLE
        binding.btnDetilFinal.visibility = View.INVISIBLE
        binding.mapsInitial.visibility = View.INVISIBLE
        binding.mapsFinal.visibility = View.INVISIBLE

        binding.txtNoKargo.text = model.title
        binding.txtTipeKendaraan.text = model.tipeKendaraan
        binding.txtNoKendaraan.text = model.noKendaraan
        binding.txtTanggalPengambilan.text = dateString
        binding.txtJamPengambilan.text = hourString
        binding.txtInitialLocation.text = model.originalLocation
        binding.txtInitialAddress.text = model.originalLocationAddress
        binding.txtFinalLocation.text = model.destinationLocation
        binding.txtFinalAddress.text = model.destinationLocationAddress

        if (model.multiPick.size > 0) {
            val pickUpList: ArrayList<LocationAddressModel> = ArrayList()
            for (x in model.multiPick) {
                val location = LocationAddressModel(
                    x.sequenceNo,
                    x.locationId,
                    x.locationName,
                    x.locationAddress,
                    10,
                    true,
                    true,
                    true,
                    x.latitude,
                    x.longitude,
                    x.radiusCalculation
                )
                pickUpList.add(location)

            }
            val pickupAdapter = LocationAddressDetilAdapter(pickUpList, true, null, true)
            val pickuplayoutManager = LinearLayoutManager(this)
            binding.rvPickups.layoutManager = pickuplayoutManager
            binding.rvPickups.adapter = pickupAdapter
        }

        if (model.multiDrop.size > 0) {
            val dropList: ArrayList<LocationAddressModel> = ArrayList()
            for (x in model.multiDrop) {
                val location = LocationAddressModel(
                    x.sequenceNo,
                    x.locationId,
                    x.locationName,
                    x.locationAddress,
                    100,
                    true,
                    true,
                    true,
                    x.latitude,
                    x.longitude,
                    x.radiusCalculation
                )
                dropList.add(location)

            }
            val dropAdapter = LocationAddressDetilAdapter(dropList, false, null, true)
            val dropLayoutManager = LinearLayoutManager(this)
            binding.rvDrops.layoutManager = dropLayoutManager
            binding.rvDrops.adapter = dropAdapter
        }

    }

    override fun onBackPressed() {
        finish()
    }
}