package com.example.saluudapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_alimentos.*
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_rutinas.*

class rutinas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rutinas)

        button7.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=iqBidNs7j3s&ab_channel=gym-in")
            )
            startActivity(intent)
        }

        button8.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=2tXQbi16EdI&ab_channel=gym-ingym-in")
            )
            startActivity(intent)
        }

        button9.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=nKmH2Laeirk&ab_channel=gymvirtual")
            )
            startActivity(intent)
        }

        button10.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=wL87zJ6wgxw&ab_channel=gymvirtual")
            )
            startActivity(intent)
        }

        button11.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}