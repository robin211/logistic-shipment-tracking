package com.fli.elogistic.driver.ui.activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.adapter.LocationAddressAdapter
import com.fli.elogistic.driver.constants.IS_SUSPENDED
import com.fli.elogistic.driver.databinding.ActivityKonfirmasiDetailBinding
import com.fli.elogistic.driver.models.LocationAddressModel
import com.fli.elogistic.driver.models.shipment.ShipmentModel
import com.fli.elogistic.driver.viewmodel.StatusConfirmationViewModel
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class KonfirmasiDetailActivity : BaseActivity() {
    lateinit var binding : ActivityKonfirmasiDetailBinding
    lateinit var model : ShipmentModel
    private val statusConfirmationViewModel: StatusConfirmationViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKonfirmasiDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        model = intent.getSerializableExtra("Model")as ShipmentModel

        initView(model)
        binding.btnBack.setOnClickListener {
            onBackPressed()
        }

        binding.mapsInitial.setOnClickListener {
            goesToGoogleMaps(model.originalLatitude, model.originalLongitude, model.originalLocation)
        }

        binding.mapsFinal.setOnClickListener {
            goesToGoogleMaps(model.destinationLatitude, model.destinationLatitude, model.destinationLocation)
        }
    }
    private fun String.getDateWithServerTimeStamp(): Date? {
        val dateFormat = SimpleDateFormat(
            "yyyy-MM-dd'T'HH:mm:ss'Z'",
            Locale.getDefault()
        )
        dateFormat.timeZone = TimeZone.getTimeZone("GMT")
        return try {
            dateFormat.parse(this)
        } catch (e: ParseException) {
            null
        }
    }

    private fun Date.getStringTimeStampWithDate(): String {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'",
            Locale.getDefault())
            dateFormat.timeZone = TimeZone.getTimeZone("GMT")
        return dateFormat.format(this)
    }


    private fun initView(model: ShipmentModel) {
//        val shipmentDate = model.shipmentDate.dropLast(6) + "Z"

        var dates : String = model.shipmentDate
        if (dates.endsWith("0")){
            dates = model.shipmentDate.substringBefore("+")
            dates += "Z"
        }

        val serverDate = dates.getDateWithServerTimeStamp()
        val serverDateString = serverDate?.getStringTimeStampWithDate()
        val inputFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault())
        val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
        val timeFormat = SimpleDateFormat("HH:mm", Locale.getDefault())
        val date = inputFormat.parse(serverDateString!!)

        binding.txtNoKargo.text = model.cargoTitle
        binding.txtTipeKendaraan.text = model.tipeKendaraan
        binding.txtNoKendaraan.text = model.noKendaraan
        binding.txtTanggalPengambilan.text = dateFormat.format(date!!)
        binding.txtJamPengambilan.text = timeFormat.format(date)
        binding.txtInitialLocation.text = model.originalLocation
        binding.txtInitialAddress.text = model.originalLocationAddress
        binding.txtFinalLocation.text = model.destinationLocation
        binding.txtFinalAddress.text = model.destinationLocationAddress

        if (model.multiPick.size > 0){
            binding.icPickup.visibility = View.VISIBLE
            val pickUpList: ArrayList<LocationAddressModel> = ArrayList()
            for (x in model.multiPick){
                val location = LocationAddressModel(x.sequenceNo, x.locationId, x.locationName,
                    x.locationAddress, model.currentSequence, model.isCurrentSequenceFinish,
                    model.isCurrentSequenceArrived,
                    model.isCurrentSequenceBASTSubmitted, x.latitude,
                x.longitude, x.radiusCalculation)
                pickUpList.add(location)

            }
            val pickupAdapter = LocationAddressAdapter(pickUpList)
            val pickuplayoutManager = LinearLayoutManager(this)
            binding.rvPickups.layoutManager = pickuplayoutManager
            binding.rvPickups.adapter = pickupAdapter
        }

        if (model.multiDrop.size > 0){
            binding.icDrop.visibility = View.VISIBLE
            val dropList: ArrayList<LocationAddressModel> = ArrayList()
            for (x in model.multiDrop){
                val location = LocationAddressModel(x.sequenceNo, x.locationId, x.locationName,
                    x.locationAddress, model.currentSequence, model.isCurrentSequenceFinish,
                    model.isCurrentSequenceArrived,
                    model.isCurrentSequenceBASTSubmitted, x.latitude,
                x.longitude, x.radiusCalculation)
                dropList.add(location)

            }
            val dropAdapter = LocationAddressAdapter(dropList)
            val dropLayoutManager = LinearLayoutManager(this)
            binding.rvDrops.layoutManager = dropLayoutManager
            binding.rvDrops.adapter = dropAdapter
        }

        if (sp.getBoolean(IS_SUSPENDED, false)){
            binding.btnTerima.visibility = View.GONE
        }

        binding.btnTerima.setOnClickListener {
            val timeOffset: Long = getTimeOffset()
            statusConfirmationViewModel.setPatchStatusConfirmation(timeOffset)
            statusConfirmationViewModel.getPatchStatusConfirmation().observe(this, {
                handleResponse(it, {
                    it.response?.data?.let { _ ->
                        Toast.makeText(this, "Berhasil", Toast.LENGTH_SHORT).show()
//                        val intentService = Intent(this, LocationsService::class.java)
//                        intentService.action = "ACTION_START_FOREGROUND_SERVICE"
//                        ContextCompat.startForegroundService(this, intentService)
                        finish()
                    }
                }, {
                    var message = it.message
                    if (it.message == "Data Not Found"){
                        message = "Waktu konfirmasi telah habis, silahkan hubungi administrator"
                    }
                    createOkSnackbar(binding.layout, message
                        ?: getString(R.string.gagal_memuat_naik_data), this)
                })
            })


        }
    }

    override fun onBackPressed() {
        finish()
    }

    private fun getTimeOffset(): Long {
        val mCalendar: Calendar = GregorianCalendar()
        val mTimeZone: TimeZone = mCalendar.timeZone
        val mGMTOffset: Long = mTimeZone.rawOffset.toLong()
        return java.util.concurrent.TimeUnit.HOURS.convert(mGMTOffset, java.util.concurrent.TimeUnit.MILLISECONDS)
    }

    fun goesToGoogleMaps(lat: Double, lon: Double, label: String){
        val mapUri: Uri = Uri.parse("geo:$lat,$lon?q=$label")
        val mapIntent = Intent(Intent.ACTION_VIEW, mapUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        startActivity(mapIntent)
    }
}