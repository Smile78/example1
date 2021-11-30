package com.example.layouts

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button


    const val CONTEXT1:String= "hello"

class MainActivity : AppCompatActivity() {

    lateinit var nextActivityButton1 : Button
    lateinit var nextActivityButton2 : Button
    lateinit var nextActivityButton3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

//    val intent : Intent = Intent(this, MainActivity2::class.java)
//    startActivity(intent)

      nextActivityButton1 = findViewById(R.id.button9_dir_active)
      nextActivityButton2 = findViewById(R.id.button12_brsr)
      nextActivityButton3 = findViewById(R.id.button3_call)

      nextActivityButton1.setOnClickListener {

//          переход на др активность
          val secondActivInten: Intent= Intent(this, MainActivity2::class.java )
          secondActivInten.putExtra(CONTEXT1, " Wow Мы передаем Тееекст в др активи")
          startActivity(secondActivInten)
      }

        nextActivityButton2.setOnClickListener {
            // вызов браузера с чузером
          val gugllink = Uri.parse("https://yandex.ru")
          val openBrowserIntent = Intent(Intent.ACTION_VIEW, gugllink)
          val chooser = Intent.createChooser(openBrowserIntent,"Browser")
          startActivity(chooser)
//          startActivity(openBrowserIntent)
        }

        nextActivityButton3.setOnClickListener {
            //звонок
            val call_dir = Uri.parse("tel:+78129999999")
            val call_intent = Intent(Intent.ACTION_CALL, call_dir)
//            val call_intent = Intent(Intent.ACTION_DIAL, call_dir)
            startActivity(call_intent)
        }


    }


}