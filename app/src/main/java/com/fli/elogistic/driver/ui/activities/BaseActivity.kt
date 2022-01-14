package com.fli.elogistic.driver.ui.activities

import android.app.Activity
import android.content.Intent
import android.content.SharedPreferences
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.fli.elogistic.driver.AppExecutors
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.Status
import com.fli.elogistic.driver.ui.BaseInterface
import com.fli.elogistic.driver.util.isResponseOk
import com.fli.elogistic.driver.util.isStatusError
import com.fli.elogistic.driver.util.isUnauthorized
import com.fli.elogistic.driver.util.setToken
import dagger.hilt.android.AndroidEntryPoint
import org.jetbrains.anko.alert
import org.jetbrains.anko.yesButton
import timber.log.Timber
import javax.inject.Inject

@Suppress("unused")
@AndroidEntryPoint
open class BaseActivity: AppCompatActivity(), BaseInterface {
    @Inject
    lateinit var appExecutors: AppExecutors

    @Inject
    lateinit var sp: SharedPreferences

    /*
    * Processing given Resource that is not on loading status
    * */
    fun handleResponse(resource: Resource<ResponseWrapper<*>>, onSuccess: () -> Unit, onError: ()-> Unit, onLoading: () -> Unit = {}){
        when {
            resource.isResponseOk() -> run(onSuccess)
            resource.isUnauthorized() -> {
                if(onUnauthorized(resource.response?.message?:"Otorisasi gagal")){
                    forceLogout()
                }
                Timber.d("unauthorized")
            }
            resource.isStatusError() -> {
                Timber.d("Resource: $resource")
                Timber.d("error nih")
                run(onError)
            }
            resource.status == Status.LOADING -> {
                run(onLoading)
            }
        }
    }

    fun forceLogout(message: String = getString(R.string.session_expired)) {
        createAlert(message) {
            sp.setToken("")
            val intent = Intent(this, AuthorizationActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun createAlert(message: String, onOkClick: () -> Unit = {}) {
        alert(message) {
            yesButton { run(onOkClick) }
            isCancelable = false
        }.show()
    }

    fun hideKeyboard(view: View) {
        val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
}