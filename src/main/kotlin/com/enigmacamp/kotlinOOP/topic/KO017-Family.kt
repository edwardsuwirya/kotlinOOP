package com.enigmacamp.kotlinOOP.topic

/*
 *
 * Companion Object untuk membuat inner object dalam class tanpa harus menggunakan nama object
 * A.K.A static variables / methods ???
 *
 */
class Family {
    companion object {
        fun hello(name: String) {
            println("Hello $name")
        }
    }
}

fun main() {
    Family.hello("Edo")
}