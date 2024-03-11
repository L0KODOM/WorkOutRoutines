package com.lokodom.myworkoutroutines.di

import com.lokodom.myworkoutroutines.data.network.WorkOutApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideWorkOutApi(): WorkOutApi {
        return Retrofit.Builder()
            .baseUrl("https://wger.de/api/v2/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create()

    }

}