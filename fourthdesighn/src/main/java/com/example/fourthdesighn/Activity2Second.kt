package com.example.fourthdesighn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import com.google.android.material.snackbar.Snackbar

class Activity2Second : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nextActivityButton : Button
        val nextActivityButton2 : Button

        nextActivityButton = findViewById(R.id.sec_actv_button_1)
        nextActivityButton.setOnClickListener {
            val secondActivInten: Intent = Intent(this, Activity3Third::class.java )
            startActivity(secondActivInten)
        }

        nextActivityButton2 = findViewById(R.id.sec_actv_button_2_bck)
        nextActivityButton2.setOnClickListener {
            val secondActivInten2: Intent = Intent(this, Activity1Main::class.java )
            startActivity(secondActivInten2)
        }

        val fab: View = findViewById(R.id.fab22_extended)

        fab.setOnClickListener {
            // Respond to FAB click
                view ->
            Snackbar.make(view, "Shake Yr Bady!", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show()
        }





        //************** HZ
//        val topAppBar: Toolbar = findViewById(R.id.topAppBar1 )
//
//        topAppBar.setNavigationOnClickListener {
//            // Handle navigation icon press
//        }
//
//        topAppBar.setOnMenuItemClickListener { menuItem ->
//            when (menuItem.itemId) {
//                R.id.favorite1 -> {
//                    // Handle favorite icon press
//                    true
//                }
//                R.id.search2 -> {
//                    // Handle search icon press
//                    true
//                }
//                R.id.more3 -> {
//                    // Handle more item (inside overflow menu) press
//                    true
//                }
//                else -> false
//            }
//        }

    }




}