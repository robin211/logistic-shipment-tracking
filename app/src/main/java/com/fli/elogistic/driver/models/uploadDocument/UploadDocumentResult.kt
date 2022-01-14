package com.fli.elogistic.driver.models.uploadDocument

import com.google.gson.annotations.SerializedName

data class UploadDocumentResult(
    @SerializedName("id") val id: Long,
    @SerializedName("documentType") val documentType: String,
    @SerializedName("documentName") val documentName: String,
    @SerializedName("imageUrl") val imageUrl: String
)