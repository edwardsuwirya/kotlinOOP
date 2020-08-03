package info.mylabstudio.learnOOP

/*
 * Sealed class adalah abstrak dan juga memiliki abstrak member
 * Tidak bisa dibuat object
 */
sealed class Calculator(val ops: String) {
    class Plus : Calculator("Plus")
    class Minus : Calculator("Minus")
}

fun operation(value1: Int, value2: Int, calc: Calculator): Int {
    return when (calc) {
        is Calculator.Plus -> value1 + value2
        is Calculator.Minus -> value1 - value2
    }
}

fun main() {
    // Error
    // val c = Calculator("Plus")
    println(operation(1, 2, Calculator.Plus()))
    println(operation(2, 3, Calculator.Minus()))
}