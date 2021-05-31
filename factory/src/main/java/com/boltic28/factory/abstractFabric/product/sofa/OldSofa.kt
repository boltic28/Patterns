package com.boltic28.factory.abstractFabric.product.sofa

class OldSofa: Sofa {
    override fun sitOn() {
        println("->> sit on the OLD sofa")
    }
    override fun sleepOn() {
        println("->> sleep on the OLD sofa")
    }
}