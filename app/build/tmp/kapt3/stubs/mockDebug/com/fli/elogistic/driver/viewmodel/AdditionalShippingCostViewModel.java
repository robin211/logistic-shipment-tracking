package com.fli.elogistic.driver.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0018\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00070\u0006J\u0018\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u00070\u0006J\u001e\u0010\u001a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00070\u0006J\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0012J\u0006\u0010\u001f\u001a\u00020\u001cR0\u0010\u0005\u001a$\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0013\u001a$\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0004\u00a8\u0006 "}, d2 = {"Lcom/fli/elogistic/driver/viewmodel/AdditionalShippingCostViewModel;", "Landroidx/lifecycle/ViewModel;", "shipmentRepo", "Lcom/fli/elogistic/driver/repo/ShipmentRepo;", "(Lcom/fli/elogistic/driver/repo/ShipmentRepo;)V", "getAdditionalShippingCostResult", "Landroidx/lifecycle/LiveData;", "Lcom/fli/elogistic/driver/models/Resource;", "Lcom/fli/elogistic/driver/models/ResponseWrapper;", "Ljava/util/ArrayList;", "Lcom/fli/elogistic/driver/models/shipment/AdditionalShippingCostModel;", "Lkotlin/collections/ArrayList;", "getAdditionalShippingCostTrigger", "Landroidx/lifecycle/MutableLiveData;", "", "getPutAdditionalShippingCostResult", "Lcom/google/gson/JsonPrimitive;", "getPutAdditionalShippingCostTrigger", "Lcom/fli/elogistic/driver/models/biayaDanTambahanOngkir/AdditionalCostPUTModel;", "getShippingCostResult", "getShippingCostTrigger", "getShipmentRepo", "()Lcom/fli/elogistic/driver/repo/ShipmentRepo;", "setShipmentRepo", "getAdditionalShippingCost", "getPutAdditionalShippingCost", "getShippingCost", "setAdditionalShippingCost", "", "setPutAdditionalShippingCost", "additionalCostPUTModel", "setShippingCost", "app_mockDebug"})
public final class AdditionalShippingCostViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> getAdditionalShippingCostTrigger = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Object> getShippingCostTrigger = null;
    private final androidx.lifecycle.MutableLiveData<com.fli.elogistic.driver.models.biayaDanTambahanOngkir.AdditionalCostPUTModel> getPutAdditionalShippingCostTrigger = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<java.util.ArrayList<com.fli.elogistic.driver.models.shipment.AdditionalShippingCostModel>>>> getAdditionalShippingCostResult = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<java.util.ArrayList<com.fli.elogistic.driver.models.shipment.AdditionalShippingCostModel>>>> getShippingCostResult = null;
    private final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> getPutAdditionalShippingCostResult = null;
    @org.jetbrains.annotations.NotNull()
    private com.fli.elogistic.driver.repo.ShipmentRepo shipmentRepo;
    
    public final void setAdditionalShippingCost() {
    }
    
    public final void setShippingCost() {
    }
    
    public final void setPutAdditionalShippingCost(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.biayaDanTambahanOngkir.AdditionalCostPUTModel additionalCostPUTModel) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<java.util.ArrayList<com.fli.elogistic.driver.models.shipment.AdditionalShippingCostModel>>>> getAdditionalShippingCost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<java.util.ArrayList<com.fli.elogistic.driver.models.shipment.AdditionalShippingCostModel>>>> getShippingCost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> getPutAdditionalShippingCost() {
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
    public AdditionalShippingCostViewModel(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.repo.ShipmentRepo shipmentRepo) {
        super();
    }
}