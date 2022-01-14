package com.fli.elogistic.driver.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\"\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0012\u0010\'\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010)H\u0015J\b\u0010*\u001a\u00020 H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006+"}, d2 = {"Lcom/fli/elogistic/driver/ui/activities/DokumenPODActivity;", "Lcom/fli/elogistic/driver/ui/activities/BaseActivity;", "()V", "binding", "Lcom/fli/elogistic/driver/databinding/ActivityDokumenPODBinding;", "getBinding", "()Lcom/fli/elogistic/driver/databinding/ActivityDokumenPODBinding;", "setBinding", "(Lcom/fli/elogistic/driver/databinding/ActivityDokumenPODBinding;)V", "listItem", "Ljava/util/ArrayList;", "Lcom/fli/elogistic/driver/models/POD/PodDocumentModel;", "Lkotlin/collections/ArrayList;", "loadingDialog", "Landroid/app/AlertDialog;", "getLoadingDialog", "()Landroid/app/AlertDialog;", "setLoadingDialog", "(Landroid/app/AlertDialog;)V", "model", "Lcom/fli/elogistic/driver/models/POD/PodSimpleModel;", "getModel", "()Lcom/fli/elogistic/driver/models/POD/PodSimpleModel;", "setModel", "(Lcom/fli/elogistic/driver/models/POD/PodSimpleModel;)V", "submitPODViewModel", "Lcom/fli/elogistic/driver/viewmodel/SubmitPODViewModel;", "getSubmitPODViewModel", "()Lcom/fli/elogistic/driver/viewmodel/SubmitPODViewModel;", "submitPODViewModel$delegate", "Lkotlin/Lazy;", "buildLoadingDialog", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "submitPOD", "app_mockDebug"})
public final class DokumenPODActivity extends com.fli.elogistic.driver.ui.activities.BaseActivity {
    public com.fli.elogistic.driver.databinding.ActivityDokumenPODBinding binding;
    public com.fli.elogistic.driver.models.POD.PodSimpleModel model;
    private java.util.ArrayList<com.fli.elogistic.driver.models.POD.PodDocumentModel> listItem;
    public android.app.AlertDialog loadingDialog;
    private final kotlin.Lazy submitPODViewModel$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.databinding.ActivityDokumenPODBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.databinding.ActivityDokumenPODBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.models.POD.PodSimpleModel getModel() {
        return null;
    }
    
    public final void setModel(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.POD.PodSimpleModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.AlertDialog getLoadingDialog() {
        return null;
    }
    
    public final void setLoadingDialog(@org.jetbrains.annotations.NotNull()
    android.app.AlertDialog p0) {
    }
    
    private final com.fli.elogistic.driver.viewmodel.SubmitPODViewModel getSubmitPODViewModel() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"InflateParams"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void submitPOD() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void buildLoadingDialog() {
    }
    
    public DokumenPODActivity() {
        super();
    }
}