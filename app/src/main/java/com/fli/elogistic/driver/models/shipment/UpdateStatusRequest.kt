package com.fli.elogistic.driver.models.shipment

import com.google.gson.annotations.SerializedName

data class UpdateStatusRequest (
    @SerializedName("status") var status: String,
    @SerializedName("notes") var notes: String,
    @SerializedName("datetimeTz") var datetimeTz: Long,
    @SerializedName("locationId") var locationId: Long,
    @SerializedName("shipmentId") var shipmentId: Long,
)
