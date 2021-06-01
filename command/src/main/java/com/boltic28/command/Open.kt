package com.boltic28.command

class Open(val order: Order): Command {
    override fun execute() {
        println("->> execute open command for ${order.data}")
        order.open()
    }
}