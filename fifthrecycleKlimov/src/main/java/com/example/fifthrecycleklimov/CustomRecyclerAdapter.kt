package com.example.fifthrecycleklimov;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


public class CustomRecyclerAdapter(private val names: List<String>) :
    RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder>() {

        class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            var largeTextView: TextView? = null
            var smallTextView: TextView? = null

            init {
                largeTextView = itemView.findViewById(R.id.textViewLarge)
                smallTextView = itemView.findViewById(R.id.textViewSmall)

            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            //TODO("Not yet implemented")
            val itemView =
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.recyclerview_item, parent, false)
            return MyViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            //TODO("Not yet implemented")
            holder.largeTextView?.text = names[position]
            holder.smallTextView?.text = "кот"
        }

        override fun getItemCount(): Int {
            //TODO("Not yet implemented")
            return   names.size
        }



}
