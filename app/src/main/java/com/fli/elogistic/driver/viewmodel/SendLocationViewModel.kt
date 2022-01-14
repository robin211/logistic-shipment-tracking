package com.fli.elogistic.driver.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.SendLocationRequest
import com.fli.elogistic.driver.repo.SendLocationRepo
import com.google.gson.JsonNull


class SendLocationViewModel
@ViewModelInject
constructor(var sendLocationRepo: SendLocationRepo): ViewModel(){

    private val getSendLocationTrigger = MutableLiveData<SendLocationRequest>()

    private val getSendLocationResult: LiveData<Resource<ResponseWrapper<JsonNull>>>

    init {

        getSendLocationResult = Transformations
            .switchMap(getSendLocationTrigger) {
                it.let { sendLocationrequest -> sendLocationRepo.sendLocation(sendLocationrequest) }
            }
    }


    fun setSendLocation(sendLocationModel: SendLocationRequest) {
        getSendLocationTrigger.value = sendLocationModel
    }

    fun getSendLocation() = getSendLocationResult

}
