package com.example.mediaplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Typeface
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.ImageButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Кнопочки
        val btsettings = findViewById<ImageButton>(R.id.BtSettings)
        //Обработчики
        btsettings.setOnClickListener{
            val intent = Intent(this,Settings::class.java)
            startActivity(intent)
        }
    }


}