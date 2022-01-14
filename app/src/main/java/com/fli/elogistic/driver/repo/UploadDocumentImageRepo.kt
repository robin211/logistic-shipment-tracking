package com.fli.elogistic.driver.repo

import android.os.Handler
import androidx.lifecycle.LiveData
import com.fli.elogistic.driver.AppExecutors
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.uploadDocument.*
import com.fli.elogistic.driver.services.UploadService
import com.fli.elogistic.driver.util.AbsentLiveData
import com.google.gson.JsonPrimitive
import javax.inject.Inject

class UploadDocumentImageRepo
@Inject
constructor(
    private val appExecutors: AppExecutors,
    private val uploadService: UploadService
) {

    val handler: Handler = Handler()

    fun postDocumentPOD(uploadRequest: UploadDocumentPODRequest): LiveData<Resource<ResponseWrapper<ArrayList<UploadDocumentResult>>>> {
        var resultDb: ResponseWrapper<ArrayList<UploadDocumentResult>>? = null
        return object :
            NetworkBoundResource<ResponseWrapper<ArrayList<UploadDocumentResult>>, ResponseWrapper<ArrayList<UploadDocumentResult>>>(
                appExecutors
            ) {
            override fun saveCallResult(item: ResponseWrapper<ArrayList<UploadDocumentResult>>) {
                resultDb = item
            }

            override fun shouldFetch(data: ResponseWrapper<ArrayList<UploadDocumentResult>>?): Boolean {
                return true
            }

            override fun loadFromDb(): LiveData<ResponseWrapper<ArrayList<UploadDocumentResult>>> {
                return if (resultDb == null) {
                    AbsentLiveData.create()
                } else {
                    object : LiveData<ResponseWrapper<ArrayList<UploadDocumentResult>>>() {
                        override fun onActive() {
                            super.onActive()
                            resultDb?.let {
                                value = it
                            }

                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<ArrayList<UploadDocumentResult>>>> {
                return uploadService.postDocumentPOD(uploadRequest)
            }

            override fun onFetchFailed() {
                handler.postDelayed({ postDocumentPOD(uploadRequest) }, 1000)
            }
        }.asLiveData()
    }

    fun submitDocumentPOD(submitDocumentPODRequest: SubmitDocumentPODRequest): LiveData<Resource<ResponseWrapper<JsonPrimitive>>> {
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
                return uploadService.submitDocumentPOD(submitDocumentPODRequest)
            }

            override fun onFetchFailed() {
                handler.postDelayed({ submitDocumentPOD(submitDocumentPODRequest) }, 1000)
            }
        }.asLiveData()
    }

    fun postSignatureBast(uploadBASTRequest: UploadBASTRequest): LiveData<Resource<ResponseWrapper<JsonPrimitive>>> {
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
                return uploadService.postBast(uploadBASTRequest)
            }

            override fun onFetchFailed() {
                handler.postDelayed({ postSignatureBast(uploadBASTRequest) }, 1000)
            }
        }.asLiveData()
    }

    fun postBasp(uploadBASPRequest: UploadBASPRequest): LiveData<Resource<ResponseWrapper<JsonPrimitive>>> {
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
                return uploadService.submitBasp(uploadBASPRequest)
            }

            override fun onFetchFailed() {
                handler.postDelayed({ postBasp(uploadBASPRequest) }, 1000)
            }
        }.asLiveData()
    }

    fun postAccident(uploadAccidentRequest: UploadAccidentRequest): LiveData<Resource<ResponseWrapper<JsonPrimitive>>> {
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
                return uploadService.submitAccident(uploadAccidentRequest)
            }

            override fun onFetchFailed() {
                handler.postDelayed({ postAccident(uploadAccidentRequest) }, 1000)
            }
        }.asLiveData()
    }
}