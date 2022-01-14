package com.fli.elogistic.driver.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.uploadDocument.UploadDocumentPODRequest
import com.fli.elogistic.driver.models.uploadDocument.UploadDocumentResult
import com.fli.elogistic.driver.repo.UploadDocumentImageRepo


class UploadPODViewModel
@ViewModelInject
constructor(var uploadDocumentImageRepo: UploadDocumentImageRepo): ViewModel(){

    private val postPODDocumentTrigger = MutableLiveData<UploadDocumentPODRequest>()

    private val postPODDocumentResult: LiveData<Resource<ResponseWrapper<ArrayList<UploadDocumentResult>>>>

    init {
        postPODDocumentResult = Transformations
            .switchMap(postPODDocumentTrigger) {
                it.let { uploadPODRequest -> uploadDocumentImageRepo.postDocumentPOD(uploadPODRequest) }
            }
    }

    fun setPostDocumentPOD(name: String, type:String, images: ArrayList<String>) {
        val uploadPodRequest = UploadDocumentPODRequest(type, name, images)
        postPODDocumentTrigger.value = uploadPodRequest
    }

    fun getPostDocumentPODResult() = postPODDocumentResult

}
