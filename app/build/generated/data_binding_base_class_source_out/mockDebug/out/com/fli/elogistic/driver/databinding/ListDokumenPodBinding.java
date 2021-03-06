// Generated by view binder compiler. Do not edit!
package com.fli.elogistic.driver.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.fli.elogistic.driver.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListDokumenPodBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView additioinalText;

  @NonNull
  public final ImageView btnCatatan;

  @NonNull
  public final ImageView btnDelete;

  @NonNull
  public final ImageView btnEdit;

  @NonNull
  public final ImageView btnView;

  @NonNull
  public final TextView txtNamaDokumen;

  @NonNull
  public final TextView txtTipeDokumen;

  private ListDokumenPodBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView additioinalText, @NonNull ImageView btnCatatan,
      @NonNull ImageView btnDelete, @NonNull ImageView btnEdit, @NonNull ImageView btnView,
      @NonNull TextView txtNamaDokumen, @NonNull TextView txtTipeDokumen) {
    this.rootView = rootView;
    this.additioinalText = additioinalText;
    this.btnCatatan = btnCatatan;
    this.btnDelete = btnDelete;
    this.btnEdit = btnEdit;
    this.btnView = btnView;
    this.txtNamaDokumen = txtNamaDokumen;
    this.txtTipeDokumen = txtTipeDokumen;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListDokumenPodBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListDokumenPodBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_dokumen_pod, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListDokumenPodBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.additioinal_text;
      TextView additioinalText = rootView.findViewById(id);
      if (additioinalText == null) {
        break missingId;
      }

      id = R.id.btn_catatan;
      ImageView btnCatatan = rootView.findViewById(id);
      if (btnCatatan == null) {
        break missingId;
      }

      id = R.id.btn_delete;
      ImageView btnDelete = rootView.findViewById(id);
      if (btnDelete == null) {
        break missingId;
      }

      id = R.id.btn_edit;
      ImageView btnEdit = rootView.findViewById(id);
      if (btnEdit == null) {
        break missingId;
      }

      id = R.id.btn_view;
      ImageView btnView = rootView.findViewById(id);
      if (btnView == null) {
        break missingId;
      }

      id = R.id.txt_nama_dokumen;
      TextView txtNamaDokumen = rootView.findViewById(id);
      if (txtNamaDokumen == null) {
        break missingId;
      }

      id = R.id.txt_tipe_dokumen;
      TextView txtTipeDokumen = rootView.findViewById(id);
      if (txtTipeDokumen == null) {
        break missingId;
      }

      return new ListDokumenPodBinding((ConstraintLayout) rootView, additioinalText, btnCatatan,
          btnDelete, btnEdit, btnView, txtNamaDokumen, txtTipeDokumen);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
