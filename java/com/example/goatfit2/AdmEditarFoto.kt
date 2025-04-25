package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmEditarFoto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_editar_foto)

        val botaoEditarFotoSair2 = findViewById<Button>(R.id.botaoEditarFotoSair2)
        botaoEditarFotoSair2.setOnClickListener {
            val intent = Intent(this, AdmPerfil::class.java)
            startActivity(intent)
        }

    }
}