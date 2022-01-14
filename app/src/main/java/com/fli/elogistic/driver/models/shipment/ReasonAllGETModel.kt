package com.fli.elogistic.driver.models.shipment

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ReasonAllGETModel (
    @SerializedName("contents") val reasonAllModels: ArrayList<ReasonAllModel>,
    @SerializedName("page") val page: Int,
    @SerializedName("rowPerPage") val rowPerPage: Int,
    @SerializedName("totalData") val totalData: Int,
    @SerializedName("startRow") val startRow: Int,
    @SerializedName("totalPage") val totalPage: Int
) : Serializable