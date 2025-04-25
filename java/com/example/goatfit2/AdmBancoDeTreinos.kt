package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmBancoDeTreinos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_banco_de_treinos)

        val buttonVoltar23 = findViewById<Button>(R.id.buttonVoltar23)
        buttonVoltar23.setOnClickListener {
            val intent = Intent(this, AdmTelaPrincipal::class.java)
            startActivity(intent)
        }

        val botaoTreinos1 = findViewById<Button>(R.id.botaoTreinos1)
        botaoTreinos1.setOnClickListener {
            val intent = Intent(this, AdmBancoDeTreinosExercicios::class.java)
            startActivity(intent)
        }

        val botaoTreinos3 = findViewById<Button>(R.id.botaoTreinos3)
        botaoTreinos1.setOnClickListener {
            val intent = Intent(this, AdmBancoDeTreinosExercicios::class.java)
            startActivity(intent)
        }

        val botaoTreinos4 = findViewById<Button>(R.id.botaoTreinos4)
        botaoTreinos1.setOnClickListener {
            val intent = Intent(this, AdmBancoDeTreinosExercicios::class.java)
            startActivity(intent)
        }

        val botaoTreinos5 = findViewById<Button>(R.id.botaoTreinos5)
        botaoTreinos1.setOnClickListener {
            val intent = Intent(this, AdmBancoDeTreinosExercicios::class.java)
            startActivity(intent)
        }

        val botaoTreinos6 = findViewById<Button>(R.id.botaoTreinos6)
        botaoTreinos1.setOnClickListener {
            val intent = Intent(this, AdmBancoDeTreinosExercicios::class.java)
            startActivity(intent)
        }
    }
}