package com.fli.elogistic.driver.ui.activities;

import java.lang.System;

@kotlin.Suppress(names = {"BlockingMethodInNonBlockingContext"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010d\u001a\u00020eH\u0002J\u0016\u0010f\u001a\u00020e2\u0006\u0010g\u001a\u00020\u00042\u0006\u0010h\u001a\u00020\u0004J\u001c\u0010i\u001a\b\u0012\u0004\u0012\u00020*002\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u001500H\u0002J\u0010\u0010k\u001a\u00020\u00062\u0006\u0010l\u001a\u00020mH\u0002J\b\u0010n\u001a\u00020mH\u0002J \u0010o\u001a\u00020e2\b\u0010p\u001a\u0004\u0018\u0001012\u0006\u0010q\u001a\u00020\u00062\u0006\u0010r\u001a\u00020\u0004J\b\u0010s\u001a\u00020eH\u0002J\u000e\u0010t\u001a\u00020\u00062\u0006\u0010u\u001a\u00020*J\u0006\u0010v\u001a\u00020\u0004J\u0006\u0010w\u001a\u00020\u0004J\b\u0010x\u001a\u00020yH\u0002J\u0006\u0010z\u001a\u00020yJ\u0006\u0010{\u001a\u00020eJ\u0016\u0010|\u001a\u00020e2\u0006\u0010}\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\u0015J\"\u0010~\u001a\u00020e2\u0007\u0010\u007f\u001a\u00030\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u0006J\t\u0010\u0083\u0001\u001a\u00020eH\u0002J\u0015\u0010\u0084\u0001\u001a\u00020*2\f\u0010\u0085\u0001\u001a\u0007\u0012\u0002\b\u00030\u0086\u0001J\'\u0010\u0087\u0001\u001a\u00020e2\u0007\u0010\u0088\u0001\u001a\u00020\u00042\u0007\u0010\u0089\u0001\u001a\u00020\u00042\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u0001H\u0014J\t\u0010\u008c\u0001\u001a\u00020eH\u0016J\u0015\u0010\u008d\u0001\u001a\u00020e2\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u0001H\u0014J\u0010\u0010\u0090\u0001\u001a\u00020e2\u0007\u0010\u0091\u0001\u001a\u00020\u0006J3\u0010\u0092\u0001\u001a\u00020e2\u0007\u0010\u0093\u0001\u001a\u00020\u00062\u0007\u0010\u0094\u0001\u001a\u00020\u00062\u0006\u0010|\u001a\u00020*2\u0007\u0010\u0095\u0001\u001a\u00020*2\u0007\u0010\u0096\u0001\u001a\u00020*J<\u0010\u0097\u0001\u001a\u00020e2\u0007\u0010\u0093\u0001\u001a\u00020\u00062\u0007\u0010\u0094\u0001\u001a\u00020\u00062\u0007\u0010\u0098\u0001\u001a\u00020*2\u0006\u0010|\u001a\u00020*2\u0007\u0010\u0095\u0001\u001a\u00020*2\u0007\u0010\u0096\u0001\u001a\u00020*J\t\u0010\u0099\u0001\u001a\u00020eH\u0002J\t\u0010\u009a\u0001\u001a\u00020eH\u0002J\t\u0010\u009b\u0001\u001a\u00020eH\u0002J\u0010\u0010\u009c\u0001\u001a\u00020*2\u0007\u0010\u009d\u0001\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b\"\u0010#R\u000e\u0010%\u001a\u00020&X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010/\u001a\u0012\u0012\u0004\u0012\u00020100j\b\u0012\u0004\u0012\u000201`2X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u000600j\b\u0012\u0004\u0012\u00020\u0006`2X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u00104\u001a\u0012\u0012\u0004\u0012\u00020100j\b\u0012\u0004\u0012\u000201`2X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u000600j\b\u0012\u0004\u0012\u00020\u0006`2X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u00106\u001a\u0012\u0012\u0004\u0012\u00020100j\b\u0012\u0004\u0012\u000201`2X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u00107\u001a\u0012\u0012\u0004\u0012\u00020\u000600j\b\u0012\u0004\u0012\u00020\u0006`2X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00108\u001a\u000209X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0010\u0010C\u001a\u0004\u0018\u00010DX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010E\u001a\u00020FX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020LX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001b\u0010Q\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bS\u0010\u001f\u001a\u0004\bR\u0010#R\u001a\u0010T\u001a\u00020UX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u000e\u0010Z\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\\\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b^\u0010\u001f\u001a\u0004\b]\u0010#R\u001b\u0010_\u001a\u00020`8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bc\u0010\u001f\u001a\u0004\ba\u0010b\u00a8\u0006\u009e\u0001"}, d2 = {"Lcom/fli/elogistic/driver/ui/activities/LokasiPenjemputanActivity;", "Lcom/fli/elogistic/driver/ui/activities/BaseActivity;", "()V", "CURRENT_ITEM_POSITION", "", "LIST_NAME_DOKUMENTASI", "", "LIST_NAME_PERINTAH_PENGIRIMAN", "LIST_NAME_SURAT_JALAN", "OPERATION_CAPTURE_PHOTO_DOKUMENTASI", "OPERATION_CAPTURE_PHOTO_PERINTAH_PENGIRIMAN", "OPERATION_CAPTURE_PHOTO_SURAT_JALAN", "binding", "Lcom/fli/elogistic/driver/databinding/ActivityLokasiPenjemputanBinding;", "getBinding", "()Lcom/fli/elogistic/driver/databinding/ActivityLokasiPenjemputanBinding;", "setBinding", "(Lcom/fli/elogistic/driver/databinding/ActivityLokasiPenjemputanBinding;)V", "counterForBAST", "counterForPic", "detailPerLocationModel", "Lcom/fli/elogistic/driver/models/shipment/DetailPerLocationModel;", "getDetailPerLocationModel", "()Lcom/fli/elogistic/driver/models/shipment/DetailPerLocationModel;", "setDetailPerLocationModel", "(Lcom/fli/elogistic/driver/models/shipment/DetailPerLocationModel;)V", "detailPerLocationViewModel", "Lcom/fli/elogistic/driver/viewmodel/DetailPerLocationViewModel;", "getDetailPerLocationViewModel", "()Lcom/fli/elogistic/driver/viewmodel/DetailPerLocationViewModel;", "detailPerLocationViewModel$delegate", "Lkotlin/Lazy;", "dokumentasiUpload", "Lcom/fli/elogistic/driver/viewmodel/UploadPODViewModel;", "getDokumentasiUpload", "()Lcom/fli/elogistic/driver/viewmodel/UploadPODViewModel;", "dokumentasiUpload$delegate", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "handler", "Landroid/os/Handler;", "isAllowed", "", "isPenjemputan", "isUploadingDokumentasi", "isUploadingPerintahPengiriman", "isUploadingSuratJalan", "listImageDokumentasi", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "listImageDokumentasiBase64", "listImagePerintahPengiriman", "listImagePerintahPengirimanBase64", "listImageSuratJalan", "listImageSuratJalanBase64", "loadingDialog", "Landroid/app/AlertDialog;", "getLoadingDialog", "()Landroid/app/AlertDialog;", "setLoadingDialog", "(Landroid/app/AlertDialog;)V", "mPath", "getMPath", "()Ljava/lang/String;", "setMPath", "(Ljava/lang/String;)V", "mUri", "Landroid/net/Uri;", "model", "Lcom/fli/elogistic/driver/models/LocationAddressModel;", "getModel", "()Lcom/fli/elogistic/driver/models/LocationAddressModel;", "setModel", "(Lcom/fli/elogistic/driver/models/LocationAddressModel;)V", "orderModel", "Lcom/fli/elogistic/driver/models/shipment/ShipmentModel;", "getOrderModel", "()Lcom/fli/elogistic/driver/models/shipment/ShipmentModel;", "setOrderModel", "(Lcom/fli/elogistic/driver/models/shipment/ShipmentModel;)V", "perintahPengirimanUpload", "getPerintahPengirimanUpload", "perintahPengirimanUpload$delegate", "shipmentDetailPerLocationAdapter", "Lcom/fli/elogistic/driver/adapter/ShipmentDetailPerLocationAdapter;", "getShipmentDetailPerLocationAdapter", "()Lcom/fli/elogistic/driver/adapter/ShipmentDetailPerLocationAdapter;", "setShipmentDetailPerLocationAdapter", "(Lcom/fli/elogistic/driver/adapter/ShipmentDetailPerLocationAdapter;)V", "showPhoto", "sizeShipment", "suratJalanUpload", "getSuratJalanUpload", "suratJalanUpload$delegate", "updateStatusViewModel", "Lcom/fli/elogistic/driver/viewmodel/UpdateStatusViewModel;", "getUpdateStatusViewModel", "()Lcom/fli/elogistic/driver/viewmodel/UpdateStatusViewModel;", "updateStatusViewModel$delegate", "buildLoadingDialog", "", "captureImage", "actionCode", "position", "composeList", "x", "convertImagetoBase64", "compressedImageFile", "Ljava/io/File;", "createImageFile", "deleteImage", "item", "listName", "itemPosition", "getData", "getLocationName", "isOriginal", "getMultidropSize", "getMultipickSize", "getTimeOffset", "", "getTotalSequence", "goesToBasp", "goesToBast", "goToMain", "goesToGoogleMaps", "lat", "", "lon", "label", "initView", "isMyServiceRunning", "serviceClass", "Ljava/lang/Class;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showText", "text", "startPostSquence", "status", "lokasi", "updateRedis", "validate", "updateStatus", "isUploading", "uploadDokumentasi", "uploadPerintahPengiriman", "uploadSuratJalan", "validateDriverPosition", "radiusCalculation", "app_mockDebug"})
public final class LokasiPenjemputanActivity extends com.fli.elogistic.driver.ui.activities.BaseActivity {
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    public com.fli.elogistic.driver.databinding.ActivityLokasiPenjemputanBinding binding;
    public com.fli.elogistic.driver.models.LocationAddressModel model;
    public com.fli.elogistic.driver.models.shipment.DetailPerLocationModel detailPerLocationModel;
    public android.app.AlertDialog loadingDialog;
    public com.fli.elogistic.driver.adapter.ShipmentDetailPerLocationAdapter shipmentDetailPerLocationAdapter;
    private final kotlin.Lazy detailPerLocationViewModel$delegate = null;
    private final kotlin.Lazy suratJalanUpload$delegate = null;
    private final kotlin.Lazy dokumentasiUpload$delegate = null;
    private final kotlin.Lazy perintahPengirimanUpload$delegate = null;
    private final kotlin.Lazy updateStatusViewModel$delegate = null;
    private boolean isUploadingSuratJalan = false;
    private boolean isUploadingDokumentasi = false;
    private boolean isUploadingPerintahPengiriman = false;
    private boolean isAllowed = false;
    private int counterForPic = 0;
    private int counterForBAST = 0;
    private int sizeShipment = 0;
    private boolean isPenjemputan = true;
    private boolean showPhoto = false;
    public com.fli.elogistic.driver.models.shipment.ShipmentModel orderModel;
    public java.lang.String mPath;
    private android.net.Uri mUri;
    private final int OPERATION_CAPTURE_PHOTO_SURAT_JALAN = 1;
    private final int OPERATION_CAPTURE_PHOTO_DOKUMENTASI = 2;
    private final int OPERATION_CAPTURE_PHOTO_PERINTAH_PENGIRIMAN = 3;
    private int CURRENT_ITEM_POSITION = 0;
    private java.util.ArrayList<java.lang.Object> listImageSuratJalan;
    private java.util.ArrayList<java.lang.String> listImageSuratJalanBase64;
    private java.util.ArrayList<java.lang.Object> listImageDokumentasi;
    private java.util.ArrayList<java.lang.String> listImageDokumentasiBase64;
    private java.util.ArrayList<java.lang.Object> listImagePerintahPengiriman;
    private java.util.ArrayList<java.lang.String> listImagePerintahPengirimanBase64;
    private final java.lang.String LIST_NAME_SURAT_JALAN = "Surat Jalan";
    private final java.lang.String LIST_NAME_DOKUMENTASI = "Dokumentasi";
    private final java.lang.String LIST_NAME_PERINTAH_PENGIRIMAN = "Perintah Pengiriman";
    private final android.os.Handler handler = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.databinding.ActivityLokasiPenjemputanBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.databinding.ActivityLokasiPenjemputanBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.models.LocationAddressModel getModel() {
        return null;
    }
    
    public final void setModel(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.LocationAddressModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.models.shipment.DetailPerLocationModel getDetailPerLocationModel() {
        return null;
    }
    
    public final void setDetailPerLocationModel(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.shipment.DetailPerLocationModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.AlertDialog getLoadingDialog() {
        return null;
    }
    
    public final void setLoadingDialog(@org.jetbrains.annotations.NotNull()
    android.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.adapter.ShipmentDetailPerLocationAdapter getShipmentDetailPerLocationAdapter() {
        return null;
    }
    
    public final void setShipmentDetailPerLocationAdapter(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.adapter.ShipmentDetailPerLocationAdapter p0) {
    }
    
    private final com.fli.elogistic.driver.viewmodel.DetailPerLocationViewModel getDetailPerLocationViewModel() {
        return null;
    }
    
    private final com.fli.elogistic.driver.viewmodel.UploadPODViewModel getSuratJalanUpload() {
        return null;
    }
    
    private final com.fli.elogistic.driver.viewmodel.UploadPODViewModel getDokumentasiUpload() {
        return null;
    }
    
    private final com.fli.elogistic.driver.viewmodel.UploadPODViewModel getPerintahPengirimanUpload() {
        return null;
    }
    
    private final com.fli.elogistic.driver.viewmodel.UpdateStatusViewModel getUpdateStatusViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.models.shipment.ShipmentModel getOrderModel() {
        return null;
    }
    
    public final void setOrderModel(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.shipment.ShipmentModel p0) {
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
    
    public final void startPostSquence(@org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String lokasi, boolean goesToBast, boolean updateRedis, boolean validate) {
    }
    
    private final void uploadSuratJalan() {
    }
    
    private final void uploadDokumentasi() {
    }
    
    private final void uploadPerintahPengiriman() {
    }
    
    public final int getMultipickSize() {
        return 0;
    }
    
    public final int getMultidropSize() {
        return 0;
    }
    
    public final long getTotalSequence() {
        return 0L;
    }
    
    public final void goesToBast(boolean goToMain, @org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.shipment.DetailPerLocationModel detailPerLocationModel) {
    }
    
    public final void goesToBasp() {
    }
    
    private final void initView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocationName(boolean isOriginal) {
        return null;
    }
    
    public final void updateStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String lokasi, boolean isUploading, boolean goesToBast, boolean updateRedis, boolean validate) {
    }
    
    private final void buildLoadingDialog() {
    }
    
    private final void getData() {
    }
    
    private final java.util.ArrayList<java.lang.Boolean> composeList(java.util.ArrayList<com.fli.elogistic.driver.models.shipment.DetailPerLocationModel> x) {
        return null;
    }
    
    public final void showText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    private final java.io.File createImageFile() {
        return null;
    }
    
    public final void captureImage(int actionCode, int position) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void deleteImage(@org.jetbrains.annotations.Nullable()
    java.lang.Object item, @org.jetbrains.annotations.NotNull()
    java.lang.String listName, int itemPosition) {
    }
    
    private final java.lang.String convertImagetoBase64(java.io.File compressedImageFile) {
        return null;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final long getTimeOffset() {
        return 0L;
    }
    
    public final void goesToGoogleMaps(double lat, double lon, @org.jetbrains.annotations.NotNull()
    java.lang.String label) {
    }
    
    public final boolean isMyServiceRunning(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> serviceClass) {
        return false;
    }
    
    public final boolean validateDriverPosition(int radiusCalculation) {
        return false;
    }
    
    public LokasiPenjemputanActivity() {
        super();
    }
}