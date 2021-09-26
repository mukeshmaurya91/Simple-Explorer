package com.maurya91.simpleexplorer.di

import com.maurya91.simpleexplorer.common.dispatcher.CoroutineDispatcherProvider
import com.maurya91.simpleexplorer.common.dispatcher.RealCoroutineDispatcherProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DispatcherModule {
    @Provides
    @Singleton
    fun providesCoroutineDispatcher(): CoroutineDispatcherProvider {
        return RealCoroutineDispatcherProvider()
    }
}
