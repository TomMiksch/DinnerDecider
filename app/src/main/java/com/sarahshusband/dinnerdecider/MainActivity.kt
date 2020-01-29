package com.sarahshusband.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val dinnerList = arrayListOf("Firehouse", "Chick-Fil-A", "Best Thai", "McDonald's", "Taco Bell")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener {
            val randomFood = Random.nextInt(dinnerList.count())
            selectedFoodText.text = dinnerList[randomFood]
        }

        addFoodButton.setOnClickListener {
            val newRestaurant = addFoodText.text.toString()
            dinnerList.add(newRestaurant)
            addFoodText.text.clear()
        }
    }
}
