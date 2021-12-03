package com.example.fifthrecycletgu

import android.icu.lang.UCharacter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var userRecyclerView:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userList: List<User> = listOf(
            User("Ivan", 21),
            User("Anna", 22),
            User("Elena", 23),
            User("Maxim", 24),
            User("Ivan2", 25)
            )

        userRecyclerView = findViewById(R.id.user_recclr_view)
        userRecyclerView.layoutManager=
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        userRecyclerView.adapter = UserAdapter(userList)
        userRecyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

    }

}