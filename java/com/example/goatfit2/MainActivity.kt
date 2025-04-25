package com.example.goatfit2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)

        val botaoEntrar = findViewById<Button>(R.id.botaoEntrar)
        botaoEntrar.setOnClickListener {
            val email = editTextEmail.text.toString().trim()
            if (email == "adm@gmail.com") {
                val intent = Intent(this, AdmTelaPrincipal::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, UserTelaPrincipal::class.java)
                startActivity(intent)
            }

            val botaoCriarConta = findViewById<Button>(R.id.botaoCriarConta)
            botaoCriarConta.setOnClickListener {
                val intent2 = Intent(this, CriarConta::class.java)
                startActivity(intent2)
            }

            val botaoRecuperarSenha = findViewById<Button>(R.id.botaoRecuperarSenha)
            botaoRecuperarSenha.setOnClickListener {
                val intent2 = Intent(this, RecuperarSenha::class.java)
                startActivity(intent2)
            }

        }
    }
}