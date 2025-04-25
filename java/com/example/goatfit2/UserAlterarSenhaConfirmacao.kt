package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class UserAlterarSenhaConfirmacao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_alterar_senha_confirmacao)

        Handler(Looper.getMainLooper()).postDelayed({
            // Aqui você define pra onde quer voltar, por exemplo:
            val intent = Intent(this, UserConfiguracoes::class.java)
            startActivity(intent)
            finish() //
        }, 1700)
    }
}