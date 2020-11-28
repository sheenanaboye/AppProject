package com.example.appproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class mainPage : AppCompatActivity() {
    private val img = arrayOf(R.drawable.veggies, R.drawable.fruit, R.drawable.poultry)
    private val texts = arrayOf("Vegetable", "Fruits", "Poultry")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(img, texts)
    }
}