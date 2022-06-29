package com.example.hotelbooking.mybookings.tabLayout.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hotelbooking.databinding.FinishhesCartBinding
class FinishedAdapter:RecyclerView.Adapter<FinishedAdapter.FinishedViewHolder>() {
    inner class FinishedViewHolder(val binding: FinishhesCartBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FinishedViewHolder {
        return FinishedViewHolder(FinishhesCartBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: FinishedViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 1
    }
}