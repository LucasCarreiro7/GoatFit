package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class TreinosConfirmarTreino : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_treinos_confirmar_treino)

        val buttonVoltar6 = findViewById<Button>(R.id.buttonVoltar6)
        buttonVoltar6.setOnClickListener {
            val intent = Intent(this, TreinosPlanoDeTreino::class.java)
            startActivity(intent)
        }

        val botaoConfirmarTreino = findViewById<Button>(R.id.botaoConfirmarTreino)
        botaoConfirmarTreino.setOnClickListener {
            val intent = Intent(this, TreinosConfirmacao::class.java)
            startActivity(intent)
        }
    }
}