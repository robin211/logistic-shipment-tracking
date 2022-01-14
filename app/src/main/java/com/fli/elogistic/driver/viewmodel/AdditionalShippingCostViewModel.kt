package com.fli.elogistic.driver.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.biayaDanTambahanOngkir.AdditionalCostPUTModel
import com.fli.elogistic.driver.models.shipment.AdditionalShippingCostModel
import com.fli.elogistic.driver.repo.ShipmentRepo
import com.google.gson.JsonPrimitive


class AdditionalShippingCostViewModel
@ViewModelInject
constructor(var shipmentRepo: ShipmentRepo): ViewModel(){

    private val getAdditionalShippingCostTrigger = MutableLiveData<Any?>()
    private val getShippingCostTrigger = MutableLiveData<Any?>()
    private val getPutAdditionalShippingCostTrigger = MutableLiveData<AdditionalCostPUTModel>()

    private val getAdditionalShippingCostResult: LiveData<Resource<ResponseWrapper<ArrayList<AdditionalShippingCostModel>>>>
    private val getShippingCostResult: LiveData<Resource<ResponseWrapper<ArrayList<AdditionalShippingCostModel>>>>
    private val getPutAdditionalShippingCostResult: LiveData<Resource<ResponseWrapper<JsonPrimitive>>>

    init {
        getAdditionalShippingCostResult = Transformations
            .switchMap(getAdditionalShippingCostTrigger) {
                it.let { _ -> shipmentRepo.getAdditionalShippingCost() }
            }

        getShippingCostResult = Transformations
            .switchMap(getShippingCostTrigger) {
                it.let { _ -> shipmentRepo.getShippingCost() }
            }

        getPutAdditionalShippingCostResult = Transformations
            .switchMap(getPutAdditionalShippingCostTrigger) {
                it.let { additionalCostPUTModel -> shipmentRepo.putAdditionalShippingCost(additionalCostPUTModel) }
            }
    }

    fun setAdditionalShippingCost() {
        getAdditionalShippingCostTrigger.value = true
    }

    fun setShippingCost() {
        getShippingCostTrigger.value = true
    }

    fun setPutAdditionalShippingCost(additionalCostPUTModel: AdditionalCostPUTModel) {
        getPutAdditionalShippingCostTrigger.value = additionalCostPUTModel
    }

    fun getAdditionalShippingCost() = getAdditionalShippingCostResult
    fun getShippingCost() = getShippingCostResult
    fun getPutAdditionalShippingCost() = getPutAdditionalShippingCostResult

}
