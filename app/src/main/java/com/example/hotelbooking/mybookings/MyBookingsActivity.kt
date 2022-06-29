package com.example.hotelbooking.mybookings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.hotelbooking.R
import com.example.hotelbooking.databinding.ActivityMyBookingsBinding
import com.example.hotelbooking.model.addFragment
import com.example.hotelbooking.mybookings.tabLayout.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MyBookingsActivity : AppCompatActivity() {
    lateinit var binding: ActivityMyBookingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_my_bookings)
        binding.root
       // addFragment(R.id.frameL,MyBookingsFragment())
        val adapter= ViewPagerAdapter(supportFragmentManager,lifecycle)

        binding.viewPager2.adapter=adapter

        TabLayoutMediator(binding.tabLayout,binding.viewPager2){tab,position->
            when(position){
                0->{
                    tab.text="Upcoming"
                }
                1->{
                    tab.text="Finished"
                }
            }
        }.attach()
    }
}