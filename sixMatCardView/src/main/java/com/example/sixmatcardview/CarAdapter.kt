package com.example.sixmatcardview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CarAdapter(private val carlist:List<Car>): RecyclerView.Adapter<CardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        //TODO("Not yet implemented")
        val itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.car_list_item,parent,false)
        return CardViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
      //  TODO("Not yet implemented")
        val car = carlist[position]
        holder.bind(car)
    }

    override fun getItemCount(): Int {
     //   TODO("Not yet implemented")
        return carlist.size
    }
}