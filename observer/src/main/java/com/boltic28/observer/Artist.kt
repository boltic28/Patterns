package com.boltic28.observer

import java.util.*

class Artist: Observable() {

    private var _action = "do nothing"
    val action: String
        get() = _action

    fun makeAction(action: String){
        _action = action
        println("->> new action from the artist - $action")
        setChanged()
        notifyObservers()
    }
}