package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmGerenciarMaquinasEditar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_gerenciar_maquinas_editar)

        val buttonVoltar27 = findViewById<Button>(R.id.buttonVoltar27)
        buttonVoltar27.setOnClickListener {
            val intent = Intent(this, AdmGerenciarMaquinasVisualizarMaquina::class.java)
            startActivity(intent)
        }

        val botaoSalvar8 = findViewById<Button>(R.id.botaoSalvar8)
        botaoSalvar8.setOnClickListener {
            val intent = Intent(this, AdmGerenciarMaquinasEditarConfirmacao::class.java)
            startActivity(intent)
        }
    }
}