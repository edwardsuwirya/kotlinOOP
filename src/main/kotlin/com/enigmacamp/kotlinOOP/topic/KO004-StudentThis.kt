package info.mylabstudio.learnOOP

class StudentThis(val name: String) {
    fun sayHello(name: String) {
        println("Hello $name, my Name ${this.name} ")
    }
}

fun main() {
    val s = StudentThis("Edo")
    s.sayHello("Sasa")
}