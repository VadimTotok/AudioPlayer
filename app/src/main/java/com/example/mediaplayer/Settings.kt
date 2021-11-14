package com.example.mediaplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val tomain = findViewById<ImageButton>(R.id.ToMain)

        tomain.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}