package com.example.goatfit2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NossasUnidadesInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_nossas_unidades_info)

        val buttonVoltar3 = findViewById<Button>(R.id.buttonVoltar3)
        buttonVoltar3.setOnClickListener {
            val intent = Intent(this, NossasUnidades::class.java)
            startActivity(intent)
        }

        }

}