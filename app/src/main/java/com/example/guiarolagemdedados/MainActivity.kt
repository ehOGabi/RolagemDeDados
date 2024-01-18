package com.example.guiarolagemdedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gerarD6 = findViewById<Button>(R.id.btnD6)
        val gerarD12 = findViewById<Button>(R.id.btnD12)
        val gerarD20 = findViewById<Button>(R.id.btnD20)

        gerarD6.setOnClickListener {
            rolarDado(6)
        }
        gerarD12.setOnClickListener {
            rolarDado(12)
        }
        gerarD20.setOnClickListener {
            rolarDado(20)
        }


    }

    private fun rolarDado(lados: Int) {
        val rolar = (1..lados).random()
        val resultado = findViewById<TextView>(R.id.txtResultado)

        resultado.text = "D$lados - $rolar"
    }
}