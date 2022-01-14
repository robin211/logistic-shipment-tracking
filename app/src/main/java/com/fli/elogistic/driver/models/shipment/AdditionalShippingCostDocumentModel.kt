package com.fli.elogistic.driver.models.shipment

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class AdditionalShippingCostDocumentModel (
    @SerializedName("id") val id: Long,
    @SerializedName("url") val url: String
) : Serializable