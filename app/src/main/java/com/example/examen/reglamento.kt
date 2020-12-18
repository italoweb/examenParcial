package com.example.examen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class reglamento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reglamento)

        val btnvolver=findViewById<Button>(R.id.regresarReglamento)
//
        btnvolver.setOnClickListener{
            val i: Intent = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        val reglamento = mutableListOf("1.-Tenga la Cámara prendida", "2.-Registro en formulario de Asistencia", "3.-Asistir ala Hora apartada", "4.-Mantener Orden", "5.-Descargar los Progrmas", "6.-No ingerir Alimentos", "7.-Respeto al participar")

        val listViewDatos = findViewById<ListView>(R.id.ListReglamento)

        val arrayAdap = ArrayAdapter(this, android.R.layout.simple_list_item_1, reglamento)
        listViewDatos.adapter = arrayAdap

        listViewDatos.setOnItemClickListener(){
                parent, view, position, id ->
            Toast.makeText(this,
                parent.getItemAtPosition(position).toString(),
                Toast.LENGTH_SHORT).show()
        }


    }

}