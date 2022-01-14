package com.fli.elogistic.driver.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0016J\u001a\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010&\u001a\u00020\u0017H\u0002J\u0010\u0010\'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020#H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/fli/elogistic/driver/ui/fragments/LoginFragment;", "Lcom/fli/elogistic/driver/ui/fragments/BaseFragment;", "()V", "authViewModel", "Lcom/fli/elogistic/driver/viewmodel/IdentityViewModel;", "getAuthViewModel", "()Lcom/fli/elogistic/driver/viewmodel/IdentityViewModel;", "authViewModel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/fli/elogistic/driver/databinding/FragmentLoginBinding;", "getBinding", "()Lcom/fli/elogistic/driver/databinding/FragmentLoginBinding;", "setBinding", "(Lcom/fli/elogistic/driver/databinding/FragmentLoginBinding;)V", "firebaseManualViewModel", "Lcom/fli/elogistic/driver/viewmodel/FirebaseManualViewModel;", "getFirebaseManualViewModel", "()Lcom/fli/elogistic/driver/viewmodel/FirebaseManualViewModel;", "firebaseManualViewModel$delegate", "showPassword", "", "checkETFilled", "", "checkSavedEmail", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onUnauthorized", "message", "", "onViewCreated", "view", "performLogin", "subscribeToTopic", "s", "app_mockDebug"})
public final class LoginFragment extends com.fli.elogistic.driver.ui.fragments.BaseFragment {
    private final kotlin.Lazy authViewModel$delegate = null;
    private final kotlin.Lazy firebaseManualViewModel$delegate = null;
    public com.fli.elogistic.driver.databinding.FragmentLoginBinding binding;
    private boolean showPassword = false;
    
    private final com.fli.elogistic.driver.viewmodel.IdentityViewModel getAuthViewModel() {
        return null;
    }
    
    private final com.fli.elogistic.driver.viewmodel.FirebaseManualViewModel getFirebaseManualViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.databinding.FragmentLoginBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.databinding.FragmentLoginBinding p0) {
    }
    
    @java.lang.Override()
    public boolean onUnauthorized(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        return false;
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
    
    private final void subscribeToTopic(java.lang.String s) {
    }
    
    private final void checkSavedEmail() {
    }
    
    private final void performLogin() {
    }
    
    private final void checkETFilled() {
    }
    
    public LoginFragment() {
        super();
    }
}