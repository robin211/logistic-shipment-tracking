package com.fli.elogistic.driver.util.pushNotificationUtils


import android.Manifest
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.constants.ACTIVE_TOKEN
import com.fli.elogistic.driver.constants.BASE
import com.fli.elogistic.driver.constants.DEVICE_ID
import com.fli.elogistic.driver.ui.activities.SplashActivity
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import org.jetbrains.anko.activityManager
import timber.log.Timber
import java.net.URL
import java.util.*


class FCMMessagingService : FirebaseMessagingService() {
    private lateinit var fusedLocationClient: FusedLocationProviderClient

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)

        Timber.d("We just got a message!")

        Timber.d("Data : ${remoteMessage.data}")
        remoteMessage.data.let {
            Timber.d("Data data: $it")
            val title = it["title"]
            val body = it["body"]

            if (title == "" || title == null) {
                if (it["id"] == "auto-assign"){
                    Timber.d("Tipe : Auto Assign")
                    fusedLocationClient = LocationServices.getFusedLocationProviderClient(applicationContext!!)
                    if (ActivityCompat.checkSelfPermission(
                            this,
                            Manifest.permission.ACCESS_FINE_LOCATION
                        ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                            this,
                            Manifest.permission.ACCESS_COARSE_LOCATION
                        ) != PackageManager.PERMISSION_GRANTED
                    ) {
                        Timber.d("Permission is not granted")
                    }else{
                        var latitude: Double
                        var longitude: Double
                        val latitudeOrigin = it["latitudeOrigin"]?.toDouble()
                        val longitudeOrigin = it["longitudeOrigin"]?.toDouble()
                        val cargoid = it["cargoId"]?.toLong()
                        fusedLocationClient.lastLocation
                            .addOnSuccessListener { location ->
                                latitude = location.latitude
                                longitude = location.longitude
                                val client = OkHttpClient()
                                val url = URL("$BASE/api/v3/auto-assign")

                                val JSON = MediaType.get("application/json; charset=utf-8")
                                val bodys = RequestBody.create(JSON,
                                    "{" +
                                            "\"cargoId\": $cargoid," +
                                            "\"latitudeOrigin\": $latitudeOrigin," +
                                            "\"longitudeOrigin\": $longitudeOrigin," +
                                            "\"latitudeDriver\": $latitude," +
                                            "\"longitudeDriver\": $longitude" +
                                            "}")

                                val request = Request.Builder()
                                    .url(url)
                                    .post(bodys)
                                    .header("Authorization",ACTIVE_TOKEN)
                                    .addHeader("x-device-id", DEVICE_ID)
                                    .build()

                                val response = client.newCall(request).execute()
                                val responseBody = response.body().toString()
                                Timber.d("Response Body: $responseBody")
                            }
                    }


                }
            } else {
                val builder = NotificationCompat.Builder(this, SplashActivity.CHANNEL_ID)
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setContentTitle(title)
                    .setContentText(body)
                    .setStyle(NotificationCompat.BigTextStyle())
                    .setPriority(NotificationCompat.PRIORITY_HIGH)

                with(NotificationManagerCompat.from(this)) {
                    // notificationId is a unique int for each notification that you must define
                    notify(Calendar.getInstance().timeInMillis.toInt(), builder.build())
                }
            }

        }

    }
//    }
}