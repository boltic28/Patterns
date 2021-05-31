package com.boltic28.factory.abstractFabric.fabric

import com.boltic28.factory.abstractFabric.product.chair.Chair
import com.boltic28.factory.abstractFabric.product.chair.OldChair
import com.boltic28.factory.abstractFabric.product.sofa.OldSofa
import com.boltic28.factory.abstractFabric.product.sofa.Sofa
import com.boltic28.factory.abstractFabric.product.table.OldTable
import com.boltic28.factory.abstractFabric.product.table.Table

class OldFurnitureFactory: FurnitureFactory {

    override fun factoryName(): String = "OLD FACTORY"

    override fun createChair(): Chair {
        println("->> creating OLD chair")
        return OldChair()
    }

    override fun createSofa(): Sofa {
        println("->> creating OLD sofa")
        return OldSofa()
    }

    override fun createTable(): Table {
        println("->> creating OLD table")
        return OldTable()
    }
}