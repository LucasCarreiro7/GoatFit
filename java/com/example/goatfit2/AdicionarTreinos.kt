package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdicionarTreinos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adicionar_treinos)

        val botaoTreino1 = findViewById<Button>(R.id.botaoTreino1)
        botaoTreino1.setOnClickListener {
            val intent = Intent(this, TreinosSelecionarExercicios::class.java)
            startActivity(intent)
        }

        val botaoTreino2 = findViewById<Button>(R.id.botaoTreino2)
        botaoTreino2.setOnClickListener {
            val intent = Intent(this, TreinosSelecionarExercicios::class.java)
            startActivity(intent)
        }

        val botaoTreino3 = findViewById<Button>(R.id.botaoTreino3)
        botaoTreino3.setOnClickListener {
            val intent = Intent(this, TreinosSelecionarExercicios::class.java)
            startActivity(intent)
        }

        val botaoTreino4 = findViewById<Button>(R.id.botaoTreino4)
        botaoTreino4.setOnClickListener {
            val intent = Intent(this, TreinosSelecionarExercicios::class.java)
            startActivity(intent)
        }

        val botaoTreino5 = findViewById<Button>(R.id.botaoTreino5)
        botaoTreino5.setOnClickListener {
            val intent = Intent(this, TreinosSelecionarExercicios::class.java)
            startActivity(intent)
        }
    }
}