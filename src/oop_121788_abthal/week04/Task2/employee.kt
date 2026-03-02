package oop_121788_abthal.week04.Task2

open class Employee(val name: String, val baseSalary: Int) {

    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        // Mengembalikan 10% dari baseSalary
        return (baseSalary * 0.1).toInt()
    }
}