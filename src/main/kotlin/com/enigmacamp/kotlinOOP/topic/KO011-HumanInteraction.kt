package info.mylabstudio.learnOOP

/*
 * Interface adalah blueprint,prototype, cetakan
 * Interface tidak bisa dibuat menjadi object
 * properties dan function di interface adalah abstrak
 * child class bisa mengimplementasikan multiple interface
 * Interface juga bisa melakukan inherintance ke interface lainnya
 */
interface Interaction {
    //Tidak boleh inisialisasi properties
    val name: String
    fun sayHello(name: String): Unit

    //boleh buat inisialisasi di function => concrete function
    //Akhirnya, concrete function tidak wajib dibuat di class implementasinya
    fun sayHi(name: String): Unit {
        println("Hi $name")
    }
}

interface Go {
    fun go()
}

class HumanInteraction(override val name: String) : Interaction, Go {
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun go() {
        println("Go Human")
    }
}

open class FloraFauna

//Kombinasi inheritance, dan interface
class AnimalIntercation() : FloraFauna(), Interaction, Go {
    override val name: String
        get() = TODO("Not yet implemented")

    override fun sayHello(name: String) {
        TODO("Not yet implemented")
    }

    override fun go() {
        println("Go Animal")
    }

}

//Konflik Interface, dan cara memanggil function interface
interface Move1 {
    fun move() = println("Move 1")
}

interface Move2 {
    fun move() = println("Move 2")
}

class Move : Move1, Move2 {
    override fun move() {
        super<Move1>.move()
        println("Move Class")
    }
}

fun main() {
    val human = HumanInteraction("Edo")
    human.sayHello("Edo-1")
    human.sayHi("Edo-2")

    val m = Move()
    m.move()
}