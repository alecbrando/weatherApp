package com.alecbrando.weatherscreen.data.api

import com.alecbrando.weatherscreen.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder().baseUrl(Constants.URL).addConverterFactory(MoshiConverterFactory.create()).build()
    }

    val api: WeatherApi by lazy {
        retrofit.create(WeatherApi::class.java)
    }
}