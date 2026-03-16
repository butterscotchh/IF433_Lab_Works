package oop_121788_abthal.week07.Task1

enum class ItemRarity(val dropChance: Int) {
    COMMON(70),
    UNCOMMON(50),
    RARE(30),
    EPIC(10),
    LEGENDARY(1)
}

data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan! Mencegah instansiasi ganda.")
        } else {
            isGameRunning = true
            println("Memulai Game Engine...")
        }
    }
}