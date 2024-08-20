package com.rd927.craftopia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class cart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cart)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<ImageView>(R.id.offerhome).setOnClickListener {
            startActivity(Intent(this, home::class.java))
        }

        findViewById<ImageView>(R.id.offercart).setOnClickListener {
            startActivity(Intent(this, cart::class.java))
        }

        findViewById<ImageView>(R.id.profilenavoffer).setOnClickListener {
            startActivity(Intent(this, profile::class.java))
        }
    }
}