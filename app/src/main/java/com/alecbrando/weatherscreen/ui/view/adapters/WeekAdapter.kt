package com.alecbrando.weatherscreen.ui.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alecbrando.weatherscreen.R
import com.alecbrando.weatherscreen.data.model.Daily
import com.alecbrando.weatherscreen.ui.view.holders.WeekHolder
import java.text.SimpleDateFormat
import java.util.*

class WeekAdapter(private val list: List<Daily>) : RecyclerView.Adapter<WeekHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeekHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.week_view_holder, parent, false)
        return WeekHolder(view)
    }

    override fun onBindViewHolder(holder: WeekHolder, position: Int) {
        val reformatDay = getDateTime(list[position].dt.toString())
        holder.weekDayHolder.text = reformatDay
        holder.weekLowHolder.text = list[position].temp.min.toString()
        holder.weekHighHolder.text = list[position].temp.max.toString()
    }

    private fun getDateTime(s: String): String? {
        return try {
            val sdf = SimpleDateFormat("dd")
            val netDate = Date(s.toLong() * 1000 )
            sdf.format(netDate)
        } catch (e: Exception) {
            e.toString()
        }
    }

    override fun getItemCount() = list.size

}