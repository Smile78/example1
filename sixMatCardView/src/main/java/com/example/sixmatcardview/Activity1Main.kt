package com.example.sixmatcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Activity1Main : AppCompatActivity() {

    lateinit var carResycleView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1_main)

        carResycleView =findViewById(R.id.car_recycler_view)

        val carList: List<Car> = listOf(
        Car("Ferrari", R.drawable.red_ferari1),
        Car("Audi", R.drawable.gray_audi),
        Car("Mercedes", R.drawable.dark_merc),
        )

        carResycleView.layoutManager=
                LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        carResycleView.adapter=CarAdapter(carList)


    }
}