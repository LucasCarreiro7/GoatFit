package com.example.goatfit2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class UserTelaPrincipal : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_tela_principal)

        val botaoiniciar = findViewById<Button>(R.id.botaoIniciar)
        botaoiniciar.setOnClickListener {
            val intent = Intent(this, UserTreino::class.java)
            startActivity(intent)
        }

        val botaoDadosPessoais = findViewById<Button>(R.id.botaoDadosPessoais)
        botaoDadosPessoais.setOnClickListener {
            val intent = Intent(this, UserDadosPessoais::class.java)
            startActivity(intent)
        }

        val botaoUnidades = findViewById<Button>(R.id.botaoUnidades)
        botaoUnidades.setOnClickListener {
            val intent = Intent(this, NossasUnidades::class.java)
            startActivity(intent)
        }

        val botaoTreinos = findViewById<Button>(R.id.botaoTreinos)
        botaoTreinos.setOnClickListener {
            val intent = Intent(this, UserFichasDeTreino::class.java)
            startActivity(intent)
        }

        val botaoPerfil = findViewById<Button>(R.id.botaoPerfil)
        botaoPerfil.setOnClickListener {
            val intent = Intent(this, UserPerfil::class.java)
            startActivity(intent)
        }

        val botaoConfig = findViewById<Button>(R.id.botaoConfig)
        botaoConfig.setOnClickListener {
            val intent = Intent(this, UserConfiguracoes::class.java)
            startActivity(intent)
        }

        val botaoIa = findViewById<Button>(R.id.botaoIa)
        botaoIa.setOnClickListener {
            val intent = Intent(this, AssistenteDeIA::class.java)
            startActivity(intent)
        }

        }

}