package com.example.saluudapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_i_m_c.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }
    fun onClick4(view: View) {

        ubinu.setOnClickListener {

            val intent: Intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }
    fun onClick5(view: View) {

        ubigi.setOnClickListener {

            val intent: Intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
        btnIMC.setOnClickListener {
            val intent: Intent = Intent(this, IMC::class.java)
            startActivity(intent)
        }

    }
}