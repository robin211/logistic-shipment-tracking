package com.fli.elogistic.driver.models.biayaDanTambahanOngkir

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class AdditionalCostPUTModel (
    @SerializedName("data") val data: ArrayList<AdditionalCostModel>
) : Serializable