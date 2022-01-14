package com.fli.elogistic.driver.models.orders

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(primaryKeys = ["shipmentId","type"])
data class ImageListModel(
    @SerializedName("shipmentId") val shipmentId: Long,
    @SerializedName("type") val type: String,
    @SerializedName("urlList") val urlList: ArrayList<String>
)