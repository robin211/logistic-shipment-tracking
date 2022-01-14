package com.fli.elogistic.driver.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.shipment.ReasonAllGETModel
import com.fli.elogistic.driver.repo.ShipmentRepo


class ReasonAllViewModel
@ViewModelInject
constructor(var shipmentRepo: ShipmentRepo): ViewModel(){

    private val getReasonBASPTrigger = MutableLiveData<Any?>()
    private val getReasonAccidentTrigger = MutableLiveData<Any?>()

    private val getReasonBASPResult: LiveData<Resource<ResponseWrapper<ReasonAllGETModel>>>
    private val getReasonAccidentResult: LiveData<Resource<ResponseWrapper<ReasonAllGETModel>>>

    init {
        getReasonBASPResult = Transformations
            .switchMap(getReasonBASPTrigger) {
                it.let { _ -> shipmentRepo.getReasonBASP() }
            }

        getReasonAccidentResult = Transformations
            .switchMap(getReasonAccidentTrigger) {
                it.let { _ -> shipmentRepo.getReasonAccident() }
            }
    }

    fun setGetReasonBASP() {
        getReasonBASPTrigger.value = true
    }

    fun setGetReasonAccident() {
        getReasonAccidentTrigger.value = true
    }

    fun getReasonBASP() = getReasonBASPResult
    fun getReasonAccident() = getReasonAccidentResult

}
