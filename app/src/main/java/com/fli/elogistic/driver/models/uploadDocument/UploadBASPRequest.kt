package com.fli.elogistic.driver.models.uploadDocument

import com.google.gson.annotations.SerializedName

data class UploadBASPRequest (
    @SerializedName("shipmentsId") var shipmentId: Long,
    @SerializedName("shipmentsDetailId") var shipmentDetailId: Long,
    @SerializedName("locationId") var locationId: Long,
    @SerializedName("baspTitle") var baspTitle: String,
    @SerializedName("isNeedConfirm") var isNeedConfirm: Boolean,
    @SerializedName("baspCategory") var baspCategory: String,
    @SerializedName("baspNotes") var baspNotes: String,
    @SerializedName("note") var note: String,
    @SerializedName("receiverName") var receiverName: String,
    @SerializedName("baspPhoto") var baspPhoto: ArrayList<String>,
    @SerializedName("documentationPhoto") var documentationPhoto: ArrayList<String>,
    @SerializedName("datetimeTz") var datetimeTz: Long
)
