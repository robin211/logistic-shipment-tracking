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
import com.fli.elogistic.driver.repo.ShipmentRepo


class ShipmentViewModel
@ViewModelInject
constructor(var shipmentRepo: ShipmentRepo): ViewModel(){

    private val getShipmentNeedConfirmationTrigger = MutableLiveData<Any?>()
    private val getShipmentOnProcessTrigger = MutableLiveData<Any?>()
    private val getShipmentFinishTrigger = MutableLiveData<Any?>()


    private val getShipmentNeedConfirmationResult: LiveData<Resource<ResponseWrapper<ShipmentGETModel>>>
    private val getShipmentOnProcessResult: LiveData<Resource<ResponseWrapper<ShipmentGETModel>>>
    private val getShipmentFinishResult: LiveData<Resource<ResponseWrapper<ShipmentGETModel>>>


    init {
        getShipmentNeedConfirmationResult = Transformations
            .switchMap(getShipmentNeedConfirmationTrigger) {
                it.let { _ -> shipmentRepo.getShipment(NEED_CONFIRMATION_SHIPMENT_STATUS) }
            }

        getShipmentOnProcessResult = Transformations
            .switchMap(getShipmentOnProcessTrigger) {
                it.let { _ -> shipmentRepo.getShipment(ON_PROCESS_SHIPMENT_STATUS) }
            }

        getShipmentFinishResult = Transformations
            .switchMap(getShipmentFinishTrigger) {
                it.let { _ -> shipmentRepo.getShipment(FINISH_SHIPMENT_STATUS) }
            }
    }

    fun setGetShipmentNeedConfirmation() {
        getShipmentNeedConfirmationTrigger.value = true
    }

    fun setGetShipmentOnProcess() {
        getShipmentOnProcessTrigger.value = true
    }

    fun setGetShipmentFinish() {
        getShipmentFinishTrigger.value = true
    }

    fun getShipmentNeedConfirmation() = getShipmentNeedConfirmationResult

    fun getShipmentOnProcess() = getShipmentOnProcessResult

    fun getShipmentFinish() = getShipmentFinishResult

}
