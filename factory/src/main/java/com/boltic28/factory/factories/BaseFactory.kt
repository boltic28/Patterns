package com.boltic28.factory.factories

import com.boltic28.factory.car.*

interface BaseFactory {

    fun produceSportCar(): Car
    fun produceBus(): Car
    fun produceTruck(): Car
    fun produceSedan(): Car

    fun createRandomCar(): Car
}