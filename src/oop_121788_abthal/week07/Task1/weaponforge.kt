package oop_121788_abthal.week07.Task1

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        fun forgeStarterSword(): Weapon {
            val starterStats = GameItem("Pedang Kayu Lapuk", 5, ItemRarity.COMMON)
            return Weapon(starterStats, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicStats = GameItem("Slayer of Gods", 150, ItemRarity.EPIC)
            return Weapon(epicStats, 200)
        }
    }
}