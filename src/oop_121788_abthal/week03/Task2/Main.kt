package oop_121788_abthal.week03.Task2

fun main() {

    val player = Player("Rikako")

    // Coba akses langsung (harus error jika di-uncomment)
    // player.xp = 100  // ERROR (karena private)

    println("Level awal: ${player.level}")

    player.addXp(50)   // Masih level 1
    println("Level sekarang: ${player.level}")

    player.addXp(60)   // Total 110 -> Harus Level Up ke 2
    println("Level sekarang: ${player.level}")
}
