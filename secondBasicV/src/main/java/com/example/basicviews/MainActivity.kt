package com.example.basicviews
/*
1onCreate0   Душе очарованной снятся лазурные дали...
2onStart0    Нет сил отогнать неотступную грусти истому...
3onResume0   И рвётся душа, трепеща от любви и печали,

4onPause    В далёкие страны, незримые оку земному.
5onStop     Но время настанет, и, сбросив оковы бессилья,
6onDestroy  Воспрянет душа, не нашедшая в жизни ответа,
7onCreate1   Широко расправит могучие белые крылья
8onStart1    И узрит чудесное в море блаженства и света!
9onResume1   Автор: Мирра Лохвицкая
*/

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG1 = "MainActivity"

    var jstCount  : Int = 0

    val numbers: Array<String> = arrayOf(
            "1 Душе очарованной снятся лазурные дали...",
            "2 Нет сил отогнать неотступную грусти истому...",
            "3 И рвётся душа, трепеща от любви и печали,",
            "4 В далёкие страны, незримые оку земному.",
            "5 Но время настанет, и, сбросив оковы бессилья,",
            "6 Воспрянет душа, не нашедшая в жизни ответа,",
            "7 Широко расправит могучие белые крылья",
            "8 И узрит чудесное в море блаженства и света!",
            "9 Автор: Мирра Лохвицкая ",
    )




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG1, numbers[jstCount++])

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG1, numbers[jstCount++])

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG1, numbers[jstCount++])

    }


    override fun onPause() {
        super.onPause()
        Log.d(TAG1, numbers[jstCount++])

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG1, numbers[jstCount++])

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG1, numbers[jstCount++])

    }



}