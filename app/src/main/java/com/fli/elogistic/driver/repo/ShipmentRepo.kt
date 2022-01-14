package com.fli.elogistic.driver.repo

import android.os.Handler
import androidx.lifecycle.LiveData
import com.fli.elogistic.driver.AppExecutors
import com.fli.elogistic.driver.constants.NEED_CONFIRMATION_SHIPMENT_STATUS
import com.fli.elogistic.driver.constants.ON_PROCESS_SHIPMENT_STATUS
import com.fli.elogistic.driver.models.POD.PodSimpleModel
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.biayaDanTambahanOngkir.AdditionalCostPUTModel
import com.fli.elogistic.driver.models.shipment.*
import com.fli.elogistic.driver.services.ShipmentService
import com.fli.elogistic.driver.util.AbsentLiveData
import com.google.gson.JsonPrimitive
import javax.inject.Inject

class ShipmentRepo
@Inject
constructor(
    private val appExecutors: AppExecutors,
    private val shipmentService: ShipmentService
) {

    val handler: Handler = Handler()

    fun getShipment(status: String): LiveData<Resource<ResponseWrapper<ShipmentGETModel>>> {
        var resultDb: ResponseWrapper<ShipmentGETModel>? = null
        return object :
            NetworkBoundResource<ResponseWrapper<ShipmentGETModel>, ResponseWrapper<ShipmentGETModel>>(
                appExecutors
            ) {
            override fun saveCallResult(item: ResponseWrapper<ShipmentGETModel>) {
                resultDb = item
            }

            override fun shouldFetch(data: ResponseWrapper<ShipmentGETModel>?): Boolean {
                return true
            }

            override fun loadFromDb(): LiveData<ResponseWrapper<ShipmentGETModel>> {
                return if (resultDb == null) {
                    AbsentLiveData.create()
                } else {
                    object : LiveData<ResponseWrapper<ShipmentGETModel>>() {
                        override fun onActive() {
                            super.onActive()
                            resultDb?.let {
                                value = it
                            }

                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<ShipmentGETModel>>> {
                return when (status) {
                    NEED_CONFIRMATION_SHIPMENT_STATUS -> {
                        shipmentService.getNeedConfirmation()
                    }
                    ON_PROCESS_SHIPMENT_STATUS -> {
                        shipmentService.getOnProcess()
                    }
                    else -> {
                        shipmentService.getFinish()
                    }
                }
            }

            override fun onFetchFailed() {
                handler.postDelayed({ getShipment(status) }, 1000)
            }
        }.asLiveData()
    }

    fun getSimplePOD(): LiveData<Resource<ResponseWrapper<ArrayList<PodSimpleModel>>>> {
        var resultDb: ResponseWrapper<ArrayList<PodSimpleModel>>? = null
        return object :
            NetworkBoundResource<ResponseWrapper<ArrayList<PodSimpleModel>>, ResponseWrapper<ArrayList<PodSimpleModel>>>(
                appExecutors
            ) {
            override fun saveCallResult(item: ResponseWrapper<ArrayList<PodSimpleModel>>) {
                resultDb = item
            }

            override fun shouldFetch(data: ResponseWrapper<ArrayList<PodSimpleModel>>?): Boolean {
                return true
            }

            override fun loadFromDb(): LiveData<ResponseWrapper<ArrayList<PodSimpleModel>>> {
                return if (resultDb == null) {
                    AbsentLiveData.create()
                } else {
                    object : LiveData<ResponseWrapper<ArrayList<PodSimpleModel>>>() {
                        override fun onActive() {
                            super.onActive()
                            resultDb?.let {
                                value = it
                            }

                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<ArrayList<PodSimpleModel>>>> {
                return shipmentService.getSimpleDocumentPOD()
            }

            override fun onFetchFailed() {
                handler.postDelayed({ getSimplePOD() }, 1000)
            }
        }.asLiveData()
    }

    fun patchStatusConfirmation(StatusConfirmationRequest: StatusConfirmationRequest): LiveData<Resource<ResponseWrapper<JsonPrimitive>>> {
        var resultDb: ResponseWrapper<JsonPrimitive>? = null
        return object :
            NetworkBoundResource<ResponseWrapper<JsonPrimitive>, ResponseWrapper<JsonPrimitive>>(
                appExecutors
            ) {
            override fun saveCallResult(item: ResponseWrapper<JsonPrimitive>) {
                resultDb = item
            }

            override fun shouldFetch(data: ResponseWrapper<JsonPrimitive>?): Boolean {
                return true
            }

            override fun loadFromDb(): LiveData<ResponseWrapper<JsonPrimitive>> {
                return if (resultDb == null) {
                    AbsentLiveData.create()
                } else {
                    object : LiveData<ResponseWrapper<JsonPrimitive>>() {
                        override fun onActive() {
                            super.onActive()
                            resultDb?.let {
                                value = it
                            }

                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<JsonPrimitive>>> {
                return shipmentService.patchkonfirmasi(StatusConfirmationRequest)
            }

            override fun onFetchFailed() {
                handler.postDelayed({ patchStatusConfirmation(StatusConfirmationRequest) }, 1000)
            }
        }.asLiveData()
    }

    fun patchUpdateStatus(updateStatusRequest: UpdateStatusRequest): LiveData<Resource<ResponseWrapper<JsonPrimitive>>> {
        var resultDb: ResponseWrapper<JsonPrimitive>? = null
        return object :
            NetworkBoundResource<ResponseWrapper<JsonPrimitive>, ResponseWrapper<JsonPrimitive>>(
                appExecutors
            ) {
            override fun saveCallResult(item: ResponseWrapper<JsonPrimitive>) {
                resultDb = item
            }

            override fun shouldFetch(data: ResponseWrapper<JsonPrimitive>?): Boolean {
                return true
            }

            override fun loadFromDb(): LiveData<ResponseWrapper<JsonPrimitive>> {
                return if (resultDb == null) {
                    AbsentLiveData.create()
                } else {
                    object : LiveData<ResponseWrapper<JsonPrimitive>>() {
                        override fun onActive() {
                            super.onActive()
                            resultDb?.let {
                                value = it
                            }

                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<JsonPrimitive>>> {
                return shipmentService.patchUpdateStatus(updateStatusRequest)
            }

            override fun onFetchFailed() {
                handler.postDelayed({ patchUpdateStatus(updateStatusRequest) }, 1000)
            }
        }.asLiveData()
    }

    fun patchUpdateStatusMobile(updateStatusRequest: UpdateStatusRequest): LiveData<Resource<ResponseWrapper<JsonPrimitive>>> {
        var resultDb: ResponseWrapper<JsonPrimitive>? = null
        return object :
            NetworkBoundResource<ResponseWrapper<JsonPrimitive>, ResponseWrapper<JsonPrimitive>>(
                appExecutors
            ) {
            override fun saveCallResult(item: ResponseWrapper<JsonPrimitive>) {
                resultDb = item
            }

            override fun shouldFetch(data: ResponseWrapper<JsonPrimitive>?): Boolean {
                return true
            }

            override fun loadFromDb(): LiveData<ResponseWrapper<JsonPrimitive>> {
                return if (resultDb == null) {
                    AbsentLiveData.create()
                } else {
                    object : LiveData<ResponseWrapper<JsonPrimitive>>() {
                        override fun onActive() {
                            super.onActive()
                            resultDb?.let {
                                value = it
                            }

                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<JsonPrimitive>>> {
                return shipmentService.patchUpdateStatusMobile(updateStatusRequest)
            }

            override fun onFetchFailed() {
                handler.postDelayed({ patchUpdateStatusMobile(updateStatusRequest) }, 1000)
            }
        }.asLiveData()
    }

    fun postAutoAssignLocation(postAutoAssignLocationRequest: PostAutoAssignLocationRequest): LiveData<Resource<ResponseWrapper<JsonPrimitive>>> {
        var resultDb: ResponseWrapper<JsonPrimitive>? = null
        return object :
            NetworkBoundResource<ResponseWrapper<JsonPrimitive>, ResponseWrapper<JsonPrimitive>>(
                appExecutors
            ) {
            override fun saveCallResult(item: ResponseWrapper<JsonPrimitive>) {
                resultDb = item
            }

            override fun shouldFetch(data: ResponseWrapper<JsonPrimitive>?): Boolean {
                return true
            }

            override fun loadFromDb(): LiveData<ResponseWrapper<JsonPrimitive>> {
                return if (resultDb == null) {
                    AbsentLiveData.create()
                } else {
                    object : LiveData<ResponseWrapper<JsonPrimitive>>() {
                        override fun onActive() {
                            super.onActive()
                            resultDb?.let {
                                value = it
                            }

                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<JsonPrimitive>>> {
                return shipmentService.postAutoAssignLocation(postAutoAssignLocationRequest)
            }

            override fun onFetchFailed() {
                handler.postDelayed({ postAutoAssignLocation(postAutoAssignLocationRequest) }, 1000)
            }
        }.asLiveData()
    }

    fun getReasonBASP(): LiveData<Resource<ResponseWrapper<ReasonAllGETModel>>> {
        var resultDb: ResponseWrapper<ReasonAllGETModel>? = null
        return object :
            NetworkBoundResource<ResponseWrapper<ReasonAllGETModel>, ResponseWrapper<ReasonAllGETModel>>(
                appExecutors
            ) {
            override fun saveCallResult(item: ResponseWrapper<ReasonAllGETModel>) {
                resultDb = item
            }

            override fun shouldFetch(data: ResponseWrapper<ReasonAllGETModel>?): Boolean {
                return true
            }

            override fun loadFromDb(): LiveData<ResponseWrapper<ReasonAllGETModel>> {
                return if (resultDb == null) {
                    AbsentLiveData.create()
                } else {
                    object : LiveData<ResponseWrapper<ReasonAllGETModel>>() {
                        override fun onActive() {
                            super.onActive()
                            resultDb?.let {
                                value = it
                            }

                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<ReasonAllGETModel>>> {
                return shipmentService.getReasonBASP()
            }

            override fun onFetchFailed() {
                handler.postDelayed({ getReasonBASP() }, 1000)
            }
        }.asLiveData()
    }

    fun getReasonAccident(): LiveData<Resource<ResponseWrapper<ReasonAllGETModel>>> {
        var resultDb: ResponseWrapper<ReasonAllGETModel>? = null
        return object :
            NetworkBoundResource<ResponseWrapper<ReasonAllGETModel>, ResponseWrapper<ReasonAllGETModel>>(
                appExecutors
            ) {
            override fun saveCallResult(item: ResponseWrapper<ReasonAllGETModel>) {
                resultDb = item
            }

            override fun shouldFetch(data: ResponseWrapper<ReasonAllGETModel>?): Boolean {
                return true
            }

            override fun loadFromDb(): LiveData<ResponseWrapper<ReasonAllGETModel>> {
                return if (resultDb == null) {
                    AbsentLiveData.create()
                } else {
                    object : LiveData<ResponseWrapper<ReasonAllGETModel>>() {
                        override fun onActive() {
                            super.onActive()
                            resultDb?.let {
                                value = it
                            }

                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<ReasonAllGETModel>>> {
                return shipmentService.getReasonAccident()
            }

            override fun onFetchFailed() {
                handler.postDelayed({ getReasonAccident() }, 1000)
            }
        }.asLiveData()
    }

    fun getAdditionalShippingCost(): LiveData<Resource<ResponseWrapper<ArrayList<AdditionalShippingCostModel>>>> {
        var resultDb: ResponseWrapper<ArrayList<AdditionalShippingCostModel>>? = null
        return object :
            NetworkBoundResource<ResponseWrapper<ArrayList<AdditionalShippingCostModel>>, ResponseWrapper<ArrayList<AdditionalShippingCostModel>>>(
                appExecutors
            ) {
            override fun saveCallResult(item: ResponseWrapper<ArrayList<AdditionalShippingCostModel>>) {
                resultDb = item
            }

            override fun shouldFetch(data: ResponseWrapper<ArrayList<AdditionalShippingCostModel>>?): Boolean {
                return true
            }

            override fun loadFromDb(): LiveData<ResponseWrapper<ArrayList<AdditionalShippingCostModel>>> {
                return if (resultDb == null) {
                    AbsentLiveData.create()
                } else {
                    object : LiveData<ResponseWrapper<ArrayList<AdditionalShippingCostModel>>>() {
                        override fun onActive() {
                            super.onActive()
                            resultDb?.let {
                                value = it
                            }

                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<ArrayList<AdditionalShippingCostModel>>>> {
                return shipmentService.getAdditionalShippingCost()
            }

            override fun onFetchFailed() {
                handler.postDelayed({ getAdditionalShippingCost() }, 1000)
            }
        }.asLiveData()
    }

    fun getShippingCost(): LiveData<Resource<ResponseWrapper<ArrayList<AdditionalShippingCostModel>>>> {
        var resultDb: ResponseWrapper<ArrayList<AdditionalShippingCostModel>>? = null
        return object :
            NetworkBoundResource<ResponseWrapper<ArrayList<AdditionalShippingCostModel>>, ResponseWrapper<ArrayList<AdditionalShippingCostModel>>>(
                appExecutors
            ) {
            override fun saveCallResult(item: ResponseWrapper<ArrayList<AdditionalShippingCostModel>>) {
                resultDb = item
            }

            override fun shouldFetch(data: ResponseWrapper<ArrayList<AdditionalShippingCostModel>>?): Boolean {
                return true
            }

            override fun loadFromDb(): LiveData<ResponseWrapper<ArrayList<AdditionalShippingCostModel>>> {
                return if (resultDb == null) {
                    AbsentLiveData.create()
                } else {
                    object : LiveData<ResponseWrapper<ArrayList<AdditionalShippingCostModel>>>() {
                        override fun onActive() {
                            super.onActive()
                            resultDb?.let {
                                value = it
                            }

                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<ArrayList<AdditionalShippingCostModel>>>> {
                return shipmentService.getShippingCost()
            }

            override fun onFetchFailed() {
                handler.postDelayed({ getShippingCost() }, 1000)
            }
        }.asLiveData()
    }

    fun putAdditionalShippingCost(additionalCostPUTModel: AdditionalCostPUTModel): LiveData<Resource<ResponseWrapper<JsonPrimitive>>> {
        var resultDb: ResponseWrapper<JsonPrimitive>? = null
        return object :
            NetworkBoundResource<ResponseWrapper<JsonPrimitive>, ResponseWrapper<JsonPrimitive>>(
                appExecutors
            ) {
            override fun saveCallResult(item: ResponseWrapper<JsonPrimitive>) {
                resultDb = item
            }

            override fun shouldFetch(data: ResponseWrapper<JsonPrimitive>?): Boolean {
                return true
            }

            override fun loadFromDb(): LiveData<ResponseWrapper<JsonPrimitive>> {
                return if (resultDb == null) {
                    AbsentLiveData.create()
                } else {
                    object : LiveData<ResponseWrapper<JsonPrimitive>>() {
                        override fun onActive() {
                            super.onActive()
                            resultDb?.let {
                                value = it
                            }

                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<JsonPrimitive>>> {
                return shipmentService.putAdditionalShippingCost(additionalCostPUTModel)
            }

            override fun onFetchFailed() {
                handler.postDelayed({ putAdditionalShippingCost(additionalCostPUTModel) }, 1000)
            }
        }.asLiveData()
    }

}