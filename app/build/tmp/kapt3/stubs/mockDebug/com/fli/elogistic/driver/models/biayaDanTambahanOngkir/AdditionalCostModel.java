package com.fli.elogistic.driver.models.biayaDanTambahanOngkir;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n\u00a2\u0006\u0002\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR&\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lcom/fli/elogistic/driver/models/biayaDanTambahanOngkir/AdditionalCostModel;", "Ljava/io/Serializable;", "name", "", "amount", "", "notes", "documents", "Ljava/util/ArrayList;", "Lcom/fli/elogistic/driver/models/biayaDanTambahanOngkir/BiayaOngkirDocumentModel;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;DLjava/lang/String;Ljava/util/ArrayList;)V", "getAmount", "()D", "getDocuments", "()Ljava/util/ArrayList;", "getName", "()Ljava/lang/String;", "getNotes", "app_mockDebug"})
public final class AdditionalCostModel implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @com.google.gson.annotations.SerializedName(value = "amount")
    private final double amount = 0.0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "notes")
    private final java.lang.String notes = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "documents")
    private final java.util.ArrayList<com.fli.elogistic.driver.models.biayaDanTambahanOngkir.BiayaOngkirDocumentModel> documents = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
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
    public final java.util.ArrayList<com.fli.elogistic.driver.models.biayaDanTambahanOngkir.BiayaOngkirDocumentModel> getDocuments() {
        return null;
    }
    
    public AdditionalCostModel(@org.jetbrains.annotations.NotNull()
    java.lang.String name, double amount, @org.jetbrains.annotations.NotNull()
    java.lang.String notes, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fli.elogistic.driver.models.biayaDanTambahanOngkir.BiayaOngkirDocumentModel> documents) {
        super();
    }
}