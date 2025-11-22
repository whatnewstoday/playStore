package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * Adapter for the outer vertical RecyclerView.
 * Displays [Category] items, each containing a horizontal RecyclerView of apps.
 */
class CategoryAdapter(private val categories: List<Category>) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    // Shared pool to optimize nested RecyclerView performance
    private val viewPool = RecyclerView.RecycledViewPool()

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvCategoryTitle: TextView = itemView.findViewById(R.id.tvCategoryTitle)
        val rvApps: RecyclerView = itemView.findViewById(R.id.rvApps)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categories[position]
        holder.tvCategoryTitle.text = category.title

        // Set up the inner horizontal RecyclerView
        val appAdapter = AppAdapter(category.items)
        holder.rvApps.layoutManager = LinearLayoutManager(holder.itemView.context, LinearLayoutManager.HORIZONTAL, false)
        holder.rvApps.adapter = appAdapter
        
        // Share the RecycledViewPool between nested RecyclerViews to improve scrolling performance
        holder.rvApps.setRecycledViewPool(viewPool)
    }

    override fun getItemCount(): Int = categories.size
}
