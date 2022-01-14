package com.fli.elogistic.driver.ui.fragments;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bJ&\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00192\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bJ$\u0010 \u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bJ\u0010\u0010!\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\"\u001a\u00020#JD\u0010$\u001a\u00020\u00172\u0010\u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\'0&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170\u001b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00170\u001b2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bJ\b\u0010+\u001a\u00020\u0017H\u0016J\u001a\u0010,\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006/"}, d2 = {"Lcom/fli/elogistic/driver/ui/fragments/BaseFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/fli/elogistic/driver/ui/BaseInterface;", "()V", "appExecutors", "Lcom/fli/elogistic/driver/AppExecutors;", "getAppExecutors", "()Lcom/fli/elogistic/driver/AppExecutors;", "setAppExecutors", "(Lcom/fli/elogistic/driver/AppExecutors;)V", "loadingDialog", "Landroid/app/AlertDialog;", "getLoadingDialog", "()Landroid/app/AlertDialog;", "setLoadingDialog", "(Landroid/app/AlertDialog;)V", "sp", "Landroid/content/SharedPreferences;", "getSp", "()Landroid/content/SharedPreferences;", "setSp", "(Landroid/content/SharedPreferences;)V", "createAlert", "", "message", "", "onOkClick", "Lkotlin/Function0;", "createOkSnackbar", "view", "Landroid/view/View;", "onClick", "createRetrySnackbar", "forceLogout", "getParentActivity", "Landroidx/appcompat/app/AppCompatActivity;", "handleResponse", "resource", "Lcom/fli/elogistic/driver/models/Resource;", "Lcom/fli/elogistic/driver/models/ResponseWrapper;", "onSuccess", "onError", "onLoading", "onDestroy", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "app_stagingDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public class BaseFragment extends androidx.fragment.app.Fragment implements com.fli.elogistic.driver.ui.BaseInterface {
    @javax.inject.Inject()
    public android.content.SharedPreferences sp;
    @javax.inject.Inject()
    public com.fli.elogistic.driver.AppExecutors appExecutors;
    public android.app.AlertDialog loadingDialog;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSp() {
        return null;
    }
    
    public final void setSp(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.AppExecutors getAppExecutors() {
        return null;
    }
    
    public final void setAppExecutors(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.AppExecutors p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.AlertDialog getLoadingDialog() {
        return null;
    }
    
    public final void setLoadingDialog(@org.jetbrains.annotations.NotNull()
    android.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.app.AppCompatActivity getParentActivity() {
        return null;
    }
    
    public final void handleResponse(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.Resource<? extends com.fli.elogistic.driver.models.ResponseWrapper<?>> resource, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onError, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoading) {
    }
    
    public final void forceLogout(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void createAlert(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onOkClick) {
    }
    
    public final void createOkSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    public final void createRetrySnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public BaseFragment() {
        super();
    }
    
    public void createOkSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    public void createRetrySnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    public boolean onUnauthorized(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        return false;
    }
}