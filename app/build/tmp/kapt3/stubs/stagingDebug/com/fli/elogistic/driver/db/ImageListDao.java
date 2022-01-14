package com.fli.elogistic.driver.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J$\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\'J \u0010\f\u001a\u00020\u00032\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000ej\b\u0012\u0004\u0012\u00020\t`\u000fH\'\u00a8\u0006\u0010"}, d2 = {"Lcom/fli/elogistic/driver/db/ImageListDao;", "", "deleteImagesFromDb", "", "shipmentId", "", "getImageList", "Landroidx/lifecycle/LiveData;", "", "Lcom/fli/elogistic/driver/models/orders/ImageListModel;", "type", "", "insertImageList", "images", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_stagingDebug"})
public abstract interface ImageListDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertImageList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fli.elogistic.driver.models.orders.ImageListModel> images);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ImageListModel where shipmentId = :shipmentId AND type = :type")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.fli.elogistic.driver.models.orders.ImageListModel>> getImageList(long shipmentId, @org.jetbrains.annotations.NotNull()
    java.lang.String type);
    
    @androidx.room.Query(value = "DELETE FROM ImageListModel where shipmentId = :shipmentId")
    public abstract void deleteImagesFromDb(long shipmentId);
}