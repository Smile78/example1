package com.example.sevenfragmenttgu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment

private const val TAG = "MyTag"

class Activity1Main : AppCompatActivity() {

    lateinit var switchFragmentsButton: Button              // инцициализировал кнопку для смены фрагменты

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1_main)
        switchFragmentsButton= findViewById(R.id.switch_frags_bttn)     // нашел ее по айди

//        Log.d(TAG, "MainActivity- onCreate")

        val startFragment = StartFragment()                 //переменные для каждого из фрагментов//
        val endFragment = EndFragment()

        replaceFragment(startFragment)

        switchFragmentsButton.setOnClickListener {
        val fragment =
            when (supportFragmentManager.findFragmentById(R.id.fragment_container) ){ //вопрос у мендж : какой фрагмент находится в контейнер с тактим айди
                is StartFragment -> endFragment // если старт то верни энд
                is EndFragment -> startFragment // ..
                else -> startFragment
            }
            replaceFragment(fragment)

        }


    }

    fun replaceFragment(fragment: Fragment ){

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container,fragment)  // подставляю фрагмент в саппорт
//            .addToBackStack(fragment.tag)           //  фрагменты будут меняться но порядок их смены будет зафиксирован
            .commit()

    }

}