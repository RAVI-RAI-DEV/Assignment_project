package com.example.eminenceinnovation

import android.annotation.SuppressLint
import android.icu.text.SimpleDateFormat
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.eminenceinnovation.adapter.LiveMatchesAdapter
import com.example.eminenceinnovation.controller.ApiController
import com.example.eminenceinnovation.model.Data
import java.util.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity(), ApiController.View {

    private val apiController = ApiController(this)
    private lateinit var recyclerView1: RecyclerView
    private lateinit var recyclerView2: RecyclerView
    private lateinit var tv_tomorrow: TextView
    private lateinit var tv_today: TextView
    private lateinit var tv_inplay: TextView
    private lateinit var adapter1: LiveMatchesAdapter
    private lateinit var adapter2: LiveMatchesAdapter

    private lateinit var allMatches: MutableList<Data>
    private lateinit var currentFilter: Filter

    enum class Filter {
        INPLAY, TODAY, TOMORROW
    }


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tv_inplay = findViewById(R.id.tv_inplay)
        tv_today = findViewById(R.id.tv_today)
        tv_tomorrow = findViewById(R.id.tv_tomorrow)

        recyclerView1 = findViewById(R.id.recyclerView1)
        recyclerView1.layoutManager = LinearLayoutManager(this)
        adapter1 = LiveMatchesAdapter()
        recyclerView1.adapter = adapter1

        recyclerView2 = findViewById(R.id.recyclerView2)
        recyclerView2.layoutManager = LinearLayoutManager(this)
        adapter2 = LiveMatchesAdapter()
        recyclerView2.adapter = adapter2

        // Initialize the filter to show "Inplay" matches by default
        currentFilter = Filter.INPLAY

        // Trigger the API call
        apiController.fetchLiveMatches()

        // Set click listeners for filter buttons
        tv_inplay.setOnClickListener {
            selectButton(tv_inplay, Filter.INPLAY)
            updateUIWithFilteredMatches(Filter.INPLAY)
        }

        tv_today.setOnClickListener {
            selectButton(tv_today, Filter.TODAY)
            updateUIWithFilteredMatches(Filter.TODAY)
        }

        tv_tomorrow.setOnClickListener {
            selectButton(tv_tomorrow, Filter.TOMORROW)
            updateUIWithFilteredMatches(Filter.TOMORROW)
        }
    }

    override fun onLiveMatchesFetched(matches: MutableList<Data>) {
        // Store all matches in the `allMatches` list
        allMatches = matches

        // Filter and display matches based on the current filter
        updateUIWithFilteredMatches(currentFilter)
    }

    private fun updateUIWithFilteredMatches(filter: Filter) {
        currentFilter = filter

        val filteredMatches = when (filter) {
            Filter.INPLAY -> filterMatchesByCategory("Inplay")
            Filter.TODAY -> filterMatchesByCategory("Today")
            Filter.TOMORROW -> filterMatchesByCategory("Tomorrow")
        }

        // Filter matches by sportId
        val cricketMatches = mutableListOf<Data>()
        val soccerMatches = mutableListOf<Data>()

        for (match in filteredMatches) {
            when (match.sportId) {
                "4" -> cricketMatches.add(match)
                "1" -> soccerMatches.add(match)
                // Add more cases if needed for other sportIds
            }
        }

        // Use the filtered lists to update the adapters
        adapter1.setData(cricketMatches)
        adapter2.setData(soccerMatches)

        // Display the counts as needed
        Toast.makeText(
            applicationContext,
            "Filtered ${filter.name}: ${filteredMatches.size}",
            Toast.LENGTH_SHORT
        ).show()
    }

    private fun filterMatchesByCategory(category: String): List<Data> {
        return allMatches.filter { categorizeMatch(it) == category }
    }

    private fun categorizeMatch(match: Data): String {
        val currentDate = Calendar.getInstance()

        val dateFormat = SimpleDateFormat("MM/dd/yyyy hh:mm:ss a", Locale.US)
        val openDate = dateFormat.parse(match.openDate)

        // Calculate the time difference between the current date and openDate
        val timeDifference = openDate.time - currentDate.timeInMillis
        val hoursDifference = TimeUnit.MILLISECONDS.toHours(timeDifference)

        // Categorize the match based on the time difference
        return when {
            hoursDifference < 0 -> "Inplay"
            hoursDifference < 24 -> "Today"
            else -> "Tomorrow"
        }
    }

    private fun selectButton(selectedButton: TextView, filter: Filter) {
        val buttons = listOf(tv_inplay, tv_today, tv_tomorrow)

        // Set all buttons to unselected style
        buttons.forEach { button ->
            button.background = ContextCompat.getDrawable(this, R.drawable.greybackground)
            button.setTextColor(ContextCompat.getColor(this, R.color.black))
        }

        // Set the selected button to selected style
        selectedButton.background =
            ContextCompat.getDrawable(this, R.drawable.rectangle_with_border)
        selectedButton.setTextColor(ContextCompat.getColor(this, R.color.white))
    }

    override fun onApiError() {
        // Handle API error
    }
}


