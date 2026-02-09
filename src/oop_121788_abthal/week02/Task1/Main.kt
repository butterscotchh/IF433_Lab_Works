package oop_121788_abthal.week02.Task1

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    // 1. Minta input dari user
    print("Masukkan Judul Buku: ")
    val title = reader.nextLine()

    print("Masukkan Nama Peminjam: ")
    val name = reader.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = reader.nextInt()

    // Membersihkan buffer newline
    reader.nextLine()

    // 2. Validasi: Jika minus, ubah menjadi 1
    if (duration < 0) {
        duration = 1
    }

    // 3. Buat objek Loan
    val loanEntry = Loan(title, name, duration)

    // Tampilkan detail dan total denda
    println("\n--- Detail Peminjaman ---")
    println("Judul Buku    : ${loanEntry.bookTitle}")
    println("Peminjam      : ${loanEntry.borrower}")
    println("Lama Pinjam   : ${loanEntry.loanDuration} hari")
    println("Total Denda   : Rp ${loanEntry.calculateFine()}")

    reader.close()
}