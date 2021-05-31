package com.boltic28.factory.abstractFabric.fabric

import com.boltic28.factory.abstractFabric.product.chair.Chair
import com.boltic28.factory.abstractFabric.product.sofa.Sofa
import com.boltic28.factory.abstractFabric.product.table.Table

interface FurnitureFactory {

    fun factoryName(): String

    fun createChair(): Chair
    fun createSofa(): Sofa
    fun createTable(): Table
}