package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmCriarTreinoPersonalizado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_criar_treino_personalizado)

        val buttonVoltar21 = findViewById<Button>(R.id.buttonVoltar21)
        buttonVoltar21.setOnClickListener {
            val intent = Intent(this, AdmTelaPrincipal::class.java)
            startActivity(intent)
        }

        val botaoAvancar4 = findViewById<Button>(R.id.botaoAvancar4)
        botaoAvancar4.setOnClickListener {
            val intent = Intent(this, AdmPerfil::class.java)
            startActivity(intent)
        }

    }
}