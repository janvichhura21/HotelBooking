package com.example.hotelbooking.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hotelbooking.R
import com.example.hotelbooking.model.addFragment

class RoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)
        addFragment(R.id.roomframe,RoomFragment())
    }
}