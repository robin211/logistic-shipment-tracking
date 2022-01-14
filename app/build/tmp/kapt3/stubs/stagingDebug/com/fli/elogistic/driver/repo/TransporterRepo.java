package com.fli.elogistic.driver.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u000b\u001a$\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00110\u000e0\r0\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/fli/elogistic/driver/repo/TransporterRepo;", "", "appExecutors", "Lcom/fli/elogistic/driver/AppExecutors;", "shipmentDetailPerLocationService", "Lcom/fli/elogistic/driver/services/ShipmentDetailPerLocationService;", "(Lcom/fli/elogistic/driver/AppExecutors;Lcom/fli/elogistic/driver/services/ShipmentDetailPerLocationService;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "getDetailPerLocation", "Landroidx/lifecycle/LiveData;", "Lcom/fli/elogistic/driver/models/Resource;", "Lcom/fli/elogistic/driver/models/ResponseWrapper;", "Ljava/util/ArrayList;", "Lcom/fli/elogistic/driver/models/shipment/DetailPerLocationModel;", "Lkotlin/collections/ArrayList;", "app_stagingDebug"})
public final class TransporterRepo {
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    private final com.fli.elogistic.driver.AppExecutors appExecutors = null;
    private final com.fli.elogistic.driver.services.ShipmentDetailPerLocationService shipmentDetailPerLocationService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Handler getHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<com.fli.elogistic.driver.models.ResponseWrapper<java.util.ArrayList<com.fli.elogistic.driver.models.shipment.DetailPerLocationModel>>>> getDetailPerLocation() {
        return null;
    }
    
    @javax.inject.Inject()
    public TransporterRepo(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.AppExecutors appExecutors, @org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.services.ShipmentDetailPerLocationService shipmentDetailPerLocationService) {
        super();
    }
}