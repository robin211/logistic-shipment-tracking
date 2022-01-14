package com.fli.elogistic.driver.models

import com.google.gson.annotations.SerializedName

data class ResponseWrapper<T>(
    @SerializedName("timestamp") var timestamp: String,
    @SerializedName("status") var status: String,
    @SerializedName("statusCode") var statusCode: Int,
    @SerializedName("message") var message: String,
    @SerializedName("data") var data: T?)