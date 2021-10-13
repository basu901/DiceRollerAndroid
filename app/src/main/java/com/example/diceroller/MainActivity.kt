package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

//A separate way to populate the parameter for the rollDice func
lateinit var diceImage: ImageView;
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        //val imageResult: ImageView = findViewById(R.id.dice_image)
        //Adding functionality for Toast messages when clicking a button
        rollButton.text = "Let's ROLLL!!"
        rollButton.setOnClickListener {
            Toast.makeText(this,"Clicked button", Toast.LENGTH_SHORT).show()
            //rollDice(imageResult)
            rollDice();
        }

        diceImage = findViewById(R.id.dice_image);


    }

    private fun rollDice() {
        val randInt = Random().nextInt(6)+1
        val drawableResource = when (randInt)
        {
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
    }
}