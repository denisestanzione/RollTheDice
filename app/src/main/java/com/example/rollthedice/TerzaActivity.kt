package com.example.rollthedice

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TerzaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_terza)

        val TAG = "TerzaActivity"
        val textViewRisultato = findViewById<TextView>(R.id.textViewRisultato)
        val imageViewIcone = findViewById<ImageView>(R.id.imageViewIcone)
        val mioRandom = intent.getIntExtra("mioRandom", -1)

        // Se il numero è dispari
        if (mioRandom % 2 != 0) {
            textViewRisultato.text = "Hai vinto!"
            imageViewIcone.setImageResource(R.drawable.coppa)
        }
        else {
            textViewRisultato.text = "Hai Perso :("
            imageViewIcone.setImageResource(R.drawable.faccina)
        }
    }
}