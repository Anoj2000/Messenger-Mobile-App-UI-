package com.example.messengerapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class callinglistpage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.callinglistpage)

        val chatPage: ImageView = findViewById(R.id.imageView27)
        val inbox: View = findViewById(R.id.textView9)
        val calling : View = findViewById(R.id.imageView51)
        val contactList:  ImageView = findViewById(R.id.imageView17)
        val profile : ImageView = findViewById(R.id.imageView24)

        chatPage.setOnClickListener{
            val intent  = Intent(this,chatingpage::class.java)
            startActivity(intent)
        }

        inbox.setOnClickListener {
            val intent  = Intent(this,chatingpage::class.java)
            startActivity(intent)
        }

        calling.setOnClickListener {
            val intent  = Intent(this,calling_page::class.java)
            startActivity(intent)
        }

        contactList.setOnClickListener {
            val intent  = Intent(this,contactlistpage::class.java)
            startActivity(intent)
        }

        profile.setOnClickListener {
            val intent  = Intent(this,profilePage::class.java)
            startActivity(intent)
        }
    }
}