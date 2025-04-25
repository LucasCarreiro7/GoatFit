package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmConfiguracoes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_configuracoes)

        val botaoAdmDadosPessoais2 = findViewById<Button>(R.id.botaoAdmDadosPessoais2)
        botaoAdmDadosPessoais2.setOnClickListener {
            val intent = Intent(this, AdmDadosPessoais::class.java)
            startActivity(intent)
        }

        val botaoAdmAlterarSenha = findViewById<Button>(R.id.botaoAdmAlterarSenha)
        botaoAdmAlterarSenha.setOnClickListener {
            val intent = Intent(this, AdmAlterarSenha::class.java)
            startActivity(intent)
        }

        val botaoAdmAcessibilidade = findViewById<Button>(R.id.botaoAdmAcessibilidade)
        botaoAdmAcessibilidade.setOnClickListener {
            val intent = Intent(this, AdmAcessibilidade::class.java)
            startActivity(intent)
        }

        val botaoAdmSair = findViewById<Button>(R.id.botaoAdmSair)
        botaoAdmSair.setOnClickListener {
            val intent = Intent(this, AdmSair::class.java)
            startActivity(intent)
        }

        val botaoAdmHome2 = findViewById<Button>(R.id.botaoAdmHome2)
        botaoAdmHome2.setOnClickListener {
            val intent = Intent(this, AdmTelaPrincipal::class.java)
            startActivity(intent)
        }

        val botaoAdmBuscar2 = findViewById<Button>(R.id.botaoAdmBuscar2)
        botaoAdmBuscar2.setOnClickListener {
            val intent = Intent(this, AdmBuscarUsuario::class.java)
            startActivity(intent)
        }

        val botaoAdmPerfil = findViewById<Button>(R.id.botaoAdmPerfil)
        botaoAdmPerfil.setOnClickListener {
            val intent = Intent(this, AdmPerfil::class.java)
            startActivity(intent)
        }
    }
}