package com.fli.elogistic.driver.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/fli/elogistic/driver/util/FirebaseUtil;", "", "()V", "Companion", "app_mockDebug"})
public final class FirebaseUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.fli.elogistic.driver.util.FirebaseUtil.Companion Companion = null;
    
    public FirebaseUtil() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006J \u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J \u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006J6\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/fli/elogistic/driver/util/FirebaseUtil$Companion;", "", "()V", "appExists", "", "tag", "", "context", "Landroid/content/Context;", "fcmInstanceName", "deleteToken", "", "gcmSenderID", "findApp", "Lcom/google/firebase/FirebaseApp;", "getToken", "initApp", "fcmProjectID", "fcmApplicationID", "fcmApiKey", "app_mockDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.google.firebase.FirebaseApp findApp(@org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String fcmInstanceName) {
            return null;
        }
        
        public final boolean appExists(@org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String fcmInstanceName) {
            return false;
        }
        
        public final void initApp(@org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String fcmInstanceName, @org.jetbrains.annotations.NotNull()
        java.lang.String fcmProjectID, @org.jetbrains.annotations.NotNull()
        java.lang.String fcmApplicationID, @org.jetbrains.annotations.NotNull()
        java.lang.String fcmApiKey) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getToken(@org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        java.lang.String fcmInstanceName, @org.jetbrains.annotations.NotNull()
        java.lang.String gcmSenderID) {
            return null;
        }
        
        public final void deleteToken(@org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String fcmInstanceName, @org.jetbrains.annotations.NotNull()
        java.lang.String gcmSenderID) {
        }
        
        private Companion() {
            super();
        }
    }
}