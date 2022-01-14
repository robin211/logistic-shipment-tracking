package com.fli.elogistic.driver.repo;

import com.fli.elogistic.driver.AppExecutors;
import com.fli.elogistic.driver.services.ShipmentDetailPerLocationService;
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
public final class TransporterRepo_Factory implements Factory<TransporterRepo> {
  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<ShipmentDetailPerLocationService> shipmentDetailPerLocationServiceProvider;

  public TransporterRepo_Factory(Provider<AppExecutors> appExecutorsProvider,
      Provider<ShipmentDetailPerLocationService> shipmentDetailPerLocationServiceProvider) {
    this.appExecutorsProvider = appExecutorsProvider;
    this.shipmentDetailPerLocationServiceProvider = shipmentDetailPerLocationServiceProvider;
  }

  @Override
  public TransporterRepo get() {
    return newInstance(appExecutorsProvider.get(), shipmentDetailPerLocationServiceProvider.get());
  }

  public static TransporterRepo_Factory create(Provider<AppExecutors> appExecutorsProvider,
      Provider<ShipmentDetailPerLocationService> shipmentDetailPerLocationServiceProvider) {
    return new TransporterRepo_Factory(appExecutorsProvider, shipmentDetailPerLocationServiceProvider);
  }

  public static TransporterRepo newInstance(AppExecutors appExecutors,
      ShipmentDetailPerLocationService shipmentDetailPerLocationService) {
    return new TransporterRepo(appExecutors, shipmentDetailPerLocationService);
  }
}
