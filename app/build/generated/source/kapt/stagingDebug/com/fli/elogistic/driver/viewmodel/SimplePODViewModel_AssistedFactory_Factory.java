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
public final class SimplePODViewModel_AssistedFactory_Factory implements Factory<SimplePODViewModel_AssistedFactory> {
  private final Provider<ShipmentRepo> shipmentRepoProvider;

  public SimplePODViewModel_AssistedFactory_Factory(Provider<ShipmentRepo> shipmentRepoProvider) {
    this.shipmentRepoProvider = shipmentRepoProvider;
  }

  @Override
  public SimplePODViewModel_AssistedFactory get() {
    return newInstance(shipmentRepoProvider);
  }

  public static SimplePODViewModel_AssistedFactory_Factory create(
      Provider<ShipmentRepo> shipmentRepoProvider) {
    return new SimplePODViewModel_AssistedFactory_Factory(shipmentRepoProvider);
  }

  public static SimplePODViewModel_AssistedFactory newInstance(
      Provider<ShipmentRepo> shipmentRepo) {
    return new SimplePODViewModel_AssistedFactory(shipmentRepo);
  }
}
