package com.fli.elogistic.driver.models.uploadDocument;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\bH\u00c6\u0003J\t\u0010(\u001a\u00020\bH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0019\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\rH\u00c6\u0003Jc\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\rH\u00c6\u0001J\u0013\u0010,\u001a\u00020\u00052\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020/H\u00d6\u0001J\t\u00100\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R.\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!\u00a8\u00061"}, d2 = {"Lcom/fli/elogistic/driver/models/uploadDocument/UploadAccidentRequest;", "", "accidentReason", "", "isNeedConfirm", "", "accidentReasonNotes", "latitude", "", "longitude", "imageNote", "encodedFile", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;ZLjava/lang/String;DDLjava/lang/String;Ljava/util/ArrayList;)V", "getAccidentReason", "()Ljava/lang/String;", "setAccidentReason", "(Ljava/lang/String;)V", "getAccidentReasonNotes", "setAccidentReasonNotes", "getEncodedFile", "()Ljava/util/ArrayList;", "setEncodedFile", "(Ljava/util/ArrayList;)V", "getImageNote", "setImageNote", "()Z", "setNeedConfirm", "(Z)V", "getLatitude", "()D", "setLatitude", "(D)V", "getLongitude", "setLongitude", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_mockDebug"})
public final class UploadAccidentRequest {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "accidentReason")
    private java.lang.String accidentReason;
    @com.google.gson.annotations.SerializedName(value = "isNeedConfirm")
    private boolean isNeedConfirm;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "accidentReasonNotes")
    private java.lang.String accidentReasonNotes;
    @com.google.gson.annotations.SerializedName(value = "latitude")
    private double latitude;
    @com.google.gson.annotations.SerializedName(value = "longitude")
    private double longitude;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "imageNote")
    private java.lang.String imageNote;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "encodedFile")
    private java.util.ArrayList<java.lang.String> encodedFile;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccidentReason() {
        return null;
    }
    
    public final void setAccidentReason(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isNeedConfirm() {
        return false;
    }
    
    public final void setNeedConfirm(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccidentReasonNotes() {
        return null;
    }
    
    public final void setAccidentReasonNotes(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageNote() {
        return null;
    }
    
    public final void setImageNote(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getEncodedFile() {
        return null;
    }
    
    public final void setEncodedFile(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    public UploadAccidentRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String accidentReason, boolean isNeedConfirm, @org.jetbrains.annotations.Nullable()
    java.lang.String accidentReasonNotes, double latitude, double longitude, @org.jetbrains.annotations.Nullable()
    java.lang.String imageNote, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> encodedFile) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.models.uploadDocument.UploadAccidentRequest copy(@org.jetbrains.annotations.NotNull()
    java.lang.String accidentReason, boolean isNeedConfirm, @org.jetbrains.annotations.Nullable()
    java.lang.String accidentReasonNotes, double latitude, double longitude, @org.jetbrains.annotations.Nullable()
    java.lang.String imageNote, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> encodedFile) {
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