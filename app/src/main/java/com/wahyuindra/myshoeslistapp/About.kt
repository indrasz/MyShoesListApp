package com.wahyuindra.myshoeslistapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val btnBack : ImageView = findViewById(R.id.button_back)

        btnBack.setOnClickListener {

            val intent = Intent(this@About, ItemList::class.java)
            startActivity(intent)
        }
    }
}