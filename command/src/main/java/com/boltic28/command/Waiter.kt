package com.boltic28.command

class Waiter(
    private val saveCommand: Save,
    private val openCommand: Open,
    private val printCommand: Print
) {

    fun save() = saveCommand.execute()
    fun open() = openCommand.execute()
    fun print() = printCommand.execute()
}