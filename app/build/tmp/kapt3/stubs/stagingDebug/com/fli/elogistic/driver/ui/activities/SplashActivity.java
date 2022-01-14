package com.fli.elogistic.driver.ui.activities;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0003J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\nH\u0002J\b\u0010\u0014\u001a\u00020\nH\u0002J\b\u0010\u0015\u001a\u00020\nH\u0002J\b\u0010\u0016\u001a\u00020\nH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/fli/elogistic/driver/ui/activities/SplashActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "sp", "Landroid/content/SharedPreferences;", "getSp", "()Landroid/content/SharedPreferences;", "setSp", "(Landroid/content/SharedPreferences;)V", "checkDeviceId", "", "checkPermission", "", "doCheckCurrentUser", "getCurrentUserId", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "refreshFirebaseToken", "requestPermission", "toHomeActivity", "toLoginActivity", "Companion", "app_stagingDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SplashActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public android.content.SharedPreferences sp;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String fcmInstanceName = "fli-driver";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String fcmProjectID = "fastlog-development";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String fcmAppID = "1:408348638345:android:d2c46d08527f9d2bb39a58";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String fcmApiKey = "AIzaSyArFu9Xus9ZgIVRUrHEgenuVSYKUj_ains";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String gcmSenderID = "408348638345";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String TAG_FCM = "fli-driver-fcm";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CHANNEL_ID = "notif_channel";
    @org.jetbrains.annotations.NotNull()
    public static final com.fli.elogistic.driver.ui.activities.SplashActivity.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSp() {
        return null;
    }
    
    public final void setSp(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean checkPermission() {
        return false;
    }
    
    private final void requestPermission() {
    }
    
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    private final void checkDeviceId() {
    }
    
    private final void refreshFirebaseToken() {
    }
    
    private final void doCheckCurrentUser() {
    }
    
    private final void toHomeActivity() {
    }
    
    private final void toLoginActivity() {
    }
    
    private final int getCurrentUserId() {
        return 0;
    }
    
    public SplashActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/fli/elogistic/driver/ui/activities/SplashActivity$Companion;", "", "()V", "CHANNEL_ID", "", "getCHANNEL_ID", "()Ljava/lang/String;", "TAG_FCM", "getTAG_FCM", "setTAG_FCM", "(Ljava/lang/String;)V", "fcmApiKey", "getFcmApiKey", "fcmAppID", "getFcmAppID", "fcmInstanceName", "getFcmInstanceName", "fcmProjectID", "getFcmProjectID", "gcmSenderID", "getGcmSenderID", "setGcmSenderID", "app_stagingDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFcmInstanceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFcmProjectID() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFcmAppID() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFcmApiKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGcmSenderID() {
            return null;
        }
        
        public final void setGcmSenderID(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG_FCM() {
            return null;
        }
        
        public final void setTAG_FCM(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCHANNEL_ID() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}