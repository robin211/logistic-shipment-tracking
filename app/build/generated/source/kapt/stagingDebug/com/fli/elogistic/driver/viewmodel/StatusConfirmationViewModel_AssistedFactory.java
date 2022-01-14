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
public final class StatusConfirmationViewModel_AssistedFactory implements ViewModelAssistedFactory<StatusConfirmationViewModel> {
  private final Provider<ShipmentRepo> shipmentRepo;

  @Inject
  StatusConfirmationViewModel_AssistedFactory(Provider<ShipmentRepo> shipmentRepo) {
    this.shipmentRepo = shipmentRepo;
  }

  @Override
  @NonNull
  public StatusConfirmationViewModel create(SavedStateHandle arg0) {
    return new StatusConfirmationViewModel(shipmentRepo.get());
  }
}
