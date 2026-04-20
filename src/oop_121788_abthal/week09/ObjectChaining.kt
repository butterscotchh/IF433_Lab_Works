package oop_121788_abthal.week09

data class Student(val name: String, val gpa: Double)

fun main() {
    val students = listOf(
        Student("Andi", 3.2),
        Student("Budi", 3.9),
        Student("Citra", 2.8),
        Student("Dewi", 3.7)
    )

    // Kode ini akan menjadi dasar untuk operasi chaining di langkah berikutnya
    println("Daftar Mahasiswa: $students")
    println("\n=== HONOR STUDENTS PIPELINE ===")

    // Kita butuh NAMA mahasiswa yang GPA-nya >= 3.5, dan diurutkan abjad
    val honorNames = students
        .filter { it.gpa >= 3.5 }             // 1. Buang yang GPA < 3.5
        .sortedBy { it.name }                 // 2. Urutkan berdasarkan nama
        .map { it.name.uppercase() }          // 3. Ambil namanya saja & jadikan kapital

    honorNames.forEach { println("Honor Roll: $it") }
}