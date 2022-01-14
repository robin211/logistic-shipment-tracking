package com.fli.elogistic.driver.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u000b\u001a$\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00110\u000e0\r0\fJ\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e0\r0\fJ\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e0\r0\fJ \u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000e0\r0\f2\u0006\u0010\u0017\u001a\u00020\u0018J(\u0010\u0019\u001a$\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00110\u000e0\r0\fJ(\u0010\u001a\u001a$\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b0\u000fj\b\u0012\u0004\u0012\u00020\u001b`\u00110\u000e0\r0\fJ \u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000e0\r0\f2\u0006\u0010\u001e\u001a\u00020\u001fJ \u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000e0\r0\f2\u0006\u0010!\u001a\u00020\"J \u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000e0\r0\f2\u0006\u0010!\u001a\u00020\"J \u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000e0\r0\f2\u0006\u0010%\u001a\u00020&J \u0010\'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u000e0\r0\f2\u0006\u0010(\u001a\u00020)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/fli/elogistic/driver/repo/ShipmentRepo;", "", "appExecutors", "Lcom/fli/elogistic/driver/AppExecutors;", "shipmentService", "Lcom/fli/elogistic/driver/services/ShipmentService;", "(Lcom/fli/elogistic/driver/AppExecutors;Lcom/fli/elogistic/driver/services/ShipmentService;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "getAdditionalShippingCost", "Landroidx/lifecycle/LiveData;", "Lcom/fli/elogistic/driver/models/Resource;", "Lcom/fli/elogistic/driver/models/ResponseWrapper;", "Ljava/util/ArrayList;", "Lcom/fli/elogistic/driver/models/shipment/AdditionalShippingCostModel;", "Lkotlin/collections/ArrayList;", "getReasonAccident", "Lcom/fli/elogistic/driver/models/shipment/ReasonAllGETModel;", "getReasonBASP", "getShipment", "Lcom/fli/elogistic/driver/models/shipment/ShipmentGETModel;", "status", "", "getShippingCost", "getSimplePOD", "Lcom/fli/elogistic/driver/models/POD/PodSimpleModel;", "patchStatusConfirmation", "Lcom/google/gson/JsonPrimitive;", "StatusConfirmationRequest", "Lcom/fli/elogistic/driver/models/shipment/StatusConfirmationRequest;", "patchUpdateStatus", "updateStatusRequest", "Lcom/fli/elogistic/driver/models/shipment/UpdateStatusRequest;", "patchUpdateStatusMobile", "postAutoAssignLocation", "postAutoAssignLocationRequest", "Lcom/fli/elogistic/driver/models/shipment/PostAutoAssignLocationRequest;", "putAdditionalShippingCost", "additionalCostPUTModel", "Lcom/fli/elogistic/driver/models/biayaDanTambahanOngkir/AdditionalCostPUTModel;", "app_stagingDebug"})
public final class ShipmentRepo {
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    private final com.fli.elogistic.driver.AppExecutors appExecutors = null;
    private final com.fli.elogistic.driver.services.ShipmentService shipmentService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Handler getHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.shipment.ShipmentGETModel>>> getShipment(@org.jetbrains.annotations.NotNull()
    java.lang.String status) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<java.util.ArrayList<com.fli.elogistic.driver.models.POD.PodSimpleModel>>>> getSimplePOD() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> patchStatusConfirmation(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.shipment.StatusConfirmationRequest StatusConfirmationRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> patchUpdateStatus(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.shipment.UpdateStatusRequest updateStatusRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> patchUpdateStatusMobile(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.shipment.UpdateStatusRequest updateStatusRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> postAutoAssignLocation(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.shipment.PostAutoAssignLocationRequest postAutoAssignLocationRequest) {
        return null;
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
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<java.util.ArrayList<com.fli.elogistic.driver.models.shipment.AdditionalShippingCostModel>>>> getAdditionalShippingCost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<java.util.ArrayList<com.fli.elogistic.driver.models.shipment.AdditionalShippingCostModel>>>> getShippingCost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> putAdditionalShippingCost(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.biayaDanTambahanOngkir.AdditionalCostPUTModel additionalCostPUTModel) {
        return null;
    }
    
    @javax.inject.Inject()
    public ShipmentRepo(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.AppExecutors appExecutors, @org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.services.ShipmentService shipmentService) {
        super();
    }
}