package com.example.sixmatcarviewpoly

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CityCarViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        private val brandTextView: TextView= itemView.findViewById((R.id.tV_city_brand))
        private val comfortTextView: TextView= itemView.findViewById((R.id.tV_city_comfortLevel))
        private val priceTextView: TextView= itemView.findViewById((R.id.tV_city_price))


    fun bind(cityCar: Car.CityCar){
        brandTextView.text=    "Brand - ${cityCar.brand}"
        comfortTextView.text = "Comfort lvl - ${cityCar.comfortLevel}"
        priceTextView.text =   "Brand - ${cityCar.price}$"

    }


}