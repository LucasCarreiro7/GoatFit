package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmEditarDadosUsuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_editar_dados_usuario)

        val buttonVoltar20 = findViewById<Button>(R.id.buttonVoltar20)
        buttonVoltar20.setOnClickListener {
            val intent = Intent(this, AdmBuscarUsuarioParaEditar::class.java)
            startActivity(intent)
        }

        val botaoSalvar7 = findViewById<Button>(R.id.botaoSalvar7)
        botaoSalvar7.setOnClickListener {
            val intent = Intent(this, AdmEditarDadosUsuarioConfirmacao::class.java)
            startActivity(intent)
        }
    }
}