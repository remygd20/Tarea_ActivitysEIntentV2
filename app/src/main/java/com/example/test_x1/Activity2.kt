package com.example.test_x1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val name = intent.getStringExtra("name") // Recuperamos los valores que se mandaron en la anterior actividad
        val apellido = intent.getStringExtra("apellido")

        val txtEdad: EditText = findViewById(R.id.txt_edad) // Referenciamos los cambos con cada cosa
        val txtCiudad: EditText = findViewById(R.id.txt_ciudad)
        val btnEnviar: Button = findViewById(R.id.btn_siguiente)

        btnEnviar.setOnClickListener { // Al hacer clic recoge los datos y hace la actividad3 o la siguiente ventana
            val edad = txtEdad.text.toString().trim()
            val ciudad = txtCiudad.text.toString().trim()

            if(edad.isEmpty()) {
                txtEdad.error = "Ingresa tu edad"
                txtEdad.requestFocus()
                return@setOnClickListener
            }

            if(ciudad.isEmpty()) {
                txtCiudad.error = "Ingresa tu ciudad"
                txtCiudad.requestFocus()
                return@setOnClickListener
            }

            val intent = Intent(this, Activity3::class.java).apply { //Manda todos los datos que escribimos a la ultima ventana para mostrarnoslos
                putExtra("name", name)
                putExtra("apellido", apellido)
                putExtra("edad", edad)
                putExtra("ciudad", ciudad)
            }
            startActivity(intent)
        }
    }
}
