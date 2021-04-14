package com.example.saluudapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_i_m_c.*

class IMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_i_m_c)

        button.setOnClickListener{
            val t1 = EditTextPeso.text.toString().toInt()
            val t2 = EditTexEstatura.text.toString().toInt()
            val resultado =  t1/t2
            tvResultado.text="Resultado de IMC: ${resultado.toString()}%"
        }

        btnRegresar.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}