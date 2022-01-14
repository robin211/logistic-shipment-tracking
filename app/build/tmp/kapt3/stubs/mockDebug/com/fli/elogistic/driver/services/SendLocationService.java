package com.fli.elogistic.driver.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/fli/elogistic/driver/services/SendLocationService;", "", "sendLocation", "Landroidx/lifecycle/LiveData;", "Lcom/fli/elogistic/driver/models/Resource;", "Lcom/fli/elogistic/driver/models/ResponseWrapper;", "Lcom/google/gson/JsonNull;", "body", "Lcom/fli/elogistic/driver/models/SendLocationRequest;", "driverId", "", "app_mockDebug"})
public abstract interface SendLocationService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "tracking/api/v3/position/{driverId}")
    public abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<com.google.gson.JsonNull>>> sendLocation(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fli.elogistic.driver.models.SendLocationRequest body, @retrofit2.http.Path(value = "driverId")
    int driverId);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}