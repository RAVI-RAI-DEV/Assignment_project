package com.example.eminenceinnovation.api

import com.example.eminenceinnovation.model.LiveMatch
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


interface ApiService {

    @GET("v1-custom/getLiveMatches")
    fun getLiveMatches(): Call<LiveMatch>

    companion object {
        private const val BASE_URL = "https://centre.7wickets.net:4000/api/"


        fun create(): ApiService {

            val loggingInterceptor = HttpLoggingInterceptor()
            loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)

            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient.build())//
                .build()

            return retrofit.create(ApiService::class.java)
        }
    }

}