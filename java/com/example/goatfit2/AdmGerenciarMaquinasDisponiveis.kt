package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmGerenciarMaquinasDisponiveis : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_gerenciar_maquinas_disponiveis)

        val buttonVoltar30 = findViewById<Button>(R.id.buttonVoltar30)
        buttonVoltar30.setOnClickListener {
            val intent = Intent(this, AdmTelaPrincipal::class.java)
            startActivity(intent)
        }

        val botaoCadastrarMaquina = findViewById<Button>(R.id.botaoCadastrarMaquina)
        botaoCadastrarMaquina.setOnClickListener {
            val intent = Intent(this, AdmGerenciarMaquinasCadastrar::class.java)
            startActivity(intent)
        }

        val botaoMaquina1 = findViewById<Button>(R.id.botaoMaquina1)
        botaoMaquina1.setOnClickListener {
            val intent = Intent(this, AdmGerenciarMaquinasVisualizarMaquina::class.java)
            startActivity(intent)
        }

        val botaoMaquina2 = findViewById<Button>(R.id.botaoMaquina2)
        botaoMaquina2.setOnClickListener {
            val intent = Intent(this, AdmGerenciarMaquinasVisualizarMaquina::class.java)
            startActivity(intent)
        }

        val botaoMaquina3 = findViewById<Button>(R.id.botaoMaquina3)
        botaoMaquina3.setOnClickListener {
            val intent = Intent(this, AdmGerenciarMaquinasVisualizarMaquina::class.java)
            startActivity(intent)
        }

        val botaoMaquina4 = findViewById<Button>(R.id.botaoMaquina4)
        botaoMaquina4.setOnClickListener {
            val intent = Intent(this, AdmGerenciarMaquinasVisualizarMaquina::class.java)
            startActivity(intent)
        }

        val botaoMaquina5 = findViewById<Button>(R.id.botaoMaquina5)
        botaoMaquina5.setOnClickListener {
            val intent = Intent(this, AdmGerenciarMaquinasVisualizarMaquina::class.java)
            startActivity(intent)
        }

    }
}