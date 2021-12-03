package com.example.sixmatcardview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val carImageView: ImageView =itemView.findViewById(R.id.car_image_view)
    private val brandTextView: TextView =itemView.findViewById(R.id.brand_text_view)

        fun bind (car: Car){
            brandTextView.text= car.brand
            carImageView.setImageResource(car.image)
        }



}