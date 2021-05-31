package com.boltic28.factory.car

abstract class AbstractCar: Car {

    abstract val name: String

    override fun produceItem(): Car {
        TODO("Not yet implemented")
    }

    override fun startEngine() {
        println("->> $name : startEngine")
    }

    override fun move() {
        println("->> $name : move forward")
    }

    override fun park() {
        println("->> $name : park the car")
    }

    override fun stopEngine() {
        println("->> $name : stopEngine")
    }
}