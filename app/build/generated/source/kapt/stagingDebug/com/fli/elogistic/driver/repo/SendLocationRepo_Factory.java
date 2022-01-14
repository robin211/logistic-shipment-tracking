package com.fli.elogistic.driver.repo;

import com.fli.elogistic.driver.AppExecutors;
import com.fli.elogistic.driver.services.SendLocationService;
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
public final class SendLocationRepo_Factory implements Factory<SendLocationRepo> {
  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<SendLocationService> sendLocationServiceProvider;

  public SendLocationRepo_Factory(Provider<AppExecutors> appExecutorsProvider,
      Provider<SendLocationService> sendLocationServiceProvider) {
    this.appExecutorsProvider = appExecutorsProvider;
    this.sendLocationServiceProvider = sendLocationServiceProvider;
  }

  @Override
  public SendLocationRepo get() {
    return newInstance(appExecutorsProvider.get(), sendLocationServiceProvider.get());
  }

  public static SendLocationRepo_Factory create(Provider<AppExecutors> appExecutorsProvider,
      Provider<SendLocationService> sendLocationServiceProvider) {
    return new SendLocationRepo_Factory(appExecutorsProvider, sendLocationServiceProvider);
  }

  public static SendLocationRepo newInstance(AppExecutors appExecutors,
      SendLocationService sendLocationService) {
    return new SendLocationRepo(appExecutors, sendLocationService);
  }
}
