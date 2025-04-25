package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserTreinoExercicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_treino_exercicio)

        val botaoVoltar11 = findViewById<Button>(R.id.buttonVoltar11)
        botaoVoltar11.setOnClickListener {
            val intent = Intent(this, UserTreino::class.java)
            startActivity(intent)
        }

        val botaoProximoExercicio = findViewById<Button>(R.id.botaoProximoExercicio)
        botaoProximoExercicio.setOnClickListener {
            val intent = Intent(this, UserTreinoConcluir::class.java)
            startActivity(intent)
        }

    }
}