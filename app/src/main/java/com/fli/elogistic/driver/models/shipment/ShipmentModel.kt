package com.fli.elogistic.driver.models.shipment

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ShipmentModel (
    @SerializedName("id") val id: Long,
    @SerializedName("cargoTitle") val cargoTitle: String,
    @SerializedName("shipmentId") val shipmentId: Long,
    @SerializedName("shipmentTitle") val shipmentTitle: String,
    @SerializedName("shipmentDate") val shipmentDate: String,
    @SerializedName("shipmentStatus") val shipmentStatus: String,
    @SerializedName("tipeKendaraan") val tipeKendaraan: String,
    @SerializedName("noKendaraan") val noKendaraan: String,
    @SerializedName("totalSequence") val totalSequence: Long,
    @SerializedName("currentSequence") var currentSequence: Long,
    @SerializedName("isCurrentSequenceFinish") var isCurrentSequenceFinish: Boolean,
    @SerializedName("isCurrentSequenceBASTSubmitted") var isCurrentSequenceBASTSubmitted: Boolean,
    @SerializedName("isCurrentSequenceArrived") var isCurrentSequenceArrived: Boolean?,
    @SerializedName("originLocationId") val originLocationId: Int,
    @SerializedName("originalLocation") val originalLocation: String,
    @SerializedName("originalLocationAddress") val originalLocationAddress: String,
    @SerializedName("originalLatitude") val originalLatitude: Double,
    @SerializedName("originalLongitude") val originalLongitude: Double,
    @SerializedName("radiusCalculationOriginal") val radiusCalculationOriginal: Int,
    @SerializedName("multiPick") val multiPick: ArrayList<MultipickDropModel>,
    @SerializedName("destinationLocationId") val destinationLocationId: Int,
    @SerializedName("destinationLocation") val destinationLocation: String,
    @SerializedName("destinationLocationAddress") val destinationLocationAddress: String,
    @SerializedName("destinationLatitude") val destinationLatitude: Double,
    @SerializedName("destinationLongitude") val destinationLongitude: Double,
    @SerializedName("radiusCalculationDestination") val radiusCalculationDestination: Int,
    @SerializedName("multiDrop") val multiDrop: ArrayList<MultipickDropModel>,
    @SerializedName("listShipments") val listShipments: ArrayList<String>?
    ) : Serializable