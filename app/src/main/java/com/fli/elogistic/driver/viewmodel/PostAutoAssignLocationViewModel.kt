package com.fli.elogistic.driver.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.fli.elogistic.driver.models.POD.PodSimpleModel
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.shipment.PostAutoAssignLocationRequest
import com.fli.elogistic.driver.models.shipment.StatusConfirmationRequest
import com.fli.elogistic.driver.models.shipment.UpdateStatusRequest
import com.fli.elogistic.driver.models.uploadDocument.UploadDocumentPODRequest
import com.fli.elogistic.driver.models.uploadDocument.UploadDocumentResult
import com.fli.elogistic.driver.repo.ShipmentRepo
import com.google.gson.JsonNull
import com.google.gson.JsonPrimitive


class PostAutoAssignLocationViewModel
@ViewModelInject
constructor(var shipmentRepo: ShipmentRepo): ViewModel(){

    private val postAutoAssignLocationTrigger = MutableLiveData<PostAutoAssignLocationRequest>()

    private val postAutoAssignLocationResult: LiveData<Resource<ResponseWrapper<JsonPrimitive>>>

    init {
        postAutoAssignLocationResult = Transformations
            .switchMap(postAutoAssignLocationTrigger) {
                it.let { postAutoAssignLocationrequest -> shipmentRepo.postAutoAssignLocation(postAutoAssignLocationrequest) }
            }
    }

    fun setPostAutoAssignLocation(postAutoAssignLocationRequest: PostAutoAssignLocationRequest) {
        postAutoAssignLocationTrigger.value = postAutoAssignLocationRequest
    }

    fun getPostAutoAssignLocation() = postAutoAssignLocationResult

}
