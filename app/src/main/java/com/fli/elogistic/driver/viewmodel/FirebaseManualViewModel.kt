package com.fli.elogistic.driver.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.fli.elogistic.driver.constants.FINISH_SHIPMENT_STATUS
import com.fli.elogistic.driver.constants.NEED_CONFIRMATION_SHIPMENT_STATUS
import com.fli.elogistic.driver.constants.ON_PROCESS_SHIPMENT_STATUS
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.shipment.ShipmentGETModel
import com.fli.elogistic.driver.repo.FirebaseManualRepo
import com.fli.elogistic.driver.repo.ShipmentRepo
import com.google.gson.JsonNull


class FirebaseManualViewModel
@ViewModelInject
constructor(var firebaseManualRepo: FirebaseManualRepo): ViewModel(){

    private val getSubscribeToTopicTrigger = MutableLiveData<Any?>()
    private val getSubscribeToTopicResult: LiveData<Resource<ResponseWrapper<JsonNull>>>

    init {
        getSubscribeToTopicResult = Transformations
            .switchMap(getSubscribeToTopicTrigger) {
                it.let { _ -> firebaseManualRepo.subscribeToTopics() }
            }

    }

    fun setGetSubscribeToTopic() {
        getSubscribeToTopicTrigger.value = true
    }

    fun getSubscribeToTopic() = getSubscribeToTopicResult

}
