package com.fli.elogistic.driver.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0004\u00a8\u0006\u0018"}, d2 = {"Lcom/fli/elogistic/driver/viewmodel/UpdateStatusViewModel;", "Landroidx/lifecycle/ViewModel;", "shipmentRepo", "Lcom/fli/elogistic/driver/repo/ShipmentRepo;", "(Lcom/fli/elogistic/driver/repo/ShipmentRepo;)V", "patchUpdateStatusMobileResult", "Landroidx/lifecycle/LiveData;", "Lcom/fli/elogistic/driver/models/Resource;", "Lcom/fli/elogistic/driver/models/ResponseWrapper;", "Lcom/google/gson/JsonPrimitive;", "patchUpdateStatusMobileTrigger", "Landroidx/lifecycle/MutableLiveData;", "Lcom/fli/elogistic/driver/models/shipment/UpdateStatusRequest;", "patchUpdateStatusResult", "patchUpdateStatusTrigger", "getShipmentRepo", "()Lcom/fli/elogistic/driver/repo/ShipmentRepo;", "setShipmentRepo", "getPatchStatusConfirmation", "getPatchStatusConfirmationMobile", "setPatchStatusConfirmation", "", "updateStatusRequest", "setPatchStatusConfirmationMobile", "app_mockDebug"})
public final class UpdateStatusViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.fli.elogistic.driver.models.shipment.UpdateStatusRequest> patchUpdateStatusTrigger = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> patchUpdateStatusResult = null;
    private final androidx.lifecycle.MutableLiveData<com.fli.elogistic.driver.models.shipment.UpdateStatusRequest> patchUpdateStatusMobileTrigger = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> patchUpdateStatusMobileResult = null;
    @org.jetbrains.annotations.NotNull()
    private com.fli.elogistic.driver.repo.ShipmentRepo shipmentRepo;
    
    public final void setPatchStatusConfirmation(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.shipment.UpdateStatusRequest updateStatusRequest) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> getPatchStatusConfirmation() {
        return null;
    }
    
    public final void setPatchStatusConfirmationMobile(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.shipment.UpdateStatusRequest updateStatusRequest) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> getPatchStatusConfirmationMobile() {
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
    public UpdateStatusViewModel(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.repo.ShipmentRepo shipmentRepo) {
        super();
    }
}