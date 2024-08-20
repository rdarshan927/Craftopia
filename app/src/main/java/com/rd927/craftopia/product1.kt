package com.rd927.craftopia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class product1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_product1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<ImageView>(R.id.producthomenav).setOnClickListener {
            startActivity(Intent(this, home::class.java))
        }

        findViewById<ImageView>(R.id.productcartnav).setOnClickListener {
            startActivity(Intent(this, cart::class.java))
        }

        findViewById<ImageView>(R.id.productprofilenav).setOnClickListener {
            startActivity(Intent(this, profile::class.java))
        }
    }
}