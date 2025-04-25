package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TreinosPlanoDeTreino : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_treinos_plano_de_treino)

        val buttonVoltar5 = findViewById<Button>(R.id.buttonVoltar5)
        buttonVoltar5.setOnClickListener {
            val intent = Intent(this, TreinosSelecionarExercicios::class.java)
            startActivity(intent)
        }

        val botaoExibirTreino = findViewById<Button>(R.id.botaoExibirTreino)
        botaoExibirTreino.setOnClickListener {
            val intent = Intent(this, TreinosConfirmarTreino::class.java)
            startActivity(intent)
        }
    }
}