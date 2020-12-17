package com.example.examen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class Inscripcion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscripcion)

        val btn4=findViewById<Button>(R.id.btnregistrar);

        btn4.setOnClickListener{

            Toast.makeText(this,"Se ha registrado exitosamente",Toast.LENGTH_LONG).show()

            val i: Intent = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

    }

}