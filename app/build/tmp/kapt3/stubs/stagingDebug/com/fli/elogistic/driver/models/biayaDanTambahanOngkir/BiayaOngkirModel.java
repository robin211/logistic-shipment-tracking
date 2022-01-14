package com.fli.elogistic.driver.models.biayaDanTambahanOngkir;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u00a2\u0006\u0002\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R&\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017\u00a8\u0006\u001b"}, d2 = {"Lcom/fli/elogistic/driver/models/biayaDanTambahanOngkir/BiayaOngkirModel;", "Ljava/io/Serializable;", "id", "", "shipmentsCargoId", "shippingCostName", "", "amount", "", "notes", "status", "documents", "Ljava/util/ArrayList;", "Lcom/fli/elogistic/driver/models/shipment/AdditionalShippingCostDocumentModel;", "Lkotlin/collections/ArrayList;", "(IILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getAmount", "()D", "getDocuments", "()Ljava/util/ArrayList;", "getId", "()I", "getNotes", "()Ljava/lang/String;", "getShipmentsCargoId", "getShippingCostName", "getStatus", "app_stagingDebug"})
public final class BiayaOngkirModel implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @com.google.gson.annotations.SerializedName(value = "shipmentsCargoId")
    private final int shipmentsCargoId = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "shippingCostName")
    private final java.lang.String shippingCostName = null;
    @com.google.gson.annotations.SerializedName(value = "amount")
    private final double amount = 0.0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "notes")
    private final java.lang.String notes = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "status")
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "documents")
    private final java.util.ArrayList<com.fli.elogistic.driver.models.shipment.AdditionalShippingCostDocumentModel> documents = null;
    
    public final int getId() {
        return 0;
    }
    
    public final int getShipmentsCargoId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShippingCostName() {
        return null;
    }
    
    public final double getAmount() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fli.elogistic.driver.models.shipment.AdditionalShippingCostDocumentModel> getDocuments() {
        return null;
    }
    
    public BiayaOngkirModel(int id, int shipmentsCargoId, @org.jetbrains.annotations.NotNull()
    java.lang.String shippingCostName, double amount, @org.jetbrains.annotations.NotNull()
    java.lang.String notes, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fli.elogistic.driver.models.shipment.AdditionalShippingCostDocumentModel> documents) {
        super();
    }
}