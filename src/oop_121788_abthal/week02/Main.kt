package oop_121788_abthal.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("- APLIKASI PMB UMNI -")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.nextLine()

    // Validasi panjang NIM
    if (nim.length != 5) {
        println("[ERROR] NIM harus 5 karakter!")
        println("Program dihentikan untuk mencegah data tidak konsisten.")
        scanner.close()
        return
    }

    // Menu pilihan jalur
    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine() // Consume newline

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        // Memanggil Primary Constructor
        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2) {
        // Memanggil Secondary Constructor, jurusan otomatis "Non-Matriculated"
        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }

    scanner.close()
}