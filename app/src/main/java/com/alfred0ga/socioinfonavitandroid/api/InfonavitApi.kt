package com.alfred0ga.socioinfonavitandroid.api

import com.alfred0ga.socioinfonavitandroid.models.Wallets
import retrofit2.Response
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST

interface InfonavitApi {

    @POST("v1/login")
    suspend fun login()

    @GET("v1/member/wallets")
    suspend fun getWallets(): Response<List<Wallets>>

    @GET("v1/member/landing_benevits")
    suspend fun getLandingBenevits()

    @DELETE("v1/logout")
    suspend fun logout()
}