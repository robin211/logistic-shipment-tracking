package com.fli.elogistic.driver.ui.activities;

import java.lang.System;

@kotlin.Suppress(names = {"BlockingMethodInNonBlockingContext"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010V\u001a\u00020WH\u0002J\u0010\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u0007H\u0002J\u0010\u0010Z\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\\H\u0002J\b\u0010]\u001a\u00020\\H\u0002J\u0018\u0010^\u001a\u00020W2\b\u0010_\u001a\u0004\u0018\u00010)2\u0006\u0010`\u001a\u00020\u0004J\u0010\u0010a\u001a\u00020U2\u0006\u0010b\u001a\u00020\u0004H\u0002J\b\u0010c\u001a\u00020WH\u0002J\b\u0010d\u001a\u00020eH\u0002J\"\u0010f\u001a\u00020W2\u0006\u0010g\u001a\u00020\u00072\u0006\u0010h\u001a\u00020\u00072\b\u0010i\u001a\u0004\u0018\u00010jH\u0014J\b\u0010k\u001a\u00020WH\u0016J\u0012\u0010l\u001a\u00020W2\b\u0010m\u001a\u0004\u0018\u00010nH\u0014J\u001b\u0010o\u001a\u00020W2\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00040qH\u0002\u00a2\u0006\u0002\u0010rJ\b\u0010s\u001a\u00020UH\u0002J\u0010\u0010t\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001e\u0010\'\u001a\u0012\u0012\u0004\u0012\u00020)0(j\b\u0012\u0004\u0012\u00020)`*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00040(j\b\u0012\u0004\u0012\u00020\u0004`*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010,\u001a\u0012\u0012\u0004\u0012\u00020)0(j\b\u0012\u0004\u0012\u00020)`*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u00040(j\b\u0012\u0004\u0012\u00020\u0004`*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010.\u001a\u0012\u0012\u0004\u0012\u00020/0(j\b\u0012\u0004\u0012\u00020/`*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000201X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010=\u001a\u00020>X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020DX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001b\u0010I\u001a\u00020J8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bK\u0010LR\u001b\u0010O\u001a\u00020P8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bS\u0010N\u001a\u0004\bQ\u0010RR\u000e\u0010T\u001a\u00020UX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006u"}, d2 = {"Lcom/fli/elogistic/driver/ui/activities/LaporanKerusakanSelisihActivity;", "Lcom/fli/elogistic/driver/ui/activities/BaseActivity;", "()V", "LIST_NAME_BARANG_BUKTI", "", "LIST_NAME_DOKUMENTASI", "OPERATION_CAPTURE_PHOTO_BARANG_BUKTI", "", "OPERATION_CAPTURE_PHOTO_DOKUMENTASI", "binding", "Lcom/fli/elogistic/driver/databinding/ActivityLaporanKerusakanSelisihBinding;", "getBinding", "()Lcom/fli/elogistic/driver/databinding/ActivityLaporanKerusakanSelisihBinding;", "setBinding", "(Lcom/fli/elogistic/driver/databinding/ActivityLaporanKerusakanSelisihBinding;)V", "detailPerLocationModel", "Lcom/fli/elogistic/driver/models/shipment/DetailPerLocationModel;", "getDetailPerLocationModel", "()Lcom/fli/elogistic/driver/models/shipment/DetailPerLocationModel;", "setDetailPerLocationModel", "(Lcom/fli/elogistic/driver/models/shipment/DetailPerLocationModel;)V", "dokumentasiManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getDokumentasiManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setDokumentasiManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "fotoManager", "getFotoManager", "setFotoManager", "imageBarangBuktiAdapter", "Lcom/fli/elogistic/driver/adapter/ImageAdapter;", "getImageBarangBuktiAdapter", "()Lcom/fli/elogistic/driver/adapter/ImageAdapter;", "setImageBarangBuktiAdapter", "(Lcom/fli/elogistic/driver/adapter/ImageAdapter;)V", "imageDokumentasiAdapter", "getImageDokumentasiAdapter", "setImageDokumentasiAdapter", "listImageBarangBukti", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "listImageBarangBuktiBase64", "listImageDokumentasi", "listImageDokumentasiBase64", "listReasonAllModel", "Lcom/fli/elogistic/driver/models/shipment/ReasonAllModel;", "loadingDialog", "Landroid/app/AlertDialog;", "getLoadingDialog", "()Landroid/app/AlertDialog;", "setLoadingDialog", "(Landroid/app/AlertDialog;)V", "mPath", "getMPath", "()Ljava/lang/String;", "setMPath", "(Ljava/lang/String;)V", "mUri", "Landroid/net/Uri;", "model", "Lcom/fli/elogistic/driver/models/LocationAddressModel;", "getModel", "()Lcom/fli/elogistic/driver/models/LocationAddressModel;", "setModel", "(Lcom/fli/elogistic/driver/models/LocationAddressModel;)V", "orderModel", "Lcom/fli/elogistic/driver/models/shipment/ShipmentModel;", "getOrderModel", "()Lcom/fli/elogistic/driver/models/shipment/ShipmentModel;", "setOrderModel", "(Lcom/fli/elogistic/driver/models/shipment/ShipmentModel;)V", "reasonAllViewModel", "Lcom/fli/elogistic/driver/viewmodel/ReasonAllViewModel;", "getReasonAllViewModel", "()Lcom/fli/elogistic/driver/viewmodel/ReasonAllViewModel;", "reasonAllViewModel$delegate", "Lkotlin/Lazy;", "uploadBASPViewModel", "Lcom/fli/elogistic/driver/viewmodel/UploadBASPViewModel;", "getUploadBASPViewModel", "()Lcom/fli/elogistic/driver/viewmodel/UploadBASPViewModel;", "uploadBASPViewModel$delegate", "willBeSuspended", "", "buildLoadingDialog", "", "captureImage", "actionCode", "convertImagetoBase64", "compressedImageFile", "Ljava/io/File;", "createImageFile", "deleteImage", "item", "listName", "getIsNeedConfirm", "reason", "getListReason", "getTimeOffset", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "populateSpinner", "reasonNames", "", "([Ljava/lang/String;)V", "submissionValid", "takePicture", "app_mockDebug"})
public final class LaporanKerusakanSelisihActivity extends com.fli.elogistic.driver.ui.activities.BaseActivity {
    private final kotlin.Lazy uploadBASPViewModel$delegate = null;
    private final kotlin.Lazy reasonAllViewModel$delegate = null;
    public com.fli.elogistic.driver.databinding.ActivityLaporanKerusakanSelisihBinding binding;
    public com.fli.elogistic.driver.adapter.ImageAdapter imageBarangBuktiAdapter;
    public com.fli.elogistic.driver.adapter.ImageAdapter imageDokumentasiAdapter;
    public androidx.recyclerview.widget.LinearLayoutManager fotoManager;
    public androidx.recyclerview.widget.LinearLayoutManager dokumentasiManager;
    public android.app.AlertDialog loadingDialog;
    public com.fli.elogistic.driver.models.shipment.DetailPerLocationModel detailPerLocationModel;
    public com.fli.elogistic.driver.models.shipment.ShipmentModel orderModel;
    public com.fli.elogistic.driver.models.LocationAddressModel model;
    public java.lang.String mPath;
    private java.util.ArrayList<java.lang.Object> listImageBarangBukti;
    private java.util.ArrayList<java.lang.String> listImageBarangBuktiBase64;
    private java.util.ArrayList<java.lang.Object> listImageDokumentasi;
    private java.util.ArrayList<java.lang.String> listImageDokumentasiBase64;
    private java.util.ArrayList<com.fli.elogistic.driver.models.shipment.ReasonAllModel> listReasonAllModel;
    private android.net.Uri mUri;
    private boolean willBeSuspended = false;
    private final int OPERATION_CAPTURE_PHOTO_BARANG_BUKTI = 11;
    private final int OPERATION_CAPTURE_PHOTO_DOKUMENTASI = 22;
    private final java.lang.String LIST_NAME_BARANG_BUKTI = "Barang Bukti";
    private final java.lang.String LIST_NAME_DOKUMENTASI = "Dokumentasi";
    
    private final com.fli.elogistic.driver.viewmodel.UploadBASPViewModel getUploadBASPViewModel() {
        return null;
    }
    
    private final com.fli.elogistic.driver.viewmodel.ReasonAllViewModel getReasonAllViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.databinding.ActivityLaporanKerusakanSelisihBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.databinding.ActivityLaporanKerusakanSelisihBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.adapter.ImageAdapter getImageBarangBuktiAdapter() {
        return null;
    }
    
    public final void setImageBarangBuktiAdapter(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.adapter.ImageAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.adapter.ImageAdapter getImageDokumentasiAdapter() {
        return null;
    }
    
    public final void setImageDokumentasiAdapter(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.adapter.ImageAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager getFotoManager() {
        return null;
    }
    
    public final void setFotoManager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager getDokumentasiManager() {
        return null;
    }
    
    public final void setDokumentasiManager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.AlertDialog getLoadingDialog() {
        return null;
    }
    
    public final void setLoadingDialog(@org.jetbrains.annotations.NotNull()
    android.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.models.shipment.DetailPerLocationModel getDetailPerLocationModel() {
        return null;
    }
    
    public final void setDetailPerLocationModel(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.shipment.DetailPerLocationModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.models.shipment.ShipmentModel getOrderModel() {
        return null;
    }
    
    public final void setOrderModel(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.shipment.ShipmentModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.models.LocationAddressModel getModel() {
        return null;
    }
    
    public final void setModel(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.LocationAddressModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMPath() {
        return null;
    }
    
    public final void setMPath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean submissionValid() {
        return false;
    }
    
    private final long getTimeOffset() {
        return 0L;
    }
    
    private final boolean getIsNeedConfirm(java.lang.String reason) {
        return false;
    }
    
    private final void getListReason() {
    }
    
    private final void populateSpinner(java.lang.String[] reasonNames) {
    }
    
    private final void takePicture(int actionCode) {
    }
    
    private final void buildLoadingDialog() {
    }
    
    private final java.io.File createImageFile() {
        return null;
    }
    
    private final void captureImage(int actionCode) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void deleteImage(@org.jetbrains.annotations.Nullable()
    java.lang.Object item, @org.jetbrains.annotations.NotNull()
    java.lang.String listName) {
    }
    
    private final java.lang.String convertImagetoBase64(java.io.File compressedImageFile) {
        return null;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public LaporanKerusakanSelisihActivity() {
        super();
    }
}