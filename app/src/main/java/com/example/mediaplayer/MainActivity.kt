package com.example.mediaplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUI()
    }

    private fun setupUI() {
        val settingsButton = findViewById<ImageButton>(R.id.BtSettings)
        settingsButton.setOnClickListener {
            startActivity(Intent(this, Settings::class.java))
        }
    }
}