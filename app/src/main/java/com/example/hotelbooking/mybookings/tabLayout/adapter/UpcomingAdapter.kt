package com.example.hotelbooking.mybookings.tabLayout.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hotelbooking.databinding.MyBookingsCartBinding

class UpcomingAdapter:RecyclerView.Adapter<UpcomingAdapter.UpcomingViewHolder>() {
    inner class UpcomingViewHolder(val binding: MyBookingsCartBinding)
        :RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpcomingViewHolder {
     return UpcomingViewHolder(MyBookingsCartBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: UpcomingViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 1
    }
}