package com.example.test_x1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val name = intent.getStringExtra("name") // Obtenemos todos los datos enviados desde la actividad anterior la Actividad2
        val apellido = intent.getStringExtra("apellido")
        val edad = intent.getStringExtra("edad")
        val ciudad = intent.getStringExtra("ciudad")

        val txtResumen: TextView = findViewById(R.id.txt_resumen) // Referenciamos para mostrar el msj de los datos y mostrarlos todos en un TextView.
        txtResumen.text = "Bienvenido $name $apellido, tienes $edad años, y tu ciudad es $ciudad." // Mensaje que se mostrará.
    }
}
