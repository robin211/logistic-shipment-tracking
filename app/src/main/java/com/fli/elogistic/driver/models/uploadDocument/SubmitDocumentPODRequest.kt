package com.fli.elogistic.driver.models.uploadDocument

import com.google.gson.annotations.SerializedName

data class SubmitDocumentPODRequest (
    @SerializedName("datetimeTz") var datetimeTz: Long
)
