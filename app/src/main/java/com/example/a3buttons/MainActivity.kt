package com.example.a3buttons

import android.content.Intent
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var name:EditText
    lateinit var location :EditText
    lateinit var mobile:EditText
    lateinit var go : Button
    lateinit var toa : Button
    lateinit var Tv :Button
    lateinit var textv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.edname)
        location = findViewById(R.id.edlocation)
        mobile = findViewById(R.id.edmobile)
        go = findViewById(R.id.gobutton)
        toa = findViewById(R.id.toabutton)
        Tv= findViewById(R.id.tvbutton)
        textv = findViewById(R.id.textv)

        toa.setOnClickListener {
            var str = name.text.toString()



            Toast.makeText(this, "Enter Your Name : $str ", Toast.LENGTH_SHORT).show()
        }
        Tv.setOnClickListener {
            location.text.toString()
            textv.text = "Location is:  ${location.text}"

        }
        go.setOnClickListener {
           var phoneNumber = mobile.text.toString()
            val names = name.text.toString()
            val Locations = location.text.toString()
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("Tag",phoneNumber)
            intent.putExtra("Tag1" , names)
            intent.putExtra("Tag2", Locations)
            startActivity(intent)

        }



    }
}