package com.example.examen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class talleres : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_talleres)

        val btnvolver=findViewById<Button>(R.id.volver2)

        btnvolver.setOnClickListener{
            val i: Intent = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        Toast.makeText(this, "Hoalss", Toast.LENGTH_SHORT).show()
        val personas = mutableListOf("Phyton", "Ciencia de Datos", "Big data","Mahing Learning","Power Bi","Android","Java","Mysql")

        val listViewDatos = findViewById<ListView>(R.id.ListaTalleres)

        val arrayAdap = ArrayAdapter(this, android.R.layout.simple_list_item_1, personas)
        listViewDatos.adapter = arrayAdap

        listViewDatos.setOnItemClickListener(){
                parent, view, position, id ->
            Toast.makeText(this,
                parent.getItemAtPosition(position).toString(),
                Toast.LENGTH_SHORT).show()
        }
    }



}