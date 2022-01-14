package com.fli.elogistic.driver.models.shipment

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DetailPerLocationModel (
    @SerializedName("shipmentsId") val shipmentsId: Long,
    @SerializedName("shipmentsTitle") val shipmentsTitle: String,
    @SerializedName("shipmentsDetailId") val shipmentsDetailId: Long,
    @SerializedName("shipmentsGroupId") val shipmentsGroupId: Long,
    @SerializedName("locationId") val locationId: Long,
    @SerializedName("picNameSender") val picNameSender: String?,
    @SerializedName("picPhoneSender") val picPhoneSender: String?,
    @SerializedName("notesSender") val notesSender: String?,
    @SerializedName("picName") val picName: String?,
    @SerializedName("picPhone") val picPhone: String?,
    @SerializedName("notes") val notes: String?,
    @SerializedName("categoryName") val categoryName: String,
    @SerializedName("subCategoryName") val subCategoryName: String,
    @SerializedName("goodsNote") val goodsNote: String,
    @SerializedName("isBasp") val isBasp: Boolean,
    @SerializedName("latestStatus") val latestStatus: String?,
    @SerializedName("isPicTaken") val isPicTaken: Boolean,
    @SerializedName("isBastTaken") val isBastTaken: Boolean
) : Serializable