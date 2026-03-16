package oop_121788_abthal.week07.Task1

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("Drop chance dari ItemRarity.LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}")
    val starterWeapon = Weapon.forgeStarterSword()
    println("Detail Senjata: ${starterWeapon.item.name}, Damage: ${starterWeapon.item.damage}, Rarity: ${starterWeapon.item.rarity}")

    val upgradedItem = starterWeapon.item.copy(damage = 25)

    processEvent(SafeZone)
    processEvent(MonsterEncounter("Goblin Nakal"))
    processEvent(LootDropped(upgradedItem))
    processEvent(GameOver("Terkena jebakan racun"))
}