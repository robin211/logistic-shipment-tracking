package com.fli.elogistic.driver.ui.fragments

import android.app.AlertDialog
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.fli.elogistic.driver.AppExecutors
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.Status
import com.fli.elogistic.driver.ui.BaseInterface
import com.fli.elogistic.driver.ui.activities.AuthorizationActivity
import com.fli.elogistic.driver.util.isResponseOk
import com.fli.elogistic.driver.util.isStatusError
import com.fli.elogistic.driver.util.isUnauthorized
import com.fli.elogistic.driver.util.setToken
import dagger.hilt.android.AndroidEntryPoint
import dmax.dialog.SpotsDialog
import org.jetbrains.anko.support.v4.alert
import org.jetbrains.anko.yesButton
import timber.log.Timber
import javax.inject.Inject

@Suppress("unused")
@AndroidEntryPoint
open class BaseFragment: Fragment(), BaseInterface {
    @Inject
    lateinit var sp: SharedPreferences

    @Inject
    lateinit var appExecutors: AppExecutors

    lateinit var loadingDialog: AlertDialog

    fun getParentActivity(): AppCompatActivity {
        return requireActivity() as AppCompatActivity
    }

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
            val intent = Intent(requireContext(), AuthorizationActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }
    }

    fun createAlert(message: String, onOkClick: () -> Unit = {}) {
        alert(message) {
            yesButton { run(onOkClick) }
            isCancelable = false
        }.show()
    }

    fun createOkSnackbar(view: View, message: String, onClick: () -> Unit = {}) {
        createOkSnackbar(view, message, requireContext(), onClick)
    }

    fun createRetrySnackbar(view: View, message: String, onClick: () -> Unit) {
        createRetrySnackbar(view, message, requireContext(), onClick)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadingDialog = SpotsDialog.Builder()
            .setContext(requireContext())
            .setMessage(R.string.loading)
            .setCancelable(false).build()
        loadingDialog.setCancelable(false)
        loadingDialog.hide()
    }

    override fun onDestroy() {
        super.onDestroy()

        if(::loadingDialog.isInitialized){
            loadingDialog.cancel()
        }
    }
}