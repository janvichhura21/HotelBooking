package com.example.hotelbooking.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hotelbooking.R
import com.example.hotelbooking.model.addFragment

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        addFragment(R.id.frame,BeginFragment())
    }
}