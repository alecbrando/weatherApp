package com.alecbrando.weatherscreen.ui.view.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.alecbrando.weatherscreen.R
import com.google.android.material.textview.MaterialTextView

class DayHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var dayTimeHolder = itemView.findViewById<MaterialTextView>(R.id.day_time_holder)
    var dayTempHolder = itemView.findViewById<MaterialTextView>(R.id.day_temp_holder)
}