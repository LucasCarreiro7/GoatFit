package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmPerfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_perfil)

        val botaoAdmEditarFoto = findViewById<Button>(R.id.botaoAdmEditarFoto)
        botaoAdmEditarFoto.setOnClickListener {
            val intent = Intent(this, AdmEditarFoto::class.java)
            startActivity(intent)
        }

        val botaoAdmDadosPessoais = findViewById<Button>(R.id.botaoAdmDadosPessoais)
        botaoAdmDadosPessoais.setOnClickListener {
            val intent = Intent(this, AdmDadosPessoais::class.java)
            startActivity(intent)
        }

        val botaoAdmHome = findViewById<Button>(R.id.botaoAdmHome)
        botaoAdmHome.setOnClickListener {
            val intent = Intent(this, AdmTelaPrincipal::class.java)
            startActivity(intent)
        }

        val botaoAdmBuscar = findViewById<Button>(R.id.botaoAdmBuscar)
        botaoAdmBuscar.setOnClickListener {
            val intent = Intent(this, AdmBuscarUsuario::class.java)
            startActivity(intent)
        }

        val botaoAdmConfig = findViewById<Button>(R.id.botaoAdmConfig)
        botaoAdmConfig.setOnClickListener {
            val intent = Intent(this, AdmConfiguracoes::class.java)
            startActivity(intent)
        }
    }
}