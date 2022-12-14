package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var txtNombre : EditText
    private lateinit var btnAceptar : Button
    private lateinit var txtPassword : EditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Obtenemos una referencia a los controles de la interfaz

        txtNombre = findViewById(R.id.txtNombre)
        btnAceptar = findViewById(R.id.btnAceptar)
        txtPassword = findViewById(R.id.txtPassword)


        btnAceptar.setOnClickListener{

            //Creamos el Intent
            val intent = Intent(this@MainActivity, Saludo::class.java)

            //Añadimos al intent la información a pasar entre actividades
            intent.putExtra("NOMBRE", txtNombre.text.toString())
            intent.putExtra("PASSWORD", txtPassword.text.toString())


            //Iniciamos la nueva actividad
            startActivity(intent)
        }
    }
}