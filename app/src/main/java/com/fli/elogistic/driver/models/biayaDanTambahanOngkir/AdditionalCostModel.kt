package com.fli.elogistic.driver.models.biayaDanTambahanOngkir

import com.fli.elogistic.driver.models.shipment.AdditionalShippingCostDocumentModel
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class AdditionalCostModel (
    @SerializedName("name") val name: String,
    @SerializedName("amount") val amount: Double,
    @SerializedName("notes") val notes: String,
    @SerializedName("documents") val documents: ArrayList<BiayaOngkirDocumentModel>
) : Serializable