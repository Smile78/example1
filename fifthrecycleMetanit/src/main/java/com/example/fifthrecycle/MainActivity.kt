package com.example.fifthrecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var nextActivityButton1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextActivityButton1 = findViewById(R.id.button1_Rec_metanit)

        nextActivityButton1.setOnClickListener {
//          переход на др активность
            val secondActivInten: Intent = Intent(this, SecondActivity::class.java )
            startActivity(secondActivInten)
        }

    }




}