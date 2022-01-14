package com.fli.elogistic.driver.repo;

import com.fli.elogistic.driver.AppExecutors;
import com.fli.elogistic.driver.services.ShipmentService;
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
public final class ShipmentRepo_Factory implements Factory<ShipmentRepo> {
  private final Provider<AppExecutors> appExecutorsProvider;

  private final Provider<ShipmentService> shipmentServiceProvider;

  public ShipmentRepo_Factory(Provider<AppExecutors> appExecutorsProvider,
      Provider<ShipmentService> shipmentServiceProvider) {
    this.appExecutorsProvider = appExecutorsProvider;
    this.shipmentServiceProvider = shipmentServiceProvider;
  }

  @Override
  public ShipmentRepo get() {
    return newInstance(appExecutorsProvider.get(), shipmentServiceProvider.get());
  }

  public static ShipmentRepo_Factory create(Provider<AppExecutors> appExecutorsProvider,
      Provider<ShipmentService> shipmentServiceProvider) {
    return new ShipmentRepo_Factory(appExecutorsProvider, shipmentServiceProvider);
  }

  public static ShipmentRepo newInstance(AppExecutors appExecutors,
      ShipmentService shipmentService) {
    return new ShipmentRepo(appExecutors, shipmentService);
  }
}
