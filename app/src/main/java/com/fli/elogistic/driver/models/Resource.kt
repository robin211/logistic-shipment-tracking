package com.fli.elogistic.driver.models
import com.fli.elogistic.driver.models.Status.*
/**
 * A generic class that holds a value with its loading status.
 * @param <T>
</T> */
data class Resource<out T>(val status: Status, val response: T?, val message: String?, val statusCode: Int = 200, val rawErrorData: String? = null) {
    companion object {
        fun <T> success(data: T?): Resource<T> {
            return Resource(SUCCESS, data, null)
        }

        fun <T> error(msg: String?, data: T?): Resource<T> {
            return Resource(ERROR, data, msg)
        }

        fun <T> loading(data: T?): Resource<T> {
            return Resource(LOADING, data, null)
        }
        fun <T> success(message: String?, data: T?): Resource<T> = Resource(SUCCESS, message = message, response = data)
        fun <T> error(msg: String?, data: T?, statusCode: Int, rawErrorData: String? = null): Resource<T> {
            return Resource(ERROR, data, msg, statusCode, rawErrorData)
        }
    }
}