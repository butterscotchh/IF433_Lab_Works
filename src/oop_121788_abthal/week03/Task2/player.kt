package oop_121788_abthal.week03.Task2

class Player(val username: String) {

    // XP tidak boleh diakses langsung dari luar
    private var xp: Int = 0

    // Computed Property (Level dihitung dari XP)
    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {

        if (amount <= 0) {
            println("XP harus bernilai positif!")
            return
        }

        val oldLevel = level
        xp += amount
        val newLevel = level

        if (newLevel > oldLevel) {
            println("Level Up! Selamat $username naik ke level $newLevel")
        }
    }
}
