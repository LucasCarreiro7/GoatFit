package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NossasUnidades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_nossas_unidades)

        val buttonVoltar4 = findViewById<Button>(R.id.buttonVoltar4)
        buttonVoltar4.setOnClickListener {
            val intent = Intent(this, UserTelaPrincipal::class.java)
            startActivity(intent)
        }

        val botaoUnidade1 = findViewById<Button>(R.id.botaoUnidade1)
        botaoUnidade1.setOnClickListener {
            val intent = Intent(this, NossasUnidadesInfo::class.java)
            startActivity(intent)
        }

        }
}