package com.soham.kotlin_sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val person = intent.extras.getParcelable<PersonModel>("dataModel")
        toast("Name: ${person.name} age: ${person.age}")
        txtMessage.text="Welcome to the second activity"
    }
}
