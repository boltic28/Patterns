package com.boltic28.factory.abstractFabric.fabric

import com.boltic28.factory.abstractFabric.product.chair.Chair
import com.boltic28.factory.abstractFabric.product.chair.ModernChair
import com.boltic28.factory.abstractFabric.product.sofa.ModernSofa
import com.boltic28.factory.abstractFabric.product.sofa.Sofa
import com.boltic28.factory.abstractFabric.product.table.ModernTable
import com.boltic28.factory.abstractFabric.product.table.Table

class ModernFurnitureFactory: FurnitureFactory {

    override fun factoryName(): String = "MODERN FACTORY"

    override fun createChair(): Chair {
        println("->> creating MODERN chair")
        return ModernChair()
    }

    override fun createSofa(): Sofa {
        println("->> creating MODERN sofa")
        return ModernSofa()
    }

    override fun createTable(): Table {
        println("->> creating MODERN table")
        return ModernTable()
    }
}