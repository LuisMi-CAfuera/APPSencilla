package com.example.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Saludo : AppCompatActivity() {

    private lateinit var txtSaludo : TextView
    private lateinit var txtPass : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)


        //Obtenemos una referencia a los controles de la interfaz
        txtSaludo = findViewById(R.id.txtSaludo)
        txtPass = findViewById(R.id.txtPass)


        //Recuperamos la información pasada en el intent
        val saludo = intent.getStringExtra("NOMBRE")
        val pass = intent.getStringExtra("PASSWORD")


        //Construimos el mensaje a mostrar
        txtSaludo.text = "Usuario: $saludo"
        txtPass.text = "Contraseña: $pass"



    }
}