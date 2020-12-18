package com.example.examen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class Inscripcion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscripcion)

        registrar()


    }

    fun registrar(){
        val btn4=findViewById<Button>(R.id.btnregistrar);

        btn4.setOnClickListener{
            if(!validar()){
                Toast.makeText(this,"Se ha registrado exitosamente",Toast.LENGTH_LONG).show()
                val i: Intent = Intent(this, MainActivity::class.java)
                startActivity(i)

            }

        }
    }
    fun validar():Boolean{
        val email=findViewById<TextView>(R.id.email)
        val ap=findViewById<TextView>(R.id.ap)
        val am=findViewById<TextView>(R.id.am)
        val nombre=findViewById<TextView>(R.id.nom)
        val dni=findViewById<TextView>(R.id.dni)
        val cel=findViewById<TextView>(R.id.cel)
        val pais=findViewById<TextView>(R.id.pais)

        if(email?.text.isNullOrEmpty()){
            Toast.makeText(this,"Inserte un email",Toast.LENGTH_LONG).show()
            return true
        }
        if(ap?.text.isNullOrEmpty()){
            Toast.makeText(this,"Inserte un Apellido Paterno",Toast.LENGTH_LONG).show()
            return true
        }
        if(am?.text.isNullOrEmpty()){
            Toast.makeText(this,"Inserte un Apellido Materno",Toast.LENGTH_LONG).show()
            return true
        }
        if(nombre?.text.isNullOrEmpty()){
            Toast.makeText(this,"Inserte Nombre",Toast.LENGTH_LONG).show()
            return true
        }
        if(dni?.text.isNullOrEmpty()){
            Toast.makeText(this,"Inserte DNI",Toast.LENGTH_LONG).show()
            return true
        }
        if(cel?.text.isNullOrEmpty()){
            Toast.makeText(this,"Inserte Celular",Toast.LENGTH_LONG).show()
            return true
        }
        if(pais?.text.isNullOrEmpty()){
            Toast.makeText(this,"Inserte pais",Toast.LENGTH_LONG).show()
            return true
        }
        return false
    }
}