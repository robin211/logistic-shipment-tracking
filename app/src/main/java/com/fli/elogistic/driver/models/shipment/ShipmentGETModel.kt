package com.fli.elogistic.driver.models.shipment

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ShipmentGETModel (
    @SerializedName("contents") val shipmentModels: ArrayList<ShipmentModel>,
    @SerializedName("page") val page: Int,
    @SerializedName("rowPerPage") val rowPerPage: Int,
    @SerializedName("totalData") val totalData: Int,
    @SerializedName("startRow") val startRow: Int,
    @SerializedName("totalPage") val totalPage: Int
) : Serializable