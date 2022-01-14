package com.fli.elogistic.driver.di;

import com.fli.elogistic.driver.services.ShipmentService;
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
public final class AppModule_ProvideShipmentServiceFactory implements Factory<ShipmentService> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideShipmentServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ShipmentService get() {
    return provideShipmentService(retrofitProvider.get());
  }

  public static AppModule_ProvideShipmentServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideShipmentServiceFactory(retrofitProvider);
  }

  public static ShipmentService provideShipmentService(Retrofit retrofit) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideShipmentService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
