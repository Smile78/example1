package com.example.sixmatcarviewpoly

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CarAdapter(private val carlist: List<Car> ):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
      //  TODO("Not yet implemented")
        val itemView = LayoutInflater.from(parent.context)
            .inflate(viewType,parent,false)
        return when(viewType){
            R.layout.city_car_list_item -> CityCarViewHolder(itemView)
            R.layout.spot_car_list_item -> SportCarViewHolder(itemView)
            else -> throw Exception()
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
      //  TODO("Not yet implemented")
        val car = carlist[position]
        when (holder){
            is SportCarViewHolder-> holder.bind (car as Car.SportCar)
            is CityCarViewHolder-> holder.bind (car as Car.CityCar)
        }
    }

    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
       return carlist.size


    }

    override fun getItemViewType(position: Int): Int {
        return when (carlist[position]){
            is Car.CityCar->R.layout.city_car_list_item
            is Car.SportCar->R.layout.spot_car_list_item
        }
    }

}