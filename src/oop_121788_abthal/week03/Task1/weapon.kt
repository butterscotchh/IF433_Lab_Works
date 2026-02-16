package oop_121788_abthal.week03.Task1

class Weapon(val name: String) {

    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("WARNING: Damage tidak boleh negatif!")
                // Jangan ubah field (biarkan nilai lama)
            } else if (value > 1000) {
                println("WARNING: Damage terlalu besar! Diset ke 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    // Computed Property (Custom Getter)
    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}
