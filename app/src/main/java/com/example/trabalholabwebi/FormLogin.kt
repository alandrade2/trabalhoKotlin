package com.example.trabalholabwebi

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.Random

class FormLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorteio)

        val numero = findViewById(R.id.edit_number) as EditText
        val sorteado = findViewById(R.id.txtsorteado) as TextView
        val resultado = findViewById(R.id.id_resultado) as EditText


        val btSort = findViewById(R.id.bt_sortear) as Button

    btSort.setOnClickListener {
        val selec = numero.text.toString().toInt();
            val numSort =  Random().nextInt(31)
            sorteado.setText("Número Sorteado: " + numSort)

        if (selec == numSort) {
            resultado.setText("Parabens você acertou")
        } else {
            resultado.setText("infelizmente não foi dessa vez!")
        }



    }
   }


}