package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class UserSair : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_sair)

        val btn_nao = findViewById<Button>(R.id.btn_nao)
        btn_nao.setOnClickListener {
            val intent = Intent(this, UserConfiguracoes::class.java)
            startActivity(intent)
        }

    }
}