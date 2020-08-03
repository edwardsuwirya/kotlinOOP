package info.mylabstudio.learnOOP

class Student(var name: String, private val age: Int)

fun Student.sayHello(name: String) {
//    Error karena age adalaha private
//    println("Hello $name, my name is ${this.name}, my age $age")
    println("Hello $name")
}

// Immutable
val Student.upperName: String
    get() = this.name.toUpperCase()

// Mutable
var Student.lowerName: String
    get() = this.name.toLowerCase()
    set(value) {
        this.name = value
    }

fun main() {
    val student = Student("Edo", 10)
    println(student.upperName)
    student.lowerName = "Sasa"
    println(student.lowerName)
}