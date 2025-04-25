package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmGerenciarMaquinasVisualizarMaquina : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_gerenciar_maquinas_visualizar_maquina)

        val buttonVoltar28 = findViewById<Button>(R.id.buttonVoltar28)
        buttonVoltar28.setOnClickListener {
            val intent = Intent(this, AdmGerenciarMaquinasDisponiveis::class.java)
            startActivity(intent)
        }

        val botaoEditarMaquina = findViewById<Button>(R.id.botaoEditarMaquina)
        botaoEditarMaquina.setOnClickListener {
            val intent = Intent(this, AdmGerenciarMaquinasEditar::class.java)
            startActivity(intent)
        }

    }
}