package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class RecuperarSenha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recuperar_senha)

        val botaoVoltar2 = findViewById<Button>(R.id.botaoVoltar2)
        botaoVoltar2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            }

        val botaoAvancar = findViewById<Button>(R.id.botaoAvancar)
        botaoAvancar.setOnClickListener {
            val intent = Intent(this, RecuperarSenhaConfirmacao::class.java)
            startActivity(intent)
        }

        }

}