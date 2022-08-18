package com.example.birthdaygreetingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greet2.*

class birthdayGreetActivity2 : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet2)

       val name = intent.getStringExtra("name_extra")
       BirthdayGreettext.text="Happy Birthday $name"
    }
}