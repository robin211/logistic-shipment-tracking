package com.fli.elogistic.driver.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011\u00a8\u0006$"}, d2 = {"Lcom/fli/elogistic/driver/models/PodModel;", "Ljava/io/Serializable;", "noKargo", "", "tipeKendaraan", "noKendaraan", "datePickUp", "timePickUp", "initialLocation", "pickUpLocations", "dropLocations", "lastLocation", "status", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDatePickUp", "()Ljava/lang/String;", "setDatePickUp", "(Ljava/lang/String;)V", "getDropLocations", "setDropLocations", "getInitialLocation", "setInitialLocation", "getLastLocation", "setLastLocation", "getNoKargo", "setNoKargo", "getNoKendaraan", "setNoKendaraan", "getPickUpLocations", "setPickUpLocations", "getStatus", "setStatus", "getTimePickUp", "setTimePickUp", "getTipeKendaraan", "setTipeKendaraan", "app_mockDebug"})
public final class PodModel implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String noKargo;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String tipeKendaraan;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String noKendaraan;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String datePickUp;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String timePickUp;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String initialLocation;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pickUpLocations;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String dropLocations;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String lastLocation;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String status;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNoKargo() {
        return null;
    }
    
    public final void setNoKargo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTipeKendaraan() {
        return null;
    }
    
    public final void setTipeKendaraan(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNoKendaraan() {
        return null;
    }
    
    public final void setNoKendaraan(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDatePickUp() {
        return null;
    }
    
    public final void setDatePickUp(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTimePickUp() {
        return null;
    }
    
    public final void setTimePickUp(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getInitialLocation() {
        return null;
    }
    
    public final void setInitialLocation(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPickUpLocations() {
        return null;
    }
    
    public final void setPickUpLocations(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDropLocations() {
        return null;
    }
    
    public final void setDropLocations(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastLocation() {
        return null;
    }
    
    public final void setLastLocation(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public PodModel(@org.jetbrains.annotations.Nullable()
    java.lang.String noKargo, @org.jetbrains.annotations.Nullable()
    java.lang.String tipeKendaraan, @org.jetbrains.annotations.Nullable()
    java.lang.String noKendaraan, @org.jetbrains.annotations.Nullable()
    java.lang.String datePickUp, @org.jetbrains.annotations.Nullable()
    java.lang.String timePickUp, @org.jetbrains.annotations.Nullable()
    java.lang.String initialLocation, @org.jetbrains.annotations.Nullable()
    java.lang.String pickUpLocations, @org.jetbrains.annotations.Nullable()
    java.lang.String dropLocations, @org.jetbrains.annotations.Nullable()
    java.lang.String lastLocation, @org.jetbrains.annotations.Nullable()
    java.lang.String status) {
        super();
    }
    
    public PodModel() {
        super();
    }
}