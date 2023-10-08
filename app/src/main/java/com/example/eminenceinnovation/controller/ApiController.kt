package com.example.eminenceinnovation.controller

import com.example.eminenceinnovation.api.ApiService
import com.example.eminenceinnovation.model.Data
import com.example.eminenceinnovation.model.Limit
import com.example.eminenceinnovation.model.LiveMatch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ApiController(private val view: View) {

    private val apiService = ApiService.create()

    fun fetchLiveMatches() {
        val call = apiService.getLiveMatches()
        call.enqueue(object : Callback<LiveMatch> {
            override fun onResponse(call: Call<LiveMatch>, response: Response<LiveMatch>) {
                if (response.isSuccessful) {
                    val liveMatches = response.body()
                    view.onLiveMatchesFetched(liveMatches!!.data)
                } else {
                    view.onApiError()
                }
            }

            override fun onFailure(call: Call<LiveMatch>, t: Throwable) {
                view.onApiError()
            }
        })
    }

    interface View {
        //fun onLiveMatchesFetched(liveMatches: LiveMatch?)
       fun onLiveMatchesFetched(liveMatches: MutableList<Data>)
        fun onApiError()
    }
}
