package com.example.hotelbooking

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.hotelbooking.databinding.ActivityMainBinding
import com.example.hotelbooking.model.addFragment
import com.example.hotelbooking.model.replaceFragment
import com.example.hotelbooking.mybookings.MyBookingsActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.root
        binding.bottommenu.background=null
      val navController= Navigation.findNavController(this,R.id.nav_host_fragment)
        NavigationUI.setupWithNavController(binding.bottommenu,navController)
        binding.myBookingsFragment.setOnClickListener {
            startActivity(Intent(this,MyBookingsActivity::class.java))
        }
    }
}