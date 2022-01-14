package com.fli.elogistic.driver.services

import androidx.lifecycle.LiveData
import com.fli.elogistic.driver.constants.*
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.SendLocationRequest
import com.fli.elogistic.driver.models.shipment.PostAutoAssignLocationRequest
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
interface SendLocationService {
    @POST("$SEND_LOCATION_URL/{driverId}")
    fun sendLocation(
        @Body body: SendLocationRequest,
        @Path("driverId") driverId:Int = DRIVER_ID
    ): LiveData<Resource<ResponseWrapper<JsonNull>>>
}