package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserFichasDeTreino : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_fichas_de_treino)

        val botaoVisualizar = findViewById<Button>(R.id.botaoVisualizar)
        botaoVisualizar.setOnClickListener {
            val intent = Intent(this, UserTreino::class.java)
            startActivity(intent)
        }

        val botaoVisualizar2 = findViewById<Button>(R.id.botaoVisualizar2)
        botaoVisualizar2.setOnClickListener {
            val intent = Intent(this, UserTreino::class.java)
            startActivity(intent)
        }

        val botaoVisualizar3 = findViewById<Button>(R.id.botaoVisualizar3)
        botaoVisualizar3.setOnClickListener {
            val intent = Intent(this, UserTreino::class.java)
            startActivity(intent)
        }
    }
}