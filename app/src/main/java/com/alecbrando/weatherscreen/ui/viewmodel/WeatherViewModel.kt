package com.alecbrando.weatherscreen.ui.viewmodel

import androidx.lifecycle.ViewModel

class WeatherViewModel : ViewModel() {
    data class DayWeather(val time: String, val temp: String)

    private val hour1pm = DayWeather("1pm", "72")
    private val hour2pm = DayWeather("2pm", "78")
    private val hour3pm = DayWeather("3pm", "79")
    private val hour4pm = DayWeather("4pm", "78")
    private val hour5pm = DayWeather("5pm", "74")
    private val hour6pm = DayWeather("6pm", "71")

    val day = mutableListOf<DayWeather>(hour1pm, hour2pm, hour3pm, hour4pm, hour5pm, hour6pm)

    data class WeekWeather(val day: String, val low: String, val high: String)
    private val monday = WeekWeather("Monday", "75", "55")
    private val tuesday = WeekWeather("Tuesday", "84", "55")
    private val wednesday = WeekWeather("Wednesday", "88", "61")
    private val thursday = WeekWeather("Thursday", "88", "63")
    private val friday = WeekWeather("Friday", "88", "62")
    private val saturday = WeekWeather("Saturday", "84", "61")
    private val sunday = WeekWeather("Sunday", "81", "59")

    val week = mutableListOf<WeekWeather>(monday, tuesday, wednesday, thursday, friday, saturday, sunday)

}