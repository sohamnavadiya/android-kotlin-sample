package com.soham.kotlin_sample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun Any.toast(context: Context) {
        Toast.makeText(context, this.toString(), Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHit = findViewById(R.id.btn_hit) as Button
        btnHit.setOnClickListener {
            "Hit Success".toast(applicationContext)

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("dataModel", PersonModel("Burak", 26))
            startActivity(intent)
        }

        txtMessage.text = "Yap, It is working fine."
    }
}
