package com.fli.elogistic.driver.ui.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.text.method.PasswordTransformationMethod
import android.text.util.Linkify
import android.util.Log
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.constants.CAPTCHA_SITE_KEY
import com.fli.elogistic.driver.databinding.FragmentActivateAccountBinding
import com.fli.elogistic.driver.models.identity.AuthenticationRequest
import com.fli.elogistic.driver.models.identity.ChangePasswordRequest
import com.fli.elogistic.driver.util.getToken
import com.fli.elogistic.driver.util.isEmpty
import com.fli.elogistic.driver.util.setToken
import com.fli.elogistic.driver.viewmodel.IdentityViewModel
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.CommonStatusCodes
import com.google.android.gms.safetynet.SafetyNet
import org.jetbrains.anko.sdk27.coroutines.onEditorAction
import timber.log.Timber
import java.util.regex.Pattern

@Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class ActivateAccountFragment : BaseFragment() {
    private val authViewModel: IdentityViewModel by viewModels()
    lateinit var binding: FragmentActivateAccountBinding
    private var verifiedByCaptcha = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentActivateAccountBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListener()
        initObserver()
    }

    private fun initObserver() {
        authViewModel.getActivateUserResult().observe(viewLifecycleOwner, {
            handleResponse(it,
                onSuccess = {
                    loadingDialog.cancel()
                    sp.setToken(it.response?.data?.accessToken!!)
                    Timber.d("Token: ${sp.getToken()}")
                    authViewModel.refreshCurrentUser()
                    initChangePasswordView()
//                    it?.response?.data?.let { response ->
//                        sp.setToken(response.accessToken)
//                        authViewModel.refreshCurrentUser()
//                    }
                },
                onError = {
                    loadingDialog.cancel()
                    createOkSnackbar(binding.activateAccountFragmentLayout,it.message?: "Terjadi Kesalahan")
                })
        })

        authViewModel.getChangePasswordResult().observe(viewLifecycleOwner, {
            handleResponse(it,
                onSuccess = {
                    loadingDialog.cancel()
                    findNavController().navigate(
                        R.id.ActivationToLogin
                    )
                },
                onError = {
                    loadingDialog.cancel()
                    createOkSnackbar(binding.activateAccountFragmentLayout,it.message?: "Terjadi Kesalahan")
                })
        })

//        authViewModel.getCurrentUser().observe(viewLifecycleOwner, {
//            handleResponse(it, {
//                it.response?.data?.let { user ->
//                    loadingDialog.cancel()
//                    initChangePasswordView()
//                    (activity as AuthorizationActivity).navigateToMainActivity(user)
//                    if(user.role !in SHIPPER_ROLE){
//                        Timber.d("role bukan driver")
//                        createAlert(getString(R.string.invalid_role))
//                    }else {
//                        loadingDialog.cancel()
//                    }
//                }
//            }, {
//                loadingDialog.hide()
//                createOkSnackbar(binding.activateAccountFragmentLayout, it.message?:"Email/password yang anda masukkan salah")
//            })
//        })
    }

    private fun initChangePasswordView() {
        binding.tosHolder.visibility = View.GONE
        binding.btnVerifyCaptcha.visibility = View.GONE
        binding.title1.text = getString(R.string.change_password)

        binding.activateVerificationEmailET.text.clear()
        binding.activateVerificationEmailET.transformationMethod = PasswordTransformationMethod.getInstance()
        binding.activateVerificationEmailET.hint = getString(R.string.password)
        binding.activateVerificationEmailET.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                if (s.isNotEmpty()){
                    binding.hideTop.visibility = View.VISIBLE
                }else {
                    binding.hideTop.visibility = View.INVISIBLE
                }
            }
        })
        binding.viewTop.setOnClickListener {
            binding.activateVerificationEmailET.transformationMethod = PasswordTransformationMethod()
            binding.hideTop.visibility = View.VISIBLE
            binding.viewTop.visibility = View.GONE
        }

        binding.hideTop.setOnClickListener {
            binding.activateVerificationEmailET.transformationMethod = null
            binding.hideTop.visibility = View.GONE
            binding.viewTop.visibility = View.VISIBLE
        }

        binding.activateVerificationPasswordET.text.clear()
        binding.activateVerificationPasswordET.hint = getString(R.string.new_password)

        binding.confirmHolder.visibility = View.VISIBLE
        binding.activateVerificationConfirmPasswordET.hint = getString(R.string.confirm_new_password)
        binding.activateVerificationConfirmPasswordET.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                if (s.isNotEmpty()){
                    binding.hideBottom.visibility = View.VISIBLE
                }else {
                    binding.hideBottom.visibility = View.INVISIBLE
                }
            }
        })
        binding.viewBottom.setOnClickListener {
            binding.activateVerificationConfirmPasswordET.transformationMethod = PasswordTransformationMethod()
            binding.hideBottom.visibility = View.VISIBLE
            binding.viewBottom.visibility = View.GONE
        }

        binding.hideBottom.setOnClickListener {
            binding.activateVerificationConfirmPasswordET.transformationMethod = null
            binding.hideBottom.visibility = View.GONE
            binding.viewBottom.visibility = View.VISIBLE
        }

    }

    private fun initListener() {
        binding.apply {

            activateVerificationPasswordET.addTextChangedListener(object : TextWatcher {

                override fun afterTextChanged(s: Editable) {}

                override fun beforeTextChanged(s: CharSequence, start: Int,
                                               count: Int, after: Int) {
                }

                override fun onTextChanged(s: CharSequence, start: Int,
                                           before: Int, count: Int) {
                    if (s.isNotEmpty()){
                        hidePassword.visibility = View.VISIBLE
                    }else {
                        hidePassword.visibility = View.INVISIBLE
                    }
                }
            })

            viewPassword.setOnClickListener {
                activateVerificationPasswordET.transformationMethod = PasswordTransformationMethod()
                hidePassword.visibility = View.VISIBLE
                viewPassword.visibility = View.GONE
            }

            hidePassword.setOnClickListener {
                activateVerificationPasswordET.transformationMethod = null
                hidePassword.visibility = View.GONE
                viewPassword.visibility = View.VISIBLE
            }

            activationVerifyBtn.setOnClickListener {
                if (binding.title1.text == getString(R.string.activation)) performVerify()
                else performChangePassword()

            }

            activateVerificationEmailET.onEditorAction { _, actionId, _ ->
                if(actionId == EditorInfo.IME_ACTION_SEND){
                    if (binding.activateVerificationEmailET.hint == getString(R.string.password)) performVerify()
                    else performChangePassword()
                }
            }

            val links = getString(R.string.link_term_of_service)
            val tos = getString(R.string.term_of_service)
            addLink(txtLink, tos, links)

            navigatePassActivationFragmentBtn.setOnClickListener {

                findNavController().navigate(
                    R.id.ActivationToLogin
                )
            }

            btnVerifyCaptcha.setOnClickListener {
                verifyRecaptcha()
            }

        }

    }

    private fun performChangePassword() {
        binding.apply {
            if (activateVerificationEmailET.isEmpty()){
                createOkSnackbar(activateAccountFragmentLayout, "Silahkan Isi Kata Sandi Lama")
            }else{
                if (activateVerificationPasswordET.isEmpty()){
                    createOkSnackbar(activateAccountFragmentLayout, "Silahkan Isi Kata Sandi Baru")
                }else {
                    if (activateVerificationConfirmPasswordET.isEmpty()){
                        createOkSnackbar(activateAccountFragmentLayout, "Silahkan Konfirmasi Kata Sandi Baru")
                    }else {
                        if (activateVerificationConfirmPasswordET.text.toString() != activateVerificationPasswordET.text.toString()){
                            createOkSnackbar(activateAccountFragmentLayout, "Kata Sandi Baru dan Konfirmasi Berbeda")
                        }else{
                            val postChangePasswordReq = ChangePasswordRequest(
                                activateVerificationEmailET.text.toString(),
                                activateVerificationPasswordET.text.toString()
                            )
                            authViewModel.setChangePassword(postChangePasswordReq)
                            loadingDialog.show()
                        }
                    }
                }
            }
        }
    }

    private fun performVerify() {
        binding.apply {
            if (activateVerificationEmailET.isEmpty()){
                createOkSnackbar(activateAccountFragmentLayout, "Silahkan Isi Email Terlebih Dahulu")
            }else {
                if (!Patterns.EMAIL_ADDRESS.matcher(activateVerificationEmailET.text).matches()) {
                    createOkSnackbar(activateAccountFragmentLayout, "Format email anda salah")
                } else {
                    if (activateVerificationPasswordET.isEmpty()){
                        createOkSnackbar(activateAccountFragmentLayout, "Silahkan Isi Password Terlebih Dahulu")
                    }else{
                        if (!checkTermOfService.isChecked){
                            createOkSnackbar(activateAccountFragmentLayout, "Silahkan check Term of Service terlebih dahulu")
                        }else{
                            if (!verifiedByCaptcha){
                                createOkSnackbar(activateAccountFragmentLayout, "Silahkan verifikasi Captcha terlebih dahulu")
                            }else {
                                val activationReq = AuthenticationRequest(activateVerificationEmailET.text.toString(),
                                    activateVerificationPasswordET.text.toString())
                                authViewModel.setActivation(activationReq)
                                loadingDialog.show()
                            }
                        }
                    }
                }
            }

        }
    }

    fun addLink(
        textView: TextView?, patternToMatch: String?,
        link: String?
    ) {
        val filter = Linkify.TransformFilter { _, _ -> link }
        Linkify.addLinks(
            textView!!, Pattern.compile(patternToMatch!!), null, null,
            filter
        )
    }

    @SuppressLint("LogNotTimber")
    private fun verifyRecaptcha() {
        SafetyNet.getClient(getParentActivity()).verifyWithRecaptcha(CAPTCHA_SITE_KEY)
            .addOnSuccessListener(getParentActivity()) { response ->
                Log.d("Captcha", "onSuccess")

                if (response.tokenResult.isNotEmpty()) {
                    verifiedByCaptcha = true
                    binding.btnVerifyCaptcha.text = getString(R.string.terverifikasi)

                    // Received reCaptcha token and This token still needs to be validated on
                    // the server using the SECRET key api.
//                    verifyTokenFromServer(response.tokenResult, feedback).execute()
//                    Log.i(TAG, "onSuccess: " + response.tokenResult)
                }
            }
            .addOnFailureListener(getParentActivity()) { e ->
                if (e is ApiException) {
                    Log.d("Captcha", "SafetyNet Error: " + CommonStatusCodes.getStatusCodeString(e.statusCode))
                } else {
                    Log.d("Captcha", "Unknown SafetyNet error: " + e.message)
                }
            }
    }

}