package com.fli.elogistic.driver.viewmodel;

import com.fli.elogistic.driver.repo.ShipmentRepo;
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
public final class ShipmentViewModel_AssistedFactory_Factory implements Factory<ShipmentViewModel_AssistedFactory> {
  private final Provider<ShipmentRepo> shipmentRepoProvider;

  public ShipmentViewModel_AssistedFactory_Factory(Provider<ShipmentRepo> shipmentRepoProvider) {
    this.shipmentRepoProvider = shipmentRepoProvider;
  }

  @Override
  public ShipmentViewModel_AssistedFactory get() {
    return newInstance(shipmentRepoProvider);
  }

  public static ShipmentViewModel_AssistedFactory_Factory create(
      Provider<ShipmentRepo> shipmentRepoProvider) {
    return new ShipmentViewModel_AssistedFactory_Factory(shipmentRepoProvider);
  }

  public static ShipmentViewModel_AssistedFactory newInstance(Provider<ShipmentRepo> shipmentRepo) {
    return new ShipmentViewModel_AssistedFactory(shipmentRepo);
  }
}
