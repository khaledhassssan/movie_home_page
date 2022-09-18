package com.khaled.moviehomepage.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.khaled.moviehomepage.R
import com.khaled.moviehomepage.model.AllCategory
import com.khaled.moviehomepage.model.CategoryItem

class MainRecyclerAdapter(
    private val context: Context,
    private val allCategory: List<AllCategory>
) : RecyclerView.Adapter<MainRecyclerAdapter.MainViewHolder>() {

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var categoryTitle: TextView
        var itemRecycler: RecyclerView

        init {
            categoryTitle = itemView.findViewById(R.id.cat_title)
            itemRecycler = itemView.findViewById(R.id.cat_item_recycler)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            LayoutInflater.from(context).inflate(R.layout.main_recyecler_row_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {

        holder.categoryTitle.text = allCategory[position].categoryTitle
        setCatItemRecycler(holder.itemRecycler, allCategory[position].categoryItem)

    }

    override fun getItemCount(): Int {
        return allCategory.size
    }

    private fun setCatItemRecycler(recyclerView: RecyclerView, categoryItem: List<CategoryItem>) {
        val itemRecyclerAdapter = CategoryItemAdapter(context, categoryItem)
        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = itemRecyclerAdapter

    }
}