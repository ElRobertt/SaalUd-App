package com.example.saluudapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_alimentos.*
import kotlinx.android.synthetic.main.activity_i_m_c.*
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main4.*

class alimentos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alimentos)

        button4.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.efesalud.com/la-piramide-nutricional-educacion-en-nutricion/"))
            startActivity(intent)
        }

        button5.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}