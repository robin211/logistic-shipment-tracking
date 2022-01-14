package com.fli.elogistic.driver.di;

import com.fli.elogistic.driver.services.SendLocationService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideSendLocationServiceFactory implements Factory<SendLocationService> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideSendLocationServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public SendLocationService get() {
    return provideSendLocationService(retrofitProvider.get());
  }

  public static AppModule_ProvideSendLocationServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideSendLocationServiceFactory(retrofitProvider);
  }

  public static SendLocationService provideSendLocationService(Retrofit retrofit) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideSendLocationService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
