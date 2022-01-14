package com.fli.elogistic.driver.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\tJ\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/fli/elogistic/driver/viewmodel/FirebaseManualViewModel;", "Landroidx/lifecycle/ViewModel;", "firebaseManualRepo", "Lcom/fli/elogistic/driver/repo/FirebaseManualRepo;", "(Lcom/fli/elogistic/driver/repo/FirebaseManualRepo;)V", "getFirebaseManualRepo", "()Lcom/fli/elogistic/driver/repo/FirebaseManualRepo;", "setFirebaseManualRepo", "getSubscribeToTopicResult", "Landroidx/lifecycle/LiveData;", "Lcom/fli/elogistic/driver/models/Resource;", "Lcom/fli/elogistic/driver/models/ResponseWrapper;", "Lcom/google/gson/JsonNull;", "getSubscribeToTopicTrigger", "Landroidx/lifecycle/MutableLiveData;", "", "getSubscribeToTopic", "setGetSubscribeToTopic", "", "app_stagingDebug"})
public final class FirebaseManualViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> getSubscribeToTopicTrigger = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonNull>>> getSubscribeToTopicResult = null;
    @org.jetbrains.annotations.NotNull()
    private com.fli.elogistic.driver.repo.FirebaseManualRepo firebaseManualRepo;
    
    public final void setGetSubscribeToTopic() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonNull>>> getSubscribeToTopic() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.repo.FirebaseManualRepo getFirebaseManualRepo() {
        return null;
    }
    
    public final void setFirebaseManualRepo(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.repo.FirebaseManualRepo p0) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public FirebaseManualViewModel(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.repo.FirebaseManualRepo firebaseManualRepo) {
        super();
    }
}