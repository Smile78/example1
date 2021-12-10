package com.example.fragmentmetanit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Activity1Main : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1_main)
        Log.d(TAG, "onCreate")
    }


    override fun onStart() {
        super.onStart()

        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "onResume")
    }




}