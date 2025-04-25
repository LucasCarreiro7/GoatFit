package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmBuscarUsuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_buscar_usuario)

        val botaoUser5 = findViewById<Button>(R.id.botaoUser5)
        botaoUser5.setOnClickListener {
            val intent = Intent(this, AdmVisualizarUser::class.java)
            startActivity(intent)
        }

        val botaoUser6 = findViewById<Button>(R.id.botaoUser6)
        botaoUser6.setOnClickListener {
            val intent = Intent(this, AdmVisualizarUser::class.java)
            startActivity(intent)
        }

        val botaoUser7 = findViewById<Button>(R.id.botaoUser7)
        botaoUser7.setOnClickListener {
            val intent = Intent(this, AdmVisualizarUser::class.java)
            startActivity(intent)
        }

        val botaoUser8 = findViewById<Button>(R.id.botaoUser8)
        botaoUser8.setOnClickListener {
            val intent = Intent(this, AdmVisualizarUser::class.java)
            startActivity(intent)
        }

        val botaoAdmHome4 = findViewById<Button>(R.id.botaoAdmHome4)
        botaoAdmHome4.setOnClickListener {
            val intent = Intent(this, AdmTelaPrincipal::class.java)
            startActivity(intent)
        }

        val botaoAdmPerfil4 = findViewById<Button>(R.id.botaoAdmPerfil4)
        botaoAdmPerfil4.setOnClickListener {
            val intent = Intent(this, AdmPerfil::class.java)
            startActivity(intent)
        }

        val botaoAdmConfig4 = findViewById<Button>(R.id.botaoAdmConfig4)
        botaoAdmConfig4.setOnClickListener {
            val intent = Intent(this, AdmConfiguracoes::class.java)
            startActivity(intent)
        }
    }
}