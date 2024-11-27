package com.example.retroware

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CreditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit)

        // Configurar ajustes para el sistema de barras (opcional, depende del diseño)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Obtener referencias a los TextView
        val usuarioTextView = findViewById<TextView>(R.id.txtusuario)
        val infoAppTextView = findViewById<TextView>(R.id.txtinfoapp)

        // Recoger el nombre del usuario desde el intent
        val usuario = intent.getStringExtra("USER")
        val appName = getString(R.string.app_name)

        // Crear mensajes dinámicos
        val usuarioTexto = if (usuario.isNullOrEmpty()) {
            "Usuario" // Texto predeterminado si no se pasa un usuario
        } else {
            usuario
        }

        // Establecer los textos en los TextView
        usuarioTextView.text = "$usuarioTexto ${getString(R.string.TEXTOUSERCREDIT)}"
        infoAppTextView.text = getString(R.string.TEXTOINFOAPP)

        // Configurar el botón "Contactar"
        val contactarButton = findViewById<Button>(R.id.btncontactar)
        contactarButton.setOnClickListener {
            enviarCorreo()


        }
    }



    // Método para enviar el correo electrónico
    private fun enviarCorreo() {
        val destinatario = "RETROWARE_Support@gmail.com" // Correo predefinido
        val asunto = "Consulta de la app ${getString(R.string.app_name)}"
        val mensaje = "Hola, tengo una consulta acerca de ${getString(R.string.app_name)}."

        // Crear el Intent con la acción ACTION_SEND
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain" // MIME type para texto plano
            putExtra(Intent.EXTRA_EMAIL, arrayOf(destinatario))
            putExtra(Intent.EXTRA_SUBJECT, asunto)
            putExtra(Intent.EXTRA_TEXT, mensaje)
        }

        // Verificar si hay aplicaciones de correo disponibles
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(Intent.createChooser(intent, "Selecciona la app de correo"))
        } else {
            // Si no hay aplicaciones de correo, mostrar un mensaje
            Toast.makeText(this, "No se puede abrir la aplicación de correo", Toast.LENGTH_SHORT).show()
        }
    }














}
