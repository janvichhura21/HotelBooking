package com.example.hotelbooking.booking

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hotelbooking.databinding.PopularCountriesCartBinding
import com.example.hotelbooking.model.PopularCountries
import com.squareup.picasso.Picasso

class PopularCountriesAdapter(val pc:ArrayList<PopularCountries>):RecyclerView.Adapter<PopularCountriesAdapter.PopularCountriesViewHolder>() {
    inner class PopularCountriesViewHolder(val binding: PopularCountriesCartBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(data:PopularCountries){
            binding.apply {
                title.text=data.title
                Picasso.get().load(data.url).into(imageView3)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularCountriesViewHolder {
        return PopularCountriesViewHolder(PopularCountriesCartBinding
            .inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: PopularCountriesViewHolder, position: Int) {
       val data=pc[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int {
       return pc.size
    }
}