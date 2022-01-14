package com.fli.elogistic.driver.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0004\u00a8\u0006\u0017"}, d2 = {"Lcom/fli/elogistic/driver/viewmodel/ReasonAllViewModel;", "Landroidx/lifecycle/ViewModel;", "shipmentRepo", "Lcom/fli/elogistic/driver/repo/ShipmentRepo;", "(Lcom/fli/elogistic/driver/repo/ShipmentRepo;)V", "getReasonAccidentResult", "Landroidx/lifecycle/LiveData;", "Lcom/fli/elogistic/driver/models/Resource;", "Lcom/fli/elogistic/driver/models/ResponseWrapper;", "Lcom/fli/elogistic/driver/models/shipment/ReasonAllGETModel;", "getReasonAccidentTrigger", "Landroidx/lifecycle/MutableLiveData;", "", "getReasonBASPResult", "getReasonBASPTrigger", "getShipmentRepo", "()Lcom/fli/elogistic/driver/repo/ShipmentRepo;", "setShipmentRepo", "getReasonAccident", "getReasonBASP", "setGetReasonAccident", "", "setGetReasonBASP", "app_mockDebug"})
public final class ReasonAllViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> getReasonBASPTrigger = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> getReasonAccidentTrigger = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.shipment.ReasonAllGETModel>>> getReasonBASPResult = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.shipment.ReasonAllGETModel>>> getReasonAccidentResult = null;
    @org.jetbrains.annotations.NotNull()
    private com.fli.elogistic.driver.repo.ShipmentRepo shipmentRepo;
    
    public final void setGetReasonBASP() {
    }
    
    public final void setGetReasonAccident() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.shipment.ReasonAllGETModel>>> getReasonBASP() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.shipment.ReasonAllGETModel>>> getReasonAccident() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.repo.ShipmentRepo getShipmentRepo() {
        return null;
    }
    
    public final void setShipmentRepo(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.repo.ShipmentRepo p0) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public ReasonAllViewModel(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.repo.ShipmentRepo shipmentRepo) {
        super();
    }
}