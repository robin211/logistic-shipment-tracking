package com.fli.elogistic.driver.util

import com.fli.elogistic.driver.models.Resource
import retrofit2.Response
import retrofit2.Retrofit
import org.json.JSONObject
import timber.log.Timber


inline fun <reified T> Retrofit.create(): T = create(T::class.java)

/**
 * Converts Retrofit [Response] to [Resource] which provides state
 * and data to the UI.
 */
fun <ResultType> Response<ResultType>.toResource(): Resource<ResultType> {
    var error = errorBody()?.string() ?: message()
    var errorCode = 0
    var rawErrorData: String? = null
    try {
        val jObjError = JSONObject(error)
        error = jObjError.getString("message")
        errorCode = jObjError.getInt("statusCode")
        Timber.d("body isinya $jObjError")
        jObjError.optJSONObject("data")?.let {
            rawErrorData = it.toString()
        }
    } catch (e: Exception) {
    }


    return when {
        isSuccessful -> {
            val body = body()
            when {
                body != null -> Resource.success(body)
                else -> Resource.success(message(), body)
            }
        }
        else -> Resource.error(error, body(), errorCode, rawErrorData)
    }
}