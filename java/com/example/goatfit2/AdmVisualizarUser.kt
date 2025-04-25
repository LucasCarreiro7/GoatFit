package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmVisualizarUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_visualizar_user)

        val botaoAdmHome5 = findViewById<Button>(R.id.botaoAdmHome5)
        botaoAdmHome5.setOnClickListener {
            val intent = Intent(this, AdmTelaPrincipal::class.java)
            startActivity(intent)
        }

        val botaoAdmPerfil5 = findViewById<Button>(R.id.botaoAdmPerfil5)
        botaoAdmPerfil5.setOnClickListener {
            val intent = Intent(this, AdmPerfil::class.java)
            startActivity(intent)
        }

        val botaoAdmConfig5 = findViewById<Button>(R.id.botaoAdmConfig5)
        botaoAdmConfig5.setOnClickListener {
            val intent = Intent(this, AdmConfiguracoes::class.java)
            startActivity(intent)
        }

        val botaoNovoTreino = findViewById<Button>(R.id.botaoNovoTreino)
        botaoNovoTreino.setOnClickListener {
            val intent = Intent(this, AdicionarTreinos::class.java)
            startActivity(intent)
        }

        val botaoEditarUser = findViewById<Button>(R.id.botaoEditarUser)
        botaoEditarUser.setOnClickListener {
            val intent = Intent(this, AdmEditarDadosUsuario::class.java)
            startActivity(intent)
        }
    }
}