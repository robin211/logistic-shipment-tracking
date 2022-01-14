package com.fli.elogistic.driver.viewmodel;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.fli.elogistic.driver.repo.ShipmentRepo;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class SimplePODViewModel_AssistedFactory implements ViewModelAssistedFactory<SimplePODViewModel> {
  private final Provider<ShipmentRepo> shipmentRepo;

  @Inject
  SimplePODViewModel_AssistedFactory(Provider<ShipmentRepo> shipmentRepo) {
    this.shipmentRepo = shipmentRepo;
  }

  @Override
  @NonNull
  public SimplePODViewModel create(SavedStateHandle arg0) {
    return new SimplePODViewModel(shipmentRepo.get());
  }
}
