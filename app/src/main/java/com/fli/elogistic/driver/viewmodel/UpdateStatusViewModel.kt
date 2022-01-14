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
import com.fli.elogistic.driver.models.shipment.UpdateStatusRequest
import com.fli.elogistic.driver.models.uploadDocument.UploadDocumentPODRequest
import com.fli.elogistic.driver.models.uploadDocument.UploadDocumentResult
import com.fli.elogistic.driver.repo.ShipmentRepo
import com.google.gson.JsonNull
import com.google.gson.JsonPrimitive


class UpdateStatusViewModel
@ViewModelInject
constructor(var shipmentRepo: ShipmentRepo): ViewModel(){

    private val patchUpdateStatusTrigger = MutableLiveData<UpdateStatusRequest>()

    private val patchUpdateStatusResult: LiveData<Resource<ResponseWrapper<JsonPrimitive>>>

    private val patchUpdateStatusMobileTrigger = MutableLiveData<UpdateStatusRequest>()

    private val patchUpdateStatusMobileResult: LiveData<Resource<ResponseWrapper<JsonPrimitive>>>

    init {
        patchUpdateStatusResult = Transformations
            .switchMap(patchUpdateStatusTrigger) {
                it.let { updateStatusRequest -> shipmentRepo.patchUpdateStatus(updateStatusRequest) }
            }

        patchUpdateStatusMobileResult = Transformations
            .switchMap(patchUpdateStatusMobileTrigger) {
                it.let { updateStatusRequest -> shipmentRepo.patchUpdateStatusMobile(updateStatusRequest) }
            }
    }

    fun setPatchStatusConfirmation(updateStatusRequest: UpdateStatusRequest) {
        patchUpdateStatusTrigger.value = updateStatusRequest
    }

    fun getPatchStatusConfirmation() = patchUpdateStatusResult

    fun setPatchStatusConfirmationMobile(updateStatusRequest: UpdateStatusRequest) {
        patchUpdateStatusMobileTrigger.value = updateStatusRequest
    }

    fun getPatchStatusConfirmationMobile() = patchUpdateStatusMobileResult

}
