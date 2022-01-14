package com.fli.elogistic.driver.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\"\u001a\u00020#J\u0018\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u0018\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u00070\u0006J\u0018\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\b0\u00070\u0006J\u0018\u0010\'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u00070\u0006J\u0018\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u0018\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\b0\u00070\u0006J\u0006\u0010*\u001a\u00020#J\u0010\u0010+\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010\fJ\u0010\u0010-\u001a\u00020#2\b\u0010,\u001a\u0004\u0018\u00010\u0011J\u0016\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020!J\u000e\u00101\u001a\u00020#2\u0006\u0010/\u001a\u00020!R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0004R \u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/fli/elogistic/driver/viewmodel/IdentityViewModel;", "Landroidx/lifecycle/ViewModel;", "identityRepo", "Lcom/fli/elogistic/driver/repo/IdentityRepo;", "(Lcom/fli/elogistic/driver/repo/IdentityRepo;)V", "activateUserResult", "Landroidx/lifecycle/LiveData;", "Lcom/fli/elogistic/driver/models/Resource;", "Lcom/fli/elogistic/driver/models/ResponseWrapper;", "Lcom/fli/elogistic/driver/models/identity/AuthenticationResult;", "activationTrigger", "Landroidx/lifecycle/MutableLiveData;", "Lcom/fli/elogistic/driver/models/identity/AuthenticationRequest;", "authenticationRequest", "changePasswordResult", "Lcom/google/gson/JsonPrimitive;", "changePasswordTrigger", "Lcom/fli/elogistic/driver/models/identity/ChangePasswordRequest;", "currentUser", "Lcom/fli/elogistic/driver/models/identity/UserInfo;", "emailVerified", "Lcom/fli/elogistic/driver/models/identity/VerificationResult;", "getCurrentUserTrigger", "", "getIdentityRepo", "()Lcom/fli/elogistic/driver/repo/IdentityRepo;", "setIdentityRepo", "loginResult", "loginTrigger", "logoutResult", "Lcom/google/gson/JsonNull;", "postLogoutTrigger", "verifyEmailTrigger", "", "doLogout", "", "getActivateUserResult", "getChangePasswordResult", "getCurrentUser", "getEmailVerified", "getLoginResult", "getLogoutResult", "refreshCurrentUser", "setActivation", "activation", "setChangePassword", "setLogin", "email", "password", "setVerifyEmail", "app_stagingDebug"})
public final class IdentityViewModel extends androidx.lifecycle.ViewModel {
    private final com.fli.elogistic.driver.models.identity.AuthenticationRequest authenticationRequest = null;
    private final androidx.lifecycle.MutableLiveData<com.fli.elogistic.driver.models.identity.AuthenticationRequest> loginTrigger = null;
    private final androidx.lifecycle.MutableLiveData<com.fli.elogistic.driver.models.identity.AuthenticationRequest> activationTrigger = null;
    private final androidx.lifecycle.MutableLiveData<com.fli.elogistic.driver.models.identity.ChangePasswordRequest> changePasswordTrigger = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> verifyEmailTrigger = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getCurrentUserTrigger = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> postLogoutTrigger = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.identity.AuthenticationResult>>> loginResult = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.identity.AuthenticationResult>>> activateUserResult = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> changePasswordResult = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.identity.VerificationResult>>> emailVerified = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.identity.UserInfo>>> currentUser = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonNull>>> logoutResult = null;
    @org.jetbrains.annotations.NotNull()
    private com.fli.elogistic.driver.repo.IdentityRepo identityRepo;
    
    public final void setLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void setActivation(@org.jetbrains.annotations.Nullable()
    com.fli.elogistic.driver.models.identity.AuthenticationRequest activation) {
    }
    
    public final void setChangePassword(@org.jetbrains.annotations.Nullable()
    com.fli.elogistic.driver.models.identity.ChangePasswordRequest activation) {
    }
    
    public final void setVerifyEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    public final void refreshCurrentUser() {
    }
    
    public final void doLogout() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.identity.AuthenticationResult>>> getLoginResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.identity.AuthenticationResult>>> getActivateUserResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> getChangePasswordResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.identity.UserInfo>>> getCurrentUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.identity.VerificationResult>>> getEmailVerified() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonNull>>> getLogoutResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.repo.IdentityRepo getIdentityRepo() {
        return null;
    }
    
    public final void setIdentityRepo(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.repo.IdentityRepo p0) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public IdentityViewModel(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.repo.IdentityRepo identityRepo) {
        super();
    }
}