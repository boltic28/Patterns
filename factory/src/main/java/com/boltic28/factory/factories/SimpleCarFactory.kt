package com.boltic28.factory.factories

import com.boltic28.factory.car.*
import kotlin.random.Random

class SimpleCarFactory: BaseFactory {

    override fun produceSportCar(): Car = SportCar()
    override fun produceBus(): Car = Bus()
    override fun produceTruck(): Car = Truck()
    override fun produceSedan(): Car = Sedan()

    override fun createRandomCar(): Car = when (Random.nextInt(4)) {
        0 -> produceSportCar()
        1 -> produceTruck()
        2 -> produceBus()
        else -> produceSedan()
    }
}