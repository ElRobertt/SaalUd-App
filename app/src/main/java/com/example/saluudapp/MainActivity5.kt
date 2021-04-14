package com.example.saluudapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main4.*
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)


        bt_gym1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/LIFE+GYM+TEPIC/@21.4923447,-104.8673342,18.25z/data=!4m19!1m13!4m12!1m4!2m2!1d-104.8804897!2d21.5039039!4e1!1m6!1m2!1s0x84273740e59ea0cb:0x78153771b7cb1fcf!2sLIFE+GYM+TEPIC,+AV.+PASEO+DE+FORUM,+264,+Subcentro+Urbano,+63175+Tepic,+Nay.!2m2!1d-104.8660169!2d21.4915298!3m4!1s0x84273740e59ea0cb:0x78153771b7cb1fcf!8m2!3d21.4915298!4d-104.8660169"))
            startActivity(intent)
        }
        bt_gym2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Total+Gym+Tepic/@21.5126682,-104.8965829,15.5z/data=!4m19!1m13!4m12!1m4!2m2!1d-104.8804897!2d21.5039039!4e1!1m6!1m2!1s0x842736ff620644d5:0x735e71f6a66b7652!2sTotal+Gym+Tepic,+63000,+Amado+Nervo+Pte.+269,+Centro,+Tepic,+Nay.!2m2!1d-104.8961471!2d21.5140937!3m4!1s0x842736ff620644d5:0x735e71f6a66b7652!8m2!3d21.5140937!4d-104.8961471"))
            startActivity(intent)
        }
        bt_gym3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Platinum+Fitness+Center+%26+Spa/@21.5012248,-104.9105336,14z/data=!4m19!1m13!4m12!1m4!2m2!1d-104.8804897!2d21.5039039!4e1!1m6!1m2!1s0x842736f033080f4f:0x7b307bd10643ac2d!2sPlatinum+Fitness+Center+%26+Spa,+Av+Del+Ej%C3%A9rcito+343,+El+Tecolote,+63137+Tepic,+Nay.!2m2!1d-104.9065854!2d21.5024926!3m4!1s0x842736f033080f4f:0x7b307bd10643ac2d!8m2!3d21.5024926!4d-104.9065854"))
            startActivity(intent)
        }
    }
}