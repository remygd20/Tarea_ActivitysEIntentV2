package com.example.test_x1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEnviar: Button = findViewById(R.id.btn_comenzar) //Referenciamos las cosas
        val txtName: EditText = findViewById(R.id.txt_name)
        val txtApellido: EditText = findViewById(R.id.txt_apellido)

        btnEnviar.setOnClickListener {
            val name = txtName.text.toString().trim() // Al dar clic vamos a la siguiente actividad y pasamos el nombre y apellido
            val apellido = txtApellido.text.toString().trim() // Con trim elimina los espacios en blanco

            if(name.isEmpty()) { // Comprueba si está vacio
                txtName.error = "Ingresa tu nombre" // Envia un error si si
                txtName.requestFocus()  // Apunta al campo que falta de contestar
                return@setOnClickListener // Se regresa y ya no ejecuta el codigo si hay error
            }

            if(apellido.isEmpty()) {
                txtApellido.error = "Ingresa tu apellido"
                txtApellido.requestFocus()
                return@setOnClickListener
            }

            val intent = Intent(this, Activity2::class.java).apply { // Nos manda a la siguiente ventana o Actividad2
                putExtra("name", name) // Pasamos los datos
                putExtra("apellido", apellido)
            }
            startActivity(intent)
        }

    }
}