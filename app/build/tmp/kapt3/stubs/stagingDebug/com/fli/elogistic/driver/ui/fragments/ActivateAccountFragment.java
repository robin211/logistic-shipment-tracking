package com.fli.elogistic.driver.ui.fragments;

import java.lang.System;

@kotlin.Suppress(names = {"RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS"})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010%\u001a\u00020\u0012H\u0002J\b\u0010&\u001a\u00020\u0012H\u0002J\b\u0010\'\u001a\u00020\u0012H\u0003R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/fli/elogistic/driver/ui/fragments/ActivateAccountFragment;", "Lcom/fli/elogistic/driver/ui/fragments/BaseFragment;", "()V", "authViewModel", "Lcom/fli/elogistic/driver/viewmodel/IdentityViewModel;", "getAuthViewModel", "()Lcom/fli/elogistic/driver/viewmodel/IdentityViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/fli/elogistic/driver/databinding/FragmentActivateAccountBinding;", "getBinding", "()Lcom/fli/elogistic/driver/databinding/FragmentActivateAccountBinding;", "setBinding", "(Lcom/fli/elogistic/driver/databinding/FragmentActivateAccountBinding;)V", "verifiedByCaptcha", "", "addLink", "", "textView", "Landroid/widget/TextView;", "patternToMatch", "", "link", "initChangePasswordView", "initListener", "initObserver", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "performChangePassword", "performVerify", "verifyRecaptcha", "app_stagingDebug"})
public final class ActivateAccountFragment extends com.fli.elogistic.driver.ui.fragments.BaseFragment {
    private final kotlin.Lazy authViewModel$delegate = null;
    public com.fli.elogistic.driver.databinding.FragmentActivateAccountBinding binding;
    private boolean verifiedByCaptcha = false;
    
    private final com.fli.elogistic.driver.viewmodel.IdentityViewModel getAuthViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.databinding.FragmentActivateAccountBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.databinding.FragmentActivateAccountBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initObserver() {
    }
    
    private final void initChangePasswordView() {
    }
    
    private final void initListener() {
    }
    
    private final void performChangePassword() {
    }
    
    private final void performVerify() {
    }
    
    public final void addLink(@org.jetbrains.annotations.Nullable()
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
    java.lang.String patternToMatch, @org.jetbrains.annotations.Nullable()
    java.lang.String link) {
    }
    
    @android.annotation.SuppressLint(value = {"LogNotTimber"})
    private final void verifyRecaptcha() {
    }
    
    public ActivateAccountFragment() {
        super();
    }
}