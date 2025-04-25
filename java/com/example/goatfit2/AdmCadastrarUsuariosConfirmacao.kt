package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmCadastrarUsuariosConfirmacao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_cadastrar_usuarios_confirmacao)

        Handler(Looper.getMainLooper()).postDelayed({
            // Aqui você define pra onde quer voltar, por exemplo:
            val intent = Intent(this, AdmTelaPrincipal::class.java)
            startActivity(intent)
            finish() //
        }, 1700)
    }
}