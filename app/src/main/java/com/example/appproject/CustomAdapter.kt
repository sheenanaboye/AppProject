package com.example.appproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val img:Array<Int>, val text: Array<String>): RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    class CustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindValue(image: Int, txt: String){
//            product image
            itemView.findViewById<ImageView>(R.id.imageView).setImageResource(image)
//            product name (vegetable .. fruits ..)
            itemView.findViewById<TextView>(R.id.Category).text = txt
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CustomViewHolder(v)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bindValue(img[position], text[position])
    }

    override fun getItemCount(): Int {
        return img.size
    }
}