package com.example.hotelbooking.room

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hotelbooking.databinding.RoomCartBinding

class RoomAdapter(val context: Context):RecyclerView.Adapter<RoomAdapter.RoomViewHolder>() {
    inner class RoomViewHolder(val binding: RoomCartBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomViewHolder {
        return RoomViewHolder(RoomCartBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RoomViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            context.startActivity(Intent(context,RoomDetailActivity::class.java))
        }
    }

    override fun getItemCount(): Int {
      return 3
    }
}