package com.boltic28.factory.abstractMethod.transport

class Train: Transport {

    override fun load(): String = "Train is loaded"

    override fun move(): String = "Train is moving"

    override fun unload(): String = "Train is unloaded"
}