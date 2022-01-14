package com.fli.elogistic.driver.di;

import com.google.gson.Gson;
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
public final class AppModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<Gson> gsonProvider;

  public AppModule_ProvideRetrofitFactory(Provider<Gson> gsonProvider) {
    this.gsonProvider = gsonProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(gsonProvider.get());
  }

  public static AppModule_ProvideRetrofitFactory create(Provider<Gson> gsonProvider) {
    return new AppModule_ProvideRetrofitFactory(gsonProvider);
  }

  public static Retrofit provideRetrofit(Gson gson) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideRetrofit(gson), "Cannot return null from a non-@Nullable @Provides method");
  }
}
