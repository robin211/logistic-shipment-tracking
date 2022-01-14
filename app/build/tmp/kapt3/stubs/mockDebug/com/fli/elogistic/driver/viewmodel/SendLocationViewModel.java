package com.fli.elogistic.driver.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004\u00a8\u0006\u0014"}, d2 = {"Lcom/fli/elogistic/driver/viewmodel/SendLocationViewModel;", "Landroidx/lifecycle/ViewModel;", "sendLocationRepo", "Lcom/fli/elogistic/driver/repo/SendLocationRepo;", "(Lcom/fli/elogistic/driver/repo/SendLocationRepo;)V", "getSendLocationResult", "Landroidx/lifecycle/LiveData;", "Lcom/fli/elogistic/driver/models/Resource;", "Lcom/fli/elogistic/driver/models/ResponseWrapper;", "Lcom/google/gson/JsonNull;", "getSendLocationTrigger", "Landroidx/lifecycle/MutableLiveData;", "Lcom/fli/elogistic/driver/models/SendLocationRequest;", "getSendLocationRepo", "()Lcom/fli/elogistic/driver/repo/SendLocationRepo;", "setSendLocationRepo", "getSendLocation", "setSendLocation", "", "sendLocationModel", "app_mockDebug"})
public final class SendLocationViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.fli.elogistic.driver.models.SendLocationRequest> getSendLocationTrigger = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonNull>>> getSendLocationResult = null;
    @org.jetbrains.annotations.NotNull()
    private com.fli.elogistic.driver.repo.SendLocationRepo sendLocationRepo;
    
    public final void setSendLocation(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.SendLocationRequest sendLocationModel) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonNull>>> getSendLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.repo.SendLocationRepo getSendLocationRepo() {
        return null;
    }
    
    public final void setSendLocationRepo(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.repo.SendLocationRepo p0) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public SendLocationViewModel(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.repo.SendLocationRepo sendLocationRepo) {
        super();
    }
}