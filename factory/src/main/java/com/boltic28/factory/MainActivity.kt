package com.boltic28.factory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.boltic28.factory.factories.MilitaryCarFactory
import com.boltic28.factory.factories.SimpleCarFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SimpleCarFactory().createRandomCar().apply {
            startEngine()
            move()
            move()
            park()
            stopEngine()
        }

        MilitaryCarFactory().createRandomCar().apply {
            startEngine()
            move()
            park()
            stopEngine()
        }

    }
}