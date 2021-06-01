package com.boltic28.state.states

class Draft: State {

    override fun getName(): String = "Draft"

    override fun cancel(): State {
        println("->> destroy document, convert to DESTROYED state")
        return Destroyed()
    }

    override fun publish(): State {
        println("->> convert to MODERATION state")
        return Moderation()
    }
}