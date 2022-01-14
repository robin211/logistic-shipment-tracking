package com.fli.elogistic.driver.models.uploadDocument;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000fj\b\u0012\u0004\u0012\u00020\u0007`\u0010\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000fj\b\u0012\u0004\u0012\u00020\u0007`\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0013J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\u0019\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000fj\b\u0012\u0004\u0012\u00020\u0007`\u0010H\u00c6\u0003J\u0019\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000fj\b\u0012\u0004\u0012\u00020\u0007`\u0010H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0007H\u00c6\u0003J\t\u0010:\u001a\u00020\tH\u00c6\u0003J\t\u0010;\u001a\u00020\u0007H\u00c6\u0003J\t\u0010<\u001a\u00020\u0007H\u00c6\u0003J\t\u0010=\u001a\u00020\u0007H\u00c6\u0003J\t\u0010>\u001a\u00020\u0007H\u00c6\u0003J\u00a1\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000fj\b\u0012\u0004\u0012\u00020\u0007`\u00102\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000fj\b\u0012\u0004\u0012\u00020\u0007`\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010@\u001a\u00020\t2\b\u0010A\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010B\u001a\u00020CH\u00d6\u0001J\t\u0010D\u001a\u00020\u0007H\u00d6\u0001R\u001e\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R.\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000fj\b\u0012\u0004\u0012\u00020\u0007`\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001e\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000fj\b\u0012\u0004\u0012\u00020\u0007`\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010&\"\u0004\b\'\u0010(R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010!\"\u0004\b*\u0010#R\u001e\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\u001e\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010!\"\u0004\b0\u0010#R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010!\"\u0004\b2\u0010#\u00a8\u0006E"}, d2 = {"Lcom/fli/elogistic/driver/models/uploadDocument/UploadBASPRequest;", "", "shipmentId", "", "shipmentDetailId", "locationId", "baspTitle", "", "isNeedConfirm", "", "baspCategory", "baspNotes", "note", "receiverName", "baspPhoto", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "documentationPhoto", "datetimeTz", "(JJJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;J)V", "getBaspCategory", "()Ljava/lang/String;", "setBaspCategory", "(Ljava/lang/String;)V", "getBaspNotes", "setBaspNotes", "getBaspPhoto", "()Ljava/util/ArrayList;", "setBaspPhoto", "(Ljava/util/ArrayList;)V", "getBaspTitle", "setBaspTitle", "getDatetimeTz", "()J", "setDatetimeTz", "(J)V", "getDocumentationPhoto", "setDocumentationPhoto", "()Z", "setNeedConfirm", "(Z)V", "getLocationId", "setLocationId", "getNote", "setNote", "getReceiverName", "setReceiverName", "getShipmentDetailId", "setShipmentDetailId", "getShipmentId", "setShipmentId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_stagingDebug"})
public final class UploadBASPRequest {
    @com.google.gson.annotations.SerializedName(value = "shipmentsId")
    private long shipmentId;
    @com.google.gson.annotations.SerializedName(value = "shipmentsDetailId")
    private long shipmentDetailId;
    @com.google.gson.annotations.SerializedName(value = "locationId")
    private long locationId;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "baspTitle")
    private java.lang.String baspTitle;
    @com.google.gson.annotations.SerializedName(value = "isNeedConfirm")
    private boolean isNeedConfirm;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "baspCategory")
    private java.lang.String baspCategory;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "baspNotes")
    private java.lang.String baspNotes;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "note")
    private java.lang.String note;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "receiverName")
    private java.lang.String receiverName;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "baspPhoto")
    private java.util.ArrayList<java.lang.String> baspPhoto;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "documentationPhoto")
    private java.util.ArrayList<java.lang.String> documentationPhoto;
    @com.google.gson.annotations.SerializedName(value = "datetimeTz")
    private long datetimeTz;
    
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
    public final java.lang.String getBaspTitle() {
        return null;
    }
    
    public final void setBaspTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isNeedConfirm() {
        return false;
    }
    
    public final void setNeedConfirm(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBaspCategory() {
        return null;
    }
    
    public final void setBaspCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBaspNotes() {
        return null;
    }
    
    public final void setBaspNotes(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNote() {
        return null;
    }
    
    public final void setNote(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReceiverName() {
        return null;
    }
    
    public final void setReceiverName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getBaspPhoto() {
        return null;
    }
    
    public final void setBaspPhoto(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getDocumentationPhoto() {
        return null;
    }
    
    public final void setDocumentationPhoto(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    public final long getDatetimeTz() {
        return 0L;
    }
    
    public final void setDatetimeTz(long p0) {
    }
    
    public UploadBASPRequest(long shipmentId, long shipmentDetailId, long locationId, @org.jetbrains.annotations.NotNull()
    java.lang.String baspTitle, boolean isNeedConfirm, @org.jetbrains.annotations.NotNull()
    java.lang.String baspCategory, @org.jetbrains.annotations.NotNull()
    java.lang.String baspNotes, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    java.lang.String receiverName, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> baspPhoto, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> documentationPhoto, long datetimeTz) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> component11() {
        return null;
    }
    
    public final long component12() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.models.uploadDocument.UploadBASPRequest copy(long shipmentId, long shipmentDetailId, long locationId, @org.jetbrains.annotations.NotNull()
    java.lang.String baspTitle, boolean isNeedConfirm, @org.jetbrains.annotations.NotNull()
    java.lang.String baspCategory, @org.jetbrains.annotations.NotNull()
    java.lang.String baspNotes, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    java.lang.String receiverName, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> baspPhoto, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> documentationPhoto, long datetimeTz) {
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