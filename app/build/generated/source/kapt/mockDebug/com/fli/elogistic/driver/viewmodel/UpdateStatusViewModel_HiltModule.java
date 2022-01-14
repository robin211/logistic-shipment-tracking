package com.fli.elogistic.driver.viewmodel;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = UpdateStatusViewModel.class
)
public interface UpdateStatusViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.fli.elogistic.driver.viewmodel.UpdateStatusViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(UpdateStatusViewModel_AssistedFactory factory);
}
