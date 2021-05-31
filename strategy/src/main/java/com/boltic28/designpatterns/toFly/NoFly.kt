package com.boltic28.designpatterns.toFly

import com.boltic28.designpatterns.toFly.Flyable

class NoFly: Flyable {
    override fun fly() {
        println("can't fly")
    }
}