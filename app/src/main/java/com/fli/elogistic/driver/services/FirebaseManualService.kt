package com.fli.elogistic.driver.services

import androidx.lifecycle.LiveData
import com.fli.elogistic.driver.constants.*
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
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
interface FirebaseManualService {
    @POST("$FCM_URL/iid/{fcm_token}/rel/topics/{topic_name}")
    fun subscribeToFCMTopics(
        @Header("Authorization") serverKey:String = FCM_SERVER_KEY,
        @Path("fcm_token") fcmToken:String = FCM_TOKEN,
        @Path("topic_name") topicName:String = TOPIC_TO_SUBSCRIBE,
    ): LiveData<Resource<ResponseWrapper<JsonNull>>>
}