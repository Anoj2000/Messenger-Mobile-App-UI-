package com.example.messengerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class otpverificationpage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.otpverificationpage)

        val chat : Button = findViewById(R.id.button2)

        chat.setOnClickListener {
            val intent = Intent(this,chatingpage::class.java)
            startActivity(intent)
        }
    }
}