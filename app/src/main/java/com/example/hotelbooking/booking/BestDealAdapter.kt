package com.example.hotelbooking.booking

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hotelbooking.databinding.BestDealsCartBinding

class BestDealAdapter:RecyclerView.Adapter<BestDealAdapter.BestDealViewholder>() {
    inner class BestDealViewholder(val binding: BestDealsCartBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BestDealViewholder {
        return BestDealViewholder(BestDealsCartBinding
            .inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: BestDealViewholder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }
}