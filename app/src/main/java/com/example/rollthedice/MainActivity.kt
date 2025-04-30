package com.example.rollthedice

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val TAG = "MainActivity"
        val btnTira = findViewById<Button>(R.id.btnTira)
        // Assegnare un comportamento al click
        btnTira.setOnClickListener {
            // Genera un numero random
            val mioRandom = generaNumero()
        }
    }

    private fun generaNumero(): Int{
        return (1..6).random()
    }
}