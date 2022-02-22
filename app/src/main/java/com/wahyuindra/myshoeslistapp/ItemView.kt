package com.wahyuindra.myshoeslistapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_item_view.*

class ItemView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_view)

        val nama = intent.getStringExtra("nama") ?: ""
        val detail = intent.getStringExtra("detail") ?: ""
        val image = intent.getIntExtra("image", 0)

        img_item_photo.setImageResource(image)
        tv_item_name.text = nama
        tv_item_detail.text = detail

        val btnBack : ImageView = findViewById(R.id.button_back)

        btnBack.setOnClickListener {
            val intent = Intent(this@ItemView, ItemList::class.java)
            startActivity(intent)
        }
    }
}