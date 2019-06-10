package com.example.ndkforsecret

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val findviewbyid = findViewById<TextView>(R.id.show_tv)
        findviewbyid.setOnClickListener {
            Toast.makeText(this, "" + JniUtil.add(100, 250), Toast.LENGTH_SHORT).show()
        }
    }
}

