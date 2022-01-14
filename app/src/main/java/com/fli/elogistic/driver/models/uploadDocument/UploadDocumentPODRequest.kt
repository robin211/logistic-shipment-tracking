package com.fli.elogistic.driver.models.uploadDocument

import com.google.gson.annotations.SerializedName

data class UploadDocumentPODRequest (
    @SerializedName("documentType") var documentType: String,
    @SerializedName("documentName") var documentName: String,
    @SerializedName("encodedImages") var encodedImages: ArrayList<String>
)
