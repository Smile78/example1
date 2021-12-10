package com.example.sevenfragmentmetanitjava

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DeveloperAdapter (private val devNames: List<String>):
    RecyclerView.Adapter<DeveloperViewHolder_1>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeveloperViewHolder_1 {
       val itemView= LayoutInflater.from(parent.context)
           .inflate(R.layout.developer_list_item,parent,false)
        return DeveloperViewHolder_1(itemView)
    }

    override fun onBindViewHolder(holder: DeveloperViewHolder_1, position: Int) {
      val name=devNames[position]         //получим имя из списка по позиции
        holder.bind(name)  //положим его в холдер

    }

    override fun getItemCount(): Int {
        return devNames.size        //возвр размер списка
    }



}