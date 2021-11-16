package com.example.firstui


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.view.View
import androidx.cardview.widget.CardView
import com.example.firstui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.title = "Notes"

        setSupportActionBar(binding.toolbar)

        val card_view = findViewById<CardView>(R.id.card_view)

        card_view.setOnClickListener {
            val intent = Intent(card_view.context, DetailedView::class.java)
            startActivity(intent)
        }
    }
}