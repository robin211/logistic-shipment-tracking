package com.fli.elogistic.driver.util.pushNotificationUtils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/fli/elogistic/driver/util/pushNotificationUtils/FCMMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "onMessageReceived", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "app_mockDebug"})
public final class FCMMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    public FCMMessagingService() {
        super();
    }
}