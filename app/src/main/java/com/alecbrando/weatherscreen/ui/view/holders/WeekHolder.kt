package com.alecbrando.weatherscreen.ui.view.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.alecbrando.weatherscreen.R
import com.google.android.material.textview.MaterialTextView

class WeekHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var weekDayHolder = itemView.findViewById<MaterialTextView>(R.id.week_day_holder)
    var weekLowHolder = itemView.findViewById<MaterialTextView>(R.id.week_low_holder)
    var weekHighHolder = itemView.findViewById<MaterialTextView>(R.id.week_high_holder)
}