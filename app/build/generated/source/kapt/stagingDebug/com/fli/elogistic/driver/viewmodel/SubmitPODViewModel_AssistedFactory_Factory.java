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
public final class SubmitPODViewModel_AssistedFactory_Factory implements Factory<SubmitPODViewModel_AssistedFactory> {
  private final Provider<UploadDocumentImageRepo> uploadDocumentImageRepoProvider;

  public SubmitPODViewModel_AssistedFactory_Factory(
      Provider<UploadDocumentImageRepo> uploadDocumentImageRepoProvider) {
    this.uploadDocumentImageRepoProvider = uploadDocumentImageRepoProvider;
  }

  @Override
  public SubmitPODViewModel_AssistedFactory get() {
    return newInstance(uploadDocumentImageRepoProvider);
  }

  public static SubmitPODViewModel_AssistedFactory_Factory create(
      Provider<UploadDocumentImageRepo> uploadDocumentImageRepoProvider) {
    return new SubmitPODViewModel_AssistedFactory_Factory(uploadDocumentImageRepoProvider);
  }

  public static SubmitPODViewModel_AssistedFactory newInstance(
      Provider<UploadDocumentImageRepo> uploadDocumentImageRepo) {
    return new SubmitPODViewModel_AssistedFactory(uploadDocumentImageRepo);
  }
}
