package com.fli.elogistic.driver.repo

import android.os.Handler
import androidx.lifecycle.LiveData
import com.fli.elogistic.driver.AppExecutors
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.SendLocationRequest
import com.fli.elogistic.driver.services.SendLocationService
import com.fli.elogistic.driver.util.AbsentLiveData
import com.google.gson.JsonNull
import timber.log.Timber
import javax.inject.Inject

class SendLocationRepo
@Inject
constructor(
        private val appExecutors: AppExecutors,
        private val sendLocationService: SendLocationService
) {
    val handler: Handler = Handler()
    fun sendLocation(sendLocationRequest: SendLocationRequest): LiveData<Resource<ResponseWrapper<JsonNull>>> {
        var resultDb: ResponseWrapper<JsonNull>? = null
        Timber.d("calling identityrepo.login")
        return object : NetworkBoundResource<ResponseWrapper<JsonNull>, ResponseWrapper<JsonNull>>(appExecutors) {
            override fun saveCallResult(item: ResponseWrapper<JsonNull>) {
                Timber.d("callResult: $item")
                resultDb = item
            }

            override fun shouldFetch(data: ResponseWrapper<JsonNull>?): Boolean {
                return true
            }

            override fun loadFromDb(): LiveData<ResponseWrapper<JsonNull>> {
                return if (resultDb == null) {
                    AbsentLiveData.create()
                } else {
                    object : LiveData<ResponseWrapper<JsonNull>>() {
                        override fun onActive() {
                            super.onActive()
                            resultDb?.let {
                                value = it
                            }

                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<JsonNull>>> {
                val result = sendLocationService.sendLocation(sendLocationRequest)
                return result
            }

            override fun onFetchFailed() {
                handler.postDelayed({ sendLocation(sendLocationRequest) }, 1000)
            }

        }.asLiveData()
    }
}