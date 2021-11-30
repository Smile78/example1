package com.example.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

const val CONTEXT2:String= "hello"

class MainActivity2 : AppCompatActivity() {

    lateinit var helloTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        helloTextView = findViewById(R.id.textView_1)
        val helloValue:String?= intent.extras?.getString(CONTEXT2, null as String?)
        helloTextView.text=helloValue



    }



}