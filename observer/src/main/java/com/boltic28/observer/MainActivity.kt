package com.boltic28.observer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val artist = Artist()
        val fan1 = Fan("Ivan")
        val fan2 = Fan("Maria")
        val fan3 = Fan("John")

        artist.addObserver(fan1)
        artist.addObserver(fan2)
        artist.addObserver(fan3)


        artist.makeAction("an arriving into the city")
    }
}