package com.fli.elogistic.driver.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000bH\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0016H\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\rH\u0007J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010&\u001a\u00020\'2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\f\u0010(\u001a\u00020\u0004*\u00020\u0004H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/fli/elogistic/driver/di/AppModule;", "", "()V", "httpClient", "Lokhttp3/OkHttpClient$Builder;", "getHttpClient", "()Lokhttp3/OkHttpClient$Builder;", "loggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "kotlin.jvm.PlatformType", "provideDb", "Lcom/fli/elogistic/driver/db/FLIDriverDb;", "app", "Landroid/app/Application;", "provideFakeGpsDao", "Lcom/fli/elogistic/driver/db/FakeGpsDao;", "db", "provideFirebaseManualService", "Lcom/fli/elogistic/driver/services/FirebaseManualService;", "retrofit", "Lretrofit2/Retrofit;", "provideGson", "Lcom/google/gson/Gson;", "provideImageListDao", "Lcom/fli/elogistic/driver/db/ImageListDao;", "provideOIdentityService", "Lcom/fli/elogistic/driver/services/IdentityService;", "provideRetrofit", "gson", "provideSendLocationService", "Lcom/fli/elogistic/driver/services/SendLocationService;", "provideSharedPreferences", "Landroid/content/SharedPreferences;", "application", "provideShipmentService", "Lcom/fli/elogistic/driver/services/ShipmentService;", "provideTransporterService", "Lcom/fli/elogistic/driver/services/ShipmentDetailPerLocationService;", "provideUploadDocumentService", "Lcom/fli/elogistic/driver/services/UploadService;", "byPassCertificate", "app_stagingDebug"})
@dagger.Module()
public final class AppModule {
    private static final okhttp3.logging.HttpLoggingInterceptor loggingInterceptor = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.fli.elogistic.driver.di.AppModule INSTANCE = null;
    
    private final okhttp3.OkHttpClient.Builder getHttpClient() {
        return null;
    }
    
    private final okhttp3.OkHttpClient.Builder byPassCertificate(okhttp3.OkHttpClient.Builder $this$byPassCertificate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.fli.elogistic.driver.services.IdentityService provideOIdentityService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.fli.elogistic.driver.services.ShipmentService provideShipmentService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.fli.elogistic.driver.services.UploadService provideUploadDocumentService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.fli.elogistic.driver.services.ShipmentDetailPerLocationService provideTransporterService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.fli.elogistic.driver.services.FirebaseManualService provideFirebaseManualService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.fli.elogistic.driver.services.SendLocationService provideSendLocationService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.fli.elogistic.driver.db.FLIDriverDb provideDb(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.SharedPreferences provideSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.fli.elogistic.driver.db.FakeGpsDao provideFakeGpsDao(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.db.FLIDriverDb db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.fli.elogistic.driver.db.ImageListDao provideImageListDao(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.db.FLIDriverDb db) {
        return null;
    }
    
    private AppModule() {
        super();
    }
}