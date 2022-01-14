package com.fli.elogistic.driver.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00070\u0006J.\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00160\tj\b\u0012\u0004\u0012\u00020\u0016`\u000bR0\u0010\u0005\u001a$\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0004\u00a8\u0006\u0019"}, d2 = {"Lcom/fli/elogistic/driver/viewmodel/UploadPODViewModel;", "Landroidx/lifecycle/ViewModel;", "uploadDocumentImageRepo", "Lcom/fli/elogistic/driver/repo/UploadDocumentImageRepo;", "(Lcom/fli/elogistic/driver/repo/UploadDocumentImageRepo;)V", "postPODDocumentResult", "Landroidx/lifecycle/LiveData;", "Lcom/fli/elogistic/driver/models/Resource;", "Lcom/fli/elogistic/driver/models/ResponseWrapper;", "Ljava/util/ArrayList;", "Lcom/fli/elogistic/driver/models/uploadDocument/UploadDocumentResult;", "Lkotlin/collections/ArrayList;", "postPODDocumentTrigger", "Landroidx/lifecycle/MutableLiveData;", "Lcom/fli/elogistic/driver/models/uploadDocument/UploadDocumentPODRequest;", "getUploadDocumentImageRepo", "()Lcom/fli/elogistic/driver/repo/UploadDocumentImageRepo;", "setUploadDocumentImageRepo", "getPostDocumentPODResult", "setPostDocumentPOD", "", "name", "", "type", "images", "app_stagingDebug"})
public final class UploadPODViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.fli.elogistic.driver.models.uploadDocument.UploadDocumentPODRequest> postPODDocumentTrigger = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<java.util.ArrayList<com.fli.elogistic.driver.models.uploadDocument.UploadDocumentResult>>>> postPODDocumentResult = null;
    @org.jetbrains.annotations.NotNull()
    private com.fli.elogistic.driver.repo.UploadDocumentImageRepo uploadDocumentImageRepo;
    
    public final void setPostDocumentPOD(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> images) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<java.util.ArrayList<com.fli.elogistic.driver.models.uploadDocument.UploadDocumentResult>>>> getPostDocumentPODResult() {
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
    public UploadPODViewModel(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.repo.UploadDocumentImageRepo uploadDocumentImageRepo) {
        super();
    }
}