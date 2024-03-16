package com.example.messengerapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class profilePage:  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profilepage)

        val Back : ImageView = findViewById(R.id.imageView23)
        val saveChange : Button = findViewById(R.id.c)

        Back.setOnClickListener {
            val intent  = Intent(this,chatingpage::class.java)
            startActivity(intent)
        }

        saveChange.setOnClickListener {
            val intent  = Intent(this,chatingpage::class.java)
            startActivity(intent)
        }
    }
}