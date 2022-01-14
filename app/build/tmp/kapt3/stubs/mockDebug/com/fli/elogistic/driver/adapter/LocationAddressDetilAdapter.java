package com.fli.elogistic.driver.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001(B7\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001f\u001a\u00020\u000eH\u0016J\u001c\u0010 \u001a\u00020!2\n\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020\u000eH\u0016J\u001c\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u000eH\u0016R\u0014\u0010\r\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0017\"\u0004\b\u001a\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/fli/elogistic/driver/adapter/LocationAddressDetilAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/fli/elogistic/driver/adapter/LocationAddressDetilAdapter$LocationAddressHolder;", "listLocationAddress", "Ljava/util/ArrayList;", "Lcom/fli/elogistic/driver/models/LocationAddressModel;", "Lkotlin/collections/ArrayList;", "isPenjemputan", "", "konfirmasiOrderModel", "Lcom/fli/elogistic/driver/models/shipment/ShipmentModel;", "isFinished", "(Ljava/util/ArrayList;ZLcom/fli/elogistic/driver/models/shipment/ShipmentModel;Z)V", "FUNCTION_TYPE_BERANGKAT_PENGIRIMAN", "", "getFUNCTION_TYPE_BERANGKAT_PENGIRIMAN", "()I", "FUNCTION_TYPE_BERANGKAT_PENJEMPUTAN", "getFUNCTION_TYPE_BERANGKAT_PENJEMPUTAN", "FUNCTION_TYPE_SAMPAI_PENGIRIMAN", "getFUNCTION_TYPE_SAMPAI_PENGIRIMAN", "FUNCTION_TYPE_SAMPAI_PENJEMPUTAN", "getFUNCTION_TYPE_SAMPAI_PENJEMPUTAN", "()Z", "setFinished", "(Z)V", "setPenjemputan", "getKonfirmasiOrderModel", "()Lcom/fli/elogistic/driver/models/shipment/ShipmentModel;", "setKonfirmasiOrderModel", "(Lcom/fli/elogistic/driver/models/shipment/ShipmentModel;)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "LocationAddressHolder", "app_mockDebug"})
public final class LocationAddressDetilAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.fli.elogistic.driver.adapter.LocationAddressDetilAdapter.LocationAddressHolder> {
    private final int FUNCTION_TYPE_BERANGKAT_PENJEMPUTAN = 1;
    private final int FUNCTION_TYPE_SAMPAI_PENJEMPUTAN = 2;
    private final int FUNCTION_TYPE_BERANGKAT_PENGIRIMAN = 3;
    private final int FUNCTION_TYPE_SAMPAI_PENGIRIMAN = 4;
    private java.util.ArrayList<com.fli.elogistic.driver.models.LocationAddressModel> listLocationAddress;
    private boolean isPenjemputan;
    @org.jetbrains.annotations.Nullable()
    private com.fli.elogistic.driver.models.shipment.ShipmentModel konfirmasiOrderModel;
    private boolean isFinished;
    
    public final int getFUNCTION_TYPE_BERANGKAT_PENJEMPUTAN() {
        return 0;
    }
    
    public final int getFUNCTION_TYPE_SAMPAI_PENJEMPUTAN() {
        return 0;
    }
    
    public final int getFUNCTION_TYPE_BERANGKAT_PENGIRIMAN() {
        return 0;
    }
    
    public final int getFUNCTION_TYPE_SAMPAI_PENGIRIMAN() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.fli.elogistic.driver.adapter.LocationAddressDetilAdapter.LocationAddressHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.adapter.LocationAddressDetilAdapter.LocationAddressHolder holder, int position) {
    }
    
    public final boolean isPenjemputan() {
        return false;
    }
    
    public final void setPenjemputan(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fli.elogistic.driver.models.shipment.ShipmentModel getKonfirmasiOrderModel() {
        return null;
    }
    
    public final void setKonfirmasiOrderModel(@org.jetbrains.annotations.Nullable()
    com.fli.elogistic.driver.models.shipment.ShipmentModel p0) {
    }
    
    public final boolean isFinished() {
        return false;
    }
    
    public final void setFinished(boolean p0) {
    }
    
    public LocationAddressDetilAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fli.elogistic.driver.models.LocationAddressModel> listLocationAddress, boolean isPenjemputan, @org.jetbrains.annotations.Nullable()
    com.fli.elogistic.driver.models.shipment.ShipmentModel konfirmasiOrderModel, boolean isFinished) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/fli/elogistic/driver/adapter/LocationAddressDetilAdapter$LocationAddressHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Lcom/fli/elogistic/driver/adapter/LocationAddressDetilAdapter;Landroid/view/View;)V", "item", "Lcom/fli/elogistic/driver/models/LocationAddressModel;", "position", "", "Ljava/lang/Integer;", "showPhoto", "", "view", "bindLocation", "", "app_mockDebug"})
    public final class LocationAddressHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.view.View view;
        private com.fli.elogistic.driver.models.LocationAddressModel item;
        private java.lang.Integer position = 0;
        private boolean showPhoto = false;
        
        public final void bindLocation(@org.jetbrains.annotations.NotNull()
        com.fli.elogistic.driver.models.LocationAddressModel item, int position) {
        }
        
        public LocationAddressHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
}