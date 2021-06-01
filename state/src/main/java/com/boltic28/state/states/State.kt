package com.boltic28.state.states

interface State {
    fun getName(): String
    fun cancel(): State
    fun publish(): State
}