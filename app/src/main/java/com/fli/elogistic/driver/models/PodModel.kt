package com.fli.elogistic.driver.models

import java.io.Serializable

class PodModel (
    var noKargo : String? = null,
    var tipeKendaraan : String? = null,
    var noKendaraan : String? = null,
    var datePickUp : String? = null,
    var timePickUp : String? = null,
    var initialLocation : String? = null,
    var pickUpLocations : String? = null,
    var dropLocations : String? = null,
    var lastLocation : String? = null,
    var status : String? = null
) : Serializable