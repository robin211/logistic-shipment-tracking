package com.fli.elogistic.driver.models.shipment

import java.io.Serializable

data class DetailPerLocationWithPictureModel (
    val detailPerLocationModel: DetailPerLocationModel,
    val listImageSuratJalan: ArrayList<Any>?,
    val listImageDokumentasi: ArrayList<Any>?,
    val listImagePerintahPengiriman: ArrayList<Any>?
) : Serializable