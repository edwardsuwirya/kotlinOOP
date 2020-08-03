package info.mylabstudio.learnOOP

class Phone {}

typealias telephone = Phone

typealias GetPhone = () -> String

fun main() {
    val phone1 = telephone()
    println(phone1)
    checkPhone { "123" }
}

fun checkPhone(phone: GetPhone) {
    println(phone())
}