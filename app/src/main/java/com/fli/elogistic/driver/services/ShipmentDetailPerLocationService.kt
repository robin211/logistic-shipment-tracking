package com.fli.elogistic.driver.services

import androidx.lifecycle.LiveData
import com.fli.elogistic.driver.constants.*
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.shipment.DetailPerLocationModel
import com.fli.elogistic.driver.models.uploadDocument.SubmitDocumentPODRequest
import com.fli.elogistic.driver.models.uploadDocument.UploadBASTRequest
import com.fli.elogistic.driver.models.uploadDocument.UploadDocumentPODRequest
import com.fli.elogistic.driver.models.uploadDocument.UploadDocumentResult
import com.fli.elogistic.driver.util.createToken
import com.fli.elogistic.driver.util.findDeviceID
import com.google.gson.JsonNull
import com.google.gson.JsonPrimitive
import retrofit2.http.*

/*
* Contains all of the functions for network call, might be split based on the functionality
* of each network call (authorization, order, etc)
* */
interface ShipmentDetailPerLocationService {
    @GET("$SHIPMENT_URL/{shipmentsCargoId}/location/{locationId}")
    fun getDetailPerLocation(
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID(),
        @Path("shipmentsCargoId") shipmentsCargoId:Long = CURRENT_SHIPMENT_CARGO_ID,
        @Path("locationId") locationId:Long = CURRENT_LOCATION_ID
    ): LiveData<Resource<ResponseWrapper<ArrayList<DetailPerLocationModel>>>>
}