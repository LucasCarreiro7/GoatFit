package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserPerfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_perfil)

        val botaoCompartilhar = findViewById<Button>(R.id.botaoCompartilhar)
        botaoCompartilhar.setOnClickListener {
            val intent = Intent(this, UserCompartilhar::class.java)
            startActivity(intent)
        }

        val botaoFotoDePerfil = findViewById<Button>(R.id.botaoFotoDePerfil)
        botaoFotoDePerfil.setOnClickListener {
            val intent = Intent(this, UserEditarFoto::class.java)
            startActivity(intent)
        }

        val botaoHome = findViewById<Button>(R.id.botaoHome)
        botaoHome.setOnClickListener {
            val intent = Intent(this, UserTelaPrincipal::class.java)
            startActivity(intent)
        }

        val botaoConfig2 = findViewById<Button>(R.id.botaoConfig2)
        botaoConfig2.setOnClickListener {
            val intent = Intent(this, UserConfiguracoes::class.java)
            startActivity(intent)
        }

        val botaoIa2 = findViewById<Button>(R.id.botaoIa2)
        botaoIa2.setOnClickListener {
            val intent = Intent(this, AssistenteDeIA::class.java)
            startActivity(intent)
        }

    }
}