package com.fli.elogistic.driver.viewmodel;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.fli.elogistic.driver.repo.UploadDocumentImageRepo;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class UploadAccidentViewModel_AssistedFactory implements ViewModelAssistedFactory<UploadAccidentViewModel> {
  private final Provider<UploadDocumentImageRepo> uploadDocumentImageRepo;

  @Inject
  UploadAccidentViewModel_AssistedFactory(
      Provider<UploadDocumentImageRepo> uploadDocumentImageRepo) {
    this.uploadDocumentImageRepo = uploadDocumentImageRepo;
  }

  @Override
  @NonNull
  public UploadAccidentViewModel create(SavedStateHandle arg0) {
    return new UploadAccidentViewModel(uploadDocumentImageRepo.get());
  }
}
