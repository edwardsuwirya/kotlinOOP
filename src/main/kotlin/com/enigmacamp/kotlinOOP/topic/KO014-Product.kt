package info.mylabstudio.learnOOP

/*
 * Class yang khusus digunakan untuk representasi dari data (model)
 * Secara otomatis method2 yang digunakan untuk data diwariskan
 * Deklarasi properties nya harus di primary constructor
 *
 */
data class Product(val productName: String, val price: Int, val category: String) {
}

fun main() {
    val product = Product("Indomie", 5_000, "Food")
    println(product)

    val product2 = product.copy(productName = "Mie Sedap")
    println(product2)
}