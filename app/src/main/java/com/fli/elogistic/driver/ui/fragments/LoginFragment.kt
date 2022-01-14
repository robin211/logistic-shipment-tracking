package com.fli.elogistic.driver.ui.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.text.method.PasswordTransformationMethod
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.constants.DEVICE_ID
import com.fli.elogistic.driver.constants.IS_SUSPENDED
import com.fli.elogistic.driver.constants.TOPIC_TO_SUBSCRIBE
import com.fli.elogistic.driver.constants.USER_EMAIL
import com.fli.elogistic.driver.databinding.FragmentLoginBinding
import com.fli.elogistic.driver.ui.activities.AuthorizationActivity
import com.fli.elogistic.driver.util.*
import com.fli.elogistic.driver.viewmodel.FirebaseManualViewModel
import com.fli.elogistic.driver.viewmodel.IdentityViewModel
import org.jetbrains.anko.sdk27.coroutines.onEditorAction
import timber.log.Timber

class LoginFragment : BaseFragment() {
    private val authViewModel: IdentityViewModel by viewModels()
    private val firebaseManualViewModel: FirebaseManualViewModel by viewModels()
    lateinit var binding: FragmentLoginBinding
    private var showPassword = false

    override fun onUnauthorized(message: String): Boolean {
        createOkSnackbar(binding.loginFragmentLayout, message)
        return false
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        checkSavedEmail()

//        val intentService = Intent(context, LocationService::class.java)
//        intentService.action = "ACTION_START_FOREGROUND_SERVICE"
//        ContextCompat.startForegroundService(getParentActivity(), intentService)

        val fcmToken = sp.getFCMToken()
        binding.deviceid.setText("device id : $DEVICE_ID")
        binding.fcmtoken.setText("fcm token : $fcmToken")

        subscribeToTopic("find-driver-456")

        binding.apply {
            navigateActivateFragmentBtn.setOnClickListener {
                findNavController().navigate(
                    R.id.LoginToActivation
                )
            }

            loginPasswordET.onEditorAction { v, actionId, event ->
                if(actionId == EditorInfo.IME_ACTION_SEND){
                    performLogin()
                }
            }

            loginBtn.setOnClickListener {
                performLogin()
            }

            loginPasswordET.onEditorAction { v, actionId, event ->
                if(actionId == EditorInfo.IME_ACTION_SEND){
                    performLogin()
                }
            }

            loginPasswordET.addTextChangedListener(object : TextWatcher {

                override fun afterTextChanged(s: Editable) {}

                override fun beforeTextChanged(s: CharSequence, start: Int,
                                               count: Int, after: Int) {
                }

                override fun onTextChanged(s: CharSequence, start: Int,
                                           before: Int, count: Int) {
                    if (s.isNotEmpty()){
                        hidePassword.visibility = View.VISIBLE
                    }else {
                        hidePassword.visibility = View.GONE
                    }
                }
            })

            viewPassword.setOnClickListener {
                    loginPasswordET.transformationMethod = PasswordTransformationMethod()
                    hidePassword.visibility = View.VISIBLE
                    viewPassword.visibility = View.GONE
            }

            hidePassword.setOnClickListener {
                loginPasswordET.transformationMethod = null
                hidePassword.visibility = View.GONE
                viewPassword.visibility = View.VISIBLE
            }
        }


        authViewModel.getLoginResult().observe(viewLifecycleOwner, {
            handleResponse(it, {
                loadingDialog.hide()
                it.response?.data?.let { result ->
                    sp.setToken(result.accessToken)
                    sp.edit().putBoolean(IS_SUSPENDED, result.isSuspended).apply()
                    Timber.d("Token: ${sp.getToken()}")
                    loadingDialog.cancel()
                    authViewModel.refreshCurrentUser()
                }
            }, {
                loadingDialog.hide()
                var message = it.message
                if (message == "java.lang.NullPointerException") message = "Akun tidak terdaftar!"
                createOkSnackbar(binding.loginFragmentLayout, message
                    ?: getString(R.string.wrong_email_pass))
            })
        })

        authViewModel.getCurrentUser().observe(viewLifecycleOwner, {
            handleResponse(it, {
                loadingDialog.hide()
                it.response?.data?.let { result ->
//                    if(result.role.toLowerCase() != "shipper"){
//                        Timber.d("role bukan shipper")
//                        createAlert(getString(R.string.invalid_role))
//                    }else {
//                        (activity as AuthorizationActivity).navigateToMainActivity(authViewModel.getCurrentUser().value?.response?.data?.copy()!!)
//                    }
                    (activity as AuthorizationActivity).navigateToMainActivity(result)
                }
            }, {
                loadingDialog.hide()
                createOkSnackbar(binding.loginFragmentLayout, it.message
                    ?: getString(R.string.wrong_email_pass))
            })
        })
    }

    private fun subscribeToTopic(s: String) {
        TOPIC_TO_SUBSCRIBE = s
        Toast.makeText(getParentActivity(), "Subscribing to $s", Toast.LENGTH_SHORT).show()
        firebaseManualViewModel.setGetSubscribeToTopic()
        firebaseManualViewModel.getSubscribeToTopic().observe(viewLifecycleOwner, {
            handleResponse(it, {
                it.response?.data?.let { _ ->
                    Toast.makeText(getParentActivity(), "Subscribed to $s", Toast.LENGTH_SHORT).show()
                }
            }, {
                if (it.statusCode == 200){
                    Toast.makeText(getParentActivity(), "Subscribed to $s", Toast.LENGTH_SHORT).show()
                }
            })
        })
    }

    private fun checkSavedEmail() {
        val email = sp.getString(USER_EMAIL, "")
        binding.loginEmailET.text = Editable.Factory.getInstance().newEditable(email)
    }

    private fun performLogin() {
        checkETFilled()
        binding.apply {
            if (loginEmailET.text.isNullOrBlank() || loginPasswordET.text.isNullOrBlank()) {
                Timber.d("Email / pass kosong")
                createOkSnackbar(loginFragmentLayout, getString(R.string.fill_email_password))
            } else if (!Patterns.EMAIL_ADDRESS.matcher(loginEmailET.text).matches()) {
                Timber.d("${loginEmailET.text}")
                createOkSnackbar(loginFragmentLayout, getString(R.string.wrong_email_format))
            } else {
                loadingDialog.show()
                authViewModel.setLogin(loginEmailET.getString(), loginPasswordET.getString())
                Timber.d("call login ${loginEmailET.getString()} ${loginPasswordET.getString()}")
            }
        }
    }

    private fun checkETFilled() {
        Timber.d("CHECK ET FILLED")
        binding.apply {
            loginEmailET.showWarningonEditText(requireContext())
            loginPasswordET.showWarningonEditText(requireContext())
        }
    }
}
