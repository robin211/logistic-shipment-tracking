package com.fli.elogistic.driver.models.biayaDanTambahanOngkir

import com.fli.elogistic.driver.models.shipment.AdditionalShippingCostDocumentModel
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class BiayaOngkirModel (
    @SerializedName("id") val id: Int,
    @SerializedName("shipmentsCargoId") val shipmentsCargoId: Int,
    @SerializedName("shippingCostName") val shippingCostName: String,
    @SerializedName("amount") val amount: Double,
    @SerializedName("notes") val notes: String,
    @SerializedName("status") val status: String,
    @SerializedName("documents") val documents: ArrayList<AdditionalShippingCostDocumentModel>
) : Serializable