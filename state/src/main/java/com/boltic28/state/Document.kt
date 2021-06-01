package com.boltic28.state

import com.boltic28.state.states.Draft
import com.boltic28.state.states.State

class Document {
    private var state: State = Draft()

    fun checkState(){
        println("->> current state is ${state.getName()}")
    }

    fun publish() {
        state = state.publish()
    }

    fun cancel() {
        state = state.cancel()
    }
}