package com.fli.elogistic.driver.ui.fragments;

import android.content.SharedPreferences;
import com.fli.elogistic.driver.AppExecutors;
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
public final class BaseFragment_MembersInjector implements MembersInjector<BaseFragment> {
  private final Provider<SharedPreferences> spProvider;

  private final Provider<AppExecutors> appExecutorsProvider;

  public BaseFragment_MembersInjector(Provider<SharedPreferences> spProvider,
      Provider<AppExecutors> appExecutorsProvider) {
    this.spProvider = spProvider;
    this.appExecutorsProvider = appExecutorsProvider;
  }

  public static MembersInjector<BaseFragment> create(Provider<SharedPreferences> spProvider,
      Provider<AppExecutors> appExecutorsProvider) {
    return new BaseFragment_MembersInjector(spProvider, appExecutorsProvider);
  }

  @Override
  public void injectMembers(BaseFragment instance) {
    injectSp(instance, spProvider.get());
    injectAppExecutors(instance, appExecutorsProvider.get());
  }

  @InjectedFieldSignature("com.fli.elogistic.driver.ui.fragments.BaseFragment.sp")
  public static void injectSp(BaseFragment instance, SharedPreferences sp) {
    instance.sp = sp;
  }

  @InjectedFieldSignature("com.fli.elogistic.driver.ui.fragments.BaseFragment.appExecutors")
  public static void injectAppExecutors(BaseFragment instance, AppExecutors appExecutors) {
    instance.appExecutors = appExecutors;
  }
}
