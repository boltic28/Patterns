package com.boltic28.factory.abstractMethod.stations

import com.boltic28.factory.abstractMethod.transport.Transport

interface Logistic {
    fun createTransport(): Transport
    fun deliver()
}