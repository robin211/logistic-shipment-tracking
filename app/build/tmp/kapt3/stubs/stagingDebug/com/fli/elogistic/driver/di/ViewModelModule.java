package com.fli.elogistic.driver.di;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/fli/elogistic/driver/di/ViewModelModule;", "", "()V", "bindIdentityViewModel", "Landroidx/lifecycle/ViewModel;", "identityViewModel", "Lcom/fli/elogistic/driver/viewmodel/IdentityViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/fli/elogistic/driver/di/ViewModelFactory;", "app_stagingDebug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.fli.elogistic.driver.viewmodel.IdentityViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindIdentityViewModel(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.viewmodel.IdentityViewModel identityViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.di.ViewModelFactory factory);
    
    public ViewModelModule() {
        super();
    }
}