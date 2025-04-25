package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmDadosPessoais : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_dados_pessoais)

        val buttonVoltar17 = findViewById<Button>(R.id.buttonVoltar17)
        buttonVoltar17.setOnClickListener {
            val intent = Intent(this, AdmTelaPrincipal::class.java)
            startActivity(intent)
        }

        val botaoSalvar6 = findViewById<Button>(R.id.botaoSalvar6)
        botaoSalvar6.setOnClickListener {
            val intent = Intent(this, AdmDadosPessoaisConfirmacao::class.java)
            startActivity(intent)
        }
    }
}