package com.rd927.craftopia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class offer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_offer)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val layout = findViewById<LinearLayout>(R.id.tree)
        layout?.setOnClickListener {
            val intent = Intent(this, product1::class.java)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.offerhome).setOnClickListener {
            startActivity(Intent(this, home::class.java))
        }

        findViewById<ImageView>(R.id.offercart).setOnClickListener {
            startActivity(Intent(this, cart::class.java))
        }

        findViewById<ImageView>(R.id.offerprofilenav).setOnClickListener {
            startActivity(Intent(this, profile::class.java))
        }
    }
}