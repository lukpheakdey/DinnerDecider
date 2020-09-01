package com.smartherd.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val listFood = arrayListOf<String>("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDecide.setOnClickListener {
            var food = listFood.random()
            txtRandom.text = food
        }

        btnAddFood.setOnClickListener {
            var newFood: Editable? = etAddFood.text
            etAddFood.text.clear()
            listFood.add(newFood.toString())
            Toast.makeText(this, "Successful Add New", Toast.LENGTH_SHORT).show()
        }

    }

}