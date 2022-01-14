package com.fli.elogistic.driver.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\nH\'J.\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00040\u00032\b\b\u0003\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\t\u001a\u00020\nH\'J \u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00050\u00040\u0003H\'J$\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\u00040\u00032\b\b\u0001\u0010\u0014\u001a\u00020\nH\'J8\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u00040\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00182\b\b\u0003\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\t\u001a\u00020\nH\'J8\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u001a\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\nH\'J.\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00050\u00040\u00032\b\b\u0003\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\t\u001a\u00020\nH\'J8\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00040\u00032\b\b\u0001\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010\u0017\u001a\u00020 2\b\b\u0003\u0010\u000e\u001a\u00020\nH\'\u00a8\u0006!"}, d2 = {"Lcom/fli/elogistic/driver/services/IdentityService;", "", "activateUser", "Landroidx/lifecycle/LiveData;", "Lcom/fli/elogistic/driver/models/Resource;", "Lcom/fli/elogistic/driver/models/ResponseWrapper;", "Lcom/fli/elogistic/driver/models/identity/AuthenticationResult;", "auth", "Lcom/fli/elogistic/driver/models/identity/AuthenticationRequest;", "deviceId", "", "firebaseToken", "getCurrentUser", "Lcom/fli/elogistic/driver/models/identity/UserInfo;", "token", "getFakeGpsPackage", "", "Lcom/fli/elogistic/driver/models/identity/FakeGpsPackageModel;", "getVerifyEmail", "Lcom/fli/elogistic/driver/models/identity/VerificationResult;", "email", "postChangePassword", "Lcom/google/gson/JsonPrimitive;", "request", "Lcom/fli/elogistic/driver/models/identity/ChangePasswordRequest;", "postLogin", "login", "postLogout", "Lcom/google/gson/JsonNull;", "putEditUser", "userId", "", "Lcom/fli/elogistic/driver/models/identity/EditUserRequest;", "app_mockDebug"})
public abstract interface IdentityService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "api/v3/auth/driver/login")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.identity.AuthenticationResult>>> postLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fli.elogistic.driver.models.identity.AuthenticationRequest login, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "firebase-token")
    java.lang.String firebaseToken);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v3/auth/driver/verify")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.identity.VerificationResult>>> getVerifyEmail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "email")
    java.lang.String email);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "api/v3/auth/driver/activation")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.identity.AuthenticationResult>>> activateUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fli.elogistic.driver.models.identity.AuthenticationRequest auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "firebase-token")
    java.lang.String firebaseToken);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v3/auth/driver/gps-package")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<java.util.List<com.fli.elogistic.driver.models.identity.FakeGpsPackageModel>>>> getFakeGpsPackage();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v3/auth/driver/whoami")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.identity.UserInfo>>> getCurrentUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "api/v3/auth/driver/logout")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonNull>>> postLogout(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "api/v3/auth/driver/users/{id}")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.identity.UserInfo>>> putEditUser(@retrofit2.http.Path(value = "id")
    long userId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fli.elogistic.driver.models.identity.EditUserRequest request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PATCH(value = "api/v3/auth/driver/change-password")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> postChangePassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fli.elogistic.driver.models.identity.ChangePasswordRequest request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}