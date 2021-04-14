package com.example.saluudapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main4.*
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        bt_nutri1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Nutri%C3%B3loga+en+Tepic.+Monitor+Nutricional/@21.5029935,-104.897106,15z/data=!4m19!1m13!4m12!1m4!2m2!1d-104.8804897!2d21.5039039!4e1!1m6!1m2!1s0x8427375b34666c5f:0x184e854b1e9fa56a!2snutriologos+en+tepic!2m2!1d-104.8957107!2d21.4981716!3m4!1s0x8427375b34666c5f:0x184e854b1e9fa56a!8m2!3d21.4981716!4d-104.8957107"))
            startActivity(intent)
        }
        bt_nutri2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Nutri%C3%B3logo+Oscar+Rivera/@21.505324,-104.8897087,17z/data=!3m1!4b1!4m5!3m4!1s0x842737445473d2b9:0x42dcf062ac4a6eac!8m2!3d21.505324!4d-104.88752"))
            startActivity(intent)
        }
        bt_nutri3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Nutridutty/@21.5053237,-104.8962748,15z/data=!4m8!1m2!2m1!1sNutri%C3%B3logo!3m4!1s0x0:0x209b90c1fab84895!8m2!3d21.5079312!4d-104.8970345"))
            startActivity(intent)
        }

    }
}