package oop_121788_abthal.week02

class Student(
    val name: String,
    val nim: String,
    var major: String = "Non-Matriculated",
    var gpa: Double = 0.0
) {
    // Secondary constructor untuk jalur umum
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated", 0.0) {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }

    init {
        println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        println("Status: Pendaftaran Selesai.")
    }
}