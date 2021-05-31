package com.boltic28.designpatterns.toFly

import com.boltic28.designpatterns.toFly.Flyable

class HighFly: Flyable {
    override fun fly() {
        println("low fly")
    }
}