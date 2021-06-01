package com.boltic28.state.states

class Moderation: State {
    override fun getName(): String = "Moderation"

    override fun cancel(): State {
        println("->> finish moderation, convert to DRAFT state")
        return Draft()
    }

    override fun publish(): State {
        println("->> convert to PUBLISHED state")
        return Published()
    }
}