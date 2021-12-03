package com.example.fourthdesighn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar


import android.widget.TextView




class Activity1Main : AppCompatActivity() {

    lateinit var nextActivityButton : Button
//    lateinit var fab: View

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            nextActivityButton = findViewById(R.id.button1_go)

            nextActivityButton.setOnClickListener {
                val secondActivInten: Intent = Intent(this, Activity2Second::class.java )
                startActivity(secondActivInten)
                }

            val fab: View = findViewById(R.id.floating_action_button)

    //        fab.setOnClickListener {
    //            // Respond to FAB click
    //            val secondActivInten2: Intent = Intent(this, Activity2Second::class.java )
    //            startActivity(secondActivInten2)
    //        }

            fab.setOnClickListener {
                // Respond to FAB click
                    view ->
                Snackbar.make(view, "Бум!", Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
                    .show()
            }

    }


    override fun onCreateOptionsMenu(menu: Menu ): Boolean {
            getMenuInflater().inflate(R.menu.main_menu, menu);
            return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id: Int = item.getItemId()
        val headerView = findViewById<TextView>(R.id.textview1_main_menu)
        when (id) {
            R.id.action_settings -> {
                headerView.text = "Настройки"
                return true
            }
            R.id.open_settings -> {
                headerView.text = "Открыть"
                return true
            }
            R.id.save_settings -> {
                headerView.text = "Сохранить"
                return true
            }
        }
        //headerView.setText(item.getTitle());
        return super.onOptionsItemSelected(item)
    }



}