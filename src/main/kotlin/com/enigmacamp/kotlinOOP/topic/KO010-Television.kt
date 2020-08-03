package info.mylabstudio.learnOOP

/*
 * Properties di kotlin wajib di inisialisasi di awal deklarasi
 * Dengan kata kunci lateinit, kita bisa membuat properties tanpa harus langsung mengisi datanya
 * lateinit hanya bisa digunakan di var
 *
 */
class Television {
    lateinit var brand: String

    fun initTelevision(brand: String) {
        this.brand = brand
    }
}

fun main() {
    val tv1 = Television()
    //Error karena fun initTelevision belum di call
//    println(tv1.brand)
    tv1.initTelevision("LG")
    println(tv1.brand)
}