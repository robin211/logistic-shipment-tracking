package com.fli.elogistic.driver.repo;

import com.fli.elogistic.driver.AppExecutors;
import com.fli.elogistic.driver.services.UploadService;
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
public final class UploadDocumentImageRepo_Factory implements Factory<UploadDocumentImageRepo> {
  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<UploadService> uploadServiceProvider;

  public UploadDocumentImageRepo_Factory(Provider<AppExecutors> appExecutorsProvider,
      Provider<UploadService> uploadServiceProvider) {
    this.appExecutorsProvider = appExecutorsProvider;
    this.uploadServiceProvider = uploadServiceProvider;
  }

  @Override
  public UploadDocumentImageRepo get() {
    return newInstance(appExecutorsProvider.get(), uploadServiceProvider.get());
  }

  public static UploadDocumentImageRepo_Factory create(Provider<AppExecutors> appExecutorsProvider,
      Provider<UploadService> uploadServiceProvider) {
    return new UploadDocumentImageRepo_Factory(appExecutorsProvider, uploadServiceProvider);
  }

  public static UploadDocumentImageRepo newInstance(AppExecutors appExecutors,
      UploadService uploadService) {
    return new UploadDocumentImageRepo(appExecutors, uploadService);
  }
}
