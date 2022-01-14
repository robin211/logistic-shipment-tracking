package com.fli.elogistic.driver.di;

import com.fli.elogistic.driver.services.IdentityService;
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
public final class AppModule_ProvideOIdentityServiceFactory implements Factory<IdentityService> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideOIdentityServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public IdentityService get() {
    return provideOIdentityService(retrofitProvider.get());
  }

  public static AppModule_ProvideOIdentityServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideOIdentityServiceFactory(retrofitProvider);
  }

  public static IdentityService provideOIdentityService(Retrofit retrofit) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideOIdentityService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
