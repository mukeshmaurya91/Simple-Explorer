package com.maurya91.simpleexplorer.data


import com.maurya91.simpleexplorer.common.dispatcher.CoroutineDispatcherProvider
import com.maurya91.simpleexplorer.common.dispatcher.RealCoroutineDispatcherProvider
import com.maurya91.simpleexplorer.data.remote.ApiService
import javax.inject.Inject

class AppRepository @Inject constructor(
    val api: ApiService,
    val dispatcherProvider: CoroutineDispatcherProvider
    ){


}