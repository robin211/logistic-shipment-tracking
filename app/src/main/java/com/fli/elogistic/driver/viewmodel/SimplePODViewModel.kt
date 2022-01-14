package com.fli.elogistic.driver.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.fli.elogistic.driver.models.POD.PodSimpleModel
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.repo.ShipmentRepo


class SimplePODViewModel
@ViewModelInject
constructor(var shipmentRepo: ShipmentRepo): ViewModel(){

    private val getSimplePODTrigger = MutableLiveData<Any?>()


    private val getSimplePODResult: LiveData<Resource<ResponseWrapper<ArrayList<PodSimpleModel>>>>


    init {
        getSimplePODResult = Transformations
            .switchMap(getSimplePODTrigger) {
                it.let { _ -> shipmentRepo.getSimplePOD() }
            }
    }

    fun setGetSimplePOD() {
        getSimplePODTrigger.value = true
    }

    fun getSimplePOD() = getSimplePODResult

}
