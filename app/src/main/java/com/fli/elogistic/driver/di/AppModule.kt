package com.fli.elogistic.driver.di

import android.app.Application
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import androidx.room.Room
import com.fli.elogistic.driver.db.FLIDriverDb
import com.fli.elogistic.driver.db.FakeGpsDao
import com.fli.elogistic.driver.db.ImageListDao
import com.fli.elogistic.driver.services.*
import com.fli.elogistic.driver.util.LiveDataCallAdapterFactory
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonParser
import com.google.gson.JsonSyntaxException
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import timber.log.Timber
import java.security.cert.CertificateException
import java.security.cert.X509Certificate
import java.util.concurrent.TimeUnit
import javax.inject.Singleton
import javax.net.ssl.SSLContext
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager

@Module
@InstallIn(ApplicationComponent::class)

object AppModule {
    private val loggingInterceptor = HttpLoggingInterceptor { message ->
        val logName = "OkHttp"
        Timber.tag(logName)
        if (!message.startsWith("(")) {
            Timber.d(message)
            return@HttpLoggingInterceptor
        }
        try {
            val prettyPrintJson = GsonBuilder()
                .setPrettyPrinting()
                .create()
                .toJson(JsonParser().parse(message))
            Timber.d(prettyPrintJson)
        } catch (e: JsonSyntaxException) {
            Timber.d(message)
        }
    }.setLevel(HttpLoggingInterceptor.Level.BODY)

    private val httpClient: OkHttpClient.Builder
        get() = OkHttpClient.Builder()
            .connectTimeout(6, TimeUnit.SECONDS)
            .readTimeout(12, TimeUnit.SECONDS)
            .writeTimeout(6, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .addInterceptor(FirebaseManualHelper())
            // remove interceptor on production
            .addInterceptor(loggingInterceptor)
//            .addInterceptor(MockInterceptorHelper())
            .byPassCertificate()

    private fun OkHttpClient.Builder.byPassCertificate(): OkHttpClient.Builder {
        try {
            // Create a trust manager that does not validate certificate chains
            val trustAllCerts = arrayOf<TrustManager>(object : X509TrustManager {

                override fun getAcceptedIssuers(): Array<X509Certificate> {
                    return arrayOf()
                }

                @Throws(CertificateException::class)
                override fun checkClientTrusted(chain: Array<X509Certificate>, authType: String) {
                }

                @Throws(CertificateException::class)
                override fun checkServerTrusted(chain: Array<X509Certificate>, authType: String) {
                }
            })

            // Install the all-trusting trust manager
            val sslContext = SSLContext.getInstance("SSL")
            sslContext.init(null, trustAllCerts, java.security.SecureRandom())
            // Create an ssl socket factory with our all-trusting manager
            val sslSocketFactory = sslContext.socketFactory

            this.sslSocketFactory(sslSocketFactory, trustAllCerts[0] as X509TrustManager)
            this.hostnameVerifier { _, _ -> true }

            return this
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    @Singleton
    @Provides
    fun provideRetrofit(gson: Gson) : Retrofit =
        Retrofit.Builder()
        .client(httpClient.build())
//        .baseUrl(BuildConfig.BASE_URL)
        .baseUrl("http://192.168.1.6:8003")
        .addConverterFactory(GsonConverterFactory.create(gson))
        .addCallAdapterFactory(LiveDataCallAdapterFactory())
        .build()

    @Provides
    fun provideGson(): Gson = GsonBuilder().create()

    @Provides
    fun provideOIdentityService(retrofit: Retrofit): IdentityService = retrofit.create(IdentityService::class.java)

    @Provides
    fun provideShipmentService(retrofit: Retrofit): ShipmentService = retrofit.create(ShipmentService::class.java)

    @Provides
    fun provideUploadDocumentService(retrofit: Retrofit): UploadService = retrofit.create(UploadService::class.java)

    @Provides
    fun provideTransporterService(retrofit: Retrofit): ShipmentDetailPerLocationService = retrofit.create(ShipmentDetailPerLocationService::class.java)

    @Provides
    fun provideFirebaseManualService(retrofit: Retrofit): FirebaseManualService = retrofit.create(FirebaseManualService::class.java)

    @Provides
    fun provideSendLocationService(retrofit: Retrofit): SendLocationService = retrofit.create(SendLocationService::class.java)

//
//    @Singleton
//    @Provides
//    fun provideCharacterRemoteDataSource(characterService: CharacterService) = CharacterRemoteDataSource(characterService)
//

    @Provides
    fun provideDb(app: Application): FLIDriverDb {
        return Room
            .databaseBuilder(app, FLIDriverDb::class.java, "fli.db")
            .addMigrations(FLIDriverDb.MIGRATION_1_2)
            .build()
    }
//
//    @Singleton
//    @Provides
//    fun provideCharacterDao(db: AppDatabase) = db.characterDao()
//
//    @Singleton
//    @Provides
//    fun provideRepository(remoteDataSource: CharacterRemoteDataSource,
//                          localDataSource: CharacterDao) =
//        CharacterRepository(remoteDataSource, localDataSource)

    @Provides
    fun provideSharedPreferences(application: Application): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(application)
    }

    @Provides
    fun provideFakeGpsDao(db: FLIDriverDb): FakeGpsDao {
        return db.fakeGpsDao()
    }

    @Provides
    fun provideImageListDao(db: FLIDriverDb): ImageListDao {
        return db.imageListDao()
    }
}