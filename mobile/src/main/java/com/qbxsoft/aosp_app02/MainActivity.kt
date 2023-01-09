package com.qbxsoft.aosp_app02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAction1 = findViewById<Button>(R.id.id_action1)
        btnAction1.setOnClickListener {
            Toast.makeText(this@MainActivity, "Message from aosp-app02", Toast.LENGTH_SHORT).show()
        }

        val btnAction2 = findViewById<Button>(R.id.id_action2)
        btnAction2.setOnClickListener {
            val intent = Intent(this, CarPanel::class.java)
            startActivity(intent)
        }
    }
}