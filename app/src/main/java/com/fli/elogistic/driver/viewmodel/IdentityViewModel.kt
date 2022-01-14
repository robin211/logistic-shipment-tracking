package com.fli.elogistic.driver.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.identity.*
import com.fli.elogistic.driver.repo.IdentityRepo
import com.fli.elogistic.driver.util.AbsentLiveData
import com.google.gson.JsonNull
import com.google.gson.JsonPrimitive
import timber.log.Timber

class IdentityViewModel
@ViewModelInject
constructor(var identityRepo: IdentityRepo): ViewModel() {
    private val authenticationRequest = AuthenticationRequest("","")

    private val loginTrigger = MutableLiveData<AuthenticationRequest>()
    private val activationTrigger = MutableLiveData<AuthenticationRequest>()
    private val changePasswordTrigger = MutableLiveData<ChangePasswordRequest>()
    private val verifyEmailTrigger = MutableLiveData<String>()
    private val getCurrentUserTrigger = MutableLiveData<Boolean>()
    private val postLogoutTrigger = MutableLiveData<Boolean>()

    private val loginResult: LiveData<Resource<ResponseWrapper<AuthenticationResult>>>
    private val activateUserResult: LiveData<Resource<ResponseWrapper<AuthenticationResult>>>
    private val changePasswordResult: LiveData<Resource<ResponseWrapper<JsonPrimitive>>>
    private val emailVerified: LiveData<Resource<ResponseWrapper<VerificationResult>>>

    private val currentUser: LiveData<Resource<ResponseWrapper<UserInfo>>>
    private val logoutResult: LiveData<Resource<ResponseWrapper<JsonNull>>>


    init {
        loginResult = Transformations
            .switchMap(loginTrigger) {
                it?.let { loginRequest -> identityRepo.login(loginRequest) }
            }
        activateUserResult = Transformations
            .switchMap(activationTrigger) { activation ->
                if (activation == null) {
                    AbsentLiveData.create()
                } else {
                    identityRepo.activateAccount(activation)
                }
            }
        changePasswordResult = Transformations
            .switchMap(changePasswordTrigger) {
                it?.let { changePasswordRequest -> identityRepo.changePassword(changePasswordRequest) }
            }

        emailVerified = Transformations
            .switchMap(verifyEmailTrigger) {
                it?.let { loginRequest -> identityRepo.verifyEmail(loginRequest) }
            }


        currentUser = Transformations
            .switchMap(getCurrentUserTrigger) {
                identityRepo.getCurrentUser()
            }
        logoutResult = Transformations
            .switchMap(postLogoutTrigger) {
                identityRepo.postLogout()
            }
    }


    fun setLogin(email: String, password: String) {
        authenticationRequest.set(email, password)
        Timber.d("setLogin called")
        loginTrigger.value = authenticationRequest
    }

    fun setActivation(activation: AuthenticationRequest?) {
        if (activationTrigger.value != activation) {
            activationTrigger.value = activation
        }
    }

    fun setChangePassword(activation: ChangePasswordRequest?) {
        if (changePasswordTrigger.value != activation) {
            changePasswordTrigger.value = activation
        }
    }

    fun setVerifyEmail(email: String){
        verifyEmailTrigger.value = email
    }

    fun refreshCurrentUser(){
        getCurrentUserTrigger.value = true
    }

    fun doLogout(){
        postLogoutTrigger.value = true
    }

    fun getLoginResult() = loginResult
    fun getActivateUserResult() = activateUserResult
    fun getChangePasswordResult() = changePasswordResult
    fun getCurrentUser() = currentUser
    fun getEmailVerified() = emailVerified
    fun getLogoutResult() = logoutResult

}