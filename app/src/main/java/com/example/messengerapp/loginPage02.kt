package com.example.messengerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class loginPage02: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginpage2)

        val otp : Button = findViewById(R.id.button2)

        otp.setOnClickListener {
            val intent = Intent(this,otpverificationpage::class.java)
            startActivity(intent)
        }
    }
}