package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmGerenciarMaquinasCadastrar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_gerenciar_maquinas_cadastrar)

        val buttonVoltar26 = findViewById<Button>(R.id.buttonVoltar26)
        buttonVoltar26.setOnClickListener {
            val intent = Intent(this, AdmGerenciarMaquinasCadastrar::class.java)
            startActivity(intent)
        }

        val botaoAvancar6 = findViewById<Button>(R.id.botaoAvancar6)
        botaoAvancar6.setOnClickListener {
            val intent = Intent(this, AdmGerenciarMaquinasCadastrarConfirmacao::class.java)
            startActivity(intent)
        }
    }
}