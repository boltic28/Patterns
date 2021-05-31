package com.boltic28.factory.abstractMethod.stations

import com.boltic28.factory.abstractMethod.transport.Transport
import com.boltic28.factory.abstractMethod.transport.Truck

class TruckStation(): Logistic {
    override fun createTransport(): Transport {
        println("->> road transport creating")
        return Truck()
    }

    override fun deliver() {
        println("->> deliver by road")
    }
}