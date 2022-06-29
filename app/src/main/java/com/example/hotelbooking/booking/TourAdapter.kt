package com.example.hotelbooking.booking

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hotelbooking.databinding.ItemsBinding
import com.example.hotelbooking.model.Places
import com.squareup.picasso.Picasso


class TourAdapter(val places: Places):RecyclerView.Adapter<TourAdapter.MyViewHolder>() {
    inner class MyViewHolder(val binding: ItemsBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(data:Places){
            binding.apply {
                Picasso.get().load(data.url).into(tourImage)
            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(ItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data=places
        holder.bind(data)
    }

    override fun getItemCount(): Int {
       return 1
    }


}

