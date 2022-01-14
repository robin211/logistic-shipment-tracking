package com.fli.elogistic.driver.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.fli.elogistic.driver.constants.CLIENT_NAME
import com.fli.elogistic.driver.constants.DEBUG_VERSION
import com.fli.elogistic.driver.constants.USER_EMAIL
import com.fli.elogistic.driver.constants.USER_NAME
import com.fli.elogistic.driver.databinding.FragmentAkunBinding
import com.fli.elogistic.driver.ui.activities.AuthorizationActivity
import com.fli.elogistic.driver.util.setToken
import com.fli.elogistic.driver.viewmodel.IdentityViewModel


class AkunFragment : BaseFragment() {
    lateinit var binding : FragmentAkunBinding
    private val authViewModel: IdentityViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAkunBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.namaLengkap.text = sp.getString(USER_NAME, "")
        binding.emailAddress.text = sp.getString(USER_EMAIL, "")
        binding.companyName.text = sp.getString(CLIENT_NAME, "")
        binding.debugVersion.text = "Debug version : $DEBUG_VERSION"
        binding.mainLogoutButton.setOnClickListener {
            authViewModel.doLogout()
        }

        authViewModel.getLogoutResult().observe(getParentActivity(), {
            handleResponse(it,
                { logout() },
                { logout() })
        })
    }
    fun logout() {
        sp.setToken("")
        val intent = Intent(context, AuthorizationActivity::class.java)
        startActivity(intent)
        getParentActivity().finish()
    }


}