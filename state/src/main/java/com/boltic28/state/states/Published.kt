package com.boltic28.state.states

class Published: State {
    override fun getName(): String = "Published"

    override fun cancel(): State {
        println("->> cancel publishing, convert to MODERATION state")
        return Moderation()
    }

    override fun publish(): State {
        println("->> document is published already!")
        return this
    }
}