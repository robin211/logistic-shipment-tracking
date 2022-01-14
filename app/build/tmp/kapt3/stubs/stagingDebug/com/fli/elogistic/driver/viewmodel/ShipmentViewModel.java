package com.fli.elogistic.driver.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u0018\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0004\u00a8\u0006\u001b"}, d2 = {"Lcom/fli/elogistic/driver/viewmodel/ShipmentViewModel;", "Landroidx/lifecycle/ViewModel;", "shipmentRepo", "Lcom/fli/elogistic/driver/repo/ShipmentRepo;", "(Lcom/fli/elogistic/driver/repo/ShipmentRepo;)V", "getShipmentFinishResult", "Landroidx/lifecycle/LiveData;", "Lcom/fli/elogistic/driver/models/Resource;", "Lcom/fli/elogistic/driver/models/ResponseWrapper;", "Lcom/fli/elogistic/driver/models/shipment/ShipmentGETModel;", "getShipmentFinishTrigger", "Landroidx/lifecycle/MutableLiveData;", "", "getShipmentNeedConfirmationResult", "getShipmentNeedConfirmationTrigger", "getShipmentOnProcessResult", "getShipmentOnProcessTrigger", "getShipmentRepo", "()Lcom/fli/elogistic/driver/repo/ShipmentRepo;", "setShipmentRepo", "getShipmentFinish", "getShipmentNeedConfirmation", "getShipmentOnProcess", "setGetShipmentFinish", "", "setGetShipmentNeedConfirmation", "setGetShipmentOnProcess", "app_stagingDebug"})
public final class ShipmentViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> getShipmentNeedConfirmationTrigger = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> getShipmentOnProcessTrigger = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> getShipmentFinishTrigger = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.shipment.ShipmentGETModel>>> getShipmentNeedConfirmationResult = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.shipment.ShipmentGETModel>>> getShipmentOnProcessResult = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.shipment.ShipmentGETModel>>> getShipmentFinishResult = null;
    @org.jetbrains.annotations.NotNull()
    private com.fli.elogistic.driver.repo.ShipmentRepo shipmentRepo;
    
    public final void setGetShipmentNeedConfirmation() {
    }
    
    public final void setGetShipmentOnProcess() {
    }
    
    public final void setGetShipmentFinish() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.shipment.ShipmentGETModel>>> getShipmentNeedConfirmation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.shipment.ShipmentGETModel>>> getShipmentOnProcess() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.shipment.ShipmentGETModel>>> getShipmentFinish() {
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
    public ShipmentViewModel(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.repo.ShipmentRepo shipmentRepo) {
        super();
    }
}