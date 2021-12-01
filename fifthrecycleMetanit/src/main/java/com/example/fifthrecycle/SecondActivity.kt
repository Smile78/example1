package com.example.fifthrecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList


public class SecondActivity : AppCompatActivity() {

    var states = ArrayList<State>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        setInitialData()
        val recyclerView = findViewById<RecyclerView>(R.id.list)
        // создаем адаптер
        // создаем адаптер
        val adapter = StateAdapter(this, states)
        // устанавливаем для списка адаптер
        // устанавливаем для списка адаптер
        recyclerView.adapter = adapter
    }

    private fun setInitialData() {
        states.add(State("Андора", "---", R.drawable.ic_ad))
        states.add(State("Антигуа и Барбуда", "---с", R.drawable.ic_ag))
        states.add(State("Албания", "---", R.drawable.ic_al))
        states.add(State("Армения", "Ереван", R.drawable.ic_am))
        states.add(State("Аруба", "---", R.drawable.ic_aw))
    }


}