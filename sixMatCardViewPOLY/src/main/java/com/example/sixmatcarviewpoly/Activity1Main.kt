package com.example.sixmatcarviewpoly

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

        var carList: List<Car> = listOf(
            Car.SportCar("Ferrari", 500, 3, "Red"),
            Car.CityCar("Ford", 5, 10000)
        )

        carResycleView.layoutManager=
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        carResycleView.adapter=   CarAdapter(carList)


    }






}