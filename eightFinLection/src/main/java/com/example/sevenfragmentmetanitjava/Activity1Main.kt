package com.example.sevenfragmentmetanitjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


private const val LAST_SELECTED_ITEM ="item"
private val DICE_ROLL_FRAGMENT =DiceRollFragment().javaClass.name // сохраняем два названия
private val ABOUT_FRAGMENT = AboutFragment().javaClass.name //
private val THIRD = frendsFragment().javaClass.name //


class Activity1Main : AppCompatActivity() {

    lateinit var bottomNavView : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1_main)


        bottomNavView = findViewById(R.id.bottom_navigation)
        bottomNavView.setOnItemSelectedListener { item->

            var fragment: Fragment? = null

            when (item.itemId){
                R.id.dice_rol1->{
                     // если он не равен 0
                        fragment= if(savedInstanceState != null)supportFragmentManager.getFragment(
                        savedInstanceState,
                         DICE_ROLL_FRAGMENT
                    ) else DiceRollFragment()
                // если тут будет 0 то
                        // и получаем его с таким названием

                }
                R.id.services->{
                    // если он не равен 0
                        fragment =  if(savedInstanceState != null) supportFragmentManager.getFragment(
                         savedInstanceState,
                          ABOUT_FRAGMENT
                        ) else AboutFragment()
                }
                R.id.frends->{

                    fragment =  if(savedInstanceState != null) supportFragmentManager.getFragment(
                        savedInstanceState,
                        THIRD
                    ) else frendsFragment()
                }


            }
            replaceFragment(fragment!!)
            true
        }

        bottomNavView.selectedItemId=
                savedInstanceState?.getInt(LAST_SELECTED_ITEM) ?: R.id.dice_rol1
                    // возвр знач инстСтейт и возвр до пеерворота
                    //если всетаки 0 то выдать dice_roll


    }

    // чтобы сохранить пери перевороте
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState )
        outState.putInt(LAST_SELECTED_ITEM, bottomNavView.selectedItemId) // как значеиче bottom

        val currentFragment = supportFragmentManager.fragments.last()
        supportFragmentManager.putFragment(
            outState,
            currentFragment.javaClass.name, // сохраняем фрагмент незнаем какой
            currentFragment
        )
        //получим последний класс который находился в сапорт
    }



    fun replaceFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmetn_container,fragment)
            .commit()
    }


}