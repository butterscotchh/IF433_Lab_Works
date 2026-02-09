package oop_121788_abthal.week02

class Student(
    val name: String,
    val nim: String,
    var major: String = "Undeclared"
) {

    init {
        if (nim.length != 5) {
            println("[WARNING] Objek tercipta dengan NIM ($nim) yang tidak valid")
        } else {
            println("[LOG] Objek Student berhasil dialokasikan di memory.")
        }
    }
}