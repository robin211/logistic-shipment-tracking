package com.fli.elogistic.driver.services

import com.fli.elogistic.driver.*
import com.fli.elogistic.driver.constants.*
import okhttp3.*
import okio.Buffer
import com.fli.elogistic.driver.mockDataResponses.*
import com.fli.elogistic.driver.util.RequestMethod
import okhttp3.ResponseBody
import timber.log.Timber

/*
* Create mock interceptor if build config is debug (later will be changed to mock)
* */

class FirebaseManualHelper() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var original = chain.request()
        val originalURL = original.url().toString()
        if (originalURL.contains("/rel/topics/")){
            val newUrl = "https://iid.googleapis.com/iid/$FCM_TOKEN/rel/topics/$TOPIC_TO_SUBSCRIBE"
            original = original.newBuilder().url(newUrl).build()
        }
        return chain.proceed(original)
    }


}