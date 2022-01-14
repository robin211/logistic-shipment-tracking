package com.fli.elogistic.driver.ui.activities

import android.app.AlertDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.adapter.LocationAddressDetilAdapter
import com.fli.elogistic.driver.constants.*
import com.fli.elogistic.driver.databinding.ActivityPengirimanDetailBinding
import com.fli.elogistic.driver.models.LocationAddressModel
import com.fli.elogistic.driver.models.shipment.DetailPerLocationModel
import com.fli.elogistic.driver.models.shipment.ShipmentModel
import com.fli.elogistic.driver.models.shipment.UpdateStatusRequest
import com.fli.elogistic.driver.viewmodel.DetailPerLocationViewModel
import com.fli.elogistic.driver.viewmodel.UpdateStatusViewModel
import dmax.dialog.SpotsDialog
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class PengirimanDetailActivity : BaseActivity() {
    lateinit var binding: ActivityPengirimanDetailBinding
    private val detailPerLocationViewModel: DetailPerLocationViewModel by viewModels()
    private val updateStatusViewModel: UpdateStatusViewModel by viewModels()
    lateinit var loadingDialog: AlertDialog
    lateinit var listDetailPerLocationModels: ArrayList<DetailPerLocationModel>
    var currentShipmentPosition : Int = -1
    val FUNCTION_TYPE_BERANGKAT_PENJEMPUTAN = 1
    val FUNCTION_TYPE_SAMPAI_PENJEMPUTAN = 2
    val FUNCTION_TYPE_BERANGKAT_PENGIRIMAN = 3
    val FUNCTION_TYPE_SAMPAI_PENGIRIMAN = 4
    val FUNCTION_TYPE_SELESAI = 5
    lateinit var model : ShipmentModel
    var current_location_id : Int = 0
    var current_location_name : String = ""
    var isGettingDetail = true
    var showPhoto = false
    private val handler = Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPengirimanDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
        buildLoadingDialog()
        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }

    private fun initView() {
        model = intent.getSerializableExtra("Model") as ShipmentModel
        if (!model.isCurrentSequenceArrived!!)model.isCurrentSequenceFinish = false
        val isFinished = intent.getBooleanExtra("isFinished", false)

        if (model.isCurrentSequenceArrived == true)showPhoto = true

        var dates = model.shipmentDate
        if (model.shipmentDate.endsWith("0")) {
            dates = model.shipmentDate.substringBefore("+")
            dates += "Z"
        }
        val serverDate = dates.getDateWithServerTimeStamp()
        val serverDateString = serverDate?.getStringTimeStampWithDate()
        val inputFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault())
        val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
        val timeFormat = SimpleDateFormat("HH:mm", Locale.getDefault())
        val date = inputFormat.parse(serverDateString!!)

        if (isFinished) {
            binding.btnDetilInitial.visibility = View.GONE
            binding.btnDetilInitialInactive.visibility = View.GONE
            binding.btnDetilFinal.visibility = View.GONE
            binding.btnDetilFinalInactive.visibility = View.GONE
            btnKirimGone()
        } else {
            determineActiveDetailButtons(model)
        }

        binding.txtNoKargo.text = model.cargoTitle
        binding.txtTipeKendaraan.text = model.tipeKendaraan
        binding.txtNoKendaraan.text = model.noKendaraan
        binding.txtTanggalPengambilan.text = dateFormat.format(date!!)
        binding.txtJamPengambilan.text = timeFormat.format(date)
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
                    model.currentSequence,
                    model.isCurrentSequenceFinish,
                    model.isCurrentSequenceArrived,
                    model.isCurrentSequenceBASTSubmitted,
                    x.latitude,
                    x.longitude,
                    x.radiusCalculation
                )
                pickUpList.add(location)

            }
            val pickupAdapter = LocationAddressDetilAdapter(pickUpList, true, model, isFinished)
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
                    model.currentSequence,
                    model.isCurrentSequenceFinish,
                    model.isCurrentSequenceArrived,
                    model.isCurrentSequenceBASTSubmitted,
                    x.latitude,
                    x.longitude,
                    x.radiusCalculation
                )
                dropList.add(location)

            }
            val dropAdapter = LocationAddressDetilAdapter(dropList, false, model, isFinished)
            val dropLayoutManager = LinearLayoutManager(this)
            binding.rvDrops.layoutManager = dropLayoutManager
            binding.rvDrops.adapter = dropAdapter
        }

        binding.btnDaftarBiaya.setOnClickListener {
            CURRENT_SHIPMENT_CARGO_ID = model.id
            val intent = Intent(this, DaftarBiayaOngkirActivity::class.java)
            startActivity(intent)
        }

        binding.mapsInitial.setOnClickListener {
            goesToGoogleMaps(
                model.originalLatitude,
                model.originalLongitude,
                model.originalLocation
            )
        }

        binding.mapsFinal.setOnClickListener {
            goesToGoogleMaps(
                model.destinationLatitude,
                model.destinationLongitude,
                model.destinationLocation
            )
        }

        binding.btnDetilInitial.setOnClickListener {
            TASK_PER_LOCATION_FINISHED = false
            val locationAddressModel = LocationAddressModel(
                1,
                model.originLocationId,
                model.originalLocation,
                model.originalLocationAddress,
                model.currentSequence,
                model.isCurrentSequenceFinish,
                model.isCurrentSequenceArrived,
                model.isCurrentSequenceBASTSubmitted,
                model.originalLatitude,
                model.originalLongitude,
                model.radiusCalculationOriginal
            )
            CURRENT_LOCATION_ID = model.originLocationId.toLong()
            gotoLokasiPenjemputan(locationAddressModel, model, true, 1, showPhoto)
        }
        binding.btnDetilInitialInactive.setOnClickListener {
            TASK_PER_LOCATION_FINISHED = true
            val locationAddressModel = LocationAddressModel(
                1,
                model.originLocationId,
                model.originalLocation,
                model.originalLocationAddress,
                model.currentSequence,
                model.isCurrentSequenceFinish,
                model.isCurrentSequenceArrived,
                model.isCurrentSequenceBASTSubmitted,
                model.originalLatitude,
                model.originalLongitude,
                model.radiusCalculationOriginal
            )
            CURRENT_LOCATION_ID = model.originLocationId.toLong()
            gotoLokasiPenjemputan(locationAddressModel, model, true, 1, showPhoto)
        }

        binding.btnDetilFinal.setOnClickListener {
            TASK_PER_LOCATION_FINISHED = false
            val sizeMultiDrop = model.multiDrop.size
            val sequence = if (sizeMultiDrop > 0) sizeMultiDrop + 1
            else 1
            val locationAddressModel = LocationAddressModel(
                sequence,
                model.originLocationId,
                model.destinationLocation,
                model.destinationLocationAddress,
                model.currentSequence,
                model.isCurrentSequenceFinish,
                model.isCurrentSequenceArrived,
                model.isCurrentSequenceBASTSubmitted,
                model.destinationLatitude,
                model.destinationLongitude,
                model.radiusCalculationDestination
            )
            CURRENT_LOCATION_ID = model.destinationLocationId.toLong()
            model.isCurrentSequenceArrived!!.also { showPhoto = it }
            gotoLokasiPenjemputan(locationAddressModel, model, false, 1.plus(sizeMultiDrop), showPhoto)
        }
        if (model.isCurrentSequenceBASTSubmitted){
            binding.btnDetilFinalInactive.setOnClickListener {
                TASK_PER_LOCATION_FINISHED = true
                val sizeMultiDrop = model.multiDrop.size
                val sequence = if (sizeMultiDrop > 0) sizeMultiDrop + 1
                else 1
                val locationAddressModel = LocationAddressModel(
                    sequence,
                    model.originLocationId,
                    model.destinationLocation,
                    model.destinationLocationAddress,
                    model.currentSequence,
                    model.isCurrentSequenceFinish,
                    model.isCurrentSequenceArrived,
                    model.isCurrentSequenceBASTSubmitted,
                    model.destinationLatitude,
                    model.destinationLongitude,
                    model.radiusCalculationDestination
                )
                CURRENT_LOCATION_ID = model.destinationLocationId.toLong()
                gotoLokasiPenjemputan(locationAddressModel, model, false, 1.plus(sizeMultiDrop), false)
            }
        }

    }

     fun gotoLokasiPenjemputan(locationAddressModel: LocationAddressModel,
                                      model: ShipmentModel, isPenjemputan: Boolean,
                                      currentSequence: Int, showPhoto: Boolean) {
        val intent = Intent(this, LokasiPenjemputanActivity::class.java)
        intent.putExtra("Model", locationAddressModel)
        intent.putExtra("OrderModel", model)
        intent.putExtra("isPenjemputan", isPenjemputan)
        intent.putExtra("currentSequence", currentSequence)
        intent.putExtra("showPhoto", showPhoto)
        startActivity(intent)
        finish()
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
        val dateFormat = SimpleDateFormat(
            "yyyy-MM-dd'T'HH:mm:ss'Z'",
            Locale.getDefault()
        )
            dateFormat.timeZone = TimeZone.getTimeZone("GMT")
        return dateFormat.format(this)
    }

    fun setBtnText(text : String){
        binding.btnKirim.text = text
    }

    fun setBtnFunction(functionType : Int){
        val radius = getCurrentLocationRadius(current_location_id)
        when (functionType) {
            FUNCTION_TYPE_BERANGKAT_PENJEMPUTAN -> {
                binding.btnKirim.setOnClickListener {
                    loadingDialog.show()
                    startUpdateSequence(STATUS_PENJEMPUTAN, false, true)
                }
            }
            FUNCTION_TYPE_SAMPAI_PENJEMPUTAN -> {
                binding.btnKirim.setOnClickListener {
                    loadingDialog.show()
                    if (validateDriverPosition(radius)){
                        startUpdateSequence(STATUS_DI_LOKASI_PENJEMPUTAN, false, true)
                    }else{
                        loadingDialog.cancel()
                        createOkSnackbar(
                            binding.layout, "Posisi terlalu jauh dari lokasi tujuan!", this
                        )
                    }
                }
            }
            FUNCTION_TYPE_BERANGKAT_PENGIRIMAN -> {
                binding.btnKirim.setOnClickListener {
                    if (model.isCurrentSequenceFinish){
                        loadingDialog.show()
                        startUpdateSequence(STATUS_PENGIRIMAN, false, true)
                    }
                }
            }
            FUNCTION_TYPE_SAMPAI_PENGIRIMAN -> {
                binding.btnKirim.setOnClickListener {
                    loadingDialog.show()
                    if (validateDriverPosition(radius)){
                        startUpdateSequence(STATUS_DI_LOKASI_TUJUAN, false, true)
                    }else{
                        loadingDialog.cancel()
                        createOkSnackbar(
                            binding.layout, "Posisi terlalu jauh dari lokasi tujuan!", this
                        )
                    }
                }
            }
            else -> {
                binding.btnKirim.setOnClickListener {
                    TASK_PER_LOCATION_FINISHED = false
                    val sizeMultiDrop = model.multiDrop.size
                    val sequence = if (sizeMultiDrop > 0) sizeMultiDrop + 1
                    else 1
                    val locationAddressModel = LocationAddressModel(
                        sequence,
                        model.originLocationId,
                        model.destinationLocation,
                        model.destinationLocationAddress,
                        model.currentSequence,
                        model.isCurrentSequenceFinish,
                        model.isCurrentSequenceArrived,
                        model.isCurrentSequenceBASTSubmitted,
                        model.destinationLatitude,
                        model.destinationLongitude,
                        model.radiusCalculationDestination
                    )
                    CURRENT_LOCATION_ID = model.destinationLocationId.toLong()
                    gotoLokasiPenjemputan(locationAddressModel, model, false, 1.plus(sizeMultiDrop), true)
                }
            }
        }
    }

    private fun startUpdateSequence(status : String, goesToBast: Boolean, updateRedis : Boolean) {
        getDetailCargo()
        handler.postDelayed(
            { updateStatus(status, current_location_name, goesToBast, updateRedis) },
            500
        )
    }

    private fun updateStatus(
        status: String,
        currentLocationName: String,
        goesToBast: Boolean,
        updateRedis: Boolean
    ) {
        handler.postDelayed(
            {
                if (isGettingDetail){
                    updateStatus(status, currentLocationName, goesToBast, updateRedis)
                }else{
                    if (!loadingDialog.isShowing) {
                        loadingDialog.show()
                    }
                    loadingDialog.setMessage("Memperbaharui status pengiriman...")
                    val timeOffset: Long = getTimeOffset()
                    val updateStatusRequest = UpdateStatusRequest(
                        status,
                        currentLocationName,
                        timeOffset,
                        current_location_id.toLong(),
                        listDetailPerLocationModels[0].shipmentsId
                    )
                    updateStatusViewModel.setPatchStatusConfirmationMobile(updateStatusRequest)
                    updateStatusViewModel.getPatchStatusConfirmationMobile().observe(this, {
                        handleResponse(it, {
                            it.response?.data?.let { _ ->
                                loadingDialog.cancel()
                                Toast.makeText(this, "Berhasil", Toast.LENGTH_SHORT).show()
                                if (updateRedis) {
                                    if (status != STATUS_DI_LOKASI_PENJEMPUTAN && status != STATUS_DI_LOKASI_TUJUAN){
                                        if (model.currentSequence == 0L)model.currentSequence += 1
                                        else {
                                            if (model.isCurrentSequenceArrived!!) model.isCurrentSequenceArrived = false
                                            if (model.isCurrentSequenceFinish){
                                                model.currentSequence += 1
                                                model.isCurrentSequenceFinish = false
                                            }
                                        }
                                    }else{
                                        showPhoto = true
                                        model.isCurrentSequenceArrived = true
                                    }
                                }

                                determineActiveDetailButtons(model)
                                if (model.multiPick.size > 0) {
                                    val pickUpList: ArrayList<LocationAddressModel> = ArrayList()
                                    for (x in model.multiPick) {
                                        val location = LocationAddressModel(
                                            x.sequenceNo,
                                            x.locationId,
                                            x.locationName,
                                            x.locationAddress,
                                            model.currentSequence,
                                            model.isCurrentSequenceFinish,
                                            model.isCurrentSequenceArrived,
                                            model.isCurrentSequenceBASTSubmitted,
                                            x.latitude,
                                            x.longitude,
                                            x.radiusCalculation
                                        )
                                        pickUpList.add(location)

                                    }
                                    val pickupAdapter = LocationAddressDetilAdapter(pickUpList, true, model, model.isCurrentSequenceFinish)
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
                                            model.currentSequence,
                                            model.isCurrentSequenceFinish,
                                            model.isCurrentSequenceArrived,
                                            model.isCurrentSequenceBASTSubmitted,
                                            x.latitude,
                                            x.longitude,
                                            x.radiusCalculation
                                        )
                                        dropList.add(location)

                                    }
                                    val dropAdapter = LocationAddressDetilAdapter(dropList, false, model, model.isCurrentSequenceFinish)
                                    val dropLayoutManager = LinearLayoutManager(this)
                                    binding.rvDrops.layoutManager = dropLayoutManager
                                    binding.rvDrops.adapter = dropAdapter
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
            }, 500
        )
    }

    private fun getDetailCargo() {
        loadingDialog.setMessage("Mendapatkan detail pengiriman...")
        detailPerLocationViewModel.setGetDetailPerLocation()
        detailPerLocationViewModel.getDetailPerLocation().observe(this, {
            handleResponse(it, {
                it.response?.data?.let { x ->
                    listDetailPerLocationModels = x
                    isGettingDetail = false
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

    private fun getCurrentLocationRadius(currentLocation: Int) : Int {
        var radius = 0
        if (model.originLocationId == currentLocation){
            radius = model.radiusCalculationOriginal
        }else if (model.destinationLocationId == currentLocation){
            radius = model.radiusCalculationDestination
        }else{
            if (model.multiPick.size > 0){
                for (x in model.multiPick){
                    if (x.locationId == currentLocation){
                        radius = x.radiusCalculation
                        break
                    }
                }
            }else {
                if (model.multiDrop.size > 0){
                    for (x in model.multiDrop){
                        if (x.locationId == currentLocation){
                            radius = x.radiusCalculation
                            break
                        }
                    }
                }
            }
        }
        return radius
    }

    fun setCurrentLocationInfo(id: Int, name : String){
        current_location_id = id
        CURRENT_LOCATION_ID = current_location_id.toLong()
        current_location_name = name
    }

    private fun determineActiveDetailButtons(model:ShipmentModel){
        if (model.currentSequence <= 1 && !model.isCurrentSequenceFinish){
            binding.btnDetilInitial.visibility = View.VISIBLE
            binding.btnDetilInitialInactive.visibility = View.GONE
            binding.btnDetilFinal.visibility = View.GONE
            binding.btnDetilFinalInactive.visibility = View.VISIBLE
            if (model.currentSequence == 0L){
                current_location_id = model.originLocationId
                CURRENT_LOCATION_ID = current_location_id.toLong()
                current_location_name = model.originalLocation
                setBtnText(getString(R.string.berangkat_ke_lokasi_asal))
                setBtnFunction(FUNCTION_TYPE_BERANGKAT_PENJEMPUTAN)
            }else if (model.currentSequence == 1L && !model.isCurrentSequenceArrived!!){
                current_location_id = model.originLocationId
                CURRENT_LOCATION_ID = current_location_id.toLong()
                current_location_name = model.originalLocation
                setBtnText(getString(R.string.sampai_dilokasi_penjemputan_asal))
                setBtnFunction(FUNCTION_TYPE_SAMPAI_PENJEMPUTAN)
            }else {
                binding.btnKirim.visibility = View.GONE
                binding.v6.visibility = View.GONE
            }
        }else if (model.currentSequence >= model.totalSequence.minus(1)){
            binding.btnDetilFinal.visibility = View.VISIBLE
            binding.btnDetilFinalInactive.visibility = View.GONE
            if (model.isCurrentSequenceBASTSubmitted){
                binding.btnDetilFinal.visibility = View.VISIBLE
                binding.btnDetilFinalInactive.visibility = View.GONE
                binding.btnDetilInitial.visibility = View.GONE
                binding.btnDetilInitialInactive.visibility = View.VISIBLE
                binding.btnKirim.visibility = View.GONE
                binding.v6.visibility = View.GONE
            }else{
                binding.btnDetilFinal.visibility = View.GONE
                binding.btnDetilFinalInactive.visibility = View.VISIBLE
            }

            if (model.currentSequence == model.totalSequence.minus(1) && model.isCurrentSequenceFinish){
                binding.btnKirim.visibility = View.VISIBLE
                binding.v6.visibility = View.VISIBLE
                binding.btnDetilFinal.visibility = View.VISIBLE
                binding.btnDetilFinalInactive.visibility = View.GONE
                if (model.multiDrop.size == 0){
                    current_location_id = model.destinationLocationId
                    CURRENT_LOCATION_ID = current_location_id.toLong()
                    current_location_name = model.destinationLocation
                    setBtnText(getString(R.string.berangkat_ke_lokasi_pengiriman_akhir))
                    setBtnFunction(FUNCTION_TYPE_BERANGKAT_PENGIRIMAN)
                }else{
                    if (model.isCurrentSequenceBASTSubmitted){
                        current_location_id = model.destinationLocationId
                        CURRENT_LOCATION_ID = current_location_id.toLong()
                        current_location_name = model.destinationLocation
                        setBtnText(getString(R.string.berangkat_ke_lokasi_pengiriman_akhir))
                        setBtnFunction(FUNCTION_TYPE_BERANGKAT_PENGIRIMAN)
                    }
                }
            }else if (model.currentSequence == model.totalSequence){
                binding.btnKirim.visibility = View.VISIBLE
                binding.v6.visibility = View.VISIBLE
                binding.btnDetilFinal.visibility = View.VISIBLE
                binding.btnDetilFinalInactive.visibility = View.GONE
                if (!model.isCurrentSequenceArrived!!){
                    current_location_id = model.destinationLocationId
                    CURRENT_LOCATION_ID = current_location_id.toLong()
                    current_location_name = model.destinationLocation
                    setBtnText(getString(R.string.sampai_dilokasi_pengiriman_akhir))
                    setBtnFunction(FUNCTION_TYPE_SAMPAI_PENGIRIMAN)
                }else{
                    if (!model.isCurrentSequenceFinish){
                        setBtnText("Selesaikan Pengiriman")
                        setBtnFunction(FUNCTION_TYPE_SELESAI)
                    }else{
                        if (model.isCurrentSequenceBASTSubmitted){
                            binding.btnKirim.visibility = View.GONE
                            binding.v6.visibility = View.GONE
                            binding.btnDetilFinal.visibility = View.GONE
                            binding.btnDetilFinalInactive.visibility = View.VISIBLE
                            binding.btnDetilInitial.visibility = View.GONE
                            binding.btnDetilInitialInactive.visibility = View.VISIBLE
                        }else{
                            setBtnText(getString(R.string.berita_acara_serah_terima))
                            setBtnFunction(FUNCTION_TYPE_SELESAI)
                        }
                    }
                }
            }
        }
    }

    override fun onBackPressed() {
        finish()
    }

    override fun onResume() {
        super.onResume()
        initView()
    }

    override fun onRestart() {
        super.onRestart()
        initView()
    }

    fun goesToGoogleMaps(lat: Double, lon: Double, label: String) {
        val mapUri: Uri = Uri.parse("geo:$lat,$lon?q=$label")
        val mapIntent = Intent(Intent.ACTION_VIEW, mapUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        startActivity(mapIntent)
    }

    fun finishActivity(){finish()}

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

    private fun buildLoadingDialog() {
        loadingDialog = SpotsDialog.Builder()
            .setContext(this)
            .setMessage(R.string.loading)
            .setCancelable(false).build()
        loadingDialog.setCancelable(false)
        loadingDialog.hide()
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

    fun btnKirimGone(){
        binding.btnKirim.visibility = View.GONE
        binding.v6.visibility = View.GONE
        binding.btnDetilFinalInactive.visibility = View.VISIBLE
        binding.btnDetilFinal.visibility = View.GONE
    }
}