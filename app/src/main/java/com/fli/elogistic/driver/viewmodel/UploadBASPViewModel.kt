package com.fli.elogistic.driver.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.uploadDocument.UploadBASPRequest
import com.fli.elogistic.driver.models.uploadDocument.UploadBASTRequest
import com.fli.elogistic.driver.repo.UploadDocumentImageRepo
import com.google.gson.JsonPrimitive


class UploadBASPViewModel
@ViewModelInject
constructor(var uploadDocumentImageRepo: UploadDocumentImageRepo): ViewModel(){

    private val postBASPTrigger = MutableLiveData<UploadBASPRequest>()

    private val postBASPResult: LiveData<Resource<ResponseWrapper<JsonPrimitive>>>

    init {
        postBASPResult = Transformations
            .switchMap(postBASPTrigger) {
                it.let { uploadBaspRequest -> uploadDocumentImageRepo.postBasp(uploadBaspRequest) }
            }
    }

    fun setPostBasp(shipmentId:Long, shipmentDetailId:Long,locationId: Long, baspTitle:String,
                    isNeedConfirm:Boolean, baspCategory:String, baspNotes:String, note:String,
                    receiverName:String, baspPhoto:ArrayList<String>,
                    documentationPhoto:ArrayList<String>, tz:Long) {
        val uploadBASPRequest = UploadBASPRequest(shipmentId,shipmentDetailId,locationId, baspTitle, isNeedConfirm, baspCategory,
        baspNotes, note, receiverName, baspPhoto, documentationPhoto, tz)
        postBASPTrigger.value = uploadBASPRequest
    }

    fun getPostBASPResult() = postBASPResult
}
