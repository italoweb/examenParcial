package com.example.examen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn=findViewById<ImageButton>(R.id.btninscripcion);
        val btn2=findViewById<ImageButton>(R.id.btntalleres);
        val btn3=findViewById<ImageButton>(R.id.btnreglamento);

        btn.setOnClickListener{
            val i:Intent = Intent(this, Inscripcion::class.java)
            startActivity(i)
        }

        btn2.setOnClickListener{
            val i:Intent = Intent(this, talleres::class.java)
            startActivity(i)
        }

        btn3.setOnClickListener{
            val i:Intent = Intent(this, reglamento::class.java)
            startActivity(i)
        }

    }
}