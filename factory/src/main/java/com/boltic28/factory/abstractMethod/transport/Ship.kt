package com.boltic28.factory.abstractMethod.transport

class Ship: Transport {

    override fun load(): String = "Ship is loaded"

    override fun move(): String = "Ship is moving"

    override fun unload(): String = "Ship is unloaded"
}