package com.example.retroware

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



// Aplica el listener para los insets de ventana
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)

            // Retorna los insets después de aplicar el padding
            insets


        }

        //intent para detectar si se ha pulsado salir.
        if(intent.getBooleanExtra("Exit",false))
            finish()

        //Enlace al botón e incorporación de evento "click".

        val btnappinfo = findViewById<Button>(R.id.btnintro)
        val etCuadroTexto = findViewById<EditText>(R.id.cuadrouser)

        btnappinfo.setOnClickListener {

            val nombreuser=etCuadroTexto.text.toString();

            // Verifica si el texto del EditText está vacío
            if (nombreuser.isEmpty()) {

                // Muestra un Toast con el mensaje de alerta
                Toast.makeText(this, getString(R.string.ALERTAINICIO), Toast.LENGTH_SHORT).show()



            }else{

                goToElection(nombreuser)
            }
        }
    }



    fun goToElection(nombreuser: String) {


        // Crear el intent
        val intent = Intent(this@MainActivity, CreditActivity::class.java)

        // Añadir la información necesaria al intent
        intent.putExtra("USER", nombreuser)

        // Iniciar la nueva actividad
        startActivity(intent)
    }





}

