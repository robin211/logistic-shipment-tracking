package com.fli.elogistic.driver.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.uploadDocument.UploadAccidentRequest
import com.fli.elogistic.driver.models.uploadDocument.UploadBASPRequest
import com.fli.elogistic.driver.models.uploadDocument.UploadBASTRequest
import com.fli.elogistic.driver.repo.UploadDocumentImageRepo
import com.google.gson.JsonPrimitive


class UploadAccidentViewModel
@ViewModelInject
constructor(var uploadDocumentImageRepo: UploadDocumentImageRepo): ViewModel(){

    private val postAccidentTrigger = MutableLiveData<UploadAccidentRequest>()

    private val postAccidentResult: LiveData<Resource<ResponseWrapper<JsonPrimitive>>>

    init {
        postAccidentResult = Transformations
            .switchMap(postAccidentTrigger) {
                it.let { uploadAccidentRequest -> uploadDocumentImageRepo.postAccident(uploadAccidentRequest) }
            }
    }

    fun setPostAccident(accidentReason:String, isNeedConfirm:Boolean, accidentReasonNotes: String?,
                        latitude:Double, longitude: Double, imageNote : String?,
                        encodedFile:ArrayList<String>) {
        val uploadAccidentRequest = UploadAccidentRequest(
            accidentReason, isNeedConfirm, accidentReasonNotes, latitude, longitude, imageNote, encodedFile
        )
        postAccidentTrigger.value = uploadAccidentRequest
    }

    fun getPostAccidentResult() = postAccidentResult
}
