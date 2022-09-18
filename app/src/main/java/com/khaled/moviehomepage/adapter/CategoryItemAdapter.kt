package com.khaled.moviehomepage.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.khaled.moviehomepage.R
import com.khaled.moviehomepage.model.AllCategory
import com.khaled.moviehomepage.model.CategoryItem

class CategoryItemAdapter(
    private val context: Context,
    private val categoryItem: List<CategoryItem>
) : RecyclerView.Adapter<CategoryItemAdapter.CategoryItemHolder>() {

    class CategoryItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryItemHolder {
        return CategoryItemHolder(
            LayoutInflater.from(context).inflate(R.layout.cat_row_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CategoryItemHolder, position: Int) {
        holder.itemImage.setImageResource(categoryItem[position].imageUrl)
    }

    override fun getItemCount(): Int {
        return categoryItem.size
    }


}