package com.example.retroware

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private val SPLASH_DELAY: Long = 3000 // milisegundos, osea 3 segundos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Usar Handler para retrasar el inicio de MainActivity
        Handler(Looper.getMainLooper()).postDelayed({
            // Iniciar MainActivity después del retraso
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Finalizar SplashActivity para que no vuelva al presionar "atrás"
        }, SPLASH_DELAY)
    }
}
