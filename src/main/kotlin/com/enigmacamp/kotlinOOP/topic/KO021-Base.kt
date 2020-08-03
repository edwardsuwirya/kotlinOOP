package com.enigmacamp.kotlinOOP.topic

/*
 * Basicly kotlin classes is blocked from inheritance (use open keyword to enable inheritance)
 * Alternative to inheritance
 * Only granted method by interface
 *
 */

interface Vehicle {
    fun go(): String
}

class CarImpl(val where: String) : Vehicle {
    override fun go(): String = "is going to ${where}"
}

class AirplaneImpl(val where: String) : Vehicle {
    override fun go(): String = "is flying to ${where}"
}

class CarOrAirplane(
    val model: String,
    impl: Vehicle
) : Vehicle by impl {
    fun tellMeYourTrip() {
        println("$model ${go()}")
    }
}

fun main() {
    val myAirbus330 = CarOrAirplane("Lamborghini", CarImpl("Seoul"))
    val myBoeing337 = CarOrAirplane("Boeing 337", AirplaneImpl("Seoul"))

    myAirbus330.tellMeYourTrip()
    myBoeing337.tellMeYourTrip()
}