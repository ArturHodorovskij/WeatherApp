package com.artur_hodorodvskij.weatherapp.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
        private const val BASE_URL = "https://api.weatherapi.com/"
        private val retrofit: Retrofit by lazy {
            val client = OkHttpClient.Builder().build()
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
        }
        val api: WeatherApi by lazy { retrofit.create(WeatherApi::class.java) }
    }
