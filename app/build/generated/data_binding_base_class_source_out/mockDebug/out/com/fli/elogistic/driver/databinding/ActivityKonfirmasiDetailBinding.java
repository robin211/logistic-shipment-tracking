// Generated by view binder compiler. Do not edit!
package com.fli.elogistic.driver.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.fli.elogistic.driver.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityKonfirmasiDetailBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView bgToolbar;

  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final RelativeLayout btnTerima;

  @NonNull
  public final ImageView icCalendar;

  @NonNull
  public final ImageView icDrop;

  @NonNull
  public final ImageView icFinal;

  @NonNull
  public final ImageView icInitial;

  @NonNull
  public final ImageView icPickup;

  @NonNull
  public final RelativeLayout layout;

  @NonNull
  public final TextView lokasiTujuan;

  @NonNull
  public final ImageView mapsFinal;

  @NonNull
  public final ImageView mapsInitial;

  @NonNull
  public final TextView noKargo;

  @NonNull
  public final TextView noKendaraan;

  @NonNull
  public final RecyclerView rvDrops;

  @NonNull
  public final RecyclerView rvPickups;

  @NonNull
  public final TextView tanggalPengambilan;

  @NonNull
  public final TextView tempatAsal;

  @NonNull
  public final TextView tipeKendaraan;

  @NonNull
  public final TextView title;

  @NonNull
  public final RelativeLayout toolbar;

  @NonNull
  public final TextView txtFinalAddress;

  @NonNull
  public final TextView txtFinalLocation;

  @NonNull
  public final TextView txtInitialAddress;

  @NonNull
  public final TextView txtInitialLocation;

  @NonNull
  public final TextView txtJamPengambilan;

  @NonNull
  public final TextView txtKonfirmasi;

  @NonNull
  public final TextView txtNoKargo;

  @NonNull
  public final TextView txtNoKendaraan;

  @NonNull
  public final TextView txtTanggalPengambilan;

  @NonNull
  public final TextView txtTipeKendaraan;

  @NonNull
  public final View view1;

  @NonNull
  public final View view2;

  @NonNull
  public final View view3;

  @NonNull
  public final View view4;

  private ActivityKonfirmasiDetailBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView bgToolbar, @NonNull ImageView btnBack, @NonNull RelativeLayout btnTerima,
      @NonNull ImageView icCalendar, @NonNull ImageView icDrop, @NonNull ImageView icFinal,
      @NonNull ImageView icInitial, @NonNull ImageView icPickup, @NonNull RelativeLayout layout,
      @NonNull TextView lokasiTujuan, @NonNull ImageView mapsFinal, @NonNull ImageView mapsInitial,
      @NonNull TextView noKargo, @NonNull TextView noKendaraan, @NonNull RecyclerView rvDrops,
      @NonNull RecyclerView rvPickups, @NonNull TextView tanggalPengambilan,
      @NonNull TextView tempatAsal, @NonNull TextView tipeKendaraan, @NonNull TextView title,
      @NonNull RelativeLayout toolbar, @NonNull TextView txtFinalAddress,
      @NonNull TextView txtFinalLocation, @NonNull TextView txtInitialAddress,
      @NonNull TextView txtInitialLocation, @NonNull TextView txtJamPengambilan,
      @NonNull TextView txtKonfirmasi, @NonNull TextView txtNoKargo,
      @NonNull TextView txtNoKendaraan, @NonNull TextView txtTanggalPengambilan,
      @NonNull TextView txtTipeKendaraan, @NonNull View view1, @NonNull View view2,
      @NonNull View view3, @NonNull View view4) {
    this.rootView = rootView;
    this.bgToolbar = bgToolbar;
    this.btnBack = btnBack;
    this.btnTerima = btnTerima;
    this.icCalendar = icCalendar;
    this.icDrop = icDrop;
    this.icFinal = icFinal;
    this.icInitial = icInitial;
    this.icPickup = icPickup;
    this.layout = layout;
    this.lokasiTujuan = lokasiTujuan;
    this.mapsFinal = mapsFinal;
    this.mapsInitial = mapsInitial;
    this.noKargo = noKargo;
    this.noKendaraan = noKendaraan;
    this.rvDrops = rvDrops;
    this.rvPickups = rvPickups;
    this.tanggalPengambilan = tanggalPengambilan;
    this.tempatAsal = tempatAsal;
    this.tipeKendaraan = tipeKendaraan;
    this.title = title;
    this.toolbar = toolbar;
    this.txtFinalAddress = txtFinalAddress;
    this.txtFinalLocation = txtFinalLocation;
    this.txtInitialAddress = txtInitialAddress;
    this.txtInitialLocation = txtInitialLocation;
    this.txtJamPengambilan = txtJamPengambilan;
    this.txtKonfirmasi = txtKonfirmasi;
    this.txtNoKargo = txtNoKargo;
    this.txtNoKendaraan = txtNoKendaraan;
    this.txtTanggalPengambilan = txtTanggalPengambilan;
    this.txtTipeKendaraan = txtTipeKendaraan;
    this.view1 = view1;
    this.view2 = view2;
    this.view3 = view3;
    this.view4 = view4;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityKonfirmasiDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityKonfirmasiDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_konfirmasi_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityKonfirmasiDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bg_toolbar;
      ImageView bgToolbar = rootView.findViewById(id);
      if (bgToolbar == null) {
        break missingId;
      }

      id = R.id.btn_back;
      ImageView btnBack = rootView.findViewById(id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btn_terima;
      RelativeLayout btnTerima = rootView.findViewById(id);
      if (btnTerima == null) {
        break missingId;
      }

      id = R.id.ic_calendar;
      ImageView icCalendar = rootView.findViewById(id);
      if (icCalendar == null) {
        break missingId;
      }

      id = R.id.ic_drop;
      ImageView icDrop = rootView.findViewById(id);
      if (icDrop == null) {
        break missingId;
      }

      id = R.id.ic_final;
      ImageView icFinal = rootView.findViewById(id);
      if (icFinal == null) {
        break missingId;
      }

      id = R.id.ic_initial;
      ImageView icInitial = rootView.findViewById(id);
      if (icInitial == null) {
        break missingId;
      }

      id = R.id.ic_pickup;
      ImageView icPickup = rootView.findViewById(id);
      if (icPickup == null) {
        break missingId;
      }

      RelativeLayout layout = (RelativeLayout) rootView;

      id = R.id.lokasi_tujuan;
      TextView lokasiTujuan = rootView.findViewById(id);
      if (lokasiTujuan == null) {
        break missingId;
      }

      id = R.id.maps_final;
      ImageView mapsFinal = rootView.findViewById(id);
      if (mapsFinal == null) {
        break missingId;
      }

      id = R.id.maps_initial;
      ImageView mapsInitial = rootView.findViewById(id);
      if (mapsInitial == null) {
        break missingId;
      }

      id = R.id.no_kargo;
      TextView noKargo = rootView.findViewById(id);
      if (noKargo == null) {
        break missingId;
      }

      id = R.id.no_kendaraan;
      TextView noKendaraan = rootView.findViewById(id);
      if (noKendaraan == null) {
        break missingId;
      }

      id = R.id.rv_drops;
      RecyclerView rvDrops = rootView.findViewById(id);
      if (rvDrops == null) {
        break missingId;
      }

      id = R.id.rv_pickups;
      RecyclerView rvPickups = rootView.findViewById(id);
      if (rvPickups == null) {
        break missingId;
      }

      id = R.id.tanggal_pengambilan;
      TextView tanggalPengambilan = rootView.findViewById(id);
      if (tanggalPengambilan == null) {
        break missingId;
      }

      id = R.id.tempat_asal;
      TextView tempatAsal = rootView.findViewById(id);
      if (tempatAsal == null) {
        break missingId;
      }

      id = R.id.tipe_kendaraan;
      TextView tipeKendaraan = rootView.findViewById(id);
      if (tipeKendaraan == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = rootView.findViewById(id);
      if (title == null) {
        break missingId;
      }

      id = R.id.toolbar;
      RelativeLayout toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.txt_final_address;
      TextView txtFinalAddress = rootView.findViewById(id);
      if (txtFinalAddress == null) {
        break missingId;
      }

      id = R.id.txt_final_location;
      TextView txtFinalLocation = rootView.findViewById(id);
      if (txtFinalLocation == null) {
        break missingId;
      }

      id = R.id.txt_initial_address;
      TextView txtInitialAddress = rootView.findViewById(id);
      if (txtInitialAddress == null) {
        break missingId;
      }

      id = R.id.txt_initial_location;
      TextView txtInitialLocation = rootView.findViewById(id);
      if (txtInitialLocation == null) {
        break missingId;
      }

      id = R.id.txt_jam_pengambilan;
      TextView txtJamPengambilan = rootView.findViewById(id);
      if (txtJamPengambilan == null) {
        break missingId;
      }

      id = R.id.txt_konfirmasi;
      TextView txtKonfirmasi = rootView.findViewById(id);
      if (txtKonfirmasi == null) {
        break missingId;
      }

      id = R.id.txt_no_kargo;
      TextView txtNoKargo = rootView.findViewById(id);
      if (txtNoKargo == null) {
        break missingId;
      }

      id = R.id.txt_no_kendaraan;
      TextView txtNoKendaraan = rootView.findViewById(id);
      if (txtNoKendaraan == null) {
        break missingId;
      }

      id = R.id.txt_tanggal_pengambilan;
      TextView txtTanggalPengambilan = rootView.findViewById(id);
      if (txtTanggalPengambilan == null) {
        break missingId;
      }

      id = R.id.txt_tipe_kendaraan;
      TextView txtTipeKendaraan = rootView.findViewById(id);
      if (txtTipeKendaraan == null) {
        break missingId;
      }

      id = R.id.view_1;
      View view1 = rootView.findViewById(id);
      if (view1 == null) {
        break missingId;
      }

      id = R.id.view_2;
      View view2 = rootView.findViewById(id);
      if (view2 == null) {
        break missingId;
      }

      id = R.id.view_3;
      View view3 = rootView.findViewById(id);
      if (view3 == null) {
        break missingId;
      }

      id = R.id.view_4;
      View view4 = rootView.findViewById(id);
      if (view4 == null) {
        break missingId;
      }

      return new ActivityKonfirmasiDetailBinding((RelativeLayout) rootView, bgToolbar, btnBack,
          btnTerima, icCalendar, icDrop, icFinal, icInitial, icPickup, layout, lokasiTujuan,
          mapsFinal, mapsInitial, noKargo, noKendaraan, rvDrops, rvPickups, tanggalPengambilan,
          tempatAsal, tipeKendaraan, title, toolbar, txtFinalAddress, txtFinalLocation,
          txtInitialAddress, txtInitialLocation, txtJamPengambilan, txtKonfirmasi, txtNoKargo,
          txtNoKendaraan, txtTanggalPengambilan, txtTipeKendaraan, view1, view2, view3, view4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
