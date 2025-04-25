package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserDadosPessoais : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_dados_pessoais)

        val botaoVoltar7 = findViewById<Button>(R.id.buttonVoltar7)
        botaoVoltar7.setOnClickListener {
            val intent = Intent(this, UserTelaPrincipal::class.java)
            startActivity(intent)
        }

        val botaoSalvar = findViewById<Button>(R.id.botaoSalvar)
        botaoSalvar.setOnClickListener {
            val intent = Intent(this, UserDadosPessoaisConfirmacao::class.java)
            startActivity(intent)
        }

    }
}