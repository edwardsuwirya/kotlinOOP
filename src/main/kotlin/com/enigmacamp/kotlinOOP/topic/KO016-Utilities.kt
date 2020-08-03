package info.mylabstudio.learnOOP

/*
 * Singleton object tidak memiliki constructor
 * Cocok digunakan untuk utils
 */
object Utilities {
    val name: String = "My Utilities"

    fun toUpper(value: String): String {
        return value.toUpperCase()
    }
}

fun main() {
    println(Utilities.name)
    println(Utilities.toUpper("Edo"))
}