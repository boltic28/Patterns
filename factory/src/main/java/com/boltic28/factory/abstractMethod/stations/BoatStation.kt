package com.boltic28.factory.abstractMethod.stations

import com.boltic28.factory.abstractMethod.transport.Ship
import com.boltic28.factory.abstractMethod.transport.Transport

class BoatStation: Logistic {
    override fun createTransport(): Transport {
        println("->> water transport creating")
        return Ship()
    }

    override fun deliver() {
        println("->> deliver by water")
    }
}