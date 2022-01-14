package com.fli.elogistic.driver.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.fli.elogistic.driver.models.POD.PodSimpleModel
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.shipment.StatusConfirmationRequest
import com.fli.elogistic.driver.models.uploadDocument.UploadDocumentPODRequest
import com.fli.elogistic.driver.models.uploadDocument.UploadDocumentResult
import com.fli.elogistic.driver.repo.ShipmentRepo
import com.google.gson.JsonNull
import com.google.gson.JsonPrimitive


class StatusConfirmationViewModel
@ViewModelInject
constructor(var shipmentRepo: ShipmentRepo): ViewModel(){

    private val patchStatusConfirmationTrigger = MutableLiveData<StatusConfirmationRequest>()

    private val patchStatusConfirmationResult: LiveData<Resource<ResponseWrapper<JsonPrimitive>>>

    init {
        patchStatusConfirmationResult = Transformations
            .switchMap(patchStatusConfirmationTrigger) {
                it.let { statusConfirmationRequest -> shipmentRepo.patchStatusConfirmation(statusConfirmationRequest) }
            }
    }

    fun setPatchStatusConfirmation(tz : Long) {
        val statusConfirmationRequest = StatusConfirmationRequest(tz)
        patchStatusConfirmationTrigger.value = statusConfirmationRequest
    }

    fun getPatchStatusConfirmation() = patchStatusConfirmationResult

}
