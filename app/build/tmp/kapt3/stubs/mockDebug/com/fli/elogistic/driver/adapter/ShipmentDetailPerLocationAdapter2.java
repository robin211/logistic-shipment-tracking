package com.fli.elogistic.driver.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u00010B]\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u0006\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0016\u0010$\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0016\u0010%\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\b\u0010&\u001a\u00020#H\u0016J\u001c\u0010\'\u001a\u00020\u001f2\n\u0010(\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020#H\u0016J\u001c\u0010)\u001a\u00060\u0002R\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020#H\u0016J\u0016\u0010-\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0016\u0010.\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0016\u0010/\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0014\"\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\r\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0014\"\u0004\b\u0019\u0010\u0016R*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/fli/elogistic/driver/adapter/ShipmentDetailPerLocationAdapter2;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/fli/elogistic/driver/adapter/ShipmentDetailPerLocationAdapter2$DetailPerLocationHolder;", "listDetailPerLocation", "Ljava/util/ArrayList;", "Lcom/fli/elogistic/driver/models/shipment/DetailPerLocationWithPictureModel;", "Lkotlin/collections/ArrayList;", "isPenjemputan", "", "currentSequence", "", "isCurrentSequenceFinish", "isCurrentSequenceBASTSubmitted", "isSuspended", "listButtonVisibility", "(Ljava/util/ArrayList;ZJZZZLjava/util/ArrayList;)V", "getCurrentSequence", "()J", "setCurrentSequence", "(J)V", "()Z", "setCurrentSequenceBASTSubmitted", "(Z)V", "setCurrentSequenceFinish", "setPenjemputan", "setSuspended", "getListButtonVisibility", "()Ljava/util/ArrayList;", "setListButtonVisibility", "(Ljava/util/ArrayList;)V", "addImageDokumentasi", "", "image", "", "position", "", "addImagePerintahPengiriman", "addImageSuratJalan", "getItemCount", "onBindViewHolder", "holderDetailPer", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeImageDokumentasi", "removeImagePerintahPengiriman", "removeImageSuratJalan", "DetailPerLocationHolder", "app_mockDebug"})
public final class ShipmentDetailPerLocationAdapter2 extends androidx.recyclerview.widget.RecyclerView.Adapter<com.fli.elogistic.driver.adapter.ShipmentDetailPerLocationAdapter2.DetailPerLocationHolder> {
    private java.util.ArrayList<com.fli.elogistic.driver.models.shipment.DetailPerLocationWithPictureModel> listDetailPerLocation;
    private boolean isPenjemputan;
    private long currentSequence;
    private boolean isCurrentSequenceFinish;
    private boolean isCurrentSequenceBASTSubmitted;
    private boolean isSuspended;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.Boolean> listButtonVisibility;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.fli.elogistic.driver.adapter.ShipmentDetailPerLocationAdapter2.DetailPerLocationHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.adapter.ShipmentDetailPerLocationAdapter2.DetailPerLocationHolder holderDetailPer, int position) {
    }
    
    public final void addImageSuratJalan(@org.jetbrains.annotations.NotNull()
    java.lang.Object image, int position) {
    }
    
    public final void removeImageSuratJalan(@org.jetbrains.annotations.NotNull()
    java.lang.Object image, int position) {
    }
    
    public final void addImageDokumentasi(@org.jetbrains.annotations.NotNull()
    java.lang.Object image, int position) {
    }
    
    public final void removeImageDokumentasi(@org.jetbrains.annotations.NotNull()
    java.lang.Object image, int position) {
    }
    
    public final void addImagePerintahPengiriman(@org.jetbrains.annotations.NotNull()
    java.lang.Object image, int position) {
    }
    
    public final void removeImagePerintahPengiriman(@org.jetbrains.annotations.NotNull()
    java.lang.Object image, int position) {
    }
    
    public final boolean isPenjemputan() {
        return false;
    }
    
    public final void setPenjemputan(boolean p0) {
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
    
    public final boolean isSuspended() {
        return false;
    }
    
    public final void setSuspended(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Boolean> getListButtonVisibility() {
        return null;
    }
    
    public final void setListButtonVisibility(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Boolean> p0) {
    }
    
    public ShipmentDetailPerLocationAdapter2(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fli.elogistic.driver.models.shipment.DetailPerLocationWithPictureModel> listDetailPerLocation, boolean isPenjemputan, long currentSequence, boolean isCurrentSequenceFinish, boolean isCurrentSequenceBASTSubmitted, boolean isSuspended, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Boolean> listButtonVisibility) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/fli/elogistic/driver/adapter/ShipmentDetailPerLocationAdapter2$DetailPerLocationHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Lcom/fli/elogistic/driver/adapter/ShipmentDetailPerLocationAdapter2;Landroid/view/View;)V", "OPERATION_CAPTURE_PHOTO_DOKUMENTASI", "", "OPERATION_CAPTURE_PHOTO_PERINTAH_PENGIRIMAN", "OPERATION_CAPTURE_PHOTO_SURAT_JALAN", "item", "Lcom/fli/elogistic/driver/models/shipment/DetailPerLocationWithPictureModel;", "position", "Ljava/lang/Integer;", "view", "bindLocation", "", "takePicture", "actionCode", "app_mockDebug"})
    public final class DetailPerLocationHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.view.View view;
        private com.fli.elogistic.driver.models.shipment.DetailPerLocationWithPictureModel item;
        private java.lang.Integer position = 0;
        private final int OPERATION_CAPTURE_PHOTO_SURAT_JALAN = 1;
        private final int OPERATION_CAPTURE_PHOTO_DOKUMENTASI = 2;
        private final int OPERATION_CAPTURE_PHOTO_PERINTAH_PENGIRIMAN = 3;
        
        private final void takePicture(int actionCode) {
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n", "UseCompatLoadingForDrawables"})
        public final void bindLocation(@org.jetbrains.annotations.NotNull()
        com.fli.elogistic.driver.models.shipment.DetailPerLocationWithPictureModel item, int position) {
        }
        
        public DetailPerLocationHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
}