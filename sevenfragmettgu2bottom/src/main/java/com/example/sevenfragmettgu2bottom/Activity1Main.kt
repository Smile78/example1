package com.example.sevenfragmettgu2bottom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Activity1Main : AppCompatActivity() {

    lateinit var bottomNavigationMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1_main)

        bottomNavigationMenu = findViewById(R.id.bottom_navigation_menu)
        bottomNavigationMenu.setOnItemSelectedListener { item->     //повесили слушатель на нижнюю навигацию

            var fragment:  Fragment?=null
          when(item.itemId){
              R.id.frag1->{
                  fragment=FirstFragment()
              }
              R.id.frag2->{
                  fragment=SecondFragment()
              }
          }
            replaceFragment(fragment!!)
            true
        }

        bottomNavigationMenu.selectedItemId=R.id.frag1
    }
    fun replaceFragment(fragment: Fragment ){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container,fragment)  // подставляю фрагмент в саппорт
//            .addToBackStack(fragment.tag)           //  фрагменты будут меняться но порядок их смены будет зафиксирован
            .commit()
    }



}