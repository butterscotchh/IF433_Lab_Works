package oop_121788_abthal.week04.Task2

fun main() {
    val manager = Manager("Budi", 8000000)
    val developer = Developer("Lusi", 7000000, "Kotlin")

    println("--- Data Manager ---")
    manager.work()
    println("Bonus: Rp ${manager.calculateBonus()}")

    println("\n--- Data Developer ---")
    developer.work()
    println("Bonus: Rp ${developer.calculateBonus()}")
}