package com.fli.elogistic.driver.di;

import android.app.Application;
import com.fli.elogistic.driver.db.FLIDriverDb;
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
public final class AppModule_ProvideDbFactory implements Factory<FLIDriverDb> {
  private final Provider<Application> appProvider;

  public AppModule_ProvideDbFactory(Provider<Application> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public FLIDriverDb get() {
    return provideDb(appProvider.get());
  }

  public static AppModule_ProvideDbFactory create(Provider<Application> appProvider) {
    return new AppModule_ProvideDbFactory(appProvider);
  }

  public static FLIDriverDb provideDb(Application app) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideDb(app), "Cannot return null from a non-@Nullable @Provides method");
  }
}
