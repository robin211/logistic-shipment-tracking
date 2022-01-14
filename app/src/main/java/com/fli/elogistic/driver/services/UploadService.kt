package com.fli.elogistic.driver.services

import androidx.lifecycle.LiveData
import com.fli.elogistic.driver.constants.*
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.uploadDocument.*
import com.fli.elogistic.driver.util.createToken
import com.fli.elogistic.driver.util.findDeviceID
import com.google.gson.JsonNull
import com.google.gson.JsonPrimitive
import retrofit2.http.*

/*
* Contains all of the functions for network call, might be split based on the functionality
* of each network call (authorization, order, etc)
* */
interface UploadService {
    @POST("$SHIPMENT_URL/{id}/document-pod/upload")
    fun postDocumentPOD(
        @Body upload: UploadDocumentPODRequest,
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID(),
        @Path("id") id:Long = CURRENT_SHIPMENT_CARGO_ID
    ): LiveData<Resource<ResponseWrapper<ArrayList<UploadDocumentResult>>>>

    @POST("$SHIPMENT_URL/{id}/document-pod/submit")
    fun submitDocumentPOD(
        @Body submit: SubmitDocumentPODRequest,
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID(),
        @Path("id") id:Long = CURRENT_SHIPMENT_CARGO_ID
    ): LiveData<Resource<ResponseWrapper<JsonPrimitive>>>

    @PATCH("$SHIPMENT_URL/{id}/status/bast")
    fun postBast(
        @Body upload: UploadBASTRequest,
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID(),
        @Path("id") id:Long = CURRENT_SHIPMENT_CARGO_ID
    ): LiveData<Resource<ResponseWrapper<JsonPrimitive>>>

    @POST("$SHIPMENT_URL/{id}/basp")
    fun submitBasp(
        @Body submit: UploadBASPRequest,
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID(),
        @Path("id") id:Long = CURRENT_SHIPMENT_CARGO_ID
    ): LiveData<Resource<ResponseWrapper<JsonPrimitive>>>

    @POST("$SHIPMENT_URL/{id}/accident")
    fun submitAccident(
        @Body submit: UploadAccidentRequest,
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID(),
        @Path("id") id:Long = CURRENT_SHIPMENT_CARGO_ID
    ): LiveData<Resource<ResponseWrapper<JsonPrimitive>>>

}