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
public final class PostAutoAssignLocationViewModel_AssistedFactory_Factory implements Factory<PostAutoAssignLocationViewModel_AssistedFactory> {
  private final Provider<ShipmentRepo> shipmentRepoProvider;

  public PostAutoAssignLocationViewModel_AssistedFactory_Factory(
      Provider<ShipmentRepo> shipmentRepoProvider) {
    this.shipmentRepoProvider = shipmentRepoProvider;
  }

  @Override
  public PostAutoAssignLocationViewModel_AssistedFactory get() {
    return newInstance(shipmentRepoProvider);
  }

  public static PostAutoAssignLocationViewModel_AssistedFactory_Factory create(
      Provider<ShipmentRepo> shipmentRepoProvider) {
    return new PostAutoAssignLocationViewModel_AssistedFactory_Factory(shipmentRepoProvider);
  }

  public static PostAutoAssignLocationViewModel_AssistedFactory newInstance(
      Provider<ShipmentRepo> shipmentRepo) {
    return new PostAutoAssignLocationViewModel_AssistedFactory(shipmentRepo);
  }
}
