// Generated by view binder compiler. Do not edit!
package com.fli.elogistic.driver.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.fli.elogistic.driver.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUploadPODBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView bgToolbar;

  @NonNull
  public final LinearLayout btnAmbilGambar;

  @NonNull
  public final TextView btnBatal;

  @NonNull
  public final TextView btnSimpan;

  @NonNull
  public final TextView catatanTitle;

  @NonNull
  public final EditText etCatatan;

  @NonNull
  public final EditText etNamaDokumen;

  @NonNull
  public final RelativeLayout header;

  @NonNull
  public final ConstraintLayout layout;

  @NonNull
  public final RelativeLayout lokasiDropdown;

  @NonNull
  public final Spinner lokasiSpinner;

  @NonNull
  public final TextView namaDokumenTitle;

  @NonNull
  public final RecyclerView rvPhoto;

  @NonNull
  public final TextView spinnerLocationTitle;

  @NonNull
  public final TextView spinnerTitle;

  @NonNull
  public final RelativeLayout tipeDokumenDropdown;

  @NonNull
  public final Spinner tipeDokumenSpinner;

  @NonNull
  public final TextView title;

  private ActivityUploadPODBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView bgToolbar,
      @NonNull LinearLayout btnAmbilGambar, @NonNull TextView btnBatal, @NonNull TextView btnSimpan,
      @NonNull TextView catatanTitle, @NonNull EditText etCatatan, @NonNull EditText etNamaDokumen,
      @NonNull RelativeLayout header, @NonNull ConstraintLayout layout,
      @NonNull RelativeLayout lokasiDropdown, @NonNull Spinner lokasiSpinner,
      @NonNull TextView namaDokumenTitle, @NonNull RecyclerView rvPhoto,
      @NonNull TextView spinnerLocationTitle, @NonNull TextView spinnerTitle,
      @NonNull RelativeLayout tipeDokumenDropdown, @NonNull Spinner tipeDokumenSpinner,
      @NonNull TextView title) {
    this.rootView = rootView;
    this.bgToolbar = bgToolbar;
    this.btnAmbilGambar = btnAmbilGambar;
    this.btnBatal = btnBatal;
    this.btnSimpan = btnSimpan;
    this.catatanTitle = catatanTitle;
    this.etCatatan = etCatatan;
    this.etNamaDokumen = etNamaDokumen;
    this.header = header;
    this.layout = layout;
    this.lokasiDropdown = lokasiDropdown;
    this.lokasiSpinner = lokasiSpinner;
    this.namaDokumenTitle = namaDokumenTitle;
    this.rvPhoto = rvPhoto;
    this.spinnerLocationTitle = spinnerLocationTitle;
    this.spinnerTitle = spinnerTitle;
    this.tipeDokumenDropdown = tipeDokumenDropdown;
    this.tipeDokumenSpinner = tipeDokumenSpinner;
    this.title = title;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUploadPODBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUploadPODBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_upload_p_o_d, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUploadPODBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bg_toolbar;
      ImageView bgToolbar = rootView.findViewById(id);
      if (bgToolbar == null) {
        break missingId;
      }

      id = R.id.btn_ambil_gambar;
      LinearLayout btnAmbilGambar = rootView.findViewById(id);
      if (btnAmbilGambar == null) {
        break missingId;
      }

      id = R.id.btn_batal;
      TextView btnBatal = rootView.findViewById(id);
      if (btnBatal == null) {
        break missingId;
      }

      id = R.id.btn_simpan;
      TextView btnSimpan = rootView.findViewById(id);
      if (btnSimpan == null) {
        break missingId;
      }

      id = R.id.catatan_title;
      TextView catatanTitle = rootView.findViewById(id);
      if (catatanTitle == null) {
        break missingId;
      }

      id = R.id.et_catatan;
      EditText etCatatan = rootView.findViewById(id);
      if (etCatatan == null) {
        break missingId;
      }

      id = R.id.et_nama_dokumen;
      EditText etNamaDokumen = rootView.findViewById(id);
      if (etNamaDokumen == null) {
        break missingId;
      }

      id = R.id.header;
      RelativeLayout header = rootView.findViewById(id);
      if (header == null) {
        break missingId;
      }

      ConstraintLayout layout = (ConstraintLayout) rootView;

      id = R.id.lokasi_dropdown;
      RelativeLayout lokasiDropdown = rootView.findViewById(id);
      if (lokasiDropdown == null) {
        break missingId;
      }

      id = R.id.lokasi_spinner;
      Spinner lokasiSpinner = rootView.findViewById(id);
      if (lokasiSpinner == null) {
        break missingId;
      }

      id = R.id.nama_dokumen_title;
      TextView namaDokumenTitle = rootView.findViewById(id);
      if (namaDokumenTitle == null) {
        break missingId;
      }

      id = R.id.rv_photo;
      RecyclerView rvPhoto = rootView.findViewById(id);
      if (rvPhoto == null) {
        break missingId;
      }

      id = R.id.spinner_location_title;
      TextView spinnerLocationTitle = rootView.findViewById(id);
      if (spinnerLocationTitle == null) {
        break missingId;
      }

      id = R.id.spinner_title;
      TextView spinnerTitle = rootView.findViewById(id);
      if (spinnerTitle == null) {
        break missingId;
      }

      id = R.id.tipe_dokumen_dropdown;
      RelativeLayout tipeDokumenDropdown = rootView.findViewById(id);
      if (tipeDokumenDropdown == null) {
        break missingId;
      }

      id = R.id.tipe_dokumen_spinner;
      Spinner tipeDokumenSpinner = rootView.findViewById(id);
      if (tipeDokumenSpinner == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = rootView.findViewById(id);
      if (title == null) {
        break missingId;
      }

      return new ActivityUploadPODBinding((ConstraintLayout) rootView, bgToolbar, btnAmbilGambar,
          btnBatal, btnSimpan, catatanTitle, etCatatan, etNamaDokumen, header, layout,
          lokasiDropdown, lokasiSpinner, namaDokumenTitle, rvPhoto, spinnerLocationTitle,
          spinnerTitle, tipeDokumenDropdown, tipeDokumenSpinner, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
