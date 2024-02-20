package com.example.test_x1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val nameR = intent.getStringExtra("name")
        val tName : TextView = findViewById(R.id.textView)

        tName.text = "Bienvenido $nameR"
    }
}