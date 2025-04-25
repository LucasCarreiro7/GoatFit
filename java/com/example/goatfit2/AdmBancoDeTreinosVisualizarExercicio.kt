package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmBancoDeTreinosVisualizarExercicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_banco_de_treinos_visualizar_exercicio)

        val buttonVoltar25 = findViewById<Button>(R.id.buttonVoltar25)
        buttonVoltar25.setOnClickListener {
            val intent = Intent(this, AdmBancoDeTreinosExercicios::class.java)
            startActivity(intent)
        }
    }
}