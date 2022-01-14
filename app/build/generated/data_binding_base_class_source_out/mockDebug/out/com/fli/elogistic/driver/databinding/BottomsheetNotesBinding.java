// Generated by view binder compiler. Do not edit!
package com.fli.elogistic.driver.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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

public final class BottomsheetNotesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView btnCloseBottomsheet;

  @NonNull
  public final TextView btnSimpan;

  @NonNull
  public final EditText etBottomsheet;

  @NonNull
  public final TextView titleBottomsheet;

  private BottomsheetNotesBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView btnCloseBottomsheet, @NonNull TextView btnSimpan,
      @NonNull EditText etBottomsheet, @NonNull TextView titleBottomsheet) {
    this.rootView = rootView;
    this.btnCloseBottomsheet = btnCloseBottomsheet;
    this.btnSimpan = btnSimpan;
    this.etBottomsheet = etBottomsheet;
    this.titleBottomsheet = titleBottomsheet;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BottomsheetNotesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BottomsheetNotesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bottomsheet_notes, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BottomsheetNotesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_close_bottomsheet;
      ImageView btnCloseBottomsheet = rootView.findViewById(id);
      if (btnCloseBottomsheet == null) {
        break missingId;
      }

      id = R.id.btn_simpan;
      TextView btnSimpan = rootView.findViewById(id);
      if (btnSimpan == null) {
        break missingId;
      }

      id = R.id.et_bottomsheet;
      EditText etBottomsheet = rootView.findViewById(id);
      if (etBottomsheet == null) {
        break missingId;
      }

      id = R.id.title_bottomsheet;
      TextView titleBottomsheet = rootView.findViewById(id);
      if (titleBottomsheet == null) {
        break missingId;
      }

      return new BottomsheetNotesBinding((ConstraintLayout) rootView, btnCloseBottomsheet,
          btnSimpan, etBottomsheet, titleBottomsheet);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
