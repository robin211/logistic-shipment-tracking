package com.fli.elogistic.driver.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/fli/elogistic/driver/services/LocationHelper;", "", "()V", "LOCATION_REFRESH_DISTANCE", "", "getLOCATION_REFRESH_DISTANCE", "()I", "setLOCATION_REFRESH_DISTANCE", "(I)V", "LOCATION_REFRESH_TIME", "getLOCATION_REFRESH_TIME", "setLOCATION_REFRESH_TIME", "startListeningUserLocation", "", "context", "Landroid/content/Context;", "myListener", "Lcom/fli/elogistic/driver/services/MyLocationListener;", "app_mockDebug"})
public final class LocationHelper {
    private int LOCATION_REFRESH_TIME = 1800000;
    private int LOCATION_REFRESH_DISTANCE = 0;
    
    public final int getLOCATION_REFRESH_TIME() {
        return 0;
    }
    
    public final void setLOCATION_REFRESH_TIME(int p0) {
    }
    
    public final int getLOCATION_REFRESH_DISTANCE() {
        return 0;
    }
    
    public final void setLOCATION_REFRESH_DISTANCE(int p0) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void startListeningUserLocation(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.services.MyLocationListener myListener) {
    }
    
    public LocationHelper() {
        super();
    }
}