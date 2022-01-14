package com.fli.elogistic.driver.models.shipment

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ReasonAllModel (
    @SerializedName("id") val id: Long,
    @SerializedName("reason") val reason: String,
    @SerializedName("type") val type: String,
    @SerializedName("needConfirm") var needConfirm: Boolean,
    @SerializedName("isActive") var isActive: Boolean,
    @SerializedName("isFreeText") var isFreeText: Boolean,
    @SerializedName("createdBy") val createdBy: String,
    @SerializedName("createdAt") val createdAt: Long,
    @SerializedName("updatedBy") val updatedBy: String,
    @SerializedName("updatedAt") val updatedAt: Long,
    @SerializedName("isDeleted") var isDeleted: Boolean
    ) : Serializable