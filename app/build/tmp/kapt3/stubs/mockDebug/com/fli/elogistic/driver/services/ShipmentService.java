package com.fli.elogistic.driver.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JH\u0010\u0002\u001a$\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b0\u00050\u00040\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\rH\'J.\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00040\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\nH\'J.\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00040\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\nH\'J.\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00040\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\nH\'J.\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\u00040\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\nH\'J.\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\u00040\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\nH\'JH\u0010\u0015\u001a$\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b0\u00050\u00040\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\rH\'J>\u0010\u0016\u001a$\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0006j\b\u0012\u0004\u0012\u00020\u0017`\b0\u00050\u00040\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\nH\'JB\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00040\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u001b2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\rH\'JB\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00040\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u001b2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\rH\'JB\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00040\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u001e2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\rH\'J8\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00040\u00032\b\b\u0001\u0010 \u001a\u00020!2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\nH\'JB\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00040\u00032\b\b\u0001\u0010 \u001a\u00020#2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\rH\'\u00a8\u0006$"}, d2 = {"Lcom/fli/elogistic/driver/services/ShipmentService;", "", "getAdditionalShippingCost", "Landroidx/lifecycle/LiveData;", "Lcom/fli/elogistic/driver/models/Resource;", "Lcom/fli/elogistic/driver/models/ResponseWrapper;", "Ljava/util/ArrayList;", "Lcom/fli/elogistic/driver/models/shipment/AdditionalShippingCostModel;", "Lkotlin/collections/ArrayList;", "token", "", "deviceId", "id", "", "getFinish", "Lcom/fli/elogistic/driver/models/shipment/ShipmentGETModel;", "getNeedConfirmation", "getOnProcess", "getReasonAccident", "Lcom/fli/elogistic/driver/models/shipment/ReasonAllGETModel;", "getReasonBASP", "getShippingCost", "getSimpleDocumentPOD", "Lcom/fli/elogistic/driver/models/POD/PodSimpleModel;", "patchUpdateStatus", "Lcom/google/gson/JsonPrimitive;", "tz", "Lcom/fli/elogistic/driver/models/shipment/UpdateStatusRequest;", "patchUpdateStatusMobile", "patchkonfirmasi", "Lcom/fli/elogistic/driver/models/shipment/StatusConfirmationRequest;", "postAutoAssignLocation", "body", "Lcom/fli/elogistic/driver/models/shipment/PostAutoAssignLocationRequest;", "putAdditionalShippingCost", "Lcom/fli/elogistic/driver/models/biayaDanTambahanOngkir/AdditionalCostPUTModel;", "app_mockDebug"})
public abstract interface ShipmentService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v3/driver/shipment/filter/NEED_CONFIRMATION/?size=20")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.shipment.ShipmentGETModel>>> getNeedConfirmation(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v3/driver/shipment/filter/ON_PROCESS/?size=20")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.shipment.ShipmentGETModel>>> getOnProcess(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v3/driver/shipment/filter/FINISH/?size=20")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.shipment.ShipmentGETModel>>> getFinish(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v3/driver/shipment/filter/document-pod/mobile")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<java.util.ArrayList<com.fli.elogistic.driver.models.POD.PodSimpleModel>>>> getSimpleDocumentPOD(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PATCH(value = "api/v3/driver/shipment/{id}/status/accepted")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> patchkonfirmasi(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fli.elogistic.driver.models.shipment.StatusConfirmationRequest tz, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId, @retrofit2.http.Path(value = "id")
    long id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PATCH(value = "api/v3/driver/shipment/{id}/status/mobile")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> patchUpdateStatusMobile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fli.elogistic.driver.models.shipment.UpdateStatusRequest tz, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId, @retrofit2.http.Path(value = "id")
    long id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PATCH(value = "api/v3/driver/shipment/{id}/status")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> patchUpdateStatus(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fli.elogistic.driver.models.shipment.UpdateStatusRequest tz, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId, @retrofit2.http.Path(value = "id")
    long id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "api/v3/auto-assign")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> postAutoAssignLocation(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fli.elogistic.driver.models.shipment.PostAutoAssignLocationRequest body, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v3/driver/shipment/reason/filter?type=qIn(basp)&size=500")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.shipment.ReasonAllGETModel>>> getReasonBASP(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v3/driver/shipment/reason/filter?type=qIn(accident)&size=500")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.fli.elogistic.driver.models.shipment.ReasonAllGETModel>>> getReasonAccident(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v3/driver/shipment/{shipmentCargoId}/additional-shipping-cost")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<java.util.ArrayList<com.fli.elogistic.driver.models.shipment.AdditionalShippingCostModel>>>> getAdditionalShippingCost(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId, @retrofit2.http.Path(value = "shipmentCargoId")
    long id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/v3/driver/shipment/{shipmentCargoId}/shipping-cost")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<java.util.ArrayList<com.fli.elogistic.driver.models.shipment.AdditionalShippingCostModel>>>> getShippingCost(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId, @retrofit2.http.Path(value = "shipmentCargoId")
    long id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "api/v3/driver/shipment/{shipmentCargoId}/additional-shipping-cost")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonPrimitive>>> putAdditionalShippingCost(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fli.elogistic.driver.models.biayaDanTambahanOngkir.AdditionalCostPUTModel body, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-device-id")
    java.lang.String deviceId, @retrofit2.http.Path(value = "shipmentCargoId")
    long id);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}