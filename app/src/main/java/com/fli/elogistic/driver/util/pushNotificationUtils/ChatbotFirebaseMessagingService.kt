package com.fli.elogistic.driver.util.pushNotificationUtils

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class ChatbotFirebaseMessagingService : FirebaseMessagingService() {

    override fun onCreate() {
        //generate new token?
        //token yang dibikin masuk ga sih?
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
//        Log.d(Consts.TAG, "CHATBOTLUAR message received: $remoteMessage")
//        if (remoteMessage != null) {
//
//            Log.d(Consts.TAG, "From: " + remoteMessage.getFrom()!!)
//
//            if (remoteMessage.getData().isNotEmpty()) {
//                Log.d(Consts.TAG, "Message data payload: " + remoteMessage.getData())
//                if (remoteMessage.getNotification() != null) {
//                    handleNow(
//                        remoteMessage.getNotification()!!.getTitle(),
//                        remoteMessage.getNotification()!!.getBody(),
//                        remoteMessage.getData()
//                    )
//                } else {
//                    handleNow("", "", remoteMessage.getData())
//                }
//                if (remoteMessage.getNotification() != null) {
//                    Log.d(
//                        Consts.TAG,
//                        "Message Notification Body: " + remoteMessage.getNotification()!!.getBody()!!
//                    )
////                    sendNotification(
////                        remoteMessage.getNotification()!!.getTitle(),
////                        remoteMessage.getNotification()!!.getBody(),
////                        remoteMessage.getData()
////                    )
//                }
//            }
//        }
    }

    private var activityClass:Int=0

    private fun handleNow(title: String?, body: String?, data: Map<String, String>) {
//        val intent = Intent(this, ChatReceiver::class.java)
//        intent.setAction(BaseChatReceiver.SERVICE_CHAT_RECEIVED)
//        intent.putExtra("title", title)
//        intent.putExtra("body", body)
//        if (data.containsKey("message")) {
//            if (!data["message"].isNullOrEmpty()) {
//                Log.d(Consts.TAG, data["message"])
//                lateinit var firebaseMsg: FirebaseMsg
//                try {
//
//                    firebaseMsg = Gson().fromJson<FirebaseMsg>(data["message"], FirebaseMsg::class.java)
//                    if (firebaseMsg != null) {
//
//                        if (firebaseMsg.type == NotifType.CLOSE_SESSION_ADMIN) {
//                            activityClass = 1
//                            intent.putExtra("state", ChatService.SESSION_CLOSED)
//                            intent.putExtra("sessionID", firebaseMsg.sessionID)
//                            LocalBroadcastManager.getInstance(this.applicationContext)
//                                .sendBroadcast(intent)
//
//                        } else if (firebaseMsg.type == NotifType.NEW_CHAT_ADMIN) {
//                            activityClass = 1
//                            intent.putExtra("state", ChatService.GET_NEW_CHATS_WITH_ADMIN)
//                            intent.putExtra("chatID", firebaseMsg.chatID)
//                            LocalBroadcastManager.getInstance(this.applicationContext)
//                                .sendBroadcast(intent)
//
//                        } else if (firebaseMsg.type == NotifType.NEW_CHAT_CHATBOT) {
//                            activityClass = 2
//                            intent.putExtra("state", ChatService.GET_NEW_CHATS_WITH_CHATBOT)
//                            intent.putExtra("chatID", firebaseMsg.chatID)
//                            LocalBroadcastManager.getInstance(this.applicationContext)
//                                .sendBroadcast(intent)
//                        }
//
//                    }
//
//                } catch (e: Exception) {
//                    Log.e(Consts.TAG, e.message)
//                }
//            }
//        }
    }

    override fun onNewToken(token: String) {
//        Log.d(Consts.TAG, "Refreshed token: $token")
//        val clientModel = Config.getClient(applicationContext)
//        val registerToken = RegisterToken(applicationContext, clientModel.id, token,
//            object : RegisterToken.RegisterTokenListener {
//                override fun onRegistered(registerToken: RegisterTokenRequest) {
//                    Log.e(
//                        Consts.TAG,
//                        "onRegisteredToken, clientID:${registerToken.clientID}, token:${registerToken.token}"
//                    )
//                }
//
//                override fun onError(err: String) {
//                    Log.e(Consts.TAG, "err: $err")
//                }
//            })
//        registerToken.exec()

    }

    private fun sendNotification(title: String?, messageBody: String?, data: Map<String, String>) {
//        var intent:Intent
//        if (activityClass==2) {
//            intent = Intent(this, OfflineChatsActivity::class.java)
//        } else {
//            intent = Intent(this, CbChatsActivity::class.java)
//        }
//
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_SINGLE_TOP or Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT)
//        val pendingIntent = PendingIntent.getActivity(
//            this, 0 /* Request code */, intent,
//            PendingIntent.FLAG_ONE_SHOT
//        )
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
//        for (key in data.keys) {
//            if (data[key] != null) {
//                intent.putExtra(key, data[key].toString())
//            } else {
//                intent.putExtra(key, "")
//            }
//        }
//        intent.putExtra("title", title)
//        intent.putExtra("body", messageBody)
//        val channelId = getString(R.string.default_notification_channel_id)
//        val defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
//        val notificationBuilder = NotificationCompat.Builder(this, channelId)
//            //.setSmallIcon(applicationInfo.icon)
//            .setContentTitle(title)
//            .setColor(resources.getColor(R.color.blue))
//            .setContentText(messageBody)
//            .setAutoCancel(true)
//            .setSound(defaultSoundUri)
//            .setDefaults(NotificationCompat.DEFAULT_ALL)
//            .setPriority(NotificationCompat.PRIORITY_MAX)
//            .setVisibility(VISIBILITY_PUBLIC)
//            .setContentIntent(pendingIntent)
//        val notificationManager =
//            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//        // Since android Oreo notification channel is needed.
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            val channel = NotificationChannel(
//                channelId,
//                "E-Logistic",
//                NotificationManager.IMPORTANCE_HIGH
//            )
//            channel.description = "E-Logistic"
//            notificationManager.createNotificationChannel(channel)
//        }
//        notificationManager.notify(0 /* ID of notification */, notificationBuilder.build())
    }
}