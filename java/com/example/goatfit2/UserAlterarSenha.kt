package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserAlterarSenha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_alterar_senha)

        val buttonVoltar15 = findViewById<Button>(R.id.buttonVoltar15)
        buttonVoltar15.setOnClickListener {
            val intent = Intent(this, UserConfiguracoes::class.java)
            startActivity(intent)
        }

        val botaoSalvar2 = findViewById<Button>(R.id.botaoSalvar2)
        botaoSalvar2.setOnClickListener {
            val intent = Intent(this, UserAlterarSenhaConfirmacao::class.java)
            startActivity(intent)
        }

    }
}