package com.fli.elogistic.driver.models.uploadDocument;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00c6\u0003J\t\u0010 \u001a\u00020\bH\u00c6\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020\bH\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e\u00a8\u0006("}, d2 = {"Lcom/fli/elogistic/driver/models/uploadDocument/UploadBASTRequest;", "", "datetimeTz", "", "shipmentId", "shipmentDetailId", "locationId", "encodedFile", "", "notes", "(JJJJLjava/lang/String;Ljava/lang/String;)V", "getDatetimeTz", "()J", "setDatetimeTz", "(J)V", "getEncodedFile", "()Ljava/lang/String;", "setEncodedFile", "(Ljava/lang/String;)V", "getLocationId", "setLocationId", "getNotes", "setNotes", "getShipmentDetailId", "setShipmentDetailId", "getShipmentId", "setShipmentId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_stagingDebug"})
public final class UploadBASTRequest {
    @com.google.gson.annotations.SerializedName(value = "datetimeTz")
    private long datetimeTz;
    @com.google.gson.annotations.SerializedName(value = "shipmentId")
    private long shipmentId;
    @com.google.gson.annotations.SerializedName(value = "shipmentDetailId")
    private long shipmentDetailId;
    @com.google.gson.annotations.SerializedName(value = "locationId")
    private long locationId;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "encodedFile")
    private java.lang.String encodedFile;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "notes")
    private java.lang.String notes;
    
    public final long getDatetimeTz() {
        return 0L;
    }
    
    public final void setDatetimeTz(long p0) {
    }
    
    public final long getShipmentId() {
        return 0L;
    }
    
    public final void setShipmentId(long p0) {
    }
    
    public final long getShipmentDetailId() {
        return 0L;
    }
    
    public final void setShipmentDetailId(long p0) {
    }
    
    public final long getLocationId() {
        return 0L;
    }
    
    public final void setLocationId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEncodedFile() {
        return null;
    }
    
    public final void setEncodedFile(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNotes() {
        return null;
    }
    
    public final void setNotes(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public UploadBASTRequest(long datetimeTz, long shipmentId, long shipmentDetailId, long locationId, @org.jetbrains.annotations.NotNull()
    java.lang.String encodedFile, @org.jetbrains.annotations.NotNull()
    java.lang.String notes) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long component4() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.models.uploadDocument.UploadBASTRequest copy(long datetimeTz, long shipmentId, long shipmentDetailId, long locationId, @org.jetbrains.annotations.NotNull()
    java.lang.String encodedFile, @org.jetbrains.annotations.NotNull()
    java.lang.String notes) {
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