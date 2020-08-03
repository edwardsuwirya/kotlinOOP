package info.mylabstudio.learnOOP

/*
 * Initializer block adalah kode yang akan dieksekusi ketika constructor dipanggil
 */
class PersonInitBlock(firstName: String, middleName: String?, lastName: String) {

    // init akan dieksekusi ketika constructor dipanggil
    // println("Error ini, tidak bisa... class bukan seperti function yang bisa sesukanya")
    init {
        println("Object ${firstName} ${middleName} ${lastName} dibuat")
    }

    //Secondary constructor
    constructor(firstNameParam: String, lastNameParam: String) : this(firstNameParam, "", lastNameParam) {
        println("Secondary")
    }

    constructor(lastNameParam: String) : this("", "", lastNameParam) {
        println("Secondary 2")
    }
}

class PersonWithoutPrimaryConstructor {
    var firstName: String = ""
    var lastName: String = ""

    constructor(fName: String, lName: String) {
        if (fName.isBlank()) {
            firstName = "Mr/Mrs/Ms."
        } else {
            firstName = fName
        }

        lastName = lName
    }

    constructor(lName: String) : this("", lName) {

    }
}

class AutomaticPropertiesConstructor(val name: String) {

}

fun main() {
    val personInitBlock = PersonInitBlock("Edo", "", "Sasa")
    val person2 = PersonInitBlock("Edo", "Edo2")
    val person3 = PersonInitBlock("Sasa")

    val person4 = PersonWithoutPrimaryConstructor("Sasa")
    println("2nd Constructor without primary")
    println("${person4.firstName} ${person4.lastName}")

    val person5 = AutomaticPropertiesConstructor("Sasa")
    println(person5.name)
}