package com.fli.elogistic.driver.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\'\u0018\u00002\u00020\u0001Bo\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\f\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\r\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u001f\"\u0004\b\"\u0010!R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0014\"\u0004\b(\u0010\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u0010\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b4\u0010*\"\u0004\b5\u0010,\u00a8\u00066"}, d2 = {"Lcom/fli/elogistic/driver/models/LocationAddressModel;", "Ljava/io/Serializable;", "sequence", "", "locationId", "location", "", "address", "currentSequence", "", "isCurretSequenceFinished", "", "isCurrentSequenceArrived", "isCurretSequenceBASTSubmitted", "latitude", "", "longitude", "radiusCalculation", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/Boolean;ZDDI)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getCurrentSequence", "()J", "setCurrentSequence", "(J)V", "()Ljava/lang/Boolean;", "setCurrentSequenceArrived", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "()Z", "setCurretSequenceBASTSubmitted", "(Z)V", "setCurretSequenceFinished", "getLatitude", "()D", "setLatitude", "(D)V", "getLocation", "setLocation", "getLocationId", "()Ljava/lang/Integer;", "setLocationId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLongitude", "setLongitude", "getRadiusCalculation", "()I", "setRadiusCalculation", "(I)V", "getSequence", "setSequence", "app_stagingDebug"})
public final class LocationAddressModel implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer sequence;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer locationId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String location;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String address;
    private long currentSequence;
    private boolean isCurretSequenceFinished;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isCurrentSequenceArrived;
    private boolean isCurretSequenceBASTSubmitted;
    private double latitude;
    private double longitude;
    private int radiusCalculation;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSequence() {
        return null;
    }
    
    public final void setSequence(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLocationId() {
        return null;
    }
    
    public final void setLocationId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long getCurrentSequence() {
        return 0L;
    }
    
    public final void setCurrentSequence(long p0) {
    }
    
    public final boolean isCurretSequenceFinished() {
        return false;
    }
    
    public final void setCurretSequenceFinished(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isCurrentSequenceArrived() {
        return null;
    }
    
    public final void setCurrentSequenceArrived(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public final boolean isCurretSequenceBASTSubmitted() {
        return false;
    }
    
    public final void setCurretSequenceBASTSubmitted(boolean p0) {
    }
    
    public final double getLatitude() {
        return 0.0;
    }
    
    public final void setLatitude(double p0) {
    }
    
    public final double getLongitude() {
        return 0.0;
    }
    
    public final void setLongitude(double p0) {
    }
    
    public final int getRadiusCalculation() {
        return 0;
    }
    
    public final void setRadiusCalculation(int p0) {
    }
    
    public LocationAddressModel(@org.jetbrains.annotations.Nullable()
    java.lang.Integer sequence, @org.jetbrains.annotations.Nullable()
    java.lang.Integer locationId, @org.jetbrains.annotations.Nullable()
    java.lang.String location, @org.jetbrains.annotations.Nullable()
    java.lang.String address, long currentSequence, boolean isCurretSequenceFinished, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isCurrentSequenceArrived, boolean isCurretSequenceBASTSubmitted, double latitude, double longitude, int radiusCalculation) {
        super();
    }
}