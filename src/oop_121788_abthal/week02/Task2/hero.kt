package oop_121788_abthal.week02.Task2

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100 // Default argument hp = 100
) {
    // Menampilkan simulasi serangan
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    // Mengurangi HP dengan validasi minimal 0
    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) {
            hp = 0 // Paksa menjadi 0 jika minus
        }
    }

    // Mengecek apakah hero masih hidup
    fun isAlive(): Boolean {
        return hp > 0
    }
}