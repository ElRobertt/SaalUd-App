package com.example.saluudapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun onClick3(view: View) {

        registrar.setOnClickListener {

            val intent: Intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}