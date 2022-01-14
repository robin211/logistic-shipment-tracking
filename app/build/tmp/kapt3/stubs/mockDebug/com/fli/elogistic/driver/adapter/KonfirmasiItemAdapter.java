package com.fli.elogistic.driver.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0012B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0016J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u001c\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/fli/elogistic/driver/adapter/KonfirmasiItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/fli/elogistic/driver/adapter/KonfirmasiItemAdapter$KonfirmasiItemHolder;", "listItemKonfirmasi", "Ljava/util/ArrayList;", "Lcom/fli/elogistic/driver/models/shipment/ShipmentModel;", "status", "", "(Ljava/util/ArrayList;I)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "KonfirmasiItemHolder", "app_mockDebug"})
public final class KonfirmasiItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.fli.elogistic.driver.adapter.KonfirmasiItemAdapter.KonfirmasiItemHolder> {
    private java.util.ArrayList<com.fli.elogistic.driver.models.shipment.ShipmentModel> listItemKonfirmasi;
    private int status;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.fli.elogistic.driver.adapter.KonfirmasiItemAdapter.KonfirmasiItemHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.adapter.KonfirmasiItemAdapter.KonfirmasiItemHolder holder, int position) {
    }
    
    public KonfirmasiItemAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fli.elogistic.driver.models.shipment.ShipmentModel> listItemKonfirmasi, int status) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\fH\u0002J\f\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/fli/elogistic/driver/adapter/KonfirmasiItemAdapter$KonfirmasiItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Lcom/fli/elogistic/driver/adapter/KonfirmasiItemAdapter;Landroid/view/View;)V", "item", "Lcom/fli/elogistic/driver/models/shipment/ShipmentModel;", "view", "bindLocation", "", "getDateWithServerTimeStamp", "Ljava/util/Date;", "", "getStringTimeStampWithDate", "app_mockDebug"})
    public final class KonfirmasiItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.view.View view;
        private com.fli.elogistic.driver.models.shipment.ShipmentModel item;
        
        private final java.util.Date getDateWithServerTimeStamp(java.lang.String $this$getDateWithServerTimeStamp) {
            return null;
        }
        
        private final java.lang.String getStringTimeStampWithDate(java.util.Date $this$getStringTimeStampWithDate) {
            return null;
        }
        
        public final void bindLocation(@org.jetbrains.annotations.NotNull()
        com.fli.elogistic.driver.models.shipment.ShipmentModel item) {
        }
        
        public KonfirmasiItemHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
}