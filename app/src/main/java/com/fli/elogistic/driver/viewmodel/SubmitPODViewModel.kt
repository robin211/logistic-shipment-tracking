package com.fli.elogistic.driver.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.uploadDocument.SubmitDocumentPODRequest
import com.fli.elogistic.driver.repo.UploadDocumentImageRepo
import com.google.gson.JsonNull
import com.google.gson.JsonPrimitive


class SubmitPODViewModel
@ViewModelInject
constructor(var uploadDocumentImageRepo: UploadDocumentImageRepo): ViewModel(){

    private val submitPODTrigger = MutableLiveData<SubmitDocumentPODRequest>()

    private val submitPODResult: LiveData<Resource<ResponseWrapper<JsonPrimitive>>>

    init {
        submitPODResult = Transformations
            .switchMap(submitPODTrigger) {
                it.let { submitPODRequest -> uploadDocumentImageRepo.submitDocumentPOD(submitPODRequest) }
            }
    }

    fun setSubmitPOD(tz: Long) {
        val submitPODRequest = SubmitDocumentPODRequest(tz)
        submitPODTrigger.value = submitPODRequest
    }

    fun getSubmitPODResult() = submitPODResult

}
