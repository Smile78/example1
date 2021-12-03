package com.example.basicviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Activity2Second : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2second)

        Log.d(TAG1, "самая первая функция")
    }


    override fun onStart() {                                    // "активность" -функция которая срабатывает  при СТАРТЕ приложения
        super.onStart()
        Log.d(TAG1, "Душе очарованной снятся лазурные дали")


    }

    override fun onRestart() {                                  //   при РЕСТАРТЕ
        super.onRestart()
        Log.d(TAG1, "Нет сил отогнать неотступную грусти истому")

    }

    override fun onResume() {                                   //   при ВОССТАНОВЛЕНИ
        super.onResume()
        Log.d(TAG1, "И рвётся душа, трепеща от любви и печали,")


    }


    override fun onPause() {                                    //   при переходе в ПАУЗУ
        super.onPause()
        Log.d(TAG1, "В далёкие страны, незримые оку земному.")

    }

    override fun onStop() {                                     // при СТОП
        super.onStop()
        Log.d(TAG1, "Но время настанет, и, сбросив оковы бессилья,")


    }

    override fun onDestroy() {                                  // при удалении
        super.onDestroy()
        Log.d(TAG1, "Воспрянет душа, не нашедшая в жизни ответа")


    }


}