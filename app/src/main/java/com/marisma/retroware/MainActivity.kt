package com.marisma.retroware

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Cargar el LoginFragment por defecto
        /**supportFragmentManager.beginTransaction()
        .replace(R.id.navHostFragment, LoginFragment())
        .commit()*/
    }
}