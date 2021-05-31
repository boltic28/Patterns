package com.boltic28.factory.car

interface Car {

    fun produceItem(): Car

    fun startEngine()
    fun move()
    fun park()
    fun stopEngine()
}