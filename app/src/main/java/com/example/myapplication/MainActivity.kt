package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the main vertical RecyclerView
        val rvMain: RecyclerView = findViewById(R.id.rvMain)
        rvMain.layoutManager = LinearLayoutManager(this)

        // Generate dummy data and set the adapter
        val categories = generateDummyData()
        val adapter = CategoryAdapter(categories)
        rvMain.adapter = adapter
    }

    /**
     * Generates a list of dummy categories with random app items for demonstration.
     */
    private fun generateDummyData(): List<Category> {
        val categories = mutableListOf<Category>()

        val titles = listOf(
            "Suggested for you",
            "Recommended for you",
            "New & Updated Games",
            "Editors' Choice",
            "Action & Adventure"
        )

        for (i in titles.indices) {
            val apps = mutableListOf<AppItem>()
            for (j in 1..10) {
                apps.add(
                    AppItem(
                        id = j,
                        title = "App Item $j",
                        category = "Category $i",
                        rating = 4.0f + (Math.random().toFloat()),
                        imageUrl = R.drawable.ic_launcher_background
                    )
                )
            }
            categories.add(Category(i, titles[i], apps))
        }

        return categories
    }
}