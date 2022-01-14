package com.fli.elogistic.driver.models.shipment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020$H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011\u00a8\u0006%"}, d2 = {"Lcom/fli/elogistic/driver/models/shipment/PostAutoAssignLocationRequest;", "", "cargoId", "", "latitudeOrigin", "", "longitudeOrigin", "latitudeDriver", "longitudeDriver", "(JDDDD)V", "getCargoId", "()J", "setCargoId", "(J)V", "getLatitudeDriver", "()D", "setLatitudeDriver", "(D)V", "getLatitudeOrigin", "setLatitudeOrigin", "getLongitudeDriver", "setLongitudeDriver", "getLongitudeOrigin", "setLongitudeOrigin", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_stagingDebug"})
public final class PostAutoAssignLocationRequest {
    @com.google.gson.annotations.SerializedName(value = "cargoId")
    private long cargoId;
    @com.google.gson.annotations.SerializedName(value = "latitudeOrigin")
    private double latitudeOrigin;
    @com.google.gson.annotations.SerializedName(value = "longitudeOrigin")
    private double longitudeOrigin;
    @com.google.gson.annotations.SerializedName(value = "latitudeDriver")
    private double latitudeDriver;
    @com.google.gson.annotations.SerializedName(value = "longitudeDriver")
    private double longitudeDriver;
    
    public final long getCargoId() {
        return 0L;
    }
    
    public final void setCargoId(long p0) {
    }
    
    public final double getLatitudeOrigin() {
        return 0.0;
    }
    
    public final void setLatitudeOrigin(double p0) {
    }
    
    public final double getLongitudeOrigin() {
        return 0.0;
    }
    
    public final void setLongitudeOrigin(double p0) {
    }
    
    public final double getLatitudeDriver() {
        return 0.0;
    }
    
    public final void setLatitudeDriver(double p0) {
    }
    
    public final double getLongitudeDriver() {
        return 0.0;
    }
    
    public final void setLongitudeDriver(double p0) {
    }
    
    public PostAutoAssignLocationRequest(long cargoId, double latitudeOrigin, double longitudeOrigin, double latitudeDriver, double longitudeDriver) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.models.shipment.PostAutoAssignLocationRequest copy(long cargoId, double latitudeOrigin, double longitudeOrigin, double latitudeDriver, double longitudeDriver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}