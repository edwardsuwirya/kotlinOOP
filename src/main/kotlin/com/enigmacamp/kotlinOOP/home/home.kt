package com.enigmacamp.kotlinOOP.home

fun main() {
    val notes = """
     - Istilah yang harus dipahami dalam OOP, Object dan Class
     - Object adalah data yang berisi properties (fields/attributes) dan Functions
     - Number, Boolean, String, Semua data di kotlin adalah object
     - Class adalah blueprint, prototype untuk membuat Object
     - Deklarasi semua properties dan function yang dimiliki object
     - Setiap Object selalu dibuat dari Class
     - Class bisa membuat object tanpa batas 
      
      1. Class, create object, and simple constructor (KO001-Person.kt)
      2. Initializer Block, secondary constructor(KO002-PersonInitBlock.kt)
      3. Function in OOP (KO003-PersonBehaviour.kt)
      4. This (KO004-StudentThis.kt)
      5. Inheritance (KO005-Employee.kt)
      6. Super (KO006-ShapeSuper.kt, KO006-Customer.kt)
      7. Any Class (KO007-Hardware.kt)
      8. Abstract Class (KO008-Location.kt)
      9. Getter & Setter (KO009-Note.kt)
      10. Late Initialized Properties (KO010-Television.kt)
      11. Interface (KO011-HumanIntercation.kt)
      12. Visibility Modifier (KO012-Teacher.kt)
      13. Extension Function & Properties (KO013-StudentExtension.kt)
      14. Data Class (KO014-Product.kt)
      15. Sealed Class (KO015-Calculator.kt)
      16. Singleton Object (KO016-Utilities.kt)
      17. Companion Object (KO017-Family.kt)
      18. Type Alias (KO018-Phone.kt)
      19. Inline Class (KO019-Token.kt)
      20. Exception (KO020-ValidationException.kt) 
      21. Class Delegation (KO021-.kt)
    """.trimIndent()

    println("  Kotlin OOP Topics  ")
    println("=====================")
    println("$notes")
}