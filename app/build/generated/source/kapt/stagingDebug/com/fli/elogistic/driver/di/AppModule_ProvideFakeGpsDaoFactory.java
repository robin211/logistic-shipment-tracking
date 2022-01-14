package com.fli.elogistic.driver.di;

import com.fli.elogistic.driver.db.FLIDriverDb;
import com.fli.elogistic.driver.db.FakeGpsDao;
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
public final class AppModule_ProvideFakeGpsDaoFactory implements Factory<FakeGpsDao> {
  private final Provider<FLIDriverDb> dbProvider;

  public AppModule_ProvideFakeGpsDaoFactory(Provider<FLIDriverDb> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public FakeGpsDao get() {
    return provideFakeGpsDao(dbProvider.get());
  }

  public static AppModule_ProvideFakeGpsDaoFactory create(Provider<FLIDriverDb> dbProvider) {
    return new AppModule_ProvideFakeGpsDaoFactory(dbProvider);
  }

  public static FakeGpsDao provideFakeGpsDao(FLIDriverDb db) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideFakeGpsDao(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
