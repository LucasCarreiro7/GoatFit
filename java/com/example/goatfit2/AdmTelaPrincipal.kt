package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmTelaPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_tela_principal)

        val botaoAcessar = findViewById<Button>(R.id.botaoAcessar)
        botaoAcessar.setOnClickListener {
            val intent = Intent(this, AdmBancoDeTreinos::class.java)
            startActivity(intent)
        }

        val botaoCadastrarUsuarios = findViewById<Button>(R.id.botaoCadastrarUsuarios)
        botaoCadastrarUsuarios.setOnClickListener {
            val intent = Intent(this, AdmCadastrarUsuarios::class.java)
            startActivity(intent)
        }

        val botaoEditarUsuarios = findViewById<Button>(R.id.botaoEditarUsuarios)
        botaoEditarUsuarios.setOnClickListener {
            val intent = Intent(this, AdmBuscarUsuarioParaEditar::class.java)
            startActivity(intent)
        }

        val botaoGerenciarMaquinas = findViewById<Button>(R.id.botaoGerenciarMaquinas)
        botaoGerenciarMaquinas.setOnClickListener {
            val intent = Intent(this, AdmGerenciarMaquinasDisponiveis::class.java)
            startActivity(intent)
        }

        val botaoCriarTreinoPersonalizado = findViewById<Button>(R.id.botaoCriarTreinoPersonalizado)
        botaoCriarTreinoPersonalizado.setOnClickListener {
            val intent = Intent(this, AdmCriarTreinoPersonalizado::class.java)
            startActivity(intent)
        }

        val botaoAdmBuscar3 = findViewById<Button>(R.id.botaoAdmBuscar3)
        botaoAdmBuscar3.setOnClickListener {
            val intent = Intent(this, AdmBuscarUsuario::class.java)
            startActivity(intent)
        }

        val botaoAdmConfig3 = findViewById<Button>(R.id.botaoAdmConfig3)
        botaoAdmConfig3.setOnClickListener {
            val intent = Intent(this, AdmConfiguracoes::class.java)
            startActivity(intent)
        }

        val botaoAdmPerfil3 = findViewById<Button>(R.id.botaoAdmPerfil3)
        botaoAdmPerfil3.setOnClickListener {
            val intent = Intent(this, AdmPerfil::class.java)
            startActivity(intent)
        }
    }
}