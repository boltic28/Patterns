package com.boltic28.factory.abstractFabric.product.sofa

class ModernSofa: Sofa {
    override fun sitOn() {
        println("->> sit on the MODERN sofa")
    }
    override fun sleepOn() {
        println("->> sleep on the MODERN sofa")
    }
}