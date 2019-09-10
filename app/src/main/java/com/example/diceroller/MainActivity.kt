package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val dieOne: ImageView = findViewById(R.id.first_die)
        val dieTwo: ImageView = findViewById(R.id.second_die)

        rollButton.setOnClickListener() {
            val randomNumber = Random().nextInt(6) + 1
        }
    }
}
