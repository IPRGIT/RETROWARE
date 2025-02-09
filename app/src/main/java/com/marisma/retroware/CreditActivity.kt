package com.marisma.retroware

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class CreditActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit)

        //obtener una referencia a la etiqueta de la actividad
        val mensajeVersion = findViewById<TextView>(R.id.mensajeVersion)

        //recogemos el nombre del intent
        val usuario = intent.getStringExtra("USER")
        //creamos la cadena del saludo
        mensajeVersion.apply {
        //toma el valor de la cadena "version" y le incorpora el valor del usuario.
        text = getString(R.string.versioninfo, usuario, getString(R.string.app_name))
        }

        // Configurar el botón "Contactar"
        val contactarButton = findViewById<Button>(R.id.contactarButton)
        contactarButton.setOnClickListener {
        enviarCorreo()
        }




        //click listener al botón para enviar correo
        contactarButton.setOnClickListener {
        enviarCorreo()
        }
        }



        private fun enviarCorreo() {
    val destinatario = "RETROWARE@gmail.com"
    val asunto = "Consulta de la app ${getString(R.string.app_name)}"

    // Crea un Intent con la acción ACTION_SENDTO y el URI del correo electrónico
    var int = Intent(Intent.ACTION_SENDTO);

    int.setData(Uri.parse("mailto:$destinatario"));

    int.putExtra(Intent.EXTRA_EMAIL, destinatario.toString());
    int.putExtra(Intent.EXTRA_SUBJECT, asunto.toString());




        startActivity(int)



}













}

