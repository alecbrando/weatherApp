package com.alecbrando.weatherscreen.ui.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alecbrando.weatherscreen.R
import com.alecbrando.weatherscreen.ui.view.holders.WeekHolder
import com.alecbrando.weatherscreen.ui.viewmodel.WeatherViewModel

class WeekAdapter(private val list: MutableList<WeatherViewModel.WeekWeather>) : RecyclerView.Adapter<WeekHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeekHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.week_view_holder, parent, false)
        return WeekHolder(view)
    }

    override fun onBindViewHolder(holder: WeekHolder, position: Int) {
        holder.weekDayHolder.text = list[position].day
        holder.weekLowHolder.text = list[position].low
        holder.weekHighHolder.text = list[position].high
    }

    override fun getItemCount() = list.size

}