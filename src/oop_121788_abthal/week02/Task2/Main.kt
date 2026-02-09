package oop_121788_abthal.week02.Task2

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    // 1. Inisialisasi Hero & Musuh
    print("Masukkan Nama Hero: ")
    val heroName = reader.nextLine()
    print("Masukkan Base Damage: ")
    val damage = reader.nextInt()

    val myHero = Hero(heroName, damage)
    var enemyHp = 100 // Variabel bantuan untuk musuh

    println("\n--- PERTANDINGAN DIMULAI ---")

    // 3. Game Loop: Berjalan selama keduanya hidup
    while (myHero.isAlive() && enemyHp > 0) {
        println("\nHP ${myHero.name}: ${myHero.hp} | HP Musuh: $enemyHp")
        println("Menu: 1. Serang, 2. Kabur")
        print("Pilih aksi: ")

        when (reader.nextInt()) {
            1 -> {
                // Hero menyerang
                myHero.attack("Musuh")
                enemyHp -= myHero.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("HP Musuh tersisa: $enemyHp")

                // Musuh membalas jika belum mati
                if (enemyHp > 0) {
                    val monsterDamage = (10..20).random()
                    println("Musuh menyerang balik sebesar $monsterDamage damage!")
                    myHero.takeDamage(monsterDamage)
                }
            }
            2 -> {
                println("Kamu memilih kabur dari pertarungan!")
                break // Paksa loop berhenti
            }
            else -> println("Pilihan tidak valid!")
        }
    }

    // 4. Pengumuman Pemenang
    println("\n--- HASIL AKHIR ---")
    if (enemyHp <= 0) {
        println("Selamat! ${myHero.name} menang!")
    } else if (!myHero.isAlive()) {
        println("Yah... ${myHero.name} telah gugur.")
    } else {
        println("Pertarungan berakhir karena kamu kabur.")
    }
}