package com.example.saluudapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main6.*

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
    }

    fun onClick(view: View) {

        btenviar.setOnClickListener {

            val intent: Intent = Intent(this, Pagos::class.java)
            startActivity(intent)
        }
    }
}