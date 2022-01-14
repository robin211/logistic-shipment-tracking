package com.fli.elogistic.driver.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\f2\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\f2\u0006\u0010\u0013\u001a\u00020\u0014J0\u0010\u0015\u001a$\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00180\u000e0\r0\f2\u0006\u0010\u0019\u001a\u00020\u001aJ \u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\f2\u0006\u0010\u001c\u001a\u00020\u001dJ \u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\f2\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/fli/elogistic/driver/repo/UploadDocumentImageRepo;", "", "appExecutors", "Lcom/fli/elogistic/driver/AppExecutors;", "uploadService", "Lcom/fli/elogistic/driver/services/UploadService;", "(Lcom/fli/elogistic/driver/AppExecutors;Lcom/fli/elogistic/driver/services/UploadService;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "postAccident", "Landroidx/lifecycle/LiveData;", "Lcom/fli/elogistic/driver/models/Resource;", "Lcom/fli/elogistic/driver/models/ResponseWrapper;", "Lcom/google/gson/JsonPrimitive;", "uploadAccidentRequest", "Lcom/fli/elogistic/driver/models/uploadDocument/UploadAccidentRequest;", "postBasp", "uploadBASPRequest", "Lcom/fli/elogistic/driver/models/uploadDocument/UploadBASPRequest;", "postDocumentPOD", "Ljava/util/ArrayList;", "Lcom/fli/elogistic/driver/models/uploadDocument/UploadDocumentResult;", "Lkotlin/collections/ArrayList;", "uploadRequest", "Lcom/fli/elogistic/driver/models/uploadDocument/UploadDocumentPODRequest;", "postSignatureBast", "uploadBASTRequest", "Lcom/fli/elogistic/driver/models/uploadDocument/UploadBASTRequest;", "submitDocumentPOD", "submitDocumentPODRequest", "Lcom/fli/elogistic/driver/models/uploadDocument/SubmitDocumentPODRequest;", "app_stagingDebug"})
public final class UploadDocumentImageRepo {
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    private final com.fli.elogistic.driver.AppExecutors appExecutors = null;
    private final com.fli.elogistic.driver.services.UploadService uploadService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Handler getHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<java.util.ArrayList<com.fli.elogistic.driver.models.uploadDocument.UploadDocumentResult>>>> postDocumentPOD(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.uploadDocument.UploadDocumentPODRequest uploadRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> submitDocumentPOD(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.uploadDocument.SubmitDocumentPODRequest submitDocumentPODRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> postSignatureBast(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.uploadDocument.UploadBASTRequest uploadBASTRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> postBasp(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.uploadDocument.UploadBASPRequest uploadBASPRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> postAccident(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.uploadDocument.UploadAccidentRequest uploadAccidentRequest) {
        return null;
    }
    
    @javax.inject.Inject()
    public UploadDocumentImageRepo(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.AppExecutors appExecutors, @org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.services.UploadService uploadService) {
        super();
    }
}