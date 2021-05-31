package com.boltic28.builder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CarBuilder()
            .addEngine("3.0 V6 TFSI")
            .addCabine("leather material")
            .addTrunk("440 litres")
            .addFuel("A-98")
            .build()

        CarBuilder()
            .addEngine("2.0 L4 DOHC")
            .addFuel("A-92")
            .build()

        CarBuilder()
            .addTrunk("440 litres")
            .addFuel("A-98")
            .build()
    }
}