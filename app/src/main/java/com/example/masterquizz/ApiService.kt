package com.example.masterquizz

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {

    @POST("api/Autenticacao/login")
    fun getValidation(email: String, senha: String): Response<Login>

    fun getEndPointInstance(): ApiService {
        return Retrofit.Builder()
            .baseUrl("http://victorgontijo-001-site1.htempurl.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiService::class.java)
    }
}



