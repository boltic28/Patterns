package com.boltic28.designpatterns.toDisplay

import com.boltic28.designpatterns.toDisplay.Displayable

class DrawDisplay: Displayable {
    override fun display() {
        println("draw duck")
    }
}