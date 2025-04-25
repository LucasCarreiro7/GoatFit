package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class UserTreino : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_treino)

        val botaoVoltar10 = findViewById<Button>(R.id.botaoVoltar10)
        botaoVoltar10.setOnClickListener {
            val intent = Intent(this, UserTelaPrincipal::class.java)
            startActivity(intent)
        }

        val botaoComecarSessao = findViewById<Button>(R.id.botaoComecarSessao)
        botaoComecarSessao.setOnClickListener {
            val intent = Intent(this, UserTreinoExercicio::class.java)
            startActivity(intent)
        }
    }
}