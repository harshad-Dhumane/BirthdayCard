package com.example.birthdaygreetingapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun createBirthdayGreet(view: View) {
        val name = userInput.editableText.toString()
        val intent= Intent(this, birthdayGreetActivity2::class.java)
        intent.putExtra(birthdayGreetActivity2.NAME_EXTRA,name)
        startActivity(intent)
    }


}