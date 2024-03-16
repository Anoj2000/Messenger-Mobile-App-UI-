package com.example.messengerapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class inboxPage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inboxpage)

        val Back : ImageView = findViewById(R.id.imageView26)

        Back.setOnClickListener {
            val intent  = Intent(this,chatingpage::class.java)
            startActivity(intent)
        }
    }
}