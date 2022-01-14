package com.fli.elogistic.driver.util

import android.content.Context
import android.util.Log
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.iid.FirebaseInstanceId

class FirebaseUtil {

    companion object {

        fun findApp(tag:String, context:Context, fcmInstanceName:String):FirebaseApp? {

            var firebaseApp:FirebaseApp? = null
            val apps = FirebaseApp.getApps(context)
            Log.d(tag, apps.size.toString())

            for (app in apps) {
                if(app.name == fcmInstanceName) {
                    firebaseApp = app
                }
            }

            if(firebaseApp!=null) {
                Log.d(tag, "FirebaseUtil.findApp(" + fcmInstanceName +")=found")
            } else {
                Log.d(tag, "FirebaseUtil.findApp(" + fcmInstanceName +")=notFound")
            }

            return firebaseApp

        }

        fun appExists(tag:String, context:Context, fcmInstanceName:String):Boolean {

            val apps = FirebaseApp.getApps(context)
            Log.d(tag, apps.size.toString())

            var found:Boolean = false
            for (app in apps) {
                if(app.name == fcmInstanceName) {
                    found = true
                }
            }
            Log.d(tag, "FirebaseUtil.appExists(" + fcmInstanceName +")=" + found.toString())
            return found
        }

        fun initApp(tag:String, context:Context,
                    fcmInstanceName: String,
                    fcmProjectID:String,
                    fcmApplicationID:String,
                    fcmApiKey:String) {

            val options = FirebaseOptions.Builder()
                .setProjectId(fcmProjectID)
                .setApplicationId(fcmApplicationID)
                .setApiKey(fcmApiKey)
                .build()
            FirebaseApp.initializeApp(context, options, fcmInstanceName)
        }

        fun getToken(tag:String, fcmInstanceName: String, gcmSenderID:String):String? {
            Log.d(tag, "FirebaseUtil.getToken()")
            Log.d(tag, "fcmInstanceName=" + fcmInstanceName)
            Log.d(tag, "gcmSenderID=" + gcmSenderID)

            val firebaseInstanceApp = FirebaseApp.getInstance(fcmInstanceName)
            val token = FirebaseInstanceId.getInstance(firebaseInstanceApp).getToken(gcmSenderID, "FCM")
            if(token!=null) {
                Log.d(tag, "token=" + token)
            } else {
                Log.d(tag, "token=null")
            }
            return token
        }

        fun deleteToken(tag:String, context:Context, fcmInstanceName: String, gcmSenderID:String) {

            val firebaseApp:FirebaseApp? = findApp(tag, context,
                fcmInstanceName
            )
            if(firebaseApp!=null) {
                FirebaseInstanceId.getInstance(firebaseApp).deleteToken(gcmSenderID, "FCM")
                Log.d(tag, "deleteToken=OK")

            }
        }
    }
}