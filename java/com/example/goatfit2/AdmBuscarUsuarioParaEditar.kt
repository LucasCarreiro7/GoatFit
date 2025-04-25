package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmBuscarUsuarioParaEditar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_buscar_usuario_para_editar)

        val buttonVoltar29 = findViewById<Button>(R.id.buttonVoltar29)
        buttonVoltar29.setOnClickListener {
            val intent = Intent(this, AdmTelaPrincipal::class.java)
            startActivity(intent)
        }

        val botaoUser1 = findViewById<Button>(R.id.botaoUser1)
        botaoUser1.setOnClickListener {
            val intent = Intent(this, AdmEditarDadosUsuario::class.java)
            startActivity(intent)
        }

        val botaoUser2 = findViewById<Button>(R.id.botaoUser2)
        botaoUser2.setOnClickListener {
            val intent = Intent(this, AdmEditarDadosUsuario::class.java)
            startActivity(intent)
        }

        val botaoUser3 = findViewById<Button>(R.id.botaoUser3)
        botaoUser3.setOnClickListener {
            val intent = Intent(this, AdmEditarDadosUsuario::class.java)
            startActivity(intent)
        }

        val botaoUser4 = findViewById<Button>(R.id.botaoUser4)
        botaoUser4.setOnClickListener {
            val intent = Intent(this, AdmEditarDadosUsuario::class.java)
            startActivity(intent)
        }
    }
}