package com.rd927.craftopia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<ImageView>(R.id.profilehomenav).setOnClickListener {
            startActivity(Intent(this, home::class.java))
        }

        findViewById<ImageView>(R.id.profilecartnav).setOnClickListener {
            startActivity(Intent(this, cart::class.java))
        }

        findViewById<ImageView>(R.id.profilenav).setOnClickListener {
            startActivity(Intent(this, profile::class.java))
        }
    }
}