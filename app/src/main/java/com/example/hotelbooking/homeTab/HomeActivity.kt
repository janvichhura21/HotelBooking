package com.example.hotelbooking.homeTab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.hotelbooking.R
import com.example.hotelbooking.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_home)
        //setContentView(R.layout.activity_home)
        binding.root
        //binding.bottommenu.background=null
    /*    val navController= Navigation.findNavController(this,R.id.fragment)
        NavigationUI.setupWithNavController(binding.bottommenu,navController)*/
    }
}