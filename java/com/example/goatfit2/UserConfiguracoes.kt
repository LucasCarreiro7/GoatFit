package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserConfiguracoes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_configuracoes)

        val botaoDadosPessoais2 = findViewById<Button>(R.id.botaoDadosPessoais2)
        botaoDadosPessoais2.setOnClickListener {
            val intent = Intent(this, UserDadosPessoais::class.java)
            startActivity(intent)
        }

        val botaoTreinos2 = findViewById<Button>(R.id.botaoTreinos2)
        botaoTreinos2.setOnClickListener {
            val intent = Intent(this, UserFichasDeTreino::class.java)
            startActivity(intent)
        }

        val botaoUnidades2 = findViewById<Button>(R.id.botaoUnidades2)
        botaoUnidades2.setOnClickListener {
            val intent = Intent(this, NossasUnidades::class.java)
            startActivity(intent)
        }

        val botaoAlterarSenha = findViewById<Button>(R.id.botaoAlterarSenha)
        botaoAlterarSenha.setOnClickListener {
            val intent = Intent(this, UserAlterarSenha::class.java)
            startActivity(intent)
        }

        val botaoAcessibilidade = findViewById<Button>(R.id.botaoAcessibilidade)
        botaoAcessibilidade.setOnClickListener {
            val intent = Intent(this, UserAcessibilidade::class.java)
            startActivity(intent)
        }

        val botaoSair = findViewById<Button>(R.id.botaoSair)
        botaoSair.setOnClickListener {
            val intent = Intent(this, UserSair::class.java)
            startActivity(intent)
        }

        val botaoHome2 = findViewById<Button>(R.id.botaoHome2)
        botaoHome2.setOnClickListener {
            val intent = Intent(this, UserTelaPrincipal::class.java)
            startActivity(intent)
        }

        val botaoPerfil2 = findViewById<Button>(R.id.botaoPerfil2)
        botaoPerfil2.setOnClickListener {
            val intent = Intent(this, UserPerfil::class.java)
            startActivity(intent)
        }

        val botaoIa3 = findViewById<Button>(R.id.botaoIa3)
        botaoIa3.setOnClickListener {
            val intent = Intent(this, AssistenteDeIA::class.java)
            startActivity(intent)
        }
    }
}