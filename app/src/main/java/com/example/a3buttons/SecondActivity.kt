package com.example.a3buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var textv2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textv2 = findViewById(R.id.textv2)
        val send = intent.getStringExtra("Tag")
        val names = intent.getStringExtra("Tag1")
        val Locations = intent.getStringExtra("Tag2")
        textv2.text = "   Enter Your Name: $names  \n Enter Your Location:$Locations  \n Enter Your Mobile Number:  $send  "


    }
}