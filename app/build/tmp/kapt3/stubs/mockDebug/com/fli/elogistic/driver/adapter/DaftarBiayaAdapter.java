package com.fli.elogistic.driver.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/fli/elogistic/driver/adapter/DaftarBiayaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/fli/elogistic/driver/adapter/DaftarBiayaAdapter$BiayaHolder;", "listBiayaOngkirModel", "Ljava/util/ArrayList;", "Lcom/fli/elogistic/driver/models/biayaDanTambahanOngkir/BiayaOngkirModel;", "Lkotlin/collections/ArrayList;", "isTambahan", "", "(Ljava/util/ArrayList;Z)V", "()Z", "setTambahan", "(Z)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "BiayaHolder", "app_mockDebug"})
public final class DaftarBiayaAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.fli.elogistic.driver.adapter.DaftarBiayaAdapter.BiayaHolder> {
    private java.util.ArrayList<com.fli.elogistic.driver.models.biayaDanTambahanOngkir.BiayaOngkirModel> listBiayaOngkirModel;
    private boolean isTambahan;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.fli.elogistic.driver.adapter.DaftarBiayaAdapter.BiayaHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.adapter.DaftarBiayaAdapter.BiayaHolder holder, int position) {
    }
    
    public final boolean isTambahan() {
        return false;
    }
    
    public final void setTambahan(boolean p0) {
    }
    
    public DaftarBiayaAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fli.elogistic.driver.models.biayaDanTambahanOngkir.BiayaOngkirModel> listBiayaOngkirModel, boolean isTambahan) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/fli/elogistic/driver/adapter/DaftarBiayaAdapter$BiayaHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Lcom/fli/elogistic/driver/adapter/DaftarBiayaAdapter;Landroid/view/View;)V", "item", "Lcom/fli/elogistic/driver/models/biayaDanTambahanOngkir/BiayaOngkirModel;", "view", "bindLocation", "", "position", "", "isEnabled", "", "app_mockDebug"})
    public final class BiayaHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.view.View view;
        private com.fli.elogistic.driver.models.biayaDanTambahanOngkir.BiayaOngkirModel item;
        
        public final void bindLocation(@org.jetbrains.annotations.NotNull()
        com.fli.elogistic.driver.models.biayaDanTambahanOngkir.BiayaOngkirModel item, int position, boolean isEnabled) {
        }
        
        public BiayaHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
}