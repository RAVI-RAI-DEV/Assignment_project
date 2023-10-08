package com.example.eminenceinnovation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.eminenceinnovation.R
import com.example.eminenceinnovation.model.Data

class LiveMatchesAdapter() : RecyclerView.Adapter<LiveMatchesAdapter.ViewHolder>() {

    private var liveMatches: List<Data> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_live_match, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val liveMatch = liveMatches[position]
        holder.bind(liveMatch)
    }

    override fun getItemCount(): Int {
        return liveMatches.size
    }

    fun setData(data: List<Data>) {
        liveMatches = data
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)

        fun bind(liveMatch: Data) {
            nameTextView.text = liveMatch.eventName
            // Bind other data fields here as needed
        }
    }
}
