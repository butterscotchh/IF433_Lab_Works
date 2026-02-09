package oop_121788_abthal.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== INPUT DATA MAHASISWA ===")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (5 karakter): ")
    val nim = scanner.nextLine()

    // Validasi panjang NIM
    if (nim.length != 5) {
        println("[ERROR] NIM harus 5 karakter!")
        println("Program dihentikan untuk mencegah data tidak konsisten.")
        scanner.close()
        return
    }

    // Menu pilihan jalur
    println("\nPilih Jalur Pendaftaran:")
    println("1. Reguler (Dengan Jurusan)")
    println("2. Umum (Tanpa Jurusan)")
    print("Pilihan (1/2): ")

    val type = scanner.nextInt()
    scanner.nextLine() // Consume newline

    when (type) {
        1 -> {
            // Jalur Reguler: menggunakan primary constructor
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()
            val student = Student(name, nim, major)
            println("Terdaftar di: ${student.major} dengan GPA awal ${student.gpa}")
        }
        2 -> {
            // Jalur Umum: menggunakan secondary constructor
            val student = Student(name, nim)
            println("Terdaftar di: ${student.major} dengan GPA awal ${student.gpa}")
        }
        else -> {
            println("Pilihan tidak valid! Pendaftaran dibatalkan.")
        }
    }

    scanner.close()
}