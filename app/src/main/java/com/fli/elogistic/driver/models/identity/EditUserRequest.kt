package com.fli.elogistic.driver.models.identity

import com.google.gson.annotations.SerializedName

data class EditUserRequest(
    @Transient val id: Long,
    @SerializedName("username") var username: String,
    @SerializedName("phone") var phone: String,
    @SerializedName("imageUrl") var imageUrl: String

)