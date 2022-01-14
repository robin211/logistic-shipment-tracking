@file:Suppress("UNUSED_VARIABLE")

package com.fli.elogistic.driver.ui.activities

import android.Manifest
import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.constants.ACTIVE_TOKEN
import com.fli.elogistic.driver.constants.DEVICE_ID
import com.fli.elogistic.driver.constants.FCM_TOKEN
import com.fli.elogistic.driver.util.FirebaseUtil
import com.fli.elogistic.driver.util.getToken
import com.fli.elogistic.driver.util.setFCMToken
import com.fli.elogistic.driver.util.setMaintenanceInfoShown
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.google.firebase.messaging.FirebaseMessaging
import dagger.hilt.android.AndroidEntryPoint
import org.jetbrains.anko.doAsync
import timber.log.Timber
import javax.inject.Inject


@Suppress("unused")
@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {
    @Inject
    lateinit var sp: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        if (!checkPermission()) {
            requestPermission()
        }

        checkDeviceId()
        refreshFirebaseToken()
        doCheckCurrentUser()
        val crashlytics = FirebaseCrashlytics.getInstance()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            // Create the NotificationChannel
            val name = getString(R.string.app_name)
            val descriptionText = getString(R.string.channel_description)
            val importance = NotificationManager.IMPORTANCE_HIGH
            val mChannel = NotificationChannel(CHANNEL_ID, name, importance)
            mChannel.description = descriptionText
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(mChannel)
        }
    }

    private fun checkPermission(): Boolean {
        val result = ContextCompat.checkSelfPermission(applicationContext, Manifest.permission.ACCESS_FINE_LOCATION)
        val result1 = ContextCompat.checkSelfPermission(applicationContext, Manifest.permission.ACCESS_COARSE_LOCATION)
        return result == PackageManager.PERMISSION_GRANTED && result1 == PackageManager.PERMISSION_GRANTED
    }

    private fun requestPermission() {
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION), 1)
    }

    @SuppressLint("HardwareIds")
    private fun checkDeviceId() {
        val deviceID = Settings.Secure.getString(
            this.contentResolver,
            Settings.Secure.ANDROID_ID
        )
        DEVICE_ID = deviceID
    }

    companion object {
        val fcmInstanceName = "fli-driver"
        val fcmProjectID = "fastlog-development"
        val fcmAppID = "1:408348638345:android:d2c46d08527f9d2bb39a58"
        val fcmApiKey = "AIzaSyArFu9Xus9ZgIVRUrHEgenuVSYKUj_ains"
        var gcmSenderID = "408348638345"
        var TAG_FCM = "fli-driver-fcm"

        val CHANNEL_ID = "notif_channel"
    }

        private fun refreshFirebaseToken() {
        Timber.d("start refresh fcm")
//        FirebaseInstanceId.getInstance().instanceId.addOnSuccessListener(this) { instanceIdResult ->
//            val newToken = instanceIdResult.token
//            Timber.d("get instance id success: $newToken")
//            sp.setFCMToken(newToken)
//        }
        if (!FirebaseUtil.appExists(TAG_FCM, applicationContext, fcmInstanceName)) {
            FirebaseUtil.initApp(
                TAG_FCM,
                applicationContext,
                fcmInstanceName,
                fcmProjectID,
                fcmAppID,
                fcmApiKey
            )
        }
        doAsync {
            try {
                val token = FirebaseUtil.getToken(
                    TAG_FCM,
                    fcmInstanceName,
                    gcmSenderID
                )
                if (token != null) {
                    Timber.d("get instance id success: $token")
                    sp.setFCMToken(token)
                    FCM_TOKEN = token
//                    FirebaseMessaging.getInstance().subscribeToTopic("driver").addOnSuccessListener {
//                        Toast.makeText(
//                            applicationContext,
//                            "Subscribed to Topic : driver",
//                            Toast.LENGTH_LONG
//                        ).show()
//                    }
                }
            } catch (e: Exception) {
                Timber.tag(TAG_FCM).d(e.message!!)
            }
        }
    }

    private fun doCheckCurrentUser() {
        if (!sp.getToken().isBlank()) {
            //re login to refresh token?
            ACTIVE_TOKEN = sp.getToken()
            Timber.tag("checkCurrentUser").d("toHome")
            toHomeActivity()
        } else {
            Timber.tag("checkCurrentUser").d("toLogin")
            toLoginActivity()
        }
    }

    private fun toHomeActivity() {
        sp.setMaintenanceInfoShown(false)
        val intent = Intent(this, MainActivity::class.java)
//        val intent = Intent(this, DaftarBiayaOngkirActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun toLoginActivity() {
        //navigate to login activity
        val intent = Intent(this, AuthorizationActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun getCurrentUserId(): Int {
        //Get user id from shared preference
        return 0
    }
}