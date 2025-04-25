package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdmBancoDeTreinosExercicios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_adm_banco_de_treinos_exercicios)

        val buttonVoltar24 = findViewById<Button>(R.id.buttonVoltar24)
        buttonVoltar24.setOnClickListener {
            val intent = Intent(this, AdmBancoDeTreinos::class.java)
            startActivity(intent)
        }

        val botaoExercicio1 = findViewById<Button>(R.id.botaoExercicio1)
        botaoExercicio1.setOnClickListener {
            val intent = Intent(this, AdmBancoDeTreinosVisualizarExercicio::class.java)
            startActivity(intent)
        }

        val botaoExercicio2 = findViewById<Button>(R.id.botaoExercicio2)
        botaoExercicio2.setOnClickListener {
            val intent = Intent(this, AdmBancoDeTreinosVisualizarExercicio::class.java)
            startActivity(intent)
        }

        val botaoExercicio3 = findViewById<Button>(R.id.botaoExercicio3)
        botaoExercicio3.setOnClickListener {
            val intent = Intent(this, AdmBancoDeTreinosVisualizarExercicio::class.java)
            startActivity(intent)
        }

        val botaoExercicio4 = findViewById<Button>(R.id.botaoExercicio4)
        botaoExercicio4.setOnClickListener {
            val intent = Intent(this, AdmBancoDeTreinosVisualizarExercicio::class.java)
            startActivity(intent)
        }

        val botaoExercicio5 = findViewById<Button>(R.id.botaoExercicio5)
        botaoExercicio5.setOnClickListener {
            val intent = Intent(this, AdmBancoDeTreinosVisualizarExercicio::class.java)
            startActivity(intent)
        }
    }
}