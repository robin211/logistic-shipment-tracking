package com.fli.elogistic.driver.models.identity

import com.google.gson.annotations.SerializedName

data class AuthenticationRequest (
    @SerializedName("username") var email: String,
    @SerializedName("password") var password: String
//    @SerializedName("username") var username: String?,
//    @SerializedName("fcm") var fcmToken: String,
//    @SerializedName("version") var version: String? = null
    ){
    fun set(email: String, password: String){
        this.email = email
        this.password = password
//        this.username = username
//        this.fcmToken = fcmToken
//        this.version = version
    }

}