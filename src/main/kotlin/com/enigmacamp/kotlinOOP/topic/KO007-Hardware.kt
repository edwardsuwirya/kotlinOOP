package info.mylabstudio.learnOOP

/*
 * Any class adalah Super Class
 * Setiap class tanpa extend apapun, secara otomatis akan menjadi turunan class Any
 * Lihat tab structure, show inherited, akan terlihat 3 buah method tambahan equals,hashCode,toString
 */

class Laptop(val brand: String) // => class Laptop(val brand:String): Any()
class PersonalComputer(val brand: String) // => class PersonalComputer(val brand:String): Any()

fun main() {
    val pcA = Laptop("Macbook")
    val pcB = PersonalComputer("IBM")
    //toString, representasi string dari sebuah object
    println(pcA.toString())
    //hashCode, representasi angka dari sebuah object
    println(pcA.hashCode())

    fun printObject(anyHardware: Any) {
        //Type checking
        if (anyHardware is Laptop) {
            println("hardware type laptop, brand ${anyHardware.brand}")
        } else {
            println("hardware type non-laptop")
        }
        println("Hash code : ${anyHardware.hashCode()}")
    }

    println("=== Print Object ===")
    printObject(pcA)
    printObject(pcB)

    fun printObjectWhen(anyHardware: Any) {
        when (anyHardware) {
            is Laptop -> println("hardware type laptop, brand ${anyHardware.brand}")
            else -> println("hardware type non-laptop")

        }
        println(anyHardware.hashCode())
    }

    fun printString(anyHardware: Any) {
        //Force casting / unsafe casting
        val hw = anyHardware as Laptop
        println("Unsafe casting : ${hw.brand}")

        //Safe casting
        val hwSafe: Laptop? = anyHardware as? Laptop
        println("Safe casting : ${hwSafe?.brand}")
    }

    // Error
    // printString(1)
    printString(pcA)
    //Error
    //printString(pcB)
}