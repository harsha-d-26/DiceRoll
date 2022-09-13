package com.harsh.exampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var roll : Button
    lateinit var image : ImageView
    lateinit var text: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        roll = findViewById(R.id.button_roll)
        image = findViewById(R.id.imageView)
        text = findViewById(R.id.textView)
        val obj = Dice(6)
        roll.setOnClickListener {
            val dice = obj.roll()
            text.text = dice.toString()
            when(dice){
                1 -> image.setImageResource(R.drawable.dice_1)
                2 -> image.setImageResource(R.drawable.dice_2)
                3 -> image.setImageResource(R.drawable.dice_3)
                4 -> image.setImageResource(R.drawable.dice_4)
                5 -> image.setImageResource(R.drawable.dice_5)
                6 -> image.setImageResource(R.drawable.dice_6)
            }
        }
    }

}
class Dice(private val numSides: Int){
    fun roll() : Int{
        return (1..numSides).random()
    }
}