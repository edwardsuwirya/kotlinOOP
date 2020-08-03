package info.mylabstudio.learnOOP

open class Customer(val name: String, val balance: Long) {
    fun registration() {
        println("Register $name with beginning balance $balance")
    }
}

class PremiumCustomer : Customer {
    constructor(name: String) : super(name, 0)
    constructor(firstName: String, lastName: String) : super("$firstName $lastName", 1000)
}

class SpecialCustomer(val customerName: String, val customerBalance: Long) : Customer(customerName, customerBalance)

class DiamondCustomer(val diamondName: String, val diamondBalance: Long) :
    Customer(diamondName, diamondBalance) {
    constructor(diamondFullName: String) : this(diamondFullName, 1000L)
}

/*
 * Kalau membuat primary constructor (class PremiumCustomer()),
 * berarti secondary constructor harus panggil primary constructor
 */
class ExecutiveCustomer(
    val firstName: String,
    val lastName: String, balance: Long
) :
    Customer("$firstName $lastName", balance) {
    constructor(fullName: String) : this(fullName, "", 0)
}

fun main() {
    val premium = PremiumCustomer("Edo")
    premium.registration()

    val special = SpecialCustomer("Edo", 100L)
    special.registration()

    val diamond = DiamondCustomer("Edo")
    diamond.registration()

    val executive = ExecutiveCustomer("Edo", "Sasa", 0)
    executive.registration()

}