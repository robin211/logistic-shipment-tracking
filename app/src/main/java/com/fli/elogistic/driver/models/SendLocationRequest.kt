package com.fli.elogistic.driver.models

import com.google.gson.annotations.SerializedName

data class SendLocationRequest (
    @SerializedName("companyId") var companyId: Long,
    @SerializedName("cargoId") var cargoId: Long,
    @SerializedName("shipmentGroupId") var shipmentGroupId: Long,
    @SerializedName("longitude") var longitude: Double,
    @SerializedName("latitude") var latitude: Double
)
