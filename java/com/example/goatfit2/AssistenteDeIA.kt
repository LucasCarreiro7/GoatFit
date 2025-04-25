package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AssistenteDeIA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_assistente_de_ia)

        val botaoHome3 = findViewById<Button>(R.id.botaoHome3)
        botaoHome3.setOnClickListener {
            val intent = Intent(this, UserTelaPrincipal::class.java)
            startActivity(intent)
        }

        val botaoPerfil3 = findViewById<Button>(R.id.botaoPerfil3)
        botaoPerfil3.setOnClickListener {
            val intent = Intent(this, UserPerfil::class.java)
            startActivity(intent)
        }

        val botaoConfig3 = findViewById<Button>(R.id.botaoConfig3)
        botaoConfig3.setOnClickListener {
            val intent = Intent(this, UserConfiguracoes::class.java)
            startActivity(intent)
        }

    }
}