package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Adapter for the inner horizontal RecyclerView.
 * Displays individual [AppItem]s.
 */
class AppAdapter(private val apps: List<AppItem>) : RecyclerView.Adapter<AppAdapter.AppViewHolder>() {

    class AppViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivAppIcon: ImageView = itemView.findViewById(R.id.ivAppIcon)
        val tvAppTitle: TextView = itemView.findViewById(R.id.tvAppTitle)
        val tvAppRating: TextView = itemView.findViewById(R.id.tvAppRating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_app, parent, false)
        return AppViewHolder(view)
    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        val app = apps[position]
        // Bind data to UI elements
        holder.tvAppTitle.text = app.title
        holder.tvAppRating.text = "${app.rating} ★"
        holder.ivAppIcon.setImageResource(app.imageUrl)
    }

    override fun getItemCount(): Int = apps.size
}
