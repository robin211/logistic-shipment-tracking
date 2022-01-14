package com.fli.elogistic.driver.di;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideSharedPreferencesFactory implements Factory<SharedPreferences> {
  private final Provider<Application> applicationProvider;

  public AppModule_ProvideSharedPreferencesFactory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideSharedPreferences(applicationProvider.get());
  }

  public static AppModule_ProvideSharedPreferencesFactory create(
      Provider<Application> applicationProvider) {
    return new AppModule_ProvideSharedPreferencesFactory(applicationProvider);
  }

  public static SharedPreferences provideSharedPreferences(Application application) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideSharedPreferences(application), "Cannot return null from a non-@Nullable @Provides method");
  }
}
