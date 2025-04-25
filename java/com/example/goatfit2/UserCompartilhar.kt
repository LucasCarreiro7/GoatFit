package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class UserCompartilhar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_compartilhar)

        val botaoCompartilharSair = findViewById<Button>(R.id.botaoCompartilharSair)
        botaoCompartilharSair.setOnClickListener {
            val intent = Intent(this, UserPerfil::class.java)
            startActivity(intent)
        }

    }
}