package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserEditarFoto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_editar_foto)

        val botaoEditarFotoSair = findViewById<Button>(R.id.botaoEditarFotoSair)
        botaoEditarFotoSair.setOnClickListener {
            val intent = Intent(this, UserPerfil::class.java)
            startActivity(intent)
        }
    }
}