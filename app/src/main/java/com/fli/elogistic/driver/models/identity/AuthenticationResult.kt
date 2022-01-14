package com.fli.elogistic.driver.models.identity

import com.google.gson.annotations.SerializedName

data class AuthenticationResult(
    @SerializedName("token") val accessToken: String,
    @SerializedName("isSuspended") val isSuspended: Boolean
)