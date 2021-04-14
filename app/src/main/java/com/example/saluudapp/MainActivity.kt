package com.example.saluudapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {

        boton1.setOnClickListener {

            val intent: Intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
    fun onClick2(view: View) {

        boton2.setOnClickListener {

            val intent: Intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}