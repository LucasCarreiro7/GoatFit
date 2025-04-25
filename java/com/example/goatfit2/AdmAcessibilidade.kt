package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmAcessibilidade : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_acessibilidade)

        val buttonVoltar18 = findViewById<Button>(R.id.buttonVoltar18)
        buttonVoltar18.setOnClickListener {
            val intent = Intent(this, AdmConfiguracoes::class.java)
            startActivity(intent)
        }

        val botaoSalvar5 = findViewById<Button>(R.id.botaoSalvar5)
        botaoSalvar5.setOnClickListener {
            val intent = Intent(this, AdmConfiguracoes::class.java)
            startActivity(intent)
        }

    }
}