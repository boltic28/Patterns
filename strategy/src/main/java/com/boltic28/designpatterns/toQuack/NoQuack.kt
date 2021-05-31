package com.boltic28.designpatterns.toQuack

class NoQuack:Quackable {
    override fun quack() {
        println("can't quack")
    }
}