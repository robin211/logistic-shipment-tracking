package com.fli.elogistic.driver.viewmodel;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.fli.elogistic.driver.repo.TransporterRepo;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class DetailPerLocationViewModel_AssistedFactory implements ViewModelAssistedFactory<DetailPerLocationViewModel> {
  private final Provider<TransporterRepo> transporterRepo;

  @Inject
  DetailPerLocationViewModel_AssistedFactory(Provider<TransporterRepo> transporterRepo) {
    this.transporterRepo = transporterRepo;
  }

  @Override
  @NonNull
  public DetailPerLocationViewModel create(SavedStateHandle arg0) {
    return new DetailPerLocationViewModel(transporterRepo.get());
  }
}
