package com.boltic28.command

class Save(val order: Order): Command {
    override fun execute() {
        println("->> execute save command for ${order.data}")
        order.save()
    }
}