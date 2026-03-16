package oop_121788_abthal.week07.Task1

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> {
            println("Hati-hati! Muncul monster ${event.monsterName} di depanmu!")
        }
        is LootDropped -> {
            // Menggunakan Smart Cast untuk mengakses properti GameItem
            println("Selamat! Kamu mendapatkan item: ${event.item.name} [Rarity: ${event.item.rarity}]")
        }
        is GameOver -> {
            println("Permainan Berakhir: ${event.reason}")
        }
        is SafeZone -> {
            println("Kamu memasuki wilayah aman. Silakan beristirahat.")
        }
    }
}