package com.example.myapplication

/**
 * Data class representing a single application item in the list.
 *
 * @property id Unique identifier for the app.
 * @property title The name of the application.
 * @property category The category name this app belongs to.
 * @property rating The user rating of the app (e.g., 4.5).
 * @property imageUrl Resource ID for the app icon (using Int for drawable resources).
 */
data class AppItem(
    val id: Int,
    val title: String,
    val category: String,
    val rating: Float,
    val imageUrl: Int // Using drawable resource ID for simplicity
)
