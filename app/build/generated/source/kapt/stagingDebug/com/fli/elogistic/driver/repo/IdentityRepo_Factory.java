package com.fli.elogistic.driver.repo;

import com.fli.elogistic.driver.AppExecutors;
import com.fli.elogistic.driver.services.IdentityService;
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
public final class IdentityRepo_Factory implements Factory<IdentityRepo> {
  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<IdentityService> identityServiceProvider;

  public IdentityRepo_Factory(Provider<AppExecutors> appExecutorsProvider,
      Provider<IdentityService> identityServiceProvider) {
    this.appExecutorsProvider = appExecutorsProvider;
    this.identityServiceProvider = identityServiceProvider;
  }

  @Override
  public IdentityRepo get() {
    return newInstance(appExecutorsProvider.get(), identityServiceProvider.get());
  }

  public static IdentityRepo_Factory create(Provider<AppExecutors> appExecutorsProvider,
      Provider<IdentityService> identityServiceProvider) {
    return new IdentityRepo_Factory(appExecutorsProvider, identityServiceProvider);
  }

  public static IdentityRepo newInstance(AppExecutors appExecutors,
      IdentityService identityService) {
    return new IdentityRepo(appExecutors, identityService);
  }
}
