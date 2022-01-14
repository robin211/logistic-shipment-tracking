package com.fli.elogistic.driver.models.shipment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bQ\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0013\u0012\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u0013\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\u0017\u0012\u0006\u0010\"\u001a\u00020\u0017\u0012\u0006\u0010#\u001a\u00020\u0013\u0012\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d\u0012\u001a\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001bj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u001d\u00a2\u0006\u0002\u0010&J\t\u0010O\u001a\u00020\u0003H\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u000fH\u00c6\u0003J\t\u0010R\u001a\u00020\u000fH\u00c6\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u00105J\t\u0010T\u001a\u00020\u0013H\u00c6\u0003J\t\u0010U\u001a\u00020\u0005H\u00c6\u0003J\t\u0010V\u001a\u00020\u0005H\u00c6\u0003J\t\u0010W\u001a\u00020\u0017H\u00c6\u0003J\t\u0010X\u001a\u00020\u0017H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0013H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0005H\u00c6\u0003J\u0019\u0010[\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001dH\u00c6\u0003J\t\u0010\\\u001a\u00020\u0013H\u00c6\u0003J\t\u0010]\u001a\u00020\u0005H\u00c6\u0003J\t\u0010^\u001a\u00020\u0005H\u00c6\u0003J\t\u0010_\u001a\u00020\u0017H\u00c6\u0003J\t\u0010`\u001a\u00020\u0017H\u00c6\u0003J\t\u0010a\u001a\u00020\u0013H\u00c6\u0003J\u0019\u0010b\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001dH\u00c6\u0003J\u001d\u0010c\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001bj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u001dH\u00c6\u0003J\t\u0010d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010g\u001a\u00020\u0005H\u00c6\u0003J\t\u0010h\u001a\u00020\u0005H\u00c6\u0003J\t\u0010i\u001a\u00020\u0005H\u00c6\u0003J\t\u0010j\u001a\u00020\u0003H\u00c6\u0003J\u00dc\u0002\u0010k\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00132\u0018\b\u0002\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00172\b\b\u0002\u0010\"\u001a\u00020\u00172\b\b\u0002\u0010#\u001a\u00020\u00132\u0018\b\u0002\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d2\u001c\b\u0002\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001bj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u001dH\u00c6\u0001\u00a2\u0006\u0002\u0010lJ\u0013\u0010m\u001a\u00020\u000f2\b\u0010n\u001a\u0004\u0018\u00010oH\u00d6\u0003J\t\u0010p\u001a\u00020\u0013H\u00d6\u0001J\t\u0010q\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010!\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u001f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0016\u0010 \u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0016\u0010\u001e\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0016\u0010\"\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010.R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\"\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00108\u001a\u0004\b\u0011\u00105\"\u0004\b6\u00107R\u001e\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u00109\"\u0004\b:\u0010;R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u00109\"\u0004\b<\u0010;R*\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001bj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u001d8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R&\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010>R&\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010>R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010(R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00102R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010.R\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010(R\u0016\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010(R\u0016\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010.R\u0016\u0010#\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00102R\u0016\u0010\u0019\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00102R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010(R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010*R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010(R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010(R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010(R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010*\u00a8\u0006r"}, d2 = {"Lcom/fli/elogistic/driver/models/shipment/ShipmentModel;", "Ljava/io/Serializable;", "id", "", "cargoTitle", "", "shipmentId", "shipmentTitle", "shipmentDate", "shipmentStatus", "tipeKendaraan", "noKendaraan", "totalSequence", "currentSequence", "isCurrentSequenceFinish", "", "isCurrentSequenceBASTSubmitted", "isCurrentSequenceArrived", "originLocationId", "", "originalLocation", "originalLocationAddress", "originalLatitude", "", "originalLongitude", "radiusCalculationOriginal", "multiPick", "Ljava/util/ArrayList;", "Lcom/fli/elogistic/driver/models/shipment/MultipickDropModel;", "Lkotlin/collections/ArrayList;", "destinationLocationId", "destinationLocation", "destinationLocationAddress", "destinationLatitude", "destinationLongitude", "radiusCalculationDestination", "multiDrop", "listShipments", "(JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZZLjava/lang/Boolean;ILjava/lang/String;Ljava/lang/String;DDILjava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;DDILjava/util/ArrayList;Ljava/util/ArrayList;)V", "getCargoTitle", "()Ljava/lang/String;", "getCurrentSequence", "()J", "setCurrentSequence", "(J)V", "getDestinationLatitude", "()D", "getDestinationLocation", "getDestinationLocationAddress", "getDestinationLocationId", "()I", "getDestinationLongitude", "getId", "()Ljava/lang/Boolean;", "setCurrentSequenceArrived", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "()Z", "setCurrentSequenceBASTSubmitted", "(Z)V", "setCurrentSequenceFinish", "getListShipments", "()Ljava/util/ArrayList;", "getMultiDrop", "getMultiPick", "getNoKendaraan", "getOriginLocationId", "getOriginalLatitude", "getOriginalLocation", "getOriginalLocationAddress", "getOriginalLongitude", "getRadiusCalculationDestination", "getRadiusCalculationOriginal", "getShipmentDate", "getShipmentId", "getShipmentStatus", "getShipmentTitle", "getTipeKendaraan", "getTotalSequence", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZZLjava/lang/Boolean;ILjava/lang/String;Ljava/lang/String;DDILjava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;DDILjava/util/ArrayList;Ljava/util/ArrayList;)Lcom/fli/elogistic/driver/models/shipment/ShipmentModel;", "equals", "other", "", "hashCode", "toString", "app_mockDebug"})
public final class ShipmentModel implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "id")
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "cargoTitle")
    private final java.lang.String cargoTitle = null;
    @com.google.gson.annotations.SerializedName(value = "shipmentId")
    private final long shipmentId = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "shipmentTitle")
    private final java.lang.String shipmentTitle = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "shipmentDate")
    private final java.lang.String shipmentDate = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "shipmentStatus")
    private final java.lang.String shipmentStatus = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "tipeKendaraan")
    private final java.lang.String tipeKendaraan = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "noKendaraan")
    private final java.lang.String noKendaraan = null;
    @com.google.gson.annotations.SerializedName(value = "totalSequence")
    private final long totalSequence = 0L;
    @com.google.gson.annotations.SerializedName(value = "currentSequence")
    private long currentSequence;
    @com.google.gson.annotations.SerializedName(value = "isCurrentSequenceFinish")
    private boolean isCurrentSequenceFinish;
    @com.google.gson.annotations.SerializedName(value = "isCurrentSequenceBASTSubmitted")
    private boolean isCurrentSequenceBASTSubmitted;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "isCurrentSequenceArrived")
    private java.lang.Boolean isCurrentSequenceArrived;
    @com.google.gson.annotations.SerializedName(value = "originLocationId")
    private final int originLocationId = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "originalLocation")
    private final java.lang.String originalLocation = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "originalLocationAddress")
    private final java.lang.String originalLocationAddress = null;
    @com.google.gson.annotations.SerializedName(value = "originalLatitude")
    private final double originalLatitude = 0.0;
    @com.google.gson.annotations.SerializedName(value = "originalLongitude")
    private final double originalLongitude = 0.0;
    @com.google.gson.annotations.SerializedName(value = "radiusCalculationOriginal")
    private final int radiusCalculationOriginal = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "multiPick")
    private final java.util.ArrayList<com.fli.elogistic.driver.models.shipment.MultipickDropModel> multiPick = null;
    @com.google.gson.annotations.SerializedName(value = "destinationLocationId")
    private final int destinationLocationId = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "destinationLocation")
    private final java.lang.String destinationLocation = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "destinationLocationAddress")
    private final java.lang.String destinationLocationAddress = null;
    @com.google.gson.annotations.SerializedName(value = "destinationLatitude")
    private final double destinationLatitude = 0.0;
    @com.google.gson.annotations.SerializedName(value = "destinationLongitude")
    private final double destinationLongitude = 0.0;
    @com.google.gson.annotations.SerializedName(value = "radiusCalculationDestination")
    private final int radiusCalculationDestination = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "multiDrop")
    private final java.util.ArrayList<com.fli.elogistic.driver.models.shipment.MultipickDropModel> multiDrop = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "listShipments")
    private final java.util.ArrayList<java.lang.String> listShipments = null;
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCargoTitle() {
        return null;
    }
    
    public final long getShipmentId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShipmentTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShipmentDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShipmentStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTipeKendaraan() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNoKendaraan() {
        return null;
    }
    
    public final long getTotalSequence() {
        return 0L;
    }
    
    public final long getCurrentSequence() {
        return 0L;
    }
    
    public final void setCurrentSequence(long p0) {
    }
    
    public final boolean isCurrentSequenceFinish() {
        return false;
    }
    
    public final void setCurrentSequenceFinish(boolean p0) {
    }
    
    public final boolean isCurrentSequenceBASTSubmitted() {
        return false;
    }
    
    public final void setCurrentSequenceBASTSubmitted(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isCurrentSequenceArrived() {
        return null;
    }
    
    public final void setCurrentSequenceArrived(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public final int getOriginLocationId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginalLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginalLocationAddress() {
        return null;
    }
    
    public final double getOriginalLatitude() {
        return 0.0;
    }
    
    public final double getOriginalLongitude() {
        return 0.0;
    }
    
    public final int getRadiusCalculationOriginal() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fli.elogistic.driver.models.shipment.MultipickDropModel> getMultiPick() {
        return null;
    }
    
    public final int getDestinationLocationId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDestinationLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDestinationLocationAddress() {
        return null;
    }
    
    public final double getDestinationLatitude() {
        return 0.0;
    }
    
    public final double getDestinationLongitude() {
        return 0.0;
    }
    
    public final int getRadiusCalculationDestination() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fli.elogistic.driver.models.shipment.MultipickDropModel> getMultiDrop() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getListShipments() {
        return null;
    }
    
    public ShipmentModel(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String cargoTitle, long shipmentId, @org.jetbrains.annotations.NotNull()
    java.lang.String shipmentTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String shipmentDate, @org.jetbrains.annotations.NotNull()
    java.lang.String shipmentStatus, @org.jetbrains.annotations.NotNull()
    java.lang.String tipeKendaraan, @org.jetbrains.annotations.NotNull()
    java.lang.String noKendaraan, long totalSequence, long currentSequence, boolean isCurrentSequenceFinish, boolean isCurrentSequenceBASTSubmitted, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isCurrentSequenceArrived, int originLocationId, @org.jetbrains.annotations.NotNull()
    java.lang.String originalLocation, @org.jetbrains.annotations.NotNull()
    java.lang.String originalLocationAddress, double originalLatitude, double originalLongitude, int radiusCalculationOriginal, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fli.elogistic.driver.models.shipment.MultipickDropModel> multiPick, int destinationLocationId, @org.jetbrains.annotations.NotNull()
    java.lang.String destinationLocation, @org.jetbrains.annotations.NotNull()
    java.lang.String destinationLocationAddress, double destinationLatitude, double destinationLongitude, int radiusCalculationDestination, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fli.elogistic.driver.models.shipment.MultipickDropModel> multiDrop, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> listShipments) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    public final long component9() {
        return 0L;
    }
    
    public final long component10() {
        return 0L;
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean component12() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component13() {
        return null;
    }
    
    public final int component14() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    public final double component17() {
        return 0.0;
    }
    
    public final double component18() {
        return 0.0;
    }
    
    public final int component19() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fli.elogistic.driver.models.shipment.MultipickDropModel> component20() {
        return null;
    }
    
    public final int component21() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component23() {
        return null;
    }
    
    public final double component24() {
        return 0.0;
    }
    
    public final double component25() {
        return 0.0;
    }
    
    public final int component26() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fli.elogistic.driver.models.shipment.MultipickDropModel> component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.models.shipment.ShipmentModel copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String cargoTitle, long shipmentId, @org.jetbrains.annotations.NotNull()
    java.lang.String shipmentTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String shipmentDate, @org.jetbrains.annotations.NotNull()
    java.lang.String shipmentStatus, @org.jetbrains.annotations.NotNull()
    java.lang.String tipeKendaraan, @org.jetbrains.annotations.NotNull()
    java.lang.String noKendaraan, long totalSequence, long currentSequence, boolean isCurrentSequenceFinish, boolean isCurrentSequenceBASTSubmitted, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isCurrentSequenceArrived, int originLocationId, @org.jetbrains.annotations.NotNull()
    java.lang.String originalLocation, @org.jetbrains.annotations.NotNull()
    java.lang.String originalLocationAddress, double originalLatitude, double originalLongitude, int radiusCalculationOriginal, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fli.elogistic.driver.models.shipment.MultipickDropModel> multiPick, int destinationLocationId, @org.jetbrains.annotations.NotNull()
    java.lang.String destinationLocation, @org.jetbrains.annotations.NotNull()
    java.lang.String destinationLocationAddress, double destinationLatitude, double destinationLongitude, int radiusCalculationDestination, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fli.elogistic.driver.models.shipment.MultipickDropModel> multiDrop, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> listShipments) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}