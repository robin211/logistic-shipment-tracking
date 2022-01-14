package com.fli.elogistic.driver.di;

import com.fli.elogistic.driver.db.FLIDriverDb;
import com.fli.elogistic.driver.db.ImageListDao;
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
public final class AppModule_ProvideImageListDaoFactory implements Factory<ImageListDao> {
  private final Provider<FLIDriverDb> dbProvider;

  public AppModule_ProvideImageListDaoFactory(Provider<FLIDriverDb> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public ImageListDao get() {
    return provideImageListDao(dbProvider.get());
  }

  public static AppModule_ProvideImageListDaoFactory create(Provider<FLIDriverDb> dbProvider) {
    return new AppModule_ProvideImageListDaoFactory(dbProvider);
  }

  public static ImageListDao provideImageListDao(FLIDriverDb db) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideImageListDao(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
