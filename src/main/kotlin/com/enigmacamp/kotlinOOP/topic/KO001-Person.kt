package com.enigmacamp.kotlinOOP.topic

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""
}

//Class Constructor
class Address(address1Param: String, address2Param: String?, cityParam: String) {
    var address1: String = address1Param
    var address2: String? = address2Param
    var city: String = cityParam
}

//Class Constructor With Default Value
class Mobile(regionParam: String = "+62", phoneNoParam: String) {
    var regionCode: String = regionParam
    var phone1Param: String = phoneNoParam
}


fun main() {
    //Membuat sebuah Object
    val me = Person()
    println(me)

    me.firstName = "Edo"
    me.lastName = "Sasa"

    println(me.lastName)

    var myAddress = Address("Pondok Bambu", "Jakarta Timur", "Jakarta")
    println(myAddress.city)

    var myPhone = Mobile(phoneNoParam = "999888")
    println("${myPhone.regionCode}${myPhone.phone1Param}")

}