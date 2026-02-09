package oop_121788_abthal.week01

fun main() {
    val gameTitle = "SteamKW Deluxe Edition"
    val price = 550_000

    val discount = calculateDiscount(price)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) price * 20 / 100
    else price * 10 / 100
