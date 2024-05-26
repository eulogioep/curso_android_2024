package com.eulogioep.aplicaciones.firstapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.eulogioep.aplicaciones.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first_app)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Aquí se indica el código de ejecución de la aplicación.
        val btnPulsame = findViewById<AppCompatButton>(R.id.btnPulsame)
        val etNombre = findViewById<AppCompatEditText>(R.id.etNombre)


        btnPulsame.setOnClickListener {
            // Aquí se ejecuta el código cuando se hace clic en el botón.
            val name = etNombre.text.toString()

            // Si el nombre no está vacío, se muestra un mensaje en la consola.
            if(name.isNotEmpty()) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }

        }
    }
}