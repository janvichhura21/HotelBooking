package com.example.hotelbooking.booking

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hotelbooking.databinding.LatestSearchCartBinding

class LatestsearchesAdpter:RecyclerView.Adapter<LatestsearchesAdpter.LatestsearchesViewHolder>() {
    inner class LatestsearchesViewHolder(val binding:LatestSearchCartBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestsearchesViewHolder {
        return LatestsearchesViewHolder(LatestSearchCartBinding
            .inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: LatestsearchesViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
       return 10
    }
}