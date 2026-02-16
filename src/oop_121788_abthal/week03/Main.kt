package oop_121788_abthal.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000 // Harusnya print Error
    e.salary = 5000000
    println("Gaji: ${e.salary}")


    e.increasePerformance()
    // e.performanceRating = 5 // Coba uncomment, pasti Merah (Error)

    println("Pajak yang harus dibayar: ${e.tax}")
}

