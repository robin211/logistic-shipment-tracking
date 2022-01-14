package com.fli.elogistic.driver.services

import androidx.lifecycle.LiveData
import com.fli.elogistic.driver.constants.*
import com.fli.elogistic.driver.models.POD.PodSimpleModel
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.biayaDanTambahanOngkir.AdditionalCostPUTModel
import com.fli.elogistic.driver.models.shipment.*
import com.fli.elogistic.driver.util.createToken
import com.fli.elogistic.driver.util.findDeviceID
import com.google.gson.JsonPrimitive
import retrofit2.http.*

/*
* Contains all of the functions for network call, might be split based on the functionality
* of each network call (authorization, order, etc)
* */
interface ShipmentService {
    @GET("$SHIPMENT_URL/filter/$NEED_CONFIRMATION_SHIPMENT_STATUS/?size=20")
    fun getNeedConfirmation(
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID()
    ): LiveData<Resource<ResponseWrapper<ShipmentGETModel>>>

    @GET("$SHIPMENT_URL/filter/$ON_PROCESS_SHIPMENT_STATUS/?size=20")
    fun getOnProcess(
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID()
    ): LiveData<Resource<ResponseWrapper<ShipmentGETModel>>>

    @GET("$SHIPMENT_URL/filter/$FINISH_SHIPMENT_STATUS/?size=20")
    fun getFinish(
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID()
    ): LiveData<Resource<ResponseWrapper<ShipmentGETModel>>>

    @GET("$SHIPMENT_URL/filter/document-pod/mobile")
    fun getSimpleDocumentPOD(
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID()
    ): LiveData<Resource<ResponseWrapper<ArrayList<PodSimpleModel>>>>

    @PATCH("$SHIPMENT_URL/{id}/status/accepted")
    fun patchkonfirmasi(
        @Body tz: StatusConfirmationRequest,
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID(),
        @Path("id") id:Long = CURRENT_SHIPMENT_CARGO_ID
    ): LiveData<Resource<ResponseWrapper<JsonPrimitive>>>

    @PATCH("$SHIPMENT_URL/{id}/status/mobile")
    fun patchUpdateStatusMobile(
        @Body tz: UpdateStatusRequest,
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID(),
        @Path("id") id:Long = CURRENT_SHIPMENT_CARGO_ID
    ): LiveData<Resource<ResponseWrapper<JsonPrimitive>>>

    @PATCH("$SHIPMENT_URL/{id}/status")
    fun patchUpdateStatus(
        @Body tz: UpdateStatusRequest,
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID(),
        @Path("id") id:Long = CURRENT_SHIPMENT_CARGO_ID
    ): LiveData<Resource<ResponseWrapper<JsonPrimitive>>>

    @POST(AUTO_ASSIGN_URL)
    fun postAutoAssignLocation(
        @Body body: PostAutoAssignLocationRequest,
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID(),
    ): LiveData<Resource<ResponseWrapper<JsonPrimitive>>>

    @GET("$SHIPMENT_URL/reason/filter?type=qIn(basp)&size=500")
    fun getReasonBASP(
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID()
    ): LiveData<Resource<ResponseWrapper<ReasonAllGETModel>>>

    @GET("$SHIPMENT_URL/reason/filter?type=qIn(accident)&size=500")
    fun getReasonAccident(
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID()
    ): LiveData<Resource<ResponseWrapper<ReasonAllGETModel>>>

    @GET("$SHIPMENT_URL/{shipmentCargoId}/additional-shipping-cost")
    fun getAdditionalShippingCost(
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID(),
        @Path("shipmentCargoId") id:Long = CURRENT_SHIPMENT_CARGO_ID
    ): LiveData<Resource<ResponseWrapper<ArrayList<AdditionalShippingCostModel>>>>

    @GET("$SHIPMENT_URL/{shipmentCargoId}/shipping-cost")
    fun getShippingCost(
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID(),
        @Path("shipmentCargoId") id:Long = CURRENT_SHIPMENT_CARGO_ID
    ): LiveData<Resource<ResponseWrapper<ArrayList<AdditionalShippingCostModel>>>>

    @PUT("$SHIPMENT_URL/{shipmentCargoId}/additional-shipping-cost")
    fun putAdditionalShippingCost(
        @Body body: AdditionalCostPUTModel,
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID(),
        @Path("shipmentCargoId") id:Long = CURRENT_SHIPMENT_CARGO_ID
    ): LiveData<Resource<ResponseWrapper<JsonPrimitive>>>

}