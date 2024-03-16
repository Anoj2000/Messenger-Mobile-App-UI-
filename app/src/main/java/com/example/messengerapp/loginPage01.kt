package com.example.messengerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class loginPage01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginpage1)

        val loggin2 : Button = findViewById(R.id.button1)

        loggin2.setOnClickListener {
            val intent = Intent(this,loginPage02::class.java)
            startActivity(intent);
        }
    }
}