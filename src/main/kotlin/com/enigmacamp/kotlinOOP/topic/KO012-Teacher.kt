package info.mylabstudio.learnOOP

/*
 * ada 4 visibility modifier
 * - public => bisa diakses dari manapun
 * - private => hanya bisa diakses di tempat deklarasinya
 * - protected => bisa diakses di tempat deklarasi dan turunannya
 * - internal => bisa diakses di module/project yang sama
 *
 * Secara default, visibility modifier adalah public
 *
 */
open class Teacher(val name: String) {
    private fun teach() {
        println("Teach")
    }

    protected fun createCourse() {
        println("Create course daily")
    }
}

class JuniorTeacher(val name2: String) : Teacher(name2) {
    fun doDiscussCourseIdea() {
        super.createCourse()
    }

    fun simpleTeach() {
        // Error karena private
        // super.teach()
        println("Try to do simple teaching")
    }
}


fun main() {
    val teacher = Teacher("Edo")
    // Error karena protected
    // teacher.createCourse()
    // Error karena private
    // teacher.teach()
    val teacheJr = JuniorTeacher("Sasa")
    teacheJr.doDiscussCourseIdea()
    teacheJr.simpleTeach()
}