package com.fli.elogistic.driver.models.identity

import com.google.gson.annotations.SerializedName

data class ClientInfo (
    @SerializedName("id") val id: Long,
    @SerializedName("name") val name: String,
    @SerializedName("type") val type: String,
    @SerializedName("code") val code: String
)