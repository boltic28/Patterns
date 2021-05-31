package com.boltic28.factory

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.boltic28.factory.abstractFabric.fabric.FurnitureFactory
import com.boltic28.factory.abstractFabric.fabric.ModernFurnitureFactory
import com.boltic28.factory.abstractMethod.stations.Logistic
import com.boltic28.factory.abstractMethod.stations.TruckStation

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //abstract factory


        val factory: FurnitureFactory = ModernFurnitureFactory()
//        val factory: FurnitureFactory = OldFurnitureFactory()

        println("->> ABSTRACT FACTORY START |||| ${factory.factoryName()}")

        // the same part for any factory
        factory.apply {
            createChair()
            createSofa()
            createTable()
        }

        // abstract method


        val station: Logistic = TruckStation()
        //val station: Logistic = BoatStation()
        //val station: Logistic = TrainStation()

        println("->> ABSTRACT METHOD START ||||")

        // the same part for any transport   >> createTransport() << - fabric method
        val deliveryTransport = station.createTransport()
        deliveryTransport.apply {
            println("->> ${load()}")
            println("->> ${move()}")
            println("->> ${unload()}")
        }

    }
}