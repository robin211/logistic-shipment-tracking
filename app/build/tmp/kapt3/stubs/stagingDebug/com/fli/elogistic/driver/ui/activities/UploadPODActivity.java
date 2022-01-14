package com.fli.elogistic.driver.ui.activities;

import java.lang.System;

@kotlin.Suppress(names = {"BlockingMethodInNonBlockingContext"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u000200H\u0002J\u0010\u00102\u001a\u00020-2\u0006\u00103\u001a\u000204H\u0002J\u0010\u00105\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012H\u0002J\u0015\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001207H\u0002\u00a2\u0006\u0002\u00108J\u0010\u00109\u001a\u00020-2\u0006\u00103\u001a\u000204H\u0002J\"\u0010:\u001a\u00020-2\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00042\b\u0010=\u001a\u0004\u0018\u00010>H\u0014J\b\u0010?\u001a\u00020-H\u0016J\u0012\u0010@\u001a\u00020-2\b\u0010A\u001a\u0004\u0018\u00010BH\u0014J\b\u0010C\u001a\u00020-H\u0002J\b\u0010D\u001a\u00020-H\u0002J\u0018\u0010E\u001a\u00020-2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0014j\b\u0012\u0004\u0012\u00020\u0012`\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\'\u001a\u00020(8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b)\u0010*\u00a8\u0006G"}, d2 = {"Lcom/fli/elogistic/driver/ui/activities/UploadPODActivity;", "Lcom/fli/elogistic/driver/ui/activities/BaseActivity;", "()V", "OPERATION_CAPTURE_PHOTO", "", "additionalShippingCostViewModel", "Lcom/fli/elogistic/driver/viewmodel/AdditionalShippingCostViewModel;", "getAdditionalShippingCostViewModel", "()Lcom/fli/elogistic/driver/viewmodel/AdditionalShippingCostViewModel;", "additionalShippingCostViewModel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/fli/elogistic/driver/databinding/ActivityUploadPODBinding;", "getBinding", "()Lcom/fli/elogistic/driver/databinding/ActivityUploadPODBinding;", "setBinding", "(Lcom/fli/elogistic/driver/databinding/ActivityUploadPODBinding;)V", "jenisBiaya", "", "listImage", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "listImageFileBase64", "loadingDialog", "Landroid/app/AlertDialog;", "getLoadingDialog", "()Landroid/app/AlertDialog;", "setLoadingDialog", "(Landroid/app/AlertDialog;)V", "mPath", "getMPath", "()Ljava/lang/String;", "setMPath", "(Ljava/lang/String;)V", "mUri", "Landroid/net/Uri;", "maxImage", "tipeDokumen", "uploadPODViewModel", "Lcom/fli/elogistic/driver/viewmodel/UploadPODViewModel;", "getUploadPODViewModel", "()Lcom/fli/elogistic/driver/viewmodel/UploadPODViewModel;", "uploadPODViewModel$delegate", "buildLoadingDialog", "", "convertImagetoBase64", "compressedImageFile", "Ljava/io/File;", "createImageFile", "determineLayout", "isUploadPOD", "", "getDocType", "getJenisBiaya", "", "()[Ljava/lang/String;", "initSpinner", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "submitAdditionalCost", "takePicture", "uploadDocumentPOD", "namaDokumen", "app_stagingDebug"})
public final class UploadPODActivity extends com.fli.elogistic.driver.ui.activities.BaseActivity {
    public com.fli.elogistic.driver.databinding.ActivityUploadPODBinding binding;
    public android.app.AlertDialog loadingDialog;
    public java.lang.String mPath;
    private java.lang.String tipeDokumen = "";
    private java.lang.String jenisBiaya = "";
    private final kotlin.Lazy uploadPODViewModel$delegate = null;
    private final kotlin.Lazy additionalShippingCostViewModel$delegate = null;
    private int maxImage = 1;
    private java.util.ArrayList<java.lang.Object> listImage;
    private java.util.ArrayList<java.lang.String> listImageFileBase64;
    private android.net.Uri mUri;
    private final int OPERATION_CAPTURE_PHOTO = 1;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.databinding.ActivityUploadPODBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.databinding.ActivityUploadPODBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.AlertDialog getLoadingDialog() {
        return null;
    }
    
    public final void setLoadingDialog(@org.jetbrains.annotations.NotNull()
    android.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMPath() {
        return null;
    }
    
    public final void setMPath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final com.fli.elogistic.driver.viewmodel.UploadPODViewModel getUploadPODViewModel() {
        return null;
    }
    
    private final com.fli.elogistic.driver.viewmodel.AdditionalShippingCostViewModel getAdditionalShippingCostViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void buildLoadingDialog() {
    }
    
    private final void uploadDocumentPOD(java.lang.String tipeDokumen, java.lang.String namaDokumen) {
    }
    
    private final void determineLayout(boolean isUploadPOD) {
    }
    
    private final void submitAdditionalCost() {
    }
    
    private final java.lang.String getDocType(java.lang.String tipeDokumen) {
        return null;
    }
    
    private final java.io.File createImageFile() {
        return null;
    }
    
    private final void takePicture() {
    }
    
    private final void initSpinner(boolean isUploadPOD) {
    }
    
    private final java.lang.String[] getJenisBiaya() {
        return null;
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final java.lang.String convertImagetoBase64(java.io.File compressedImageFile) {
        return null;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public UploadPODActivity() {
        super();
    }
}