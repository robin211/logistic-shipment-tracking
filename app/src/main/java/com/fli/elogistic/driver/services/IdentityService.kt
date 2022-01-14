package com.fli.elogistic.driver.services

import android.hardware.usb.UsbDevice.getDeviceId
import android.provider.Settings
import androidx.lifecycle.LiveData
import com.fli.elogistic.driver.constants.FCM_TOKEN
import com.fli.elogistic.driver.constants.IDENTITY_URL
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.identity.*
import com.fli.elogistic.driver.util.createToken
import com.fli.elogistic.driver.util.findDeviceID
import com.google.android.gms.common.api.GoogleApi
import com.google.gson.JsonNull
import com.google.gson.JsonPrimitive
import retrofit2.http.*

/*
* Contains all of the functions for network call, might be split based on the functionality
* of each network call (authorization, order, etc)
* */
interface IdentityService {
    @POST("$IDENTITY_URL/login")
    fun postLogin(
        @Body login: AuthenticationRequest,
        @Header("x-device-id") deviceId:String = findDeviceID(),
        @Header("firebase-token") firebaseToken:String = FCM_TOKEN
    ): LiveData<Resource<ResponseWrapper<AuthenticationResult>>>

    @GET("$IDENTITY_URL/verify")
    fun getVerifyEmail(@Query("email") email:String): LiveData<Resource<ResponseWrapper<VerificationResult>>>

    @POST("$IDENTITY_URL/activation")
    fun activateUser(
        @Body auth: AuthenticationRequest,
        @Header("x-device-id") deviceId:String = findDeviceID(),
        @Header("firebase-token") firebaseToken:String = FCM_TOKEN
    ): LiveData<Resource<ResponseWrapper<AuthenticationResult>>>

    @GET("$IDENTITY_URL/gps-package")
    fun getFakeGpsPackage(): LiveData<Resource<ResponseWrapper<List<FakeGpsPackageModel>>>>

    @GET("$IDENTITY_URL/whoami")
    fun getCurrentUser(
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID()
    ): LiveData<Resource<ResponseWrapper<UserInfo>>>

    @POST("$IDENTITY_URL/logout")
    fun postLogout(
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID()
    ): LiveData<Resource<ResponseWrapper<JsonNull>>>

    @PUT("$IDENTITY_URL/users/{id}")
    fun putEditUser(
        @Path("id") userId: Long,
        @Body request: EditUserRequest,
        @Header("Authorization") token:String = createToken()
    ): LiveData<Resource<ResponseWrapper<UserInfo>>>

    @PATCH("$IDENTITY_URL/change-password")
    fun postChangePassword(
        @Body request: ChangePasswordRequest,
        @Header("Authorization") token:String = createToken(),
        @Header("x-device-id") deviceId:String = findDeviceID()
    ): LiveData<Resource<ResponseWrapper<JsonPrimitive>>>
}