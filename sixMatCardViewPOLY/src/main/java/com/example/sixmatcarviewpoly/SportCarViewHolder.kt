package com.example.sixmatcarviewpoly

import android.annotation.SuppressLint
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SportCarViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    private val brandSPTextView: TextView = itemView.findViewById((R.id.tV_sport_brand))
    private val speedSPTextView: TextView = itemView.findViewById((R.id.tV_sport_speed))
    private val driftSPTextView: TextView = itemView.findViewById((R.id.tV_sport_driftLevel))
    private val colorSPTextView: TextView = itemView.findViewById((R.id.tV_sport_color))



    fun bind(sportCar: Car.SportCar){
        brandSPTextView.text=  "Brand - ${sportCar.brand}"
        speedSPTextView.text = "Speed - ${sportCar.speed}km/h$"
        driftSPTextView.text = "Drift lvl - ${sportCar.driftLevel}$"
        colorSPTextView.text = "Color - ${sportCar.color}"

    }


}