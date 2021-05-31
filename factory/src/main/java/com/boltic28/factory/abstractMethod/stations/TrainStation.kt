package com.boltic28.factory.abstractMethod.stations

import com.boltic28.factory.abstractMethod.transport.Train
import com.boltic28.factory.abstractMethod.transport.Transport

class TrainStation: Logistic {
    override fun createTransport(): Transport {
        println("->> railway transport creating")
        return Train()
    }

    override fun deliver() {
        println("->> deliver by railway")
    }
}