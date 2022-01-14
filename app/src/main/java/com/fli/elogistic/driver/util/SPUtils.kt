package com.fli.elogistic.driver.util

import android.content.SharedPreferences
import com.fli.elogistic.driver.constants.*

fun SharedPreferences.getToken(): String {
    val token = this.getString(ACCESS_TOKEN_KEY, "")
    return token?: ""
}

fun SharedPreferences.setToken(token: String) {
    edit().putString(ACCESS_TOKEN_KEY, token).apply()
    ACTIVE_TOKEN = token
}

fun SharedPreferences.getFCMToken(): String {
    val token = this.getString(FCM_TOKEN_KEY, "")
    return token?: ""
}

fun SharedPreferences.setFCMToken(token: String) {
    edit().putString(FCM_TOKEN_KEY, token).apply()
}

//fun SharedPreferences.setDeviceId(deviceId: String) {
//    edit().putString(DEVICE_ID_KEY, deviceId).apply()
//}
//
//fun SharedPreferences.getDeviceId(): String {
//    val deviceId = this.getString(DEVICE_ID_KEY, "")
//    return deviceId?: ""
//}

fun SharedPreferences.getIsMultiShipper(): Boolean {
    return getBoolean(IS_MULTISHIPPER_KEY, false)
}

fun SharedPreferences.setIsMultiShipper(isMultiShipper: Boolean) {
    edit().putBoolean(IS_MULTISHIPPER_KEY, isMultiShipper).apply()
}

fun SharedPreferences.getMaintenanceInfoShown(): Boolean {
    return getBoolean(MAINTENANCE_INFO_SHOWN_KEY, false)
}

fun SharedPreferences.setMaintenanceInfoShown(maintenanceInfoShown: Boolean) {
    edit().putBoolean(MAINTENANCE_INFO_SHOWN_KEY, maintenanceInfoShown).apply()
}