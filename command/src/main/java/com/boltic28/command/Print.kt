package com.boltic28.command

class Print(val order: Order): Command {
    override fun execute() {
        println("->> execute print command for ${order.data}")
        order.print()
    }
}