package com.boltic28.builder

class CarBuilder {
    companion object{
        const val EMPTY_FIELD = "default"
    }
    private var car: Car = Car(EMPTY_FIELD, EMPTY_FIELD, EMPTY_FIELD, EMPTY_FIELD)

    fun addEngine(engine: String): CarBuilder {
        println("->> add Engine: $engine")
        car = car.copy(engine = engine)
        return this
    }

    fun addCabine(cabine: String): CarBuilder {
        println("->> add Cabine: $cabine")
        car = car.copy(cabine = cabine)
        return this
    }

    fun addTrunk(trunk: String): CarBuilder {
        println("->> add Trunk: $trunk")
        car = car.copy(trunk = trunk)
        return this
    }

    fun addFuel(fuel: String): CarBuilder {
        println("->> add Fuel: $fuel")
        car = car.copy(fuel = fuel)
        return this
    }

    fun build(): Car {
        println("->> Car is created: $car")
        return car
    }
}