package com.fli.elogistic.driver.viewmodel;

import com.fli.elogistic.driver.repo.IdentityRepo;
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
public final class IdentityViewModel_AssistedFactory_Factory implements Factory<IdentityViewModel_AssistedFactory> {
  private final Provider<IdentityRepo> identityRepoProvider;

  public IdentityViewModel_AssistedFactory_Factory(Provider<IdentityRepo> identityRepoProvider) {
    this.identityRepoProvider = identityRepoProvider;
  }

  @Override
  public IdentityViewModel_AssistedFactory get() {
    return newInstance(identityRepoProvider);
  }

  public static IdentityViewModel_AssistedFactory_Factory create(
      Provider<IdentityRepo> identityRepoProvider) {
    return new IdentityViewModel_AssistedFactory_Factory(identityRepoProvider);
  }

  public static IdentityViewModel_AssistedFactory newInstance(Provider<IdentityRepo> identityRepo) {
    return new IdentityViewModel_AssistedFactory(identityRepo);
  }
}
