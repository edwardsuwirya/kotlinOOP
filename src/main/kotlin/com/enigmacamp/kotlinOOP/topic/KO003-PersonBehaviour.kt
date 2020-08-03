package info.mylabstudio.learnOOP

class PersonBehaviour(var name: String = "") {
    fun run() {
        println("Run")
    }

    fun getMyName(): String {
        return "$name"
    }

    //Function overloading
    //Nama function sama tapi harus berbeda parameter
    fun getMyName(title: String): String {
        return "$title $name"
    }
}

fun main() {
    val p = PersonBehaviour("Edo")
    p.run()
    println(p.getMyName())
    println(p.getMyName("Mr"))
}