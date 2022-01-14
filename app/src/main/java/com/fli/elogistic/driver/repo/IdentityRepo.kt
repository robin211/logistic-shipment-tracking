package com.fli.elogistic.driver.repo

import android.os.Handler
import androidx.lifecycle.LiveData
import com.fli.elogistic.driver.AppExecutors
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.identity.*
import com.fli.elogistic.driver.services.IdentityService
import com.fli.elogistic.driver.util.AbsentLiveData
import com.fli.elogistic.driver.util.RateLimiter
import com.google.gson.JsonNull
import com.google.gson.JsonPrimitive
import timber.log.Timber
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class IdentityRepo
@Inject
constructor(
        private val appExecutors: AppExecutors,
        private val identityService: IdentityService
) {

    val handler: Handler = Handler()

    private val rateLimit = RateLimiter<String>(10, TimeUnit.MINUTES)

    fun login(authRequest: AuthenticationRequest): LiveData<Resource<ResponseWrapper<AuthenticationResult>>> {
        var resultDb: ResponseWrapper<AuthenticationResult>? = null
        Timber.d("calling identityrepo.login")
        return object : NetworkBoundResource<ResponseWrapper<AuthenticationResult>, ResponseWrapper<AuthenticationResult>>(appExecutors) {
            override fun saveCallResult(item: ResponseWrapper<AuthenticationResult>) {
                Timber.d("callResult: $item")
                resultDb = item
            }

            override fun shouldFetch(data: ResponseWrapper<AuthenticationResult>?): Boolean {
                return true
            }

            override fun loadFromDb(): LiveData<ResponseWrapper<AuthenticationResult>> {
                return if (resultDb == null) {
                    AbsentLiveData.create()
                } else {
                    object : LiveData<ResponseWrapper<AuthenticationResult>>() {
                        override fun onActive() {
                            super.onActive()
                            resultDb?.let {
                                value = it
                            }

                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<AuthenticationResult>>> {
                val result = identityService.postLogin(authRequest)
                Timber.d("create call result: ${result.value}")
                return result
            }

            override fun onFetchFailed() {
                handler.postDelayed({ login(authRequest) }, 1000)
            }

        }.asLiveData()
    }

    fun activateAccount(authRequest: AuthenticationRequest): LiveData<Resource<ResponseWrapper<AuthenticationResult>>> {
        var resultDb: ResponseWrapper<AuthenticationResult>? = null
        return object : NetworkBoundResource<ResponseWrapper<AuthenticationResult>, ResponseWrapper<AuthenticationResult>>(appExecutors) {
            override fun saveCallResult(item: ResponseWrapper<AuthenticationResult>) {
                resultDb = item
            }

            override fun shouldFetch(data: ResponseWrapper<AuthenticationResult>?): Boolean {
                return true
            }

            override fun loadFromDb(): LiveData<ResponseWrapper<AuthenticationResult>> {
                return if (resultDb == null) {
                    AbsentLiveData.create()
                } else {
                    object : LiveData<ResponseWrapper<AuthenticationResult>>() {
                        override fun onActive() {
                            super.onActive()
                            value = resultDb
                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<AuthenticationResult>>> {
                return identityService.activateUser(authRequest)
            }

            override fun onFetchFailed() {
                handler.postDelayed({ activateAccount(authRequest) }, 1000)
            }

        }.asLiveData()
    }

    fun changePassword(authRequest: ChangePasswordRequest): LiveData<Resource<ResponseWrapper<JsonPrimitive>>> {
        var resultDb: ResponseWrapper<JsonPrimitive>? = null
        return object : NetworkBoundResource<ResponseWrapper<JsonPrimitive>, ResponseWrapper<JsonPrimitive>>(appExecutors) {
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
                            value = resultDb
                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<JsonPrimitive>>> {
                return identityService.postChangePassword(authRequest)
            }

            override fun onFetchFailed() {
                handler.postDelayed({ changePassword(authRequest) }, 1000)
            }

        }.asLiveData()
    }

    fun verifyEmail(email: String): LiveData<Resource<ResponseWrapper<VerificationResult>>> {
        var resultDb: ResponseWrapper<VerificationResult>? = null
        return object : NetworkBoundResource<ResponseWrapper<VerificationResult>, ResponseWrapper<VerificationResult>>(appExecutors) {
            override fun saveCallResult(item: ResponseWrapper<VerificationResult>) {
                resultDb = item
            }

            override fun shouldFetch(data: ResponseWrapper<VerificationResult>?): Boolean {
                return true
            }

            override fun loadFromDb(): LiveData<ResponseWrapper<VerificationResult>> {
                return if (resultDb == null) {
                    AbsentLiveData.create()
                } else {
                    object : LiveData<ResponseWrapper<VerificationResult>>() {
                        override fun onActive() {
                            super.onActive()
                            value = resultDb
                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<VerificationResult>>> {
                val result = identityService.getVerifyEmail(email)
                Timber.d("create call result: ${result}")
                return result
            }

            override fun onFetchFailed() {
                handler.postDelayed({ verifyEmail(email) }, 1000)
            }

        }.asLiveData()
    }

    fun getCurrentUser(): LiveData<Resource<ResponseWrapper<UserInfo>>> {
        var resultDb: ResponseWrapper<UserInfo>? = null
        return object : NetworkBoundResource<ResponseWrapper<UserInfo>, ResponseWrapper<UserInfo>>(appExecutors) {
            override fun saveCallResult(item: ResponseWrapper<UserInfo>) {
                resultDb = item
            }

            override fun shouldFetch(data: ResponseWrapper<UserInfo>?): Boolean {
                return true
            }

            override fun loadFromDb(): LiveData<ResponseWrapper<UserInfo>> {
                return if (resultDb == null) {
                    AbsentLiveData.create()
                } else {
                    object : LiveData<ResponseWrapper<UserInfo>>() {
                        override fun onActive() {
                            super.onActive()
                            resultDb?.let {
                                value = it
                            }

                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<UserInfo>>> {
                return identityService.getCurrentUser()
            }

            override fun onFetchFailed() {
                handler.postDelayed({ getCurrentUser() }, 1000)
            }
        }.asLiveData()
    }

    fun postLogout(): LiveData<Resource<ResponseWrapper<JsonNull>>> {
        var resultDb: ResponseWrapper<JsonNull>? = null
        return object : NetworkBoundResource<ResponseWrapper<JsonNull>, ResponseWrapper<JsonNull>>(appExecutors) {
            override fun saveCallResult(item: ResponseWrapper<JsonNull>) {
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
                            value = resultDb
                        }
                    }
                }
            }

            override fun createCall(): LiveData<Resource<ResponseWrapper<JsonNull>>> {
                return identityService.postLogout()
            }

            override fun onFetchFailed() {
                handler.postDelayed({ postLogout() }, 1000)
            }
        }.asLiveData()
    }
}