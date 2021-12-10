package com.example.sevenfragmenttgu

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


private const val TAG = "MyTag"


class StartFragment : Fragment() {

    lateinit var showToastBttn:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_start, container, false)

        showToastBttn= view.findViewById(R.id.show_toast_bttn)              //тоаст на нижн кнопку
        showToastBttn.setOnClickListener {
            Toast.makeText(context,"Hello",Toast.LENGTH_LONG).show()
        }

        return view
    }




}

//1. Вынести вьюшку в отд переменную
//2. Совершем работу с вью
//3. Вовзр вью