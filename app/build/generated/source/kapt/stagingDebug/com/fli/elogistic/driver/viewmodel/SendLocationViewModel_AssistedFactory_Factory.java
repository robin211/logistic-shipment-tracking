package com.fli.elogistic.driver.viewmodel;

import com.fli.elogistic.driver.repo.SendLocationRepo;
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
public final class SendLocationViewModel_AssistedFactory_Factory implements Factory<SendLocationViewModel_AssistedFactory> {
  private final Provider<SendLocationRepo> sendLocationRepoProvider;

  public SendLocationViewModel_AssistedFactory_Factory(
      Provider<SendLocationRepo> sendLocationRepoProvider) {
    this.sendLocationRepoProvider = sendLocationRepoProvider;
  }

  @Override
  public SendLocationViewModel_AssistedFactory get() {
    return newInstance(sendLocationRepoProvider);
  }

  public static SendLocationViewModel_AssistedFactory_Factory create(
      Provider<SendLocationRepo> sendLocationRepoProvider) {
    return new SendLocationViewModel_AssistedFactory_Factory(sendLocationRepoProvider);
  }

  public static SendLocationViewModel_AssistedFactory newInstance(
      Provider<SendLocationRepo> sendLocationRepo) {
    return new SendLocationViewModel_AssistedFactory(sendLocationRepo);
  }
}
