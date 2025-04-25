package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmCriarTreinoPersonalizadoSelecionarExercicios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_criar_treino_personalizado_selecionar_exercicios)

        val buttonVoltar22 = findViewById<Button>(R.id.buttonVoltar22)
        buttonVoltar22.setOnClickListener {
            val intent = Intent(this, AdmCriarTreinoPersonalizado::class.java)
            startActivity(intent)
        }

        val botaoAvancar5 = findViewById<Button>(R.id.botaoAvancar5)
        botaoAvancar5.setOnClickListener {
            val intent = Intent(this, AdmCriarTreinoPersonalizadoConfirmacao::class.java)
            startActivity(intent)
        }

    }
}