package com.fli.elogistic.driver.viewmodel;

import com.fli.elogistic.driver.repo.FirebaseManualRepo;
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
public final class FirebaseManualViewModel_AssistedFactory_Factory implements Factory<FirebaseManualViewModel_AssistedFactory> {
  private final Provider<FirebaseManualRepo> firebaseManualRepoProvider;

  public FirebaseManualViewModel_AssistedFactory_Factory(
      Provider<FirebaseManualRepo> firebaseManualRepoProvider) {
    this.firebaseManualRepoProvider = firebaseManualRepoProvider;
  }

  @Override
  public FirebaseManualViewModel_AssistedFactory get() {
    return newInstance(firebaseManualRepoProvider);
  }

  public static FirebaseManualViewModel_AssistedFactory_Factory create(
      Provider<FirebaseManualRepo> firebaseManualRepoProvider) {
    return new FirebaseManualViewModel_AssistedFactory_Factory(firebaseManualRepoProvider);
  }

  public static FirebaseManualViewModel_AssistedFactory newInstance(
      Provider<FirebaseManualRepo> firebaseManualRepo) {
    return new FirebaseManualViewModel_AssistedFactory(firebaseManualRepo);
  }
}
