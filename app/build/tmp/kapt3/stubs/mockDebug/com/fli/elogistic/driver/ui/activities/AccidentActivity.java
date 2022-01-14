package com.fli.elogistic.driver.ui.activities;

import java.lang.System;

@kotlin.Suppress(names = {"BlockingMethodInNonBlockingContext"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u00020:H\u0002J\u0010\u0010<\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0004H\u0002J\u0010\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020?H\u0002J\u0010\u0010A\u001a\u00020:2\b\u0010B\u001a\u0004\u0018\u00010\u001dJ\b\u0010C\u001a\u00020:H\u0002J\"\u0010D\u001a\u00020:2\u0006\u0010E\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u00062\b\u0010G\u001a\u0004\u0018\u00010HH\u0014J\b\u0010I\u001a\u00020:H\u0016J\u0012\u0010J\u001a\u00020:2\b\u0010K\u001a\u0004\u0018\u00010LH\u0014J\b\u0010M\u001a\u00020:H\u0002J\b\u0010N\u001a\u00020,H\u0002J\b\u0010O\u001a\u00020:H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u001cj\b\u0012\u0004\u0012\u00020\u0004`\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u0012\u0012\u0004\u0012\u00020!0\u001cj\b\u0012\u0004\u0012\u00020!`\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u000e\u0010(\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b2\u00103\u001a\u0004\b0\u00101R\u001b\u00104\u001a\u0002058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b8\u00103\u001a\u0004\b6\u00107\u00a8\u0006P"}, d2 = {"Lcom/fli/elogistic/driver/ui/activities/AccidentActivity;", "Lcom/fli/elogistic/driver/ui/activities/BaseActivity;", "()V", "LIST_NAME_BARANG_BUKTI", "", "OPERATION_CAPTURE_PHOTO_BARANG_BUKTI", "", "binding", "Lcom/fli/elogistic/driver/databinding/ActivityAccidentBinding;", "getBinding", "()Lcom/fli/elogistic/driver/databinding/ActivityAccidentBinding;", "setBinding", "(Lcom/fli/elogistic/driver/databinding/ActivityAccidentBinding;)V", "fotoManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getFotoManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setFotoManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "imageBarangBuktiAdapter", "Lcom/fli/elogistic/driver/adapter/ImageAdapter;", "getImageBarangBuktiAdapter", "()Lcom/fli/elogistic/driver/adapter/ImageAdapter;", "setImageBarangBuktiAdapter", "(Lcom/fli/elogistic/driver/adapter/ImageAdapter;)V", "listImageBarangBukti", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "listImageBarangBuktiBase64", "listReasonAllModel", "Lcom/fli/elogistic/driver/models/shipment/ReasonAllModel;", "loadingDialog", "Landroid/app/AlertDialog;", "getLoadingDialog", "()Landroid/app/AlertDialog;", "setLoadingDialog", "(Landroid/app/AlertDialog;)V", "mPath", "mUri", "Landroid/net/Uri;", "needConfirm", "", "reason", "reasonAllViewModel", "Lcom/fli/elogistic/driver/viewmodel/ReasonAllViewModel;", "getReasonAllViewModel", "()Lcom/fli/elogistic/driver/viewmodel/ReasonAllViewModel;", "reasonAllViewModel$delegate", "Lkotlin/Lazy;", "uploadAccidentViewModel", "Lcom/fli/elogistic/driver/viewmodel/UploadAccidentViewModel;", "getUploadAccidentViewModel", "()Lcom/fli/elogistic/driver/viewmodel/UploadAccidentViewModel;", "uploadAccidentViewModel$delegate", "buildLoadingDialog", "", "captureImage", "checkNeedConfirm", "convertImagetoBase64", "compressedImageFile", "Ljava/io/File;", "createImageFile", "deleteImage", "item", "getData", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "sendAccidentInfo", "submissionValid", "takePicture", "app_mockDebug"})
public final class AccidentActivity extends com.fli.elogistic.driver.ui.activities.BaseActivity {
    public com.fli.elogistic.driver.databinding.ActivityAccidentBinding binding;
    public android.app.AlertDialog loadingDialog;
    public com.fli.elogistic.driver.adapter.ImageAdapter imageBarangBuktiAdapter;
    public androidx.recyclerview.widget.LinearLayoutManager fotoManager;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private final kotlin.Lazy reasonAllViewModel$delegate = null;
    private final kotlin.Lazy uploadAccidentViewModel$delegate = null;
    private java.util.ArrayList<com.fli.elogistic.driver.models.shipment.ReasonAllModel> listReasonAllModel;
    private final java.lang.String LIST_NAME_BARANG_BUKTI = "Barang Bukti";
    private final int OPERATION_CAPTURE_PHOTO_BARANG_BUKTI = 21;
    private java.util.ArrayList<java.lang.Object> listImageBarangBukti;
    private java.util.ArrayList<java.lang.String> listImageBarangBuktiBase64;
    private android.net.Uri mUri;
    private java.lang.String mPath;
    private java.lang.String reason;
    private boolean needConfirm = false;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.databinding.ActivityAccidentBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.databinding.ActivityAccidentBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.AlertDialog getLoadingDialog() {
        return null;
    }
    
    public final void setLoadingDialog(@org.jetbrains.annotations.NotNull()
    android.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.adapter.ImageAdapter getImageBarangBuktiAdapter() {
        return null;
    }
    
    public final void setImageBarangBuktiAdapter(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.adapter.ImageAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager getFotoManager() {
        return null;
    }
    
    public final void setFotoManager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager p0) {
    }
    
    private final com.fli.elogistic.driver.viewmodel.ReasonAllViewModel getReasonAllViewModel() {
        return null;
    }
    
    private final com.fli.elogistic.driver.viewmodel.UploadAccidentViewModel getUploadAccidentViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void takePicture() {
    }
    
    private final java.io.File createImageFile() {
        return null;
    }
    
    private final void captureImage() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final java.lang.Object convertImagetoBase64(java.io.File compressedImageFile) {
        return null;
    }
    
    public final void deleteImage(@org.jetbrains.annotations.Nullable()
    java.lang.Object item) {
    }
    
    private final void buildLoadingDialog() {
    }
    
    private final void getData() {
    }
    
    private final boolean checkNeedConfirm(java.lang.String reason) {
        return false;
    }
    
    private final void sendAccidentInfo() {
    }
    
    private final boolean submissionValid() {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public AccidentActivity() {
        super();
    }
}