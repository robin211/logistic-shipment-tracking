package com.fli.elogistic.driver.models.biayaDanTambahanOngkir

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class BiayaOngkirDocumentModel (
    @SerializedName("encodedImage") val encodedImage: String
) : Serializable