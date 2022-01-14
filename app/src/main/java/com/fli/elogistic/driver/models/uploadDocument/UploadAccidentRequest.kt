package com.fli.elogistic.driver.models.uploadDocument

import com.google.gson.annotations.SerializedName

data class UploadAccidentRequest (
    @SerializedName("accidentReason") var accidentReason: String,
    @SerializedName("isNeedConfirm") var isNeedConfirm: Boolean,
    @SerializedName("accidentReasonNotes") var accidentReasonNotes: String?,
    @SerializedName("latitude") var latitude: Double,
    @SerializedName("longitude") var longitude: Double,
    @SerializedName("imageNote") var imageNote: String?,
    @SerializedName("encodedFile") var encodedFile: ArrayList<String>
)
