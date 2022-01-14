package com.fli.elogistic.driver.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020*H\u0016J\u0012\u0010.\u001a\u00020*2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\u0012\u00101\u001a\u00020*2\b\u00102\u001a\u0004\u0018\u000103H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010(\u001a\u0004\b%\u0010&\u00a8\u00064"}, d2 = {"Lcom/fli/elogistic/driver/ui/activities/PernyataanSerahTerimaActivity;", "Lcom/fli/elogistic/driver/ui/activities/BaseActivity;", "()V", "binding", "Lcom/fli/elogistic/driver/databinding/ActivityPernyataanSerahTerimaBinding;", "getBinding", "()Lcom/fli/elogistic/driver/databinding/ActivityPernyataanSerahTerimaBinding;", "setBinding", "(Lcom/fli/elogistic/driver/databinding/ActivityPernyataanSerahTerimaBinding;)V", "detailPerLocationModel", "Lcom/fli/elogistic/driver/models/shipment/DetailPerLocationModel;", "getDetailPerLocationModel", "()Lcom/fli/elogistic/driver/models/shipment/DetailPerLocationModel;", "setDetailPerLocationModel", "(Lcom/fli/elogistic/driver/models/shipment/DetailPerLocationModel;)V", "goTomain", "", "loadingDialog", "Landroid/app/AlertDialog;", "getLoadingDialog", "()Landroid/app/AlertDialog;", "setLoadingDialog", "(Landroid/app/AlertDialog;)V", "model", "Lcom/fli/elogistic/driver/models/LocationAddressModel;", "getModel", "()Lcom/fli/elogistic/driver/models/LocationAddressModel;", "setModel", "(Lcom/fli/elogistic/driver/models/LocationAddressModel;)V", "orderModel", "Lcom/fli/elogistic/driver/models/shipment/ShipmentModel;", "getOrderModel", "()Lcom/fli/elogistic/driver/models/shipment/ShipmentModel;", "setOrderModel", "(Lcom/fli/elogistic/driver/models/shipment/ShipmentModel;)V", "uploadSignatureBastViewModel", "Lcom/fli/elogistic/driver/viewmodel/UploadSignatureBastViewModel;", "getUploadSignatureBastViewModel", "()Lcom/fli/elogistic/driver/viewmodel/UploadSignatureBastViewModel;", "uploadSignatureBastViewModel$delegate", "Lkotlin/Lazy;", "buildLoadingDialog", "", "getTimeOffset", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "uploadSignature", "signatureBitmap", "Landroid/graphics/Bitmap;", "app_stagingDebug"})
public final class PernyataanSerahTerimaActivity extends com.fli.elogistic.driver.ui.activities.BaseActivity {
    public com.fli.elogistic.driver.databinding.ActivityPernyataanSerahTerimaBinding binding;
    public com.fli.elogistic.driver.models.shipment.DetailPerLocationModel detailPerLocationModel;
    public com.fli.elogistic.driver.models.shipment.ShipmentModel orderModel;
    public com.fli.elogistic.driver.models.LocationAddressModel model;
    private boolean goTomain = false;
    private final kotlin.Lazy uploadSignatureBastViewModel$delegate = null;
    public android.app.AlertDialog loadingDialog;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.databinding.ActivityPernyataanSerahTerimaBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.databinding.ActivityPernyataanSerahTerimaBinding p0) {
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
    
    private final com.fli.elogistic.driver.viewmodel.UploadSignatureBastViewModel getUploadSignatureBastViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.AlertDialog getLoadingDialog() {
        return null;
    }
    
    public final void setLoadingDialog(@org.jetbrains.annotations.NotNull()
    android.app.AlertDialog p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void uploadSignature(android.graphics.Bitmap signatureBitmap) {
    }
    
    private final long getTimeOffset() {
        return 0L;
    }
    
    private final void buildLoadingDialog() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public PernyataanSerahTerimaActivity() {
        super();
    }
}