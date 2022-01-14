package com.fli.elogistic.driver.models.shipment

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MultipickDropModel (
    @SerializedName("sequenceNo") val sequenceNo: Int,
    @SerializedName("locationId") val locationId: Int,
    @SerializedName("locationName") val locationName: String,
    @SerializedName("locationAddress") val locationAddress: String,
    @SerializedName("cityId") val cityId: Int,
    @SerializedName("cityName") val cityName: String,
    @SerializedName("latitude") val latitude: Double,
    @SerializedName("longitude") val longitude: Double,
    @SerializedName("radiusCalculation") val radiusCalculation: Int
) : Serializable