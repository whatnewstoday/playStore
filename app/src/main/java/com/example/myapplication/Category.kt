package com.example.myapplication

/**
 * Data class representing a category section.
 *
 * @property id Unique identifier for the category.
 * @property title The title of the category (e.g., "Recommended for you").
 * @property items The list of [AppItem]s contained within this category.
 */
data class Category(
    val id: Int,
    val title: String,
    val items: List<AppItem>
)
