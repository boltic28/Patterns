package com.boltic28.state.states

class Destroyed: State {
    override fun getName(): String = "Destroyed"

    override fun cancel(): State = this

    override fun publish(): State {
        println("->> recover document, convert to DRAFT state")
        return Draft()
    }
}