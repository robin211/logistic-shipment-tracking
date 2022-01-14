package com.fli.elogistic.driver.models.shipment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007H\u00c6\u0003J\u001d\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007H\u00c6\u0003J\u001d\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007H\u00c6\u0003Jm\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00072\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00072\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR%\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR%\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Lcom/fli/elogistic/driver/models/shipment/DetailPerLocationWithPictureModel;", "Ljava/io/Serializable;", "detailPerLocationModel", "Lcom/fli/elogistic/driver/models/shipment/DetailPerLocationModel;", "listImageSuratJalan", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "listImageDokumentasi", "listImagePerintahPengiriman", "(Lcom/fli/elogistic/driver/models/shipment/DetailPerLocationModel;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getDetailPerLocationModel", "()Lcom/fli/elogistic/driver/models/shipment/DetailPerLocationModel;", "getListImageDokumentasi", "()Ljava/util/ArrayList;", "getListImagePerintahPengiriman", "getListImageSuratJalan", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_mockDebug"})
public final class DetailPerLocationWithPictureModel implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final com.fli.elogistic.driver.models.shipment.DetailPerLocationModel detailPerLocationModel = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.ArrayList<java.lang.Object> listImageSuratJalan = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.ArrayList<java.lang.Object> listImageDokumentasi = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.ArrayList<java.lang.Object> listImagePerintahPengiriman = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.models.shipment.DetailPerLocationModel getDetailPerLocationModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.Object> getListImageSuratJalan() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.Object> getListImageDokumentasi() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.Object> getListImagePerintahPengiriman() {
        return null;
    }
    
    public DetailPerLocationWithPictureModel(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.shipment.DetailPerLocationModel detailPerLocationModel, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Object> listImageSuratJalan, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Object> listImageDokumentasi, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Object> listImagePerintahPengiriman) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.models.shipment.DetailPerLocationModel component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.Object> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.Object> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.Object> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.models.shipment.DetailPerLocationWithPictureModel copy(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.shipment.DetailPerLocationModel detailPerLocationModel, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Object> listImageSuratJalan, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Object> listImageDokumentasi, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Object> listImagePerintahPengiriman) {
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