package com.example.sevenfragmentmetanitjava

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragSecServices : Fragment() {


    lateinit var developerRecyclerView: RecyclerView
    lateinit var showWEbBtn: Button
    lateinit var call: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.frag_sec_servic, container, false)


        val devNames2: List<String> = listOf(
            "Полет на параплане",
            "Ралли на авто",
            "КроссЭндуро мотопокатушка",
            "Полет на вертолете",
            "Стендовая стрельба",
            "Выстрел в бронежилет",
            "Яхтинг",
            "Плавание с акулами"
        )


        showWEbBtn=view.findViewById(R.id.show_website_button)
        call=view.findViewById(R.id.call_bttn)

        developerRecyclerView = view.findViewById(R.id.developer_recycler_view)
        developerRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        //контекст таккак
        //Вертикаль
        //фолс -список переворачивать не надо


        developerRecyclerView.adapter = RclrAdapter(devNames2) // адапетр в который надо положить список имен
//

        showWEbBtn.setOnClickListener {
            val link = Uri.parse("https://google.com/")
            val intent = Intent (Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }

        call.setOnClickListener {
            val call_dir = Uri.parse("tel:+78129638383")
            val call_intent = Intent(Intent.ACTION_CALL, call_dir)
            context?.startActivity(call_intent)
        }

        return view
    }

}