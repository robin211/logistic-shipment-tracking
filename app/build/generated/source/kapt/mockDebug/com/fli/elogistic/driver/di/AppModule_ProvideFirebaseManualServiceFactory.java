package com.fli.elogistic.driver.di;

import com.fli.elogistic.driver.services.FirebaseManualService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideFirebaseManualServiceFactory implements Factory<FirebaseManualService> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideFirebaseManualServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public FirebaseManualService get() {
    return provideFirebaseManualService(retrofitProvider.get());
  }

  public static AppModule_ProvideFirebaseManualServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideFirebaseManualServiceFactory(retrofitProvider);
  }

  public static FirebaseManualService provideFirebaseManualService(Retrofit retrofit) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideFirebaseManualService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
