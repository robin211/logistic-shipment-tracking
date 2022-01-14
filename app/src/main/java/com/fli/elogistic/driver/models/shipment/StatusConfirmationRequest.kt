package com.fli.elogistic.driver.models.shipment

import com.google.gson.annotations.SerializedName

data class StatusConfirmationRequest (
    @SerializedName("datetimeTz") var datetimeTz: Long
)
