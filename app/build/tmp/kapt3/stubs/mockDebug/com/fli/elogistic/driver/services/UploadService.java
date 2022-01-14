package com.fli.elogistic.driver.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JB\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\rH\'JR\u0010\u000e\u001a$\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00110\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00122\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\rH\'JB\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\rH\'JB\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00172\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\rH\'JB\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00192\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\rH\'\u00a8\u0006\u001a"}, d2 = {"Lcom/fli/elogistic/driver/services/UploadService;", "", "postBast", "Landroidx/lifecycle/LiveData;", "Lcom/fli/elogistic/driver/models/Resource;", "Lcom/fli/elogistic/driver/models/ResponseWrapper;", "Lcom/google/gson/JsonPrimitive;", "upload", "Lcom/fli/elogistic/driver/models/uploadDocument/UploadBASTRequest;", "token", "", "deviceId", "id", "", "postDocumentPOD", "Ljava/util/ArrayList;", "Lcom/fli/elogistic/driver/models/uploadDocument/UploadDocumentResult;", "Lkotlin/collections/ArrayList;", "Lcom/fli/elogistic/driver/models/uploadDocument/UploadDocumentPODRequest;", "submitAccident", "submit", "Lcom/fli/elogistic/driver/models/uploadDocument/UploadAccidentRequest;", "submitBasp", "Lcom/fli/elogistic/driver/models/uploadDocument/UploadBASPRequest;", "submitDocumentPOD", "Lcom/fli/elogistic/driver/models/uploadDocument/SubmitDocumentPODRequest;", "app_mockDebug"})
public abstract interface UploadService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "api/v3/driver/shipment/{id}/document-pod/upload")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<java.util.ArrayList<com.fli.elogistic.driver.models.uploadDocument.UploadDocumentResult>>>> postDocumentPOD(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fli.elogistic.driver.models.uploadDocument.UploadDocumentPODRequest upload, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId, @retrofit2.http.Path(value = "id")
    long id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "api/v3/driver/shipment/{id}/document-pod/submit")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> submitDocumentPOD(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fli.elogistic.driver.models.uploadDocument.SubmitDocumentPODRequest submit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId, @retrofit2.http.Path(value = "id")
    long id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PATCH(value = "api/v3/driver/shipment/{id}/status/bast")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> postBast(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fli.elogistic.driver.models.uploadDocument.UploadBASTRequest upload, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId, @retrofit2.http.Path(value = "id")
    long id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "api/v3/driver/shipment/{id}/basp")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> submitBasp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fli.elogistic.driver.models.uploadDocument.UploadBASPRequest submit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId, @retrofit2.http.Path(value = "id")
    long id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "api/v3/driver/shipment/{id}/accident")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> submitAccident(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fli.elogistic.driver.models.uploadDocument.UploadAccidentRequest submit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId, @retrofit2.http.Path(value = "id")
    long id);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}