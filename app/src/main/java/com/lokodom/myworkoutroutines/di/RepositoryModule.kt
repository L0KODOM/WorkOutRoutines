package com.lokodom.myworkoutroutines.di

import com.lokodom.myworkoutroutines.data.repository.WorkOutRepository
import com.lokodom.myworkoutroutines.data.repository.WorkOutRepositoryImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindRepository(repo: WorkOutRepositoryImp): WorkOutRepository
}