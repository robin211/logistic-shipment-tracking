package com.fli.elogistic.driver.models.identity

import com.google.gson.annotations.SerializedName

data class UserInfo (
    @SerializedName("driverId") val driverId: Int,
    @SerializedName("name") val name: String,
    @SerializedName("email") val email: String,
    @SerializedName("phoneNo") val phoneNo: String,
    @SerializedName("profileImageUrl") val imageUrl: String,
    @SerializedName("companyId") val companyId: Int,
    @SerializedName("companyName") val companyName: String
)