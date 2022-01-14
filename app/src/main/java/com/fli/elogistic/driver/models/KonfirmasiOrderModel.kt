package com.fli.elogistic.driver.models

import java.io.Serializable

class KonfirmasiOrderModel (
    var id : Long? = 0L,
    var noKargo : String? = null,
    var tipeKendaraan : String? = null,
    var noKendaraan : String? = null,
    var datePickUp : String? = null,
    var timePickUp : String? = null,
    var initialLocation : String? = null,
    var pickUpLocations : String? = null,
    var dropLocations : String? = null,
    var lastLocation : String? = null,
    var status : String? = null,
    var initStart : Boolean? = false,
    var initFinish : Boolean? = false,
    var pickOneStart : Boolean? = false,
    var pickOneFinish : Boolean? = false,
    var pickTwoStart : Boolean? = false,
    var pickTwoFinish : Boolean? = false,
    var finalStart : Boolean? = false,
    var finalFinish : Boolean? = false,
    var dropOneStart : Boolean? = false,
    var dropOneFinish : Boolean? = false,
    var dropTwoStart : Boolean? = false,
    var dropTwoFinish : Boolean? = false
) : Serializable