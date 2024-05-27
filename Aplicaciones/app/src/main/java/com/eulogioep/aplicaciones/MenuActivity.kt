package com.eulogioep.aplicaciones

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.eulogioep.aplicaciones.firstapp.FirstAppActivity
import com.eulogioep.aplicaciones.imccalc.IMCActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Botones de acceso a las aplicaciones.
        val btnSaludos = findViewById<AppCompatButton>(R.id.btnSaludos)
        val btnIMCApp = findViewById<AppCompatButton>(R.id.btnIMCApp)

        // Acciones al pulsar los botones.
        btnSaludos.setOnClickListener{ navigateToSaludosAPP() }
        btnIMCApp.setOnClickListener{ navigateToIMCAPP() }
    }

    private fun navigateToIMCAPP() {
        val intent = Intent(this, IMCActivity::class.java)
        startActivity(intent)

    }


    private fun navigateToSaludosAPP() {

        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }


}