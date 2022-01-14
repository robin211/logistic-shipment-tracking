package com.fli.elogistic.driver.models.shipment

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class AdditionalShippingCostModel (
    @SerializedName("id") val id: Long,
    @SerializedName("shipmentsCargoId") val shipmentsCargoId: Long,
    @SerializedName("shippingCostName") val shippingCostName: String,
    @SerializedName("amount") var amount: Double,
    @SerializedName("notes") var notes: String,
    @SerializedName("status") var status: String,
    @SerializedName("documents") val documents: ArrayList<AdditionalShippingCostDocumentModel>
    ) : Serializable