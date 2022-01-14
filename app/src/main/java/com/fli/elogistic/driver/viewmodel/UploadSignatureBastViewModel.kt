package com.fli.elogistic.driver.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.uploadDocument.UploadBASTRequest
import com.fli.elogistic.driver.repo.UploadDocumentImageRepo
import com.google.gson.JsonPrimitive


class UploadSignatureBastViewModel
@ViewModelInject
constructor(var uploadDocumentImageRepo: UploadDocumentImageRepo): ViewModel(){

    private val postSignatureBastTrigger = MutableLiveData<UploadBASTRequest>()

    private val postSignatureBastResult: LiveData<Resource<ResponseWrapper<JsonPrimitive>>>

    init {
        postSignatureBastResult = Transformations
            .switchMap(postSignatureBastTrigger) {
                it.let { uploadBastRequest -> uploadDocumentImageRepo.postSignatureBast(uploadBastRequest) }
            }
    }

    fun setPostSignatureBast(tz: Long, shipmentId:Long, shipmentDetailId:Long,locationId: Long, base64Image:String, notes: String) {
        val uploadBASTRequest = UploadBASTRequest(tz, shipmentId, shipmentDetailId,locationId, base64Image, notes)
        postSignatureBastTrigger.value = uploadBASTRequest
    }

    fun getPostSignatureBastResult() = postSignatureBastResult

}
