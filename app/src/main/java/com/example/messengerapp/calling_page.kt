package com.example.messengerapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class calling_page: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calling_page)

        val cancelCall : ImageView = findViewById(R.id.imageView20)

        cancelCall.setOnClickListener {
            val intent  = Intent(this,callinglistpage::class.java)
            startActivity(intent)
        }
    }
}