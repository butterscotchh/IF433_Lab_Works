package oop_121788_abthal.week02

class Student(
    val name: String,
    val nim: String,
    var major: String
) {

    init {
        // Validasi sederhana: cek panjang NIM
        if (nim.length != 5) {
            println("[WARNING] Objek tercipta dengan NIM ($nim) yang tidak valid")
            println("Data mahasiswa masih mungkin akan bermasalah di sistem.")
        } else {
            println("[LOG] Objek Student berhasil dialokasikan di memory.")
        }
    }
}