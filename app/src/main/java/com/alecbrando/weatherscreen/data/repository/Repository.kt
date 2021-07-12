package com.alecbrando.weatherscreen.data.repository

import com.alecbrando.weatherscreen.data.api.RetrofitInstance
import com.alecbrando.weatherscreen.data.model.DailyWeather
import retrofit2.Response

class Repository {
    suspend fun getWeeklyWeather(): Response<DailyWeather> {
        return RetrofitInstance.api.getWeeklyWeather()
    }
}