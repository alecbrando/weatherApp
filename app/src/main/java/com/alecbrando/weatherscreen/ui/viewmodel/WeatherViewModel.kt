package com.alecbrando.weatherscreen.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alecbrando.weatherscreen.data.model.DailyWeather
import com.alecbrando.weatherscreen.data.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class WeatherViewModel(private val repository: Repository) : ViewModel() {
    private val _data : MutableLiveData<Response<DailyWeather>> = MutableLiveData()

    fun getData() : LiveData<Response<DailyWeather>>{
        return _data
    }

    fun getWeeklyWeather(){
        viewModelScope.launch {
            val res: Response<DailyWeather> = repository.getWeeklyWeather()
            _data.value = res
        }
    }

}