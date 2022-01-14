package com.fli.elogistic.driver.services

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Intent
import android.location.Location
import android.os.Build
import android.os.IBinder
import android.util.Log
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.constants.*
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import timber.log.Timber
import java.net.URL

class LocationsService() : Service() {

    val ACTION_START_FOREGROUND_SERVICE = "ACTION_START_FOREGROUND_SERVICE"
    val ACTION_STOP_FOREGROUND_SERVICE = "ACTION_STOP_FOREGROUND_SERVICE"

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {

        when (intent.action) {
            ACTION_START_FOREGROUND_SERVICE -> {
                val builder: NotificationCompat.Builder =
                    NotificationCompat.Builder(this, "location_service")
                        .setOngoing(false)
                        .setSmallIcon(R.drawable.ic_penjemputan)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    val notificationManager: NotificationManager =
                        getSystemService(NOTIFICATION_SERVICE) as NotificationManager
                    val notificationChannel = NotificationChannel(
                        "location_service",
                        "location_service", NotificationManager.IMPORTANCE_LOW
                    )
                    notificationChannel.description = "location_service"
                    notificationChannel.setSound(null, null)
                    notificationManager.createNotificationChannel(notificationChannel)
                    startForeground(1, builder.build())
                    Toast.makeText(this, "Foreground Service Started", Toast.LENGTH_SHORT).show()
                }
            }
            ACTION_STOP_FOREGROUND_SERVICE -> {

                // Stop foreground service and remove the notification.
                stopForeground(true)

                // Stop the foreground service.
                stopSelf()

            }
        }

        LocationHelper().startListeningUserLocation(
            this, object : MyLocationListener {
                @SuppressLint("LogNotTimber")
                override fun onLocationChanged(location: Location?) {
                    CURRENT_LOCATION = location
                    Log.d("Location","Latitude: ${location?.latitude}")
                    Log.d("Location","Longitude: ${location?.longitude}")

                    val client = OkHttpClient()
                    val url = URL("https://api-dev.fastlog.api/tracking/api/v3/position/$DRIVER_ID")

                    val JSON = MediaType.get("application/json; charset=utf-8")
                    val bodys = RequestBody.create(JSON,
                        "{" +
                                "\"companyId\": $COMPANY_ID," +
                                "\"cargoId\": $CURRENT_SHIPMENT_CARGO_ID," +
                                "\"shipmentGroupId\": $SHIPMENT_GROUP_ID," +
                                "\"longitude\": ${location?.longitude}," +
                                "\"latitude\": ${location?.latitude}" +
                                "}")

                    val request = Request.Builder()
                        .url(url)
                        .post(bodys)
                        .build()

                    val thread = Thread {
                        try {
                            val response = client.newCall(request).execute()
                            val responseBody = response.body().toString()
                            Timber.d("Response Tracking: $responseBody")
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }

                    thread.start()
                }
            })
        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

}