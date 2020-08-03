package info.mylabstudio.learnOOP


open class ShapeSuper {
    open val corner: Int = -1
    open val colour: String = "white"

    open fun printName() {
        println("Super $colour $corner corner")
    }
}

open class FourSideShape : ShapeSuper() {
    override val corner: Int = 4
    override val colour: String = "black"

    override fun printName() {
        println("$corner Side Shape with colour $colour")
    }

    fun superPrintName() {
        super.printName()
    }
}

class Rectangle : FourSideShape() {
    // Hanya bisa akses 1 parent diatas nya
    // Kalau mau akses grandparent nya, harus buat method di parent
    // val parentCorner: Int = super.super.corner => tidak bisa

    val parentCorner: Int = super.corner

    override fun printName() {
        super.printName()
        superPrintName()
    }
}

fun main() {
    val rectangle = Rectangle()
    rectangle.printName()
}