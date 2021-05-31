package com.boltic28.factory.abstractMethod.transport

class Truck: Transport {

    override fun load(): String = "Truck is loaded"

    override fun move(): String = "Truck is moving"

    override fun unload(): String = "Truck is unloaded"
}