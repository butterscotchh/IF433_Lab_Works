package oop_121788_abthal.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== INPUT DATA MAHASISWA ===")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (5 karakter): ")
    val nim = scanner.nextLine()

    print("Masukkan Jurusan: ")
    val major = scanner.nextLine()

    // Validasi input NIM
    if (nim.length != 5) {
        println("[ERROR] NIM harus 5 karakter!")
        println("Program dihentikan untuk mencegah data tidak konsisten.")
    } else {
        // Buat object Student
        val student = Student(name, nim, major)
        println("Student berhasil dibuat: ${student.name}")
    }

    scanner.close()
}
