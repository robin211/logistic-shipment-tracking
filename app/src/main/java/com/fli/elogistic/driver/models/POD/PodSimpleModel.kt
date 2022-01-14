package com.fli.elogistic.driver.models.POD

import com.fli.elogistic.driver.models.shipment.MultipickDropModel
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PodSimpleModel (
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("pickupDate") val pickupDate: Long,
    @SerializedName("latestStatus") val latestStatus: String,

    @SerializedName("cargoTitle") val cargoTitle: String,
    @SerializedName("shipmentId") val shipmentId: Long,
    @SerializedName("shipmentGroupId") val shipmentGroupId: Long,
    @SerializedName("shipmentTitle") val shipmentTitle: String,
    @SerializedName("shipmentDate") val shipmentDate: String,
    @SerializedName("shipmentStatus") val shipmentStatus: String,
    @SerializedName("tipeKendaraan") val tipeKendaraan: String,
    @SerializedName("noKendaraan") val noKendaraan: String,
    @SerializedName("totalSequence") val totalSequence: Long?,
    @SerializedName("currentSequence") val currentSequence: Long?,
    @SerializedName("isCurrentSequenceFinish") val isCurrentSequenceFinish: Boolean?,
    @SerializedName("isCurrentSequenceBASTSubmitted") val isCurrentSequenceBASTSubmitted: Boolean?,
    @SerializedName("originLocationId") val originLocationId: Long,
    @SerializedName("originalLocation") val originalLocation: String,
    @SerializedName("originalLocationAddress") val originalLocationAddress: String,
    @SerializedName("originalLatitude") val originalLatitude: Double,
    @SerializedName("originalLongitude") val originalLongitude: Double,
    @SerializedName("multiPick") val multiPick: ArrayList<MultipickDropModel>,
    @SerializedName("destinationLocationId") val destinationLocationId: Long,
    @SerializedName("destinationLocation") val destinationLocation: String,
    @SerializedName("destinationLocationAddress") val destinationLocationAddress: String,
    @SerializedName("destinationLatitude") val destinationLatitude: Double,
    @SerializedName("destinationLongitude") val destinationLongitude: Double,
    @SerializedName("multiDrop") val multiDrop: ArrayList<MultipickDropModel>

    ) : Serializable