package com.alecbrando.weatherscreen.ui.view.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alecbrando.weatherscreen.R
import com.alecbrando.weatherscreen.ui.view.adapters.DayAdapter
import com.alecbrando.weatherscreen.ui.view.adapters.WeekAdapter
import com.alecbrando.weatherscreen.ui.viewmodel.WeatherViewModel

class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var viewModel : WeatherViewModel
    private var navController: NavController? = null
    private lateinit var dayRecycler : RecyclerView
    private lateinit var weekRecyclerView: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(WeatherViewModel::class.java)
        navController = Navigation.findNavController(view)
        dayRecycler = view.findViewById(R.id.day_recycler)
        weekRecyclerView = view.findViewById(R.id.week_recycler)
        dayRecycler.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        weekRecyclerView.layoutManager = LinearLayoutManager(activity)
        //day recycler adapter set up
        dayRecycler.adapter = DayAdapter(viewModel.day)
        //week recycler adapter set up
        weekRecyclerView.adapter = WeekAdapter(viewModel.week)
    }
}