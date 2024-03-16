package com.example.messengerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class onboardingPage01: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onbordingpage1)

        val login : Button = findViewById(R.id.button)

        login.setOnClickListener{
            val intent = Intent(this,loginPage01::class.java)
            startActivity(intent)
        }
    }
}