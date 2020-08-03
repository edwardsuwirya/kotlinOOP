package info.mylabstudio.learnOOP

/*
 * Sebenarnya di kotlin, tidak perlu membuat getter-setter, sudah otomatis
 *
 */
class Note(title: String) {
    //Kalau pake var, bisa get dan set, kalau val hanya bisa get
    var title: String = title
        //field adalah kata kunci, dalam hal ini isinya adalah title
        get() = field.toUpperCase()
        //value juga kata kunci
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }
        }
}

fun main() {
    val note = Note("Catatanku")
    note.title = ""
    println(note.title)
}