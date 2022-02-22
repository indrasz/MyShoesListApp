package com.wahyuindra.myshoeslistapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemList : AppCompatActivity() {
    private lateinit var rvShoes: RecyclerView
    private var list : ArrayList<Shoes> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_list)

        rvShoes = findViewById(R.id.rv_shoes)
        rvShoes.setHasFixedSize(true)

        list.addAll(ShoesData.listData)
        showRecyclerCardView()

        val btnAbout : ImageView = findViewById(R.id.action_about)
        btnAbout.setOnClickListener {
            val intent = Intent(this@ItemList, About::class.java)
            startActivity(intent)
        }
    }

    private fun showRecyclerCardView() {
        rvShoes.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewItem(list)
        rvShoes.adapter = cardViewHeroAdapter
    }
}