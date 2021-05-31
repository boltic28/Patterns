package com.boltic28.designpatterns

import com.boltic28.designpatterns.toDisplay.Displayable
import com.boltic28.designpatterns.toFly.Flyable
import com.boltic28.designpatterns.toQuack.Quackable
import com.boltic28.designpatterns.toWorkWithData.DataWorker

// use interfaces as variables
class Duck(
    private val name: String,
    private val flyBehavior: Flyable,
    private val quackBehavior: Quackable,
    private val displayBehavior: Displayable,
    private val dataWorker: DataWorker
) {
    fun fly() {
        printName()
        flyBehavior.fly()
    }

    fun display() {
        printName()
        displayBehavior.display()
    }

    fun quack() {
        printName()
        quackBehavior.quack()
    }

    fun printName(){
        dataWorker.provideName(name)
    }
}