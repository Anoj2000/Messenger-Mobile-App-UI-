package com.example.messengerapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class startPage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.startpage)

        android.os.Handler().postDelayed({
            val intent = Intent(this,onboardingPage01::class.java)
            startActivity(intent)
            finish()
        },1000)
    }
}