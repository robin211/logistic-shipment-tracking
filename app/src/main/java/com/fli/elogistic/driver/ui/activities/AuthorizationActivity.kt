package com.fli.elogistic.driver.ui.activities

import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.constants.*
import com.fli.elogistic.driver.models.identity.UserInfo
import timber.log.Timber

class AuthorizationActivity : BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorization)

        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.authorizationFragmentHost) as NavHostFragment? ?: return

        val navController = host.navController

        navController.addOnDestinationChangedListener { _, destination, _ ->
            val dest: String = try {
                resources.getResourceName(destination.id)
            } catch (e: Resources.NotFoundException) {
                destination.id.toString()
            }
            Timber.d("Navigated to $dest")
        }
    }

    fun navigateToMainActivity(result: UserInfo){
        sp.edit().putString(USER_EMAIL, result.email).apply()
        sp.edit().putString(USER_NAME, result.name).apply()
        sp.edit().putString(USER_IMAGE, result.imageUrl).apply()
        sp.edit().putString(CLIENT_NAME, result.companyName).apply()
        DRIVER_ID = result.driverId
        COMPANY_ID = result.companyId

//        if (!checkPermission()) {
//            requestPermission()
//        }

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

//    private fun checkPermission(): Boolean {
//        val result = ContextCompat.checkSelfPermission(applicationContext, Manifest.permission.ACCESS_FINE_LOCATION)
//        val result1 = ContextCompat.checkSelfPermission(applicationContext, Manifest.permission.ACCESS_COARSE_LOCATION)
//        return result == PackageManager.PERMISSION_GRANTED && result1 == PackageManager.PERMISSION_GRANTED
//    }
//
//    private fun requestPermission() {
//        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION), 1)
//    }
}
