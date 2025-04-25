package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmCadastrarUsuarios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_cadastrar_usuarios)

        val buttonVoltar19 = findViewById<Button>(R.id.buttonVoltar19)
        buttonVoltar19.setOnClickListener {
            val intent = Intent(this, AdmPerfil::class.java)
            startActivity(intent)
        }

        val botaoCadastrar = findViewById<Button>(R.id.botaoCadastrar)
        botaoCadastrar.setOnClickListener {
            val intent = Intent(this, AdmCadastrarUsuariosConfirmacao::class.java)
            startActivity(intent)
        }
    }
}