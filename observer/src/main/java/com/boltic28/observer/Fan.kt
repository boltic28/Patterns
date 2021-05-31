package com.boltic28.observer

import java.util.*

class Fan(private val name: String): Observer {

    override fun update(p0: Observable?, p1: Any?) {
        println("->> $name: Ouch!!! It's so cool!!! It is ${(p0 as Artist).action}")
    }
}