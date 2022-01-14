package com.fli.elogistic.driver.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010K\u001a\u00020LJ\b\u0010M\u001a\u00020LH\u0002J\u0010\u0010N\u001a\u00020L2\u0006\u0010=\u001a\u00020>H\u0002J\u0006\u0010O\u001a\u00020LJ\u0010\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u0004H\u0002J\b\u0010R\u001a\u00020LH\u0002J\b\u0010S\u001a\u00020TH\u0002J\u001e\u0010U\u001a\u00020L2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\u001dJ.\u0010Z\u001a\u00020L2\u0006\u0010[\u001a\u00020\\2\u0006\u0010=\u001a\u00020>2\u0006\u0010]\u001a\u00020+2\u0006\u0010^\u001a\u00020\u00042\u0006\u0010C\u001a\u00020+J\b\u0010_\u001a\u00020LH\u0002J\b\u0010`\u001a\u00020LH\u0016J\u0012\u0010a\u001a\u00020L2\b\u0010b\u001a\u0004\u0018\u00010cH\u0014J\b\u0010d\u001a\u00020LH\u0014J\b\u0010e\u001a\u00020LH\u0014J\u000e\u0010f\u001a\u00020L2\u0006\u0010g\u001a\u00020\u0004J\u000e\u0010h\u001a\u00020L2\u0006\u0010i\u001a\u00020\u001dJ\u0016\u0010j\u001a\u00020L2\u0006\u0010k\u001a\u00020\u00042\u0006\u0010l\u001a\u00020\u001dJ \u0010m\u001a\u00020L2\u0006\u0010n\u001a\u00020\u001d2\u0006\u0010o\u001a\u00020+2\u0006\u0010p\u001a\u00020+H\u0002J(\u0010q\u001a\u00020L2\u0006\u0010n\u001a\u00020\u001d2\u0006\u0010r\u001a\u00020\u001d2\u0006\u0010o\u001a\u00020+2\u0006\u0010p\u001a\u00020+H\u0002J\u000e\u0010s\u001a\u00020+2\u0006\u0010t\u001a\u00020\u0004J\u000e\u0010u\u001a\u0004\u0018\u00010v*\u00020\u001dH\u0002J\f\u0010w\u001a\u00020\u001d*\u00020vH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\'\u001a\u0004\b$\u0010%R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R*\u0010/\u001a\u0012\u0012\u0004\u0012\u00020100j\b\u0012\u0004\u0012\u000201`2X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020>X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010,\"\u0004\bE\u0010.R\u001b\u0010F\u001a\u00020G8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bJ\u0010\'\u001a\u0004\bH\u0010I\u00a8\u0006x"}, d2 = {"Lcom/fli/elogistic/driver/ui/activities/PengirimanDetailActivity;", "Lcom/fli/elogistic/driver/ui/activities/BaseActivity;", "()V", "FUNCTION_TYPE_BERANGKAT_PENGIRIMAN", "", "getFUNCTION_TYPE_BERANGKAT_PENGIRIMAN", "()I", "FUNCTION_TYPE_BERANGKAT_PENJEMPUTAN", "getFUNCTION_TYPE_BERANGKAT_PENJEMPUTAN", "FUNCTION_TYPE_SAMPAI_PENGIRIMAN", "getFUNCTION_TYPE_SAMPAI_PENGIRIMAN", "FUNCTION_TYPE_SAMPAI_PENJEMPUTAN", "getFUNCTION_TYPE_SAMPAI_PENJEMPUTAN", "FUNCTION_TYPE_SELESAI", "getFUNCTION_TYPE_SELESAI", "binding", "Lcom/fli/elogistic/driver/databinding/ActivityPengirimanDetailBinding;", "getBinding", "()Lcom/fli/elogistic/driver/databinding/ActivityPengirimanDetailBinding;", "setBinding", "(Lcom/fli/elogistic/driver/databinding/ActivityPengirimanDetailBinding;)V", "currentShipmentPosition", "getCurrentShipmentPosition", "setCurrentShipmentPosition", "(I)V", "current_location_id", "getCurrent_location_id", "setCurrent_location_id", "current_location_name", "", "getCurrent_location_name", "()Ljava/lang/String;", "setCurrent_location_name", "(Ljava/lang/String;)V", "detailPerLocationViewModel", "Lcom/fli/elogistic/driver/viewmodel/DetailPerLocationViewModel;", "getDetailPerLocationViewModel", "()Lcom/fli/elogistic/driver/viewmodel/DetailPerLocationViewModel;", "detailPerLocationViewModel$delegate", "Lkotlin/Lazy;", "handler", "Landroid/os/Handler;", "isGettingDetail", "", "()Z", "setGettingDetail", "(Z)V", "listDetailPerLocationModels", "Ljava/util/ArrayList;", "Lcom/fli/elogistic/driver/models/shipment/DetailPerLocationModel;", "Lkotlin/collections/ArrayList;", "getListDetailPerLocationModels", "()Ljava/util/ArrayList;", "setListDetailPerLocationModels", "(Ljava/util/ArrayList;)V", "loadingDialog", "Landroid/app/AlertDialog;", "getLoadingDialog", "()Landroid/app/AlertDialog;", "setLoadingDialog", "(Landroid/app/AlertDialog;)V", "model", "Lcom/fli/elogistic/driver/models/shipment/ShipmentModel;", "getModel", "()Lcom/fli/elogistic/driver/models/shipment/ShipmentModel;", "setModel", "(Lcom/fli/elogistic/driver/models/shipment/ShipmentModel;)V", "showPhoto", "getShowPhoto", "setShowPhoto", "updateStatusViewModel", "Lcom/fli/elogistic/driver/viewmodel/UpdateStatusViewModel;", "getUpdateStatusViewModel", "()Lcom/fli/elogistic/driver/viewmodel/UpdateStatusViewModel;", "updateStatusViewModel$delegate", "btnKirimGone", "", "buildLoadingDialog", "determineActiveDetailButtons", "finishActivity", "getCurrentLocationRadius", "currentLocation", "getDetailCargo", "getTimeOffset", "", "goesToGoogleMaps", "lat", "", "lon", "label", "gotoLokasiPenjemputan", "locationAddressModel", "Lcom/fli/elogistic/driver/models/LocationAddressModel;", "isPenjemputan", "currentSequence", "initView", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRestart", "onResume", "setBtnFunction", "functionType", "setBtnText", "text", "setCurrentLocationInfo", "id", "name", "startUpdateSequence", "status", "goesToBast", "updateRedis", "updateStatus", "currentLocationName", "validateDriverPosition", "radiusCalculation", "getDateWithServerTimeStamp", "Ljava/util/Date;", "getStringTimeStampWithDate", "app_mockDebug"})
public final class PengirimanDetailActivity extends com.fli.elogistic.driver.ui.activities.BaseActivity {
    public com.fli.elogistic.driver.databinding.ActivityPengirimanDetailBinding binding;
    private final kotlin.Lazy detailPerLocationViewModel$delegate = null;
    private final kotlin.Lazy updateStatusViewModel$delegate = null;
    public android.app.AlertDialog loadingDialog;
    public java.util.ArrayList<com.fli.elogistic.driver.models.shipment.DetailPerLocationModel> listDetailPerLocationModels;
    private int currentShipmentPosition = -1;
    private final int FUNCTION_TYPE_BERANGKAT_PENJEMPUTAN = 1;
    private final int FUNCTION_TYPE_SAMPAI_PENJEMPUTAN = 2;
    private final int FUNCTION_TYPE_BERANGKAT_PENGIRIMAN = 3;
    private final int FUNCTION_TYPE_SAMPAI_PENGIRIMAN = 4;
    private final int FUNCTION_TYPE_SELESAI = 5;
    public com.fli.elogistic.driver.models.shipment.ShipmentModel model;
    private int current_location_id = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String current_location_name = "";
    private boolean isGettingDetail = true;
    private boolean showPhoto = false;
    private final android.os.Handler handler = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.databinding.ActivityPengirimanDetailBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.databinding.ActivityPengirimanDetailBinding p0) {
    }
    
    private final com.fli.elogistic.driver.viewmodel.DetailPerLocationViewModel getDetailPerLocationViewModel() {
        return null;
    }
    
    private final com.fli.elogistic.driver.viewmodel.UpdateStatusViewModel getUpdateStatusViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.AlertDialog getLoadingDialog() {
        return null;
    }
    
    public final void setLoadingDialog(@org.jetbrains.annotations.NotNull()
    android.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fli.elogistic.driver.models.shipment.DetailPerLocationModel> getListDetailPerLocationModels() {
        return null;
    }
    
    public final void setListDetailPerLocationModels(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fli.elogistic.driver.models.shipment.DetailPerLocationModel> p0) {
    }
    
    public final int getCurrentShipmentPosition() {
        return 0;
    }
    
    public final void setCurrentShipmentPosition(int p0) {
    }
    
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
    
    public final int getFUNCTION_TYPE_SELESAI() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.models.shipment.ShipmentModel getModel() {
        return null;
    }
    
    public final void setModel(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.shipment.ShipmentModel p0) {
    }
    
    public final int getCurrent_location_id() {
        return 0;
    }
    
    public final void setCurrent_location_id(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrent_location_name() {
        return null;
    }
    
    public final void setCurrent_location_name(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isGettingDetail() {
        return false;
    }
    
    public final void setGettingDetail(boolean p0) {
    }
    
    public final boolean getShowPhoto() {
        return false;
    }
    
    public final void setShowPhoto(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    public final void gotoLokasiPenjemputan(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.LocationAddressModel locationAddressModel, @org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.shipment.ShipmentModel model, boolean isPenjemputan, int currentSequence, boolean showPhoto) {
    }
    
    private final java.util.Date getDateWithServerTimeStamp(java.lang.String $this$getDateWithServerTimeStamp) {
        return null;
    }
    
    private final java.lang.String getStringTimeStampWithDate(java.util.Date $this$getStringTimeStampWithDate) {
        return null;
    }
    
    public final void setBtnText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void setBtnFunction(int functionType) {
    }
    
    private final void startUpdateSequence(java.lang.String status, boolean goesToBast, boolean updateRedis) {
    }
    
    private final void updateStatus(java.lang.String status, java.lang.String currentLocationName, boolean goesToBast, boolean updateRedis) {
    }
    
    private final void getDetailCargo() {
    }
    
    private final int getCurrentLocationRadius(int currentLocation) {
        return 0;
    }
    
    public final void setCurrentLocationInfo(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    private final void determineActiveDetailButtons(com.fli.elogistic.driver.models.shipment.ShipmentModel model) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onRestart() {
    }
    
    public final void goesToGoogleMaps(double lat, double lon, @org.jetbrains.annotations.NotNull()
    java.lang.String label) {
    }
    
    public final void finishActivity() {
    }
    
    public final boolean validateDriverPosition(int radiusCalculation) {
        return false;
    }
    
    private final void buildLoadingDialog() {
    }
    
    private final long getTimeOffset() {
        return 0L;
    }
    
    public final void btnKirimGone() {
    }
    
    public PengirimanDetailActivity() {
        super();
    }
}