package com.example.sevenfragmentmetanitjava

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

public class DeveloperViewHolder_1 (itemView : View) : RecyclerView.ViewHolder(itemView){

    private val devNameTxtView : TextView =
        itemView.findViewById(R.id.develop_list_text_view)

    fun bind(name: String){
        devNameTxtView.text =name
    }

}