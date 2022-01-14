package com.fli.elogistic.driver.repo

import android.os.Handler
import androidx.lifecycle.LiveData
import com.fli.elogistic.driver.AppExecutors
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.shipment.DetailPerLocationModel
import com.fli.elogistic.driver.services.ShipmentDetailPerLocationService
import com.fli.elogistic.driver.util.AbsentLiveData
import javax.inject.Inject

class TransporterRepo
@Inject
constructor(
    private val appExecutors: AppExecutors,
    private val shipmentDetailPerLocationService: ShipmentDetailPerLocationService
) {

    val handler: Handler = Handler()

    fun getDetailPerLocation(): LiveData<Resource<ResponseWrapper<ArrayList<DetailPerLocationModel>>>> {
        var resultDb: ResponseWrapper<ArrayList<DetailPerLocationModel>>? = null
        return object :
            NetworkBoundResource<ResponseWrapper<ArrayList<DetailPerLocationModel>>, ResponseWrapper<ArrayList<DetailPerLocationModel>>>(
                appExecutors
            ) {
            override fun saveCallResult(item: ResponseWrapper<ArrayList<DetailPerLocationModel>>) {
                resultDb = item
            }

            override fun shouldFetch(data: ResponseWrapper<ArrayList<DetailPerLocationModel>>?): Boolean {
                return true
            }

            override fun loadFromDb(): LiveData<ResponseWrapper<ArrayList<DetailPerLocationModel>>> {
                return if (resultDb == null) {
                    AbsentLiveData.create()
                } else {
                    object : LiveData<ResponseWrapper<ArrayList<DetailPerLocationModel>>>() {
                        override fun onActive() {
                            super.onActive()
                            resultDb?.let {
                                value = it
                            }

                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<ArrayList<DetailPerLocationModel>>>> {
                return shipmentDetailPerLocationService.getDetailPerLocation()
            }

            override fun onFetchFailed() {
                handler.postDelayed({ getDetailPerLocation() }, 1000)
            }
        }.asLiveData()
    }
}