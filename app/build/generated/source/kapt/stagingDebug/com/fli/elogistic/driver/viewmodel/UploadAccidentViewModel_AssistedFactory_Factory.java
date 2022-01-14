package com.fli.elogistic.driver.viewmodel;

import com.fli.elogistic.driver.repo.UploadDocumentImageRepo;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UploadAccidentViewModel_AssistedFactory_Factory implements Factory<UploadAccidentViewModel_AssistedFactory> {
  private final Provider<UploadDocumentImageRepo> uploadDocumentImageRepoProvider;

  public UploadAccidentViewModel_AssistedFactory_Factory(
      Provider<UploadDocumentImageRepo> uploadDocumentImageRepoProvider) {
    this.uploadDocumentImageRepoProvider = uploadDocumentImageRepoProvider;
  }

  @Override
  public UploadAccidentViewModel_AssistedFactory get() {
    return newInstance(uploadDocumentImageRepoProvider);
  }

  public static UploadAccidentViewModel_AssistedFactory_Factory create(
      Provider<UploadDocumentImageRepo> uploadDocumentImageRepoProvider) {
    return new UploadAccidentViewModel_AssistedFactory_Factory(uploadDocumentImageRepoProvider);
  }

  public static UploadAccidentViewModel_AssistedFactory newInstance(
      Provider<UploadDocumentImageRepo> uploadDocumentImageRepo) {
    return new UploadAccidentViewModel_AssistedFactory(uploadDocumentImageRepo);
  }
}
