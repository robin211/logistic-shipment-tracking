package com.fli.elogistic.driver.viewmodel;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.fli.elogistic.driver.repo.FirebaseManualRepo;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class FirebaseManualViewModel_AssistedFactory implements ViewModelAssistedFactory<FirebaseManualViewModel> {
  private final Provider<FirebaseManualRepo> firebaseManualRepo;

  @Inject
  FirebaseManualViewModel_AssistedFactory(Provider<FirebaseManualRepo> firebaseManualRepo) {
    this.firebaseManualRepo = firebaseManualRepo;
  }

  @Override
  @NonNull
  public FirebaseManualViewModel create(SavedStateHandle arg0) {
    return new FirebaseManualViewModel(firebaseManualRepo.get());
  }
}
