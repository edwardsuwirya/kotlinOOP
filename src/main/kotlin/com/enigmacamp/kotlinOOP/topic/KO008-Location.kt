package info.mylabstudio.learnOOP

/*
 * Class yang hanya bisa untuk diturunkan
 * Tidak bisa dibuat object
 * Tidak perlu menambahkan open
 */
abstract class Location(val name: String)

class City(name: String) : Location(name)

fun main() {
    // Error
    // val location = Location("sss")
    val city = City("Jakarta")
    println(city.name)
}