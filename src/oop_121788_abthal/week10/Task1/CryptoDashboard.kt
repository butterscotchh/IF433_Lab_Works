package oop_121788_abthal.week10.Task1

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 50000.0))
    coinRepo.add(Coin("ETH", 3000.0))
    coinRepo.add(Coin("USDT", 1.0))
}