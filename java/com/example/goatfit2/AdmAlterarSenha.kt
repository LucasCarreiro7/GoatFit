package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmAlterarSenha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_alterar_senha)

        val buttonVoltar14 = findViewById<Button>(R.id.buttonVoltar14)
        buttonVoltar14.setOnClickListener {
            val intent = Intent(this, AdmConfiguracoes::class.java)
            startActivity(intent)
        }

        val botaoSalvar4 = findViewById<Button>(R.id.botaoSalvar4)
        botaoSalvar4.setOnClickListener {
            val intent = Intent(this, AdmAlterarSenhaConfirmacao::class.java)
            startActivity(intent)
        }
    }
}