package info.mylabstudio.learnOOP

/*
 * Terlalu banyak class akan mengkonsumsi memory yang banyak juga
 * inline class hanya bisa dengan 1 properties saja
 */
inline class Token(val value: String) {
    fun toUpper(): String = value.toUpperCase()
}

fun main() {
    val login = Token("123")
    println(login.toUpper())
}