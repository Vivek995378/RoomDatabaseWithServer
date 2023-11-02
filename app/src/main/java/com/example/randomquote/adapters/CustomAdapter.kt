package com.example.randomquote.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.randomquote.R
import com.example.randomquote.models.Result

class CustomAdapter (private val mList: List<Result>) : RecyclerView.Adapter<CustomAdapter.DbViewHolder>(){

    class DbViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView)  {
        val tvAuthor: TextView = itemView.findViewById(R.id.tvAuthor)
        val tvContent: TextView = itemView.findViewById(R.id.tvContent)
        val tvDate: TextView = itemView.findViewById(R.id.tvDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DbViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycler_view, parent, false)

        return DbViewHolder(view)
    }

    override fun onBindViewHolder(holder: DbViewHolder, position: Int) {

        val result = mList[position]

        holder.tvAuthor.text = result.author
        holder.tvContent.text = result.content
        holder.tvDate.text = result.dateAdded
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}