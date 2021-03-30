package com.alfred0ga.socioinfonavitandroid.repository

import com.alfred0ga.socioinfonavitandroid.api.RetrofitInstance

class InfonavitRepository {
    suspend fun login() = RetrofitInstance.retrofit.login()
    suspend fun getWallets() = RetrofitInstance.retrofit.getWallets()
    suspend fun getLandingBenevits() = RetrofitInstance.retrofit.getLandingBenevits()
    suspend fun  logout() = RetrofitInstance.retrofit.logout()
}