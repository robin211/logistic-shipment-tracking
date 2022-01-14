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
public final class UploadSignatureBastViewModel_AssistedFactory implements ViewModelAssistedFactory<UploadSignatureBastViewModel> {
  private final Provider<UploadDocumentImageRepo> uploadDocumentImageRepo;

  @Inject
  UploadSignatureBastViewModel_AssistedFactory(
      Provider<UploadDocumentImageRepo> uploadDocumentImageRepo) {
    this.uploadDocumentImageRepo = uploadDocumentImageRepo;
  }

  @Override
  @NonNull
  public UploadSignatureBastViewModel create(SavedStateHandle arg0) {
    return new UploadSignatureBastViewModel(uploadDocumentImageRepo.get());
  }
}
