package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val dieOne: ImageView = findViewById(R.id.first_die)
        val dieTwo: ImageView = findViewById(R.id.second_die)

        rollButton.setOnClickListener {
            dieOne.setImageResource(roller())
            dieTwo.setImageResource(roller())
        }
    }

    fun roller(): Int {
        val randomNumber = Random().nextInt(6) + 1

        return when (randomNumber) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.dice6
        }
    }
}
