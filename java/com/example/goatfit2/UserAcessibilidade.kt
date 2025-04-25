package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class UserAcessibilidade : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_acessibilidade)

        val buttonVoltar16 = findViewById<Button>(R.id.buttonVoltar16)
        buttonVoltar16.setOnClickListener {
            val intent = Intent(this, UserConfiguracoes::class.java)
            startActivity(intent)
        }

        val botaoSalvar3 = findViewById<Button>(R.id.botaoSalvar3)
        botaoSalvar3.setOnClickListener {
            val intent = Intent(this, UserConfiguracoes::class.java)
            startActivity(intent)
        }

    }
}