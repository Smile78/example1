package com.example.sevenfragmentmetanitjava

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import java.util.*
import kotlin.random.Random.*


private const val LAST_ROLLED_IMAGE = "item"

class DiceRollFragment : Fragment() {


    lateinit var  diceImageView : ImageView
    lateinit var  rollButton : Button

    private val diceImageList: List<Int> = listOf (
        R.drawable.fun1,
        R.drawable.fun2,
        R.drawable.fun3,
        R.drawable.fun4,
        R.drawable.fun5,
        R.drawable.fun6

    )


    var lastRolledImageRes = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dice_roll, container, false)

        diceImageView = view.findViewById(R.id.dice_image)
        rollButton =view.findViewById(R.id.button_frag_dice_roll_1)

        if(savedInstanceState!=null)
            diceImageView.setImageResource(savedInstanceState.getInt(LAST_ROLLED_IMAGE))

        rollButton.setOnClickListener {
            lastRolledImageRes = diceImageList.random()
            diceImageView.setImageResource(lastRolledImageRes)// с каждым кликом обновляю переменную
        }

        return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState )
        outState.putInt(LAST_ROLLED_IMAGE, lastRolledImageRes) // как значеиче bottom

    }




}