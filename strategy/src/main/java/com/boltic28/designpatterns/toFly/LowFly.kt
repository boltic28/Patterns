package com.boltic28.designpatterns.toFly

import com.boltic28.designpatterns.toFly.Flyable

class LowFly: Flyable {
    override fun fly() {
        println("low fly")
    }
}