package com.alecbrando.weatherscreen.data.api

import com.alecbrando.weatherscreen.data.model.DailyWeather
import com.alecbrando.weatherscreen.utils.Constants
import retrofit2.Response
import retrofit2.http.GET

interface WeatherApi {
    @GET("onecall?lat=33.448376&lon=-112.074036&units=imperial&exclude=minutely,pop&appid=${Constants.API_KEY}")
    suspend fun getWeeklyWeather() : Response<DailyWeather>
}