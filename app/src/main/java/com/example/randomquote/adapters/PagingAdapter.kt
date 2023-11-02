package com.example.randomquote.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.android.randomquote.R
import com.example.randomquote.models.Result

class PagingAdapter : PagingDataAdapter<Result , PagingAdapter.MyViewHolder>(DiffUtilCallBack()){

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val tvAuthor: TextView = view.findViewById(R.id.tvAuthor)
        val tvContent: TextView = view.findViewById(R.id.tvContent)
        val tvDate: TextView = view.findViewById(R.id.tvDate)

        fun bind(data: Result) {
            tvAuthor.text = data.author
            tvContent.text = data.content
            tvDate.text = data.dateAdded


        }
    }

    class DiffUtilCallBack: DiffUtil.ItemCallback<Result>() {
        override fun areItemsTheSame(oldItem: Result, newItem: Result): Boolean {
            return oldItem.author == newItem.author
        }

        override fun areContentsTheSame(oldItem: Result, newItem: Result): Boolean {
            return oldItem.author == newItem.author
        }
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val result = getItem(position) ?: return
        holder.bind(result)
        //holder.bind(result!!)         //Cause null pointer exception
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_view, parent, false)

        return MyViewHolder(view)
    }

}