package com.example.appproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, addedToCart)
        val queueListView = findViewById<ListView>(R.id.cartListView)
        queueListView.adapter = adapter
    }
}