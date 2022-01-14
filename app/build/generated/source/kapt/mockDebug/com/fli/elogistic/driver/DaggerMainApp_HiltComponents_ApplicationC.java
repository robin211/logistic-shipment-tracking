package com.fli.elogistic.driver;

import android.app.Activity;
import android.app.Service;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.fli.elogistic.driver.di.AppModule;
import com.fli.elogistic.driver.di.AppModule_ProvideFirebaseManualServiceFactory;
import com.fli.elogistic.driver.di.AppModule_ProvideGsonFactory;
import com.fli.elogistic.driver.di.AppModule_ProvideOIdentityServiceFactory;
import com.fli.elogistic.driver.di.AppModule_ProvideRetrofitFactory;
import com.fli.elogistic.driver.di.AppModule_ProvideSendLocationServiceFactory;
import com.fli.elogistic.driver.di.AppModule_ProvideSharedPreferencesFactory;
import com.fli.elogistic.driver.di.AppModule_ProvideShipmentServiceFactory;
import com.fli.elogistic.driver.di.AppModule_ProvideTransporterServiceFactory;
import com.fli.elogistic.driver.di.AppModule_ProvideUploadDocumentServiceFactory;
import com.fli.elogistic.driver.repo.FirebaseManualRepo;
import com.fli.elogistic.driver.repo.IdentityRepo;
import com.fli.elogistic.driver.repo.SendLocationRepo;
import com.fli.elogistic.driver.repo.ShipmentRepo;
import com.fli.elogistic.driver.repo.TransporterRepo;
import com.fli.elogistic.driver.repo.UploadDocumentImageRepo;
import com.fli.elogistic.driver.services.FirebaseManualService;
import com.fli.elogistic.driver.services.IdentityService;
import com.fli.elogistic.driver.services.SendLocationService;
import com.fli.elogistic.driver.services.ShipmentDetailPerLocationService;
import com.fli.elogistic.driver.services.ShipmentService;
import com.fli.elogistic.driver.services.UploadService;
import com.fli.elogistic.driver.ui.activities.BaseActivity;
import com.fli.elogistic.driver.ui.activities.BaseActivity_MembersInjector;
import com.fli.elogistic.driver.ui.activities.SplashActivity;
import com.fli.elogistic.driver.ui.activities.SplashActivity_MembersInjector;
import com.fli.elogistic.driver.ui.fragments.BaseFragment;
import com.fli.elogistic.driver.ui.fragments.BaseFragment_MembersInjector;
import com.fli.elogistic.driver.viewmodel.AdditionalShippingCostViewModel_AssistedFactory;
import com.fli.elogistic.driver.viewmodel.AdditionalShippingCostViewModel_AssistedFactory_Factory;
import com.fli.elogistic.driver.viewmodel.DetailPerLocationViewModel_AssistedFactory;
import com.fli.elogistic.driver.viewmodel.DetailPerLocationViewModel_AssistedFactory_Factory;
import com.fli.elogistic.driver.viewmodel.FirebaseManualViewModel_AssistedFactory;
import com.fli.elogistic.driver.viewmodel.FirebaseManualViewModel_AssistedFactory_Factory;
import com.fli.elogistic.driver.viewmodel.IdentityViewModel_AssistedFactory;
import com.fli.elogistic.driver.viewmodel.IdentityViewModel_AssistedFactory_Factory;
import com.fli.elogistic.driver.viewmodel.PostAutoAssignLocationViewModel_AssistedFactory;
import com.fli.elogistic.driver.viewmodel.PostAutoAssignLocationViewModel_AssistedFactory_Factory;
import com.fli.elogistic.driver.viewmodel.ReasonAllViewModel_AssistedFactory;
import com.fli.elogistic.driver.viewmodel.ReasonAllViewModel_AssistedFactory_Factory;
import com.fli.elogistic.driver.viewmodel.SendLocationViewModel_AssistedFactory;
import com.fli.elogistic.driver.viewmodel.SendLocationViewModel_AssistedFactory_Factory;
import com.fli.elogistic.driver.viewmodel.ShipmentViewModel_AssistedFactory;
import com.fli.elogistic.driver.viewmodel.ShipmentViewModel_AssistedFactory_Factory;
import com.fli.elogistic.driver.viewmodel.SimplePODViewModel_AssistedFactory;
import com.fli.elogistic.driver.viewmodel.SimplePODViewModel_AssistedFactory_Factory;
import com.fli.elogistic.driver.viewmodel.StatusConfirmationViewModel_AssistedFactory;
import com.fli.elogistic.driver.viewmodel.StatusConfirmationViewModel_AssistedFactory_Factory;
import com.fli.elogistic.driver.viewmodel.SubmitPODViewModel_AssistedFactory;
import com.fli.elogistic.driver.viewmodel.SubmitPODViewModel_AssistedFactory_Factory;
import com.fli.elogistic.driver.viewmodel.UpdateStatusViewModel_AssistedFactory;
import com.fli.elogistic.driver.viewmodel.UpdateStatusViewModel_AssistedFactory_Factory;
import com.fli.elogistic.driver.viewmodel.UploadAccidentViewModel_AssistedFactory;
import com.fli.elogistic.driver.viewmodel.UploadAccidentViewModel_AssistedFactory_Factory;
import com.fli.elogistic.driver.viewmodel.UploadBASPViewModel_AssistedFactory;
import com.fli.elogistic.driver.viewmodel.UploadBASPViewModel_AssistedFactory_Factory;
import com.fli.elogistic.driver.viewmodel.UploadPODViewModel_AssistedFactory;
import com.fli.elogistic.driver.viewmodel.UploadPODViewModel_AssistedFactory_Factory;
import com.fli.elogistic.driver.viewmodel.UploadSignatureBastViewModel_AssistedFactory;
import com.fli.elogistic.driver.viewmodel.UploadSignatureBastViewModel_AssistedFactory_Factory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerMainApp_HiltComponents_ApplicationC extends MainApp_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object appExecutors = new MemoizedSentinel();

  private volatile Object retrofit = new MemoizedSentinel();

  private DaggerMainApp_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private AppExecutors getAppExecutors() {
    Object local = appExecutors;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = appExecutors;
        if (local instanceof MemoizedSentinel) {
          local = new AppExecutors();
          appExecutors = DoubleCheck.reentrantCheck(appExecutors, local);
        }
      }
    }
    return (AppExecutors) local;
  }

  private SharedPreferences getSharedPreferences() {
    return AppModule_ProvideSharedPreferencesFactory.provideSharedPreferences(ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
  }

  private Retrofit getRetrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideRetrofitFactory.provideRetrofit(AppModule_ProvideGsonFactory.provideGson());
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private ShipmentService getShipmentService() {
    return AppModule_ProvideShipmentServiceFactory.provideShipmentService(getRetrofit());
  }

  private ShipmentDetailPerLocationService getShipmentDetailPerLocationService() {
    return AppModule_ProvideTransporterServiceFactory.provideTransporterService(getRetrofit());
  }

  private FirebaseManualService getFirebaseManualService() {
    return AppModule_ProvideFirebaseManualServiceFactory.provideFirebaseManualService(getRetrofit());
  }

  private IdentityService getIdentityService() {
    return AppModule_ProvideOIdentityServiceFactory.provideOIdentityService(getRetrofit());
  }

  private SendLocationService getSendLocationService() {
    return AppModule_ProvideSendLocationServiceFactory.provideSendLocationService(getRetrofit());
  }

  private UploadService getUploadService() {
    return AppModule_ProvideUploadDocumentServiceFactory.provideUploadDocumentService(getRetrofit());
  }

  @Override
  public void injectMainApp(MainApp mainApp) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public MainApp_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMainApp_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MainApp_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MainApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MainApp_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements MainApp_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MainApp_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MainApp_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<ShipmentRepo> shipmentRepoProvider;

      private volatile Provider<AdditionalShippingCostViewModel_AssistedFactory> additionalShippingCostViewModel_AssistedFactoryProvider;

      private volatile Provider<TransporterRepo> transporterRepoProvider;

      private volatile Provider<DetailPerLocationViewModel_AssistedFactory> detailPerLocationViewModel_AssistedFactoryProvider;

      private volatile Provider<FirebaseManualRepo> firebaseManualRepoProvider;

      private volatile Provider<FirebaseManualViewModel_AssistedFactory> firebaseManualViewModel_AssistedFactoryProvider;

      private volatile Provider<IdentityRepo> identityRepoProvider;

      private volatile Provider<IdentityViewModel_AssistedFactory> identityViewModel_AssistedFactoryProvider;

      private volatile Provider<PostAutoAssignLocationViewModel_AssistedFactory> postAutoAssignLocationViewModel_AssistedFactoryProvider;

      private volatile Provider<ReasonAllViewModel_AssistedFactory> reasonAllViewModel_AssistedFactoryProvider;

      private volatile Provider<SendLocationRepo> sendLocationRepoProvider;

      private volatile Provider<SendLocationViewModel_AssistedFactory> sendLocationViewModel_AssistedFactoryProvider;

      private volatile Provider<ShipmentViewModel_AssistedFactory> shipmentViewModel_AssistedFactoryProvider;

      private volatile Provider<SimplePODViewModel_AssistedFactory> simplePODViewModel_AssistedFactoryProvider;

      private volatile Provider<StatusConfirmationViewModel_AssistedFactory> statusConfirmationViewModel_AssistedFactoryProvider;

      private volatile Provider<UploadDocumentImageRepo> uploadDocumentImageRepoProvider;

      private volatile Provider<SubmitPODViewModel_AssistedFactory> submitPODViewModel_AssistedFactoryProvider;

      private volatile Provider<UpdateStatusViewModel_AssistedFactory> updateStatusViewModel_AssistedFactoryProvider;

      private volatile Provider<UploadAccidentViewModel_AssistedFactory> uploadAccidentViewModel_AssistedFactoryProvider;

      private volatile Provider<UploadBASPViewModel_AssistedFactory> uploadBASPViewModel_AssistedFactoryProvider;

      private volatile Provider<UploadPODViewModel_AssistedFactory> uploadPODViewModel_AssistedFactoryProvider;

      private volatile Provider<UploadSignatureBastViewModel_AssistedFactory> uploadSignatureBastViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private ShipmentRepo getShipmentRepo() {
        return new ShipmentRepo(DaggerMainApp_HiltComponents_ApplicationC.this.getAppExecutors(), DaggerMainApp_HiltComponents_ApplicationC.this.getShipmentService());
      }

      private Provider<ShipmentRepo> getShipmentRepoProvider() {
        Object local = shipmentRepoProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          shipmentRepoProvider = (Provider<ShipmentRepo>) local;
        }
        return (Provider<ShipmentRepo>) local;
      }

      private AdditionalShippingCostViewModel_AssistedFactory getAdditionalShippingCostViewModel_AssistedFactory(
          ) {
        return AdditionalShippingCostViewModel_AssistedFactory_Factory.newInstance(getShipmentRepoProvider());
      }

      private Provider<AdditionalShippingCostViewModel_AssistedFactory> getAdditionalShippingCostViewModel_AssistedFactoryProvider(
          ) {
        Object local = additionalShippingCostViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          additionalShippingCostViewModel_AssistedFactoryProvider = (Provider<AdditionalShippingCostViewModel_AssistedFactory>) local;
        }
        return (Provider<AdditionalShippingCostViewModel_AssistedFactory>) local;
      }

      private TransporterRepo getTransporterRepo() {
        return new TransporterRepo(DaggerMainApp_HiltComponents_ApplicationC.this.getAppExecutors(), DaggerMainApp_HiltComponents_ApplicationC.this.getShipmentDetailPerLocationService());
      }

      private Provider<TransporterRepo> getTransporterRepoProvider() {
        Object local = transporterRepoProvider;
        if (local == null) {
          local = new SwitchingProvider<>(3);
          transporterRepoProvider = (Provider<TransporterRepo>) local;
        }
        return (Provider<TransporterRepo>) local;
      }

      private DetailPerLocationViewModel_AssistedFactory getDetailPerLocationViewModel_AssistedFactory(
          ) {
        return DetailPerLocationViewModel_AssistedFactory_Factory.newInstance(getTransporterRepoProvider());
      }

      private Provider<DetailPerLocationViewModel_AssistedFactory> getDetailPerLocationViewModel_AssistedFactoryProvider(
          ) {
        Object local = detailPerLocationViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          detailPerLocationViewModel_AssistedFactoryProvider = (Provider<DetailPerLocationViewModel_AssistedFactory>) local;
        }
        return (Provider<DetailPerLocationViewModel_AssistedFactory>) local;
      }

      private FirebaseManualRepo getFirebaseManualRepo() {
        return new FirebaseManualRepo(DaggerMainApp_HiltComponents_ApplicationC.this.getAppExecutors(), DaggerMainApp_HiltComponents_ApplicationC.this.getFirebaseManualService());
      }

      private Provider<FirebaseManualRepo> getFirebaseManualRepoProvider() {
        Object local = firebaseManualRepoProvider;
        if (local == null) {
          local = new SwitchingProvider<>(5);
          firebaseManualRepoProvider = (Provider<FirebaseManualRepo>) local;
        }
        return (Provider<FirebaseManualRepo>) local;
      }

      private FirebaseManualViewModel_AssistedFactory getFirebaseManualViewModel_AssistedFactory() {
        return FirebaseManualViewModel_AssistedFactory_Factory.newInstance(getFirebaseManualRepoProvider());
      }

      private Provider<FirebaseManualViewModel_AssistedFactory> getFirebaseManualViewModel_AssistedFactoryProvider(
          ) {
        Object local = firebaseManualViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(4);
          firebaseManualViewModel_AssistedFactoryProvider = (Provider<FirebaseManualViewModel_AssistedFactory>) local;
        }
        return (Provider<FirebaseManualViewModel_AssistedFactory>) local;
      }

      private IdentityRepo getIdentityRepo() {
        return new IdentityRepo(DaggerMainApp_HiltComponents_ApplicationC.this.getAppExecutors(), DaggerMainApp_HiltComponents_ApplicationC.this.getIdentityService());
      }

      private Provider<IdentityRepo> getIdentityRepoProvider() {
        Object local = identityRepoProvider;
        if (local == null) {
          local = new SwitchingProvider<>(7);
          identityRepoProvider = (Provider<IdentityRepo>) local;
        }
        return (Provider<IdentityRepo>) local;
      }

      private IdentityViewModel_AssistedFactory getIdentityViewModel_AssistedFactory() {
        return IdentityViewModel_AssistedFactory_Factory.newInstance(getIdentityRepoProvider());
      }

      private Provider<IdentityViewModel_AssistedFactory> getIdentityViewModel_AssistedFactoryProvider(
          ) {
        Object local = identityViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(6);
          identityViewModel_AssistedFactoryProvider = (Provider<IdentityViewModel_AssistedFactory>) local;
        }
        return (Provider<IdentityViewModel_AssistedFactory>) local;
      }

      private PostAutoAssignLocationViewModel_AssistedFactory getPostAutoAssignLocationViewModel_AssistedFactory(
          ) {
        return PostAutoAssignLocationViewModel_AssistedFactory_Factory.newInstance(getShipmentRepoProvider());
      }

      private Provider<PostAutoAssignLocationViewModel_AssistedFactory> getPostAutoAssignLocationViewModel_AssistedFactoryProvider(
          ) {
        Object local = postAutoAssignLocationViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(8);
          postAutoAssignLocationViewModel_AssistedFactoryProvider = (Provider<PostAutoAssignLocationViewModel_AssistedFactory>) local;
        }
        return (Provider<PostAutoAssignLocationViewModel_AssistedFactory>) local;
      }

      private ReasonAllViewModel_AssistedFactory getReasonAllViewModel_AssistedFactory() {
        return ReasonAllViewModel_AssistedFactory_Factory.newInstance(getShipmentRepoProvider());
      }

      private Provider<ReasonAllViewModel_AssistedFactory> getReasonAllViewModel_AssistedFactoryProvider(
          ) {
        Object local = reasonAllViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(9);
          reasonAllViewModel_AssistedFactoryProvider = (Provider<ReasonAllViewModel_AssistedFactory>) local;
        }
        return (Provider<ReasonAllViewModel_AssistedFactory>) local;
      }

      private SendLocationRepo getSendLocationRepo() {
        return new SendLocationRepo(DaggerMainApp_HiltComponents_ApplicationC.this.getAppExecutors(), DaggerMainApp_HiltComponents_ApplicationC.this.getSendLocationService());
      }

      private Provider<SendLocationRepo> getSendLocationRepoProvider() {
        Object local = sendLocationRepoProvider;
        if (local == null) {
          local = new SwitchingProvider<>(11);
          sendLocationRepoProvider = (Provider<SendLocationRepo>) local;
        }
        return (Provider<SendLocationRepo>) local;
      }

      private SendLocationViewModel_AssistedFactory getSendLocationViewModel_AssistedFactory() {
        return SendLocationViewModel_AssistedFactory_Factory.newInstance(getSendLocationRepoProvider());
      }

      private Provider<SendLocationViewModel_AssistedFactory> getSendLocationViewModel_AssistedFactoryProvider(
          ) {
        Object local = sendLocationViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(10);
          sendLocationViewModel_AssistedFactoryProvider = (Provider<SendLocationViewModel_AssistedFactory>) local;
        }
        return (Provider<SendLocationViewModel_AssistedFactory>) local;
      }

      private ShipmentViewModel_AssistedFactory getShipmentViewModel_AssistedFactory() {
        return ShipmentViewModel_AssistedFactory_Factory.newInstance(getShipmentRepoProvider());
      }

      private Provider<ShipmentViewModel_AssistedFactory> getShipmentViewModel_AssistedFactoryProvider(
          ) {
        Object local = shipmentViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(12);
          shipmentViewModel_AssistedFactoryProvider = (Provider<ShipmentViewModel_AssistedFactory>) local;
        }
        return (Provider<ShipmentViewModel_AssistedFactory>) local;
      }

      private SimplePODViewModel_AssistedFactory getSimplePODViewModel_AssistedFactory() {
        return SimplePODViewModel_AssistedFactory_Factory.newInstance(getShipmentRepoProvider());
      }

      private Provider<SimplePODViewModel_AssistedFactory> getSimplePODViewModel_AssistedFactoryProvider(
          ) {
        Object local = simplePODViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(13);
          simplePODViewModel_AssistedFactoryProvider = (Provider<SimplePODViewModel_AssistedFactory>) local;
        }
        return (Provider<SimplePODViewModel_AssistedFactory>) local;
      }

      private StatusConfirmationViewModel_AssistedFactory getStatusConfirmationViewModel_AssistedFactory(
          ) {
        return StatusConfirmationViewModel_AssistedFactory_Factory.newInstance(getShipmentRepoProvider());
      }

      private Provider<StatusConfirmationViewModel_AssistedFactory> getStatusConfirmationViewModel_AssistedFactoryProvider(
          ) {
        Object local = statusConfirmationViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(14);
          statusConfirmationViewModel_AssistedFactoryProvider = (Provider<StatusConfirmationViewModel_AssistedFactory>) local;
        }
        return (Provider<StatusConfirmationViewModel_AssistedFactory>) local;
      }

      private UploadDocumentImageRepo getUploadDocumentImageRepo() {
        return new UploadDocumentImageRepo(DaggerMainApp_HiltComponents_ApplicationC.this.getAppExecutors(), DaggerMainApp_HiltComponents_ApplicationC.this.getUploadService());
      }

      private Provider<UploadDocumentImageRepo> getUploadDocumentImageRepoProvider() {
        Object local = uploadDocumentImageRepoProvider;
        if (local == null) {
          local = new SwitchingProvider<>(16);
          uploadDocumentImageRepoProvider = (Provider<UploadDocumentImageRepo>) local;
        }
        return (Provider<UploadDocumentImageRepo>) local;
      }

      private SubmitPODViewModel_AssistedFactory getSubmitPODViewModel_AssistedFactory() {
        return SubmitPODViewModel_AssistedFactory_Factory.newInstance(getUploadDocumentImageRepoProvider());
      }

      private Provider<SubmitPODViewModel_AssistedFactory> getSubmitPODViewModel_AssistedFactoryProvider(
          ) {
        Object local = submitPODViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(15);
          submitPODViewModel_AssistedFactoryProvider = (Provider<SubmitPODViewModel_AssistedFactory>) local;
        }
        return (Provider<SubmitPODViewModel_AssistedFactory>) local;
      }

      private UpdateStatusViewModel_AssistedFactory getUpdateStatusViewModel_AssistedFactory() {
        return UpdateStatusViewModel_AssistedFactory_Factory.newInstance(getShipmentRepoProvider());
      }

      private Provider<UpdateStatusViewModel_AssistedFactory> getUpdateStatusViewModel_AssistedFactoryProvider(
          ) {
        Object local = updateStatusViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(17);
          updateStatusViewModel_AssistedFactoryProvider = (Provider<UpdateStatusViewModel_AssistedFactory>) local;
        }
        return (Provider<UpdateStatusViewModel_AssistedFactory>) local;
      }

      private UploadAccidentViewModel_AssistedFactory getUploadAccidentViewModel_AssistedFactory() {
        return UploadAccidentViewModel_AssistedFactory_Factory.newInstance(getUploadDocumentImageRepoProvider());
      }

      private Provider<UploadAccidentViewModel_AssistedFactory> getUploadAccidentViewModel_AssistedFactoryProvider(
          ) {
        Object local = uploadAccidentViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(18);
          uploadAccidentViewModel_AssistedFactoryProvider = (Provider<UploadAccidentViewModel_AssistedFactory>) local;
        }
        return (Provider<UploadAccidentViewModel_AssistedFactory>) local;
      }

      private UploadBASPViewModel_AssistedFactory getUploadBASPViewModel_AssistedFactory() {
        return UploadBASPViewModel_AssistedFactory_Factory.newInstance(getUploadDocumentImageRepoProvider());
      }

      private Provider<UploadBASPViewModel_AssistedFactory> getUploadBASPViewModel_AssistedFactoryProvider(
          ) {
        Object local = uploadBASPViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(19);
          uploadBASPViewModel_AssistedFactoryProvider = (Provider<UploadBASPViewModel_AssistedFactory>) local;
        }
        return (Provider<UploadBASPViewModel_AssistedFactory>) local;
      }

      private UploadPODViewModel_AssistedFactory getUploadPODViewModel_AssistedFactory() {
        return UploadPODViewModel_AssistedFactory_Factory.newInstance(getUploadDocumentImageRepoProvider());
      }

      private Provider<UploadPODViewModel_AssistedFactory> getUploadPODViewModel_AssistedFactoryProvider(
          ) {
        Object local = uploadPODViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(20);
          uploadPODViewModel_AssistedFactoryProvider = (Provider<UploadPODViewModel_AssistedFactory>) local;
        }
        return (Provider<UploadPODViewModel_AssistedFactory>) local;
      }

      private UploadSignatureBastViewModel_AssistedFactory getUploadSignatureBastViewModel_AssistedFactory(
          ) {
        return UploadSignatureBastViewModel_AssistedFactory_Factory.newInstance(getUploadDocumentImageRepoProvider());
      }

      private Provider<UploadSignatureBastViewModel_AssistedFactory> getUploadSignatureBastViewModel_AssistedFactoryProvider(
          ) {
        Object local = uploadSignatureBastViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(21);
          uploadSignatureBastViewModel_AssistedFactoryProvider = (Provider<UploadSignatureBastViewModel_AssistedFactory>) local;
        }
        return (Provider<UploadSignatureBastViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(16).put("com.fli.elogistic.driver.viewmodel.AdditionalShippingCostViewModel", (Provider) getAdditionalShippingCostViewModel_AssistedFactoryProvider()).put("com.fli.elogistic.driver.viewmodel.DetailPerLocationViewModel", (Provider) getDetailPerLocationViewModel_AssistedFactoryProvider()).put("com.fli.elogistic.driver.viewmodel.FirebaseManualViewModel", (Provider) getFirebaseManualViewModel_AssistedFactoryProvider()).put("com.fli.elogistic.driver.viewmodel.IdentityViewModel", (Provider) getIdentityViewModel_AssistedFactoryProvider()).put("com.fli.elogistic.driver.viewmodel.PostAutoAssignLocationViewModel", (Provider) getPostAutoAssignLocationViewModel_AssistedFactoryProvider()).put("com.fli.elogistic.driver.viewmodel.ReasonAllViewModel", (Provider) getReasonAllViewModel_AssistedFactoryProvider()).put("com.fli.elogistic.driver.viewmodel.SendLocationViewModel", (Provider) getSendLocationViewModel_AssistedFactoryProvider()).put("com.fli.elogistic.driver.viewmodel.ShipmentViewModel", (Provider) getShipmentViewModel_AssistedFactoryProvider()).put("com.fli.elogistic.driver.viewmodel.SimplePODViewModel", (Provider) getSimplePODViewModel_AssistedFactoryProvider()).put("com.fli.elogistic.driver.viewmodel.StatusConfirmationViewModel", (Provider) getStatusConfirmationViewModel_AssistedFactoryProvider()).put("com.fli.elogistic.driver.viewmodel.SubmitPODViewModel", (Provider) getSubmitPODViewModel_AssistedFactoryProvider()).put("com.fli.elogistic.driver.viewmodel.UpdateStatusViewModel", (Provider) getUpdateStatusViewModel_AssistedFactoryProvider()).put("com.fli.elogistic.driver.viewmodel.UploadAccidentViewModel", (Provider) getUploadAccidentViewModel_AssistedFactoryProvider()).put("com.fli.elogistic.driver.viewmodel.UploadBASPViewModel", (Provider) getUploadBASPViewModel_AssistedFactoryProvider()).put("com.fli.elogistic.driver.viewmodel.UploadPODViewModel", (Provider) getUploadPODViewModel_AssistedFactoryProvider()).put("com.fli.elogistic.driver.viewmodel.UploadSignatureBastViewModel", (Provider) getUploadSignatureBastViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApp_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectBaseActivity(BaseActivity baseActivity) {
        injectBaseActivity2(baseActivity);
      }

      @Override
      public void injectSplashActivity(SplashActivity splashActivity) {
        injectSplashActivity2(splashActivity);
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private BaseActivity injectBaseActivity2(BaseActivity instance) {
        BaseActivity_MembersInjector.injectAppExecutors(instance, DaggerMainApp_HiltComponents_ApplicationC.this.getAppExecutors());
        BaseActivity_MembersInjector.injectSp(instance, DaggerMainApp_HiltComponents_ApplicationC.this.getSharedPreferences());
        return instance;
      }

      private SplashActivity injectSplashActivity2(SplashActivity instance) {
        SplashActivity_MembersInjector.injectSp(instance, DaggerMainApp_HiltComponents_ApplicationC.this.getSharedPreferences());
        return instance;
      }

      private final class FragmentCBuilder implements MainApp_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MainApp_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MainApp_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApp_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectBaseFragment(BaseFragment baseFragment) {
          injectBaseFragment2(baseFragment);
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private BaseFragment injectBaseFragment2(BaseFragment instance) {
          BaseFragment_MembersInjector.injectSp(instance, DaggerMainApp_HiltComponents_ApplicationC.this.getSharedPreferences());
          BaseFragment_MembersInjector.injectAppExecutors(instance, DaggerMainApp_HiltComponents_ApplicationC.this.getAppExecutors());
          return instance;
        }

        private final class ViewWithFragmentCBuilder implements MainApp_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MainApp_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MainApp_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MainApp_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MainApp_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MainApp_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.fli.elogistic.driver.viewmodel.AdditionalShippingCostViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getAdditionalShippingCostViewModel_AssistedFactory();

            case 1: // com.fli.elogistic.driver.repo.ShipmentRepo 
            return (T) ActivityCImpl.this.getShipmentRepo();

            case 2: // com.fli.elogistic.driver.viewmodel.DetailPerLocationViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getDetailPerLocationViewModel_AssistedFactory();

            case 3: // com.fli.elogistic.driver.repo.TransporterRepo 
            return (T) ActivityCImpl.this.getTransporterRepo();

            case 4: // com.fli.elogistic.driver.viewmodel.FirebaseManualViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getFirebaseManualViewModel_AssistedFactory();

            case 5: // com.fli.elogistic.driver.repo.FirebaseManualRepo 
            return (T) ActivityCImpl.this.getFirebaseManualRepo();

            case 6: // com.fli.elogistic.driver.viewmodel.IdentityViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getIdentityViewModel_AssistedFactory();

            case 7: // com.fli.elogistic.driver.repo.IdentityRepo 
            return (T) ActivityCImpl.this.getIdentityRepo();

            case 8: // com.fli.elogistic.driver.viewmodel.PostAutoAssignLocationViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getPostAutoAssignLocationViewModel_AssistedFactory();

            case 9: // com.fli.elogistic.driver.viewmodel.ReasonAllViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getReasonAllViewModel_AssistedFactory();

            case 10: // com.fli.elogistic.driver.viewmodel.SendLocationViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getSendLocationViewModel_AssistedFactory();

            case 11: // com.fli.elogistic.driver.repo.SendLocationRepo 
            return (T) ActivityCImpl.this.getSendLocationRepo();

            case 12: // com.fli.elogistic.driver.viewmodel.ShipmentViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getShipmentViewModel_AssistedFactory();

            case 13: // com.fli.elogistic.driver.viewmodel.SimplePODViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getSimplePODViewModel_AssistedFactory();

            case 14: // com.fli.elogistic.driver.viewmodel.StatusConfirmationViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getStatusConfirmationViewModel_AssistedFactory();

            case 15: // com.fli.elogistic.driver.viewmodel.SubmitPODViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getSubmitPODViewModel_AssistedFactory();

            case 16: // com.fli.elogistic.driver.repo.UploadDocumentImageRepo 
            return (T) ActivityCImpl.this.getUploadDocumentImageRepo();

            case 17: // com.fli.elogistic.driver.viewmodel.UpdateStatusViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getUpdateStatusViewModel_AssistedFactory();

            case 18: // com.fli.elogistic.driver.viewmodel.UploadAccidentViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getUploadAccidentViewModel_AssistedFactory();

            case 19: // com.fli.elogistic.driver.viewmodel.UploadBASPViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getUploadBASPViewModel_AssistedFactory();

            case 20: // com.fli.elogistic.driver.viewmodel.UploadPODViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getUploadPODViewModel_AssistedFactory();

            case 21: // com.fli.elogistic.driver.viewmodel.UploadSignatureBastViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getUploadSignatureBastViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements MainApp_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MainApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MainApp_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
