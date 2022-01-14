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
public final class AdditionalShippingCostViewModel_AssistedFactory implements ViewModelAssistedFactory<AdditionalShippingCostViewModel> {
  private final Provider<ShipmentRepo> shipmentRepo;

  @Inject
  AdditionalShippingCostViewModel_AssistedFactory(Provider<ShipmentRepo> shipmentRepo) {
    this.shipmentRepo = shipmentRepo;
  }

  @Override
  @NonNull
  public AdditionalShippingCostViewModel create(SavedStateHandle arg0) {
    return new AdditionalShippingCostViewModel(shipmentRepo.get());
  }
}
