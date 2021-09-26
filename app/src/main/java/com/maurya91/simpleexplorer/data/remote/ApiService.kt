package com.maurya91.simpleexplorer.data.remote

import retrofit2.Response
import retrofit2.http.GET


interface ApiService {

    @GET("/api/")
    suspend fun getPeoples(): Response<Unit>

}