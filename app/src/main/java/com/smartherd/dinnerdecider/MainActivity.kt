package com.smartherd.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val listFood = arrayListOf<String>("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDecide.setOnClickListener {
            var food = listFood.random()
            txtRandom.text = food
        }

        btnAddFood.setOnClickListener {
            val newFood: Editable? = etAddFood.text
            Toast.makeText(this, " ${newFood}have added", Toast.LENGTH_SHORT).show()
            listFood.add(newFood.toString())
            etAddFood.text.clear()
        }

    }

}