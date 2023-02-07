package com.example.dice2dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice ()
        }
    }

    private fun rollDice() {
        val diceOne = Dice (6)
        val diceTwo = Dice (6)
        val diceRollOne = diceOne.roll ()
        val diceRollTwo = diceTwo.roll ()
        val resultTextViewOne : TextView=findViewById(R.id.textView2)
        val resultTextViewTwo : TextView= findViewById(R.id.textView3)
        resultTextViewOne.text= diceRollOne.toString()
        resultTextViewTwo.text= diceRollTwo.toString()
    }
}

class Dice (private val numSides: Int) {
    fun roll (): Int {
        return (1..numSides).random()
    }
}