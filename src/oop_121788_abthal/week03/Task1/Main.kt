package oop_121788_abthal.week03.Task1

fun main() {

    val weapon = Weapon("Excalibur")

    // Test 1: Damage negatif (harus gagal)
    weapon.damage = -50
    println("Damage sekarang: ${weapon.damage}")

    // Test 2: Damage terlalu besar (harus jadi 1000)
    weapon.damage = 9999
    println("Damage sekarang: ${weapon.damage}")

    // Print Tier
    println("Tier senjata: ${weapon.tier}")
}
