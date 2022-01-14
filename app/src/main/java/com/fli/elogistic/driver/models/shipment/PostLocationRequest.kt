package com.fli.elogistic.driver.models.shipment

import com.google.gson.annotations.SerializedName

data class PostAutoAssignLocationRequest (
    @SerializedName("cargoId") var cargoId: Long,
    @SerializedName("latitudeOrigin") var latitudeOrigin: Double,
    @SerializedName("longitudeOrigin") var longitudeOrigin: Double,
    @SerializedName("latitudeDriver") var latitudeDriver: Double,
    @SerializedName("longitudeDriver") var longitudeDriver: Double,
)
