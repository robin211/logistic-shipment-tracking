/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WATTANTIES OT CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fli.elogistic.driver.util


import androidx.lifecycle.LiveData
import com.fli.elogistic.driver.models.Resource
import retrofit2.*
import timber.log.Timber
import java.lang.reflect.Type
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import java.util.concurrent.atomic.AtomicBoolean

/**
 * A Retrofit adapter that converts the Call into a LiveData of Resource.
 * @param <R>
</R> */
class LiveDataCallAdapter<R>(private val responseType: Type) :
    CallAdapter<R, LiveData<Resource<R>>> {

    override fun responseType() = responseType

    override fun adapt(call: Call<R>): LiveData<Resource<R>> {
        return object : LiveData<Resource<R>>() {
            private var started = AtomicBoolean(false)
            override fun onActive() {
                super.onActive()
                if (started.compareAndSet(false, true)) {
                    call.enqueue(object : Callback<R> {
                        override fun onResponse(call: Call<R>, response: Response<R>) {
                            Timber.d("response: $response")
                            postValue(response.toResource())
                        }

                        override fun onFailure(call: Call<R>, throwable: Throwable) {
                            Timber.d("Exception class: ${throwable.javaClass.simpleName}")
                            Timber.d("ConnectException: ${ConnectException::class.simpleName}")
//                            val message = when {
//                                (throwable.javaClass.simpleName == ConnectException::class.simpleName) -> "Terjadi Kendala Koneksi"
//                                else -> throwable.message
//                            }
//                            postValue(Resource.error(message, null, 408))

                            Timber.d(call.request().url().encodedPath())
                            var statusCode = 200
                            var message = throwable.message
                            throwable.apply {
                                if (this is ConnectException ||
                                    this is SocketTimeoutException){
                                    message = "Terjadi Kendala Koneksi"
                                    statusCode = 408
                                } else if (this is UnknownHostException){
                                    message = "Terjadi Kendala Koneksi, Harap Cek Jaringan Internet Anda"
                                    statusCode = 408
                                }
                            }
                            postValue(Resource.error(message, null, statusCode))
                        }
                    })
                }
            }
        }
    }
}
