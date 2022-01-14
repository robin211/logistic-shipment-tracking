package com.fli.elogistic.driver.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.fli.elogistic.driver.models.POD.PodSimpleModel
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.shipment.DetailPerLocationModel
import com.fli.elogistic.driver.repo.ShipmentRepo
import com.fli.elogistic.driver.repo.TransporterRepo


class DetailPerLocationViewModel
@ViewModelInject
constructor(var transporterRepo: TransporterRepo): ViewModel(){

    private val getDetailPerLocationTrigger = MutableLiveData<Any?>()


    private val getDetailPerLocationResult: LiveData<Resource<ResponseWrapper<ArrayList<DetailPerLocationModel>>>>


    init {
        getDetailPerLocationResult = Transformations
            .switchMap(getDetailPerLocationTrigger) {
                it.let { _ -> transporterRepo.getDetailPerLocation() }
            }
    }

    fun setGetDetailPerLocation() {
        getDetailPerLocationTrigger.value = true
    }

    fun getDetailPerLocation() = getDetailPerLocationResult

}
