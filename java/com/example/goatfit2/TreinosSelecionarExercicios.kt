package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TreinosSelecionarExercicios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_treinos_selecionar_exercicios)

        val buttonVoltar9 = findViewById<Button>(R.id.buttonVoltar9)
        buttonVoltar9.setOnClickListener {
            val intent = Intent(this, AdicionarTreinos::class.java)
            startActivity(intent)
        }

        val botaoAvancar2 = findViewById<Button>(R.id.botaoAvancar2)
        botaoAvancar2.setOnClickListener {
            val intent = Intent(this, TreinosPlanoDeTreino::class.java)
            startActivity(intent)
        }
    }
}