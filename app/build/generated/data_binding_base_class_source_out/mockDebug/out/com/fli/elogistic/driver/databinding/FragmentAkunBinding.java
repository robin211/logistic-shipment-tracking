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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.fli.elogistic.driver.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAkunBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView bgToolbar;

  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final TextView company;

  @NonNull
  public final TextView companyName;

  @NonNull
  public final TextView debugVersion;

  @NonNull
  public final TextView email;

  @NonNull
  public final TextView emailAddress;

  @NonNull
  public final ImageView icCompany;

  @NonNull
  public final ImageView icEmail;

  @NonNull
  public final ImageView icLogout;

  @NonNull
  public final ImageView icProfile;

  @NonNull
  public final RelativeLayout mainLogoutButton;

  @NonNull
  public final TextView nama;

  @NonNull
  public final TextView namaLengkap;

  private FragmentAkunBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView bgToolbar,
      @NonNull ImageView btnBack, @NonNull TextView company, @NonNull TextView companyName,
      @NonNull TextView debugVersion, @NonNull TextView email, @NonNull TextView emailAddress,
      @NonNull ImageView icCompany, @NonNull ImageView icEmail, @NonNull ImageView icLogout,
      @NonNull ImageView icProfile, @NonNull RelativeLayout mainLogoutButton,
      @NonNull TextView nama, @NonNull TextView namaLengkap) {
    this.rootView = rootView;
    this.bgToolbar = bgToolbar;
    this.btnBack = btnBack;
    this.company = company;
    this.companyName = companyName;
    this.debugVersion = debugVersion;
    this.email = email;
    this.emailAddress = emailAddress;
    this.icCompany = icCompany;
    this.icEmail = icEmail;
    this.icLogout = icLogout;
    this.icProfile = icProfile;
    this.mainLogoutButton = mainLogoutButton;
    this.nama = nama;
    this.namaLengkap = namaLengkap;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAkunBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAkunBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_akun, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAkunBinding bind(@NonNull View rootView) {
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

      id = R.id.company;
      TextView company = rootView.findViewById(id);
      if (company == null) {
        break missingId;
      }

      id = R.id.company_name;
      TextView companyName = rootView.findViewById(id);
      if (companyName == null) {
        break missingId;
      }

      id = R.id.debug_version;
      TextView debugVersion = rootView.findViewById(id);
      if (debugVersion == null) {
        break missingId;
      }

      id = R.id.email;
      TextView email = rootView.findViewById(id);
      if (email == null) {
        break missingId;
      }

      id = R.id.email_address;
      TextView emailAddress = rootView.findViewById(id);
      if (emailAddress == null) {
        break missingId;
      }

      id = R.id.ic_company;
      ImageView icCompany = rootView.findViewById(id);
      if (icCompany == null) {
        break missingId;
      }

      id = R.id.ic_email;
      ImageView icEmail = rootView.findViewById(id);
      if (icEmail == null) {
        break missingId;
      }

      id = R.id.ic_logout;
      ImageView icLogout = rootView.findViewById(id);
      if (icLogout == null) {
        break missingId;
      }

      id = R.id.ic_profile;
      ImageView icProfile = rootView.findViewById(id);
      if (icProfile == null) {
        break missingId;
      }

      id = R.id.mainLogoutButton;
      RelativeLayout mainLogoutButton = rootView.findViewById(id);
      if (mainLogoutButton == null) {
        break missingId;
      }

      id = R.id.nama;
      TextView nama = rootView.findViewById(id);
      if (nama == null) {
        break missingId;
      }

      id = R.id.nama_lengkap;
      TextView namaLengkap = rootView.findViewById(id);
      if (namaLengkap == null) {
        break missingId;
      }

      return new FragmentAkunBinding((ConstraintLayout) rootView, bgToolbar, btnBack, company,
          companyName, debugVersion, email, emailAddress, icCompany, icEmail, icLogout, icProfile,
          mainLogoutButton, nama, namaLengkap);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}