package com.fli.elogistic.driver.models.identity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class FakeGpsPackageModel(
    @PrimaryKey @SerializedName("id") val id: Int,
    @SerializedName("packageName") val packageName: String,
    @SerializedName("createdAt") val createdAt: Long
)