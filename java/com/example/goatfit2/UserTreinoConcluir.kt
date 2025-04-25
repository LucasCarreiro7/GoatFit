package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserTreinoConcluir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_treino_concluir)

        val botaoVoltar12 = findViewById<Button>(R.id.buttonVoltar12)
        botaoVoltar12.setOnClickListener {
            val intent = Intent(this, UserTreinoExercicio::class.java)
            startActivity(intent)
        }

        val botaoConcluirSessao = findViewById<Button>(R.id.botaoConcluirSessao)
        botaoConcluirSessao.setOnClickListener {
            val intent = Intent(this, UserTelaPrincipal::class.java)
            startActivity(intent)
        }
    }
}