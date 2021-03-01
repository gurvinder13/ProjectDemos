package com.example.projectdemos.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.projectdemos.R
import com.example.projectdemos.data.model.Media
import com.example.projectdemos.data.model.Result

class MainAdapter(private val users: ArrayList<Result>) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: Result,position: Int) {
            val textViewUserName:TextView
            val textViewUserEmail:TextView
            val imageViewAvatar:ImageView
            textViewUserName=itemView.findViewById(R.id.textViewUserName)
            textViewUserEmail=itemView.findViewById(R.id.textViewUserEmail)
            imageViewAvatar=itemView.findViewById(R.id.imageViewAvatar)
            itemView.apply {

                textViewUserName.text = user.title
                //textViewUserEmail.text = user.byline

                Glide.with(imageViewAvatar.context)
                    .load("https://static01.nyt.com/images/2021/02/24/science/24VIRUS-NYCVARIANT1/24VIRUS-NYCVARIANT1-thumbStandard.jpg")
                    .apply( RequestOptions().placeholder(R.mipmap.ic_launcher))
                    .into(imageViewAvatar)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false))

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(users[position],position)
    }

    fun addUsers(users: List<Result>) {
        this.users.apply {
            clear()
            addAll(users)
        }

    }
}