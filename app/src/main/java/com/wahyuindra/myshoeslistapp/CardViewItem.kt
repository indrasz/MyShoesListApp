package com.wahyuindra.myshoeslistapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewItem (private val listShoes: ArrayList<Shoes>) : RecyclerView.Adapter<CardViewItem.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_cardview, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val shoes = listShoes[position]
        Glide.with(holder.itemView.context)
            .load(shoes.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = shoes.name
        holder.tvDetail.text = shoes.detail
        holder.btnFavorite.setOnClickListener { Toast.makeText(holder.itemView.context, "Favorite " + listShoes[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        holder.btnShare.setOnClickListener { Toast.makeText(holder.itemView.context, "Share " + listShoes[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        holder.setData(shoes)

    }


    override fun getItemCount(): Int {
        return listShoes.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
        var btnShare: Button = itemView.findViewById(R.id.btn_set_share)


        fun setData(shoes: Shoes) {
            imgPhoto.setImageResource(shoes.photo)
            tvName.text = shoes.name
            tvDetail.text = shoes.detail

            btnShare.rootView.setOnClickListener {
                val intent = Intent(itemView.context, ItemView::class.java)
                intent.putExtra("image", shoes.photo)
                intent.putExtra("nama", shoes.name)
                intent.putExtra("detail", shoes.detail)
                itemView.context.startActivity(intent)
            }
        }
    }
}