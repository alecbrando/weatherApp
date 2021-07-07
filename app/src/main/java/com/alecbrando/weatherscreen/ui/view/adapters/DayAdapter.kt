package com.alecbrando.weatherscreen.ui.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alecbrando.weatherscreen.R
import com.alecbrando.weatherscreen.ui.view.holders.DayHolder
import com.alecbrando.weatherscreen.ui.viewmodel.WeatherViewModel

class DayAdapter(private val list : MutableList<WeatherViewModel.DayWeather>) : RecyclerView.Adapter<DayHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.day_view_holder, parent, false)
        return DayHolder(view)
    }

    override fun onBindViewHolder(holder: DayHolder, position: Int) {
        holder.dayTimeHolder.text = list[position].time
        holder.dayTempHolder.text = list[position].temp
    }

    override fun getItemCount() = list.size
}