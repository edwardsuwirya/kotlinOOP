package info.mylabstudio.learnOOP

// Secara Standar, class di kotlin adalah final (tidak bisa diwariskan)
// Termasuk function di class adalah final
// Agar bisa diwariskan makan perlu kata open
open class Employee(val name: String) {
    open fun sayHello(name: String) {
        println("Hello $name")
    }
}

// final keyword, opsional kalau ingin diketik
final class Manager(name: String) : Employee(name)

// Function overriding = kemampuan membuat ulang function yang sudah ada di parent
// Berbeda dengan function overloading
// Ketika kita meng-override function secara otomatis function tersebut open (bisa digunakan child bawahnya lagi)
open class AssistentManager(name: String) : Employee(name) {
    /*final*/ override fun sayHello(name: String) {
        println("Hai $name")
    }
}

final class Staff(name: String) : AssistentManager(name) {
    //Tidak bisa dioverride
    override fun sayHello(name: String) {
        println("Hai $name")
    }
}

// Properties pun bisa dioverride dengan behaviour berbeda dengan function
// Secara default langsung final, jadi harus di open

open class BOD(val name: String) {
    open fun callEveryone() {
        println("Meeting in 5 minutes")
    }
}

fun main() {
    val manager = Manager("Edo")
    println(manager.name)
    manager.sayHello("Edo")

    val asstManager = AssistentManager("Sasa")
    println(asstManager.name)
    asstManager.sayHello("Sasa")

    //Anonymous Object
    val personAnonymous = object : BOD("Faqih") {
        override fun callEveryone() {
            println("Coffee please")
        }
    }

    personAnonymous.callEveryone()

}
