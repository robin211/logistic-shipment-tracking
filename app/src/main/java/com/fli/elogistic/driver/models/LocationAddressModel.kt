package com.fli.elogistic.driver.models

import java.io.Serializable

class LocationAddressModel (
    var sequence : Int? = null,
    var locationId : Int? = null,
    var location : String? = null,
    var address : String? = null,
    var currentSequence : Long,
    var isCurretSequenceFinished : Boolean,
    var isCurrentSequenceArrived : Boolean?,
    var isCurretSequenceBASTSubmitted : Boolean,
    var latitude : Double,
    var longitude : Double,
    var radiusCalculation : Int
) : Serializable