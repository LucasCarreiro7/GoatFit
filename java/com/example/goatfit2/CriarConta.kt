package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class CriarConta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_criar_conta)

        val botaoEntrar6 = findViewById<Button>(R.id.botaoEntrar6)
        botaoEntrar6.setOnClickListener {
            val intent = Intent(this, UserTelaPrincipal::class.java)
            startActivity(intent)
        }

        val botaoVoltar = findViewById<Button>(R.id.botaoVoltar)
        botaoVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}