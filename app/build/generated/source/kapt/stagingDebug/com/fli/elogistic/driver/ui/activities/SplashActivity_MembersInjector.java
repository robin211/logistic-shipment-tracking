package com.fli.elogistic.driver.ui.activities;

import android.content.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class SplashActivity_MembersInjector implements MembersInjector<SplashActivity> {
  private final Provider<SharedPreferences> spProvider;

  public SplashActivity_MembersInjector(Provider<SharedPreferences> spProvider) {
    this.spProvider = spProvider;
  }

  public static MembersInjector<SplashActivity> create(Provider<SharedPreferences> spProvider) {
    return new SplashActivity_MembersInjector(spProvider);
  }

  @Override
  public void injectMembers(SplashActivity instance) {
    injectSp(instance, spProvider.get());
  }

  @InjectedFieldSignature("com.fli.elogistic.driver.ui.activities.SplashActivity.sp")
  public static void injectSp(SplashActivity instance, SharedPreferences sp) {
    instance.sp = sp;
  }
}
