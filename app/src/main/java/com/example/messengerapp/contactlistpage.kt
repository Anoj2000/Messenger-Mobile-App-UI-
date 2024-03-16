package com.example.messengerapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class contactlistpage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contactlistpage)

        val chatPage: ImageView = findViewById(R.id.imageView27)
        val callList:  ImageView = findViewById(R.id.imageView28)
        val profile : ImageView = findViewById(R.id.imageView24)

        chatPage.setOnClickListener{
            val intent  = Intent(this,chatingpage::class.java)
            startActivity(intent)
        }

        callList .setOnClickListener{
            val intent  = Intent(this,callinglistpage::class.java)
            startActivity(intent)
        }

        profile.setOnClickListener{
            val intent  = Intent(this,profilePage::class.java)
            startActivity(intent)
        }





    }

}