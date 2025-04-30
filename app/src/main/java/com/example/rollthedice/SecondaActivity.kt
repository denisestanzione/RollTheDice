package com.example.rollthedice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_seconda)

        val TAG = "SecondaActivity"
        val imageViewDado = findViewById<ImageView>(R.id.imageViewDado)
        val btnRisultato = findViewById<Button>(R.id.btnRisultato)
        val mioRandom = intent.getIntExtra("mioRandom", -1) // Recupera il numero random

        // Array associativo, when() Funziona come un case
        val dadi = when(mioRandom) {
            1 -> R.drawable.dado_1
            2 -> R.drawable.dado_2
            3 -> R.drawable.dado_3
            4 -> R.drawable.dado_4
            5 -> R.drawable.dado_5
            else -> {R.drawable.dado_6}
        }
        imageViewDado.setImageResource(dadi as Int) // Imposta l'immagine

    }
}