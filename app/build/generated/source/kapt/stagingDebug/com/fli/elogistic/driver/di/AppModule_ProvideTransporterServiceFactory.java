package com.fli.elogistic.driver.di;

import com.fli.elogistic.driver.services.ShipmentDetailPerLocationService;
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
public final class AppModule_ProvideTransporterServiceFactory implements Factory<ShipmentDetailPerLocationService> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideTransporterServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ShipmentDetailPerLocationService get() {
    return provideTransporterService(retrofitProvider.get());
  }

  public static AppModule_ProvideTransporterServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideTransporterServiceFactory(retrofitProvider);
  }

  public static ShipmentDetailPerLocationService provideTransporterService(Retrofit retrofit) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideTransporterService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
