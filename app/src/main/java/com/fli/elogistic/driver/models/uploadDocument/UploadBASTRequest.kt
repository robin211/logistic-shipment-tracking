package com.fli.elogistic.driver.models.uploadDocument

import com.google.gson.annotations.SerializedName

data class UploadBASTRequest (
    @SerializedName("datetimeTz") var datetimeTz: Long,
    @SerializedName("shipmentId") var shipmentId: Long,
    @SerializedName("shipmentDetailId") var shipmentDetailId: Long,
    @SerializedName("locationId") var locationId: Long,
    @SerializedName("encodedFile") var encodedFile: String,
    @SerializedName("notes") var notes: String
)
