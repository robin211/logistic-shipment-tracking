package com.fli.elogistic.driver;

import androidx.hilt.lifecycle.ViewModelFactoryModules;
import com.fli.elogistic.driver.di.AppModule;
import com.fli.elogistic.driver.di.ViewModelModule;
import com.fli.elogistic.driver.ui.activities.BaseActivity_GeneratedInjector;
import com.fli.elogistic.driver.ui.activities.SplashActivity_GeneratedInjector;
import com.fli.elogistic.driver.ui.fragments.BaseFragment_GeneratedInjector;
import com.fli.elogistic.driver.viewmodel.AdditionalShippingCostViewModel_HiltModule;
import com.fli.elogistic.driver.viewmodel.DetailPerLocationViewModel_HiltModule;
import com.fli.elogistic.driver.viewmodel.FirebaseManualViewModel_HiltModule;
import com.fli.elogistic.driver.viewmodel.IdentityViewModel_HiltModule;
import com.fli.elogistic.driver.viewmodel.PostAutoAssignLocationViewModel_HiltModule;
import com.fli.elogistic.driver.viewmodel.ReasonAllViewModel_HiltModule;
import com.fli.elogistic.driver.viewmodel.SendLocationViewModel_HiltModule;
import com.fli.elogistic.driver.viewmodel.ShipmentViewModel_HiltModule;
import com.fli.elogistic.driver.viewmodel.SimplePODViewModel_HiltModule;
import com.fli.elogistic.driver.viewmodel.StatusConfirmationViewModel_HiltModule;
import com.fli.elogistic.driver.viewmodel.SubmitPODViewModel_HiltModule;
import com.fli.elogistic.driver.viewmodel.UpdateStatusViewModel_HiltModule;
import com.fli.elogistic.driver.viewmodel.UploadAccidentViewModel_HiltModule;
import com.fli.elogistic.driver.viewmodel.UploadBASPViewModel_HiltModule;
import com.fli.elogistic.driver.viewmodel.UploadPODViewModel_HiltModule;
import com.fli.elogistic.driver.viewmodel.UploadSignatureBastViewModel_HiltModule;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.annotation.Generated;
import javax.inject.Singleton;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class MainApp_HiltComponents {
  private MainApp_HiltComponents() {
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Subcomponent(
      modules = {
          DefaultViewModelFactories.ActivityModule.class,
          HiltWrapper_ActivityModule.class,
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class,
          ViewModelFactoryModules.ActivityModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements BaseActivity_GeneratedInjector,
      SplashActivity_GeneratedInjector,
      ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AdditionalShippingCostViewModel_HiltModule.class,
          DetailPerLocationViewModel_HiltModule.class,
          FirebaseManualViewModel_HiltModule.class,
          IdentityViewModel_HiltModule.class,
          ActivityCBuilderModule.class,
          PostAutoAssignLocationViewModel_HiltModule.class,
          ReasonAllViewModel_HiltModule.class,
          SendLocationViewModel_HiltModule.class,
          ShipmentViewModel_HiltModule.class,
          SimplePODViewModel_HiltModule.class,
          StatusConfirmationViewModel_HiltModule.class,
          SubmitPODViewModel_HiltModule.class,
          UpdateStatusViewModel_HiltModule.class,
          UploadAccidentViewModel_HiltModule.class,
          UploadBASPViewModel_HiltModule.class,
          UploadPODViewModel_HiltModule.class,
          UploadSignatureBastViewModel_HiltModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Component(
      modules = {
          AppModule.class,
          ApplicationContextModule.class,
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class,
          ViewModelModule.class
      }
  )
  @Singleton
  public abstract static class ApplicationC implements MainApp_GeneratedInjector,
      ApplicationComponent,
      HiltWrapper_ActivityRetainedComponentManager_LifecycleComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      GeneratedComponent {
  }

  @Subcomponent(
      modules = {
          DefaultViewModelFactories.FragmentModule.class,
          ViewWithFragmentCBuilderModule.class,
          ViewModelFactoryModules.FragmentModule.class
      }
  )
  @FragmentScoped
  public abstract static class FragmentC implements BaseFragment_GeneratedInjector,
      FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements ServiceComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}
