package com.example.messengerapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class chatingpage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chatingpage)

        val profile : ImageView = findViewById(R.id.imageView24)
        val callList:  ImageView = findViewById(R.id.imageView28)
        val contactList:  ImageView = findViewById(R.id.imageView17)
        val call: View = findViewById(R.id.textView10)
        val inbox : View = findViewById(R.id.textView8)



        profile.setOnClickListener {
            val intent  = Intent(this,profilePage::class.java)
            startActivity(intent)
        }

        callList.setOnClickListener {
            val intent = Intent(this,callinglistpage::class.java)
            startActivity(intent)
        }

        call.setOnClickListener {
            val intent = Intent(this,callinglistpage::class.java)
            startActivity(intent)
        }

        contactList.setOnClickListener {
            val intent = Intent(this,contactlistpage::class.java)
            startActivity(intent)
        }

        inbox.setOnClickListener {
            val intent = Intent(this,inboxPage::class.java)
            startActivity(intent)
        }


    }
}