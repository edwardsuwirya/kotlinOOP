package info.mylabstudio.learnOOP

import java.lang.NullPointerException

class ValidationException(message: String) : Throwable(message)


fun validateAndSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
    try {
        validateAndSayHello("Edo")
        validateAndSayHello("")
    } catch (error: ValidationException) {
        println("Error : ${error.message}")
    } catch (error: NullPointerException) {
        println("Error : ${error.message}")
    } catch (error: Throwable) {
        println("General Error : ${error.message}")
    } finally {
        println("Done")
    }
}