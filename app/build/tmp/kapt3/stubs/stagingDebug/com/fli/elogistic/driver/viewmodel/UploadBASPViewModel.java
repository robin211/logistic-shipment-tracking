package com.fli.elogistic.driver.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u0086\u0001\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00180 j\b\u0012\u0004\u0012\u00020\u0018`!2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00180 j\b\u0012\u0004\u0012\u00020\u0018`!2\u0006\u0010#\u001a\u00020\u0014R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004\u00a8\u0006$"}, d2 = {"Lcom/fli/elogistic/driver/viewmodel/UploadBASPViewModel;", "Landroidx/lifecycle/ViewModel;", "uploadDocumentImageRepo", "Lcom/fli/elogistic/driver/repo/UploadDocumentImageRepo;", "(Lcom/fli/elogistic/driver/repo/UploadDocumentImageRepo;)V", "postBASPResult", "Landroidx/lifecycle/LiveData;", "Lcom/fli/elogistic/driver/models/Resource;", "Lcom/fli/elogistic/driver/models/ResponseWrapper;", "Lcom/google/gson/JsonPrimitive;", "postBASPTrigger", "Landroidx/lifecycle/MutableLiveData;", "Lcom/fli/elogistic/driver/models/uploadDocument/UploadBASPRequest;", "getUploadDocumentImageRepo", "()Lcom/fli/elogistic/driver/repo/UploadDocumentImageRepo;", "setUploadDocumentImageRepo", "getPostBASPResult", "setPostBasp", "", "shipmentId", "", "shipmentDetailId", "locationId", "baspTitle", "", "isNeedConfirm", "", "baspCategory", "baspNotes", "note", "receiverName", "baspPhoto", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "documentationPhoto", "tz", "app_stagingDebug"})
public final class UploadBASPViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.fli.elogistic.driver.models.uploadDocument.UploadBASPRequest> postBASPTrigger = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> postBASPResult = null;
    @org.jetbrains.annotations.NotNull()
    private com.fli.elogistic.driver.repo.UploadDocumentImageRepo uploadDocumentImageRepo;
    
    public final void setPostBasp(long shipmentId, long shipmentDetailId, long locationId, @org.jetbrains.annotations.NotNull()
    java.lang.String baspTitle, boolean isNeedConfirm, @org.jetbrains.annotations.NotNull()
    java.lang.String baspCategory, @org.jetbrains.annotations.NotNull()
    java.lang.String baspNotes, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    java.lang.String receiverName, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> baspPhoto, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> documentationPhoto, long tz) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> getPostBASPResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.repo.UploadDocumentImageRepo getUploadDocumentImageRepo() {
        return null;
    }
    
    public final void setUploadDocumentImageRepo(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.repo.UploadDocumentImageRepo p0) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public UploadBASPViewModel(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.repo.UploadDocumentImageRepo uploadDocumentImageRepo) {
        super();
    }
}