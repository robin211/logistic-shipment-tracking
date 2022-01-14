package com.fli.elogistic.driver.ui.activities;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\"\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020\u001eH\u0016J\u0012\u0010\'\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006*"}, d2 = {"Lcom/fli/elogistic/driver/ui/activities/BiayaTambahanActivity;", "Lcom/fli/elogistic/driver/ui/activities/BaseActivity;", "()V", "additionalShippingCostViewModel", "Lcom/fli/elogistic/driver/viewmodel/AdditionalShippingCostViewModel;", "getAdditionalShippingCostViewModel", "()Lcom/fli/elogistic/driver/viewmodel/AdditionalShippingCostViewModel;", "additionalShippingCostViewModel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/fli/elogistic/driver/databinding/ActivityBiayaTambahanBinding;", "getBinding", "()Lcom/fli/elogistic/driver/databinding/ActivityBiayaTambahanBinding;", "setBinding", "(Lcom/fli/elogistic/driver/databinding/ActivityBiayaTambahanBinding;)V", "listItem", "Ljava/util/ArrayList;", "Lcom/fli/elogistic/driver/models/biayaDanTambahanOngkir/BiayaOngkirModel;", "Lkotlin/collections/ArrayList;", "getListItem", "()Ljava/util/ArrayList;", "setListItem", "(Ljava/util/ArrayList;)V", "loadingDialog", "Landroid/app/AlertDialog;", "getLoadingDialog", "()Landroid/app/AlertDialog;", "setLoadingDialog", "(Landroid/app/AlertDialog;)V", "buildLoadingDialog", "", "initData", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_mockDebug"})
public final class BiayaTambahanActivity extends com.fli.elogistic.driver.ui.activities.BaseActivity {
    public android.app.AlertDialog loadingDialog;
    public com.fli.elogistic.driver.databinding.ActivityBiayaTambahanBinding binding;
    private final kotlin.Lazy additionalShippingCostViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.fli.elogistic.driver.models.biayaDanTambahanOngkir.BiayaOngkirModel> listItem;
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.AlertDialog getLoadingDialog() {
        return null;
    }
    
    public final void setLoadingDialog(@org.jetbrains.annotations.NotNull()
    android.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.databinding.ActivityBiayaTambahanBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.databinding.ActivityBiayaTambahanBinding p0) {
    }
    
    private final com.fli.elogistic.driver.viewmodel.AdditionalShippingCostViewModel getAdditionalShippingCostViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fli.elogistic.driver.models.biayaDanTambahanOngkir.BiayaOngkirModel> getListItem() {
        return null;
    }
    
    public final void setListItem(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fli.elogistic.driver.models.biayaDanTambahanOngkir.BiayaOngkirModel> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void buildLoadingDialog() {
    }
    
    private final void initData() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public BiayaTambahanActivity() {
        super();
    }
}