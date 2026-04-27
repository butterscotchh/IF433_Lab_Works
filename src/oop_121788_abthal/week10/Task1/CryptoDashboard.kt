package oop_121788_abthal.week10.Task1

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 50000.0))
    coinRepo.add(Coin("ETH", 3000.0))
    coinRepo.add(Coin("USDT", 1.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println(response.status)
    response.data.forEach {
        println("Coin: ${it.name}, Balance: ${it.balance}")
    }

    val trxRepo = WalletRepository<Transaction>()
    trxRepo.add(Transaction("TX001", 100.0))
    trxRepo.add(Transaction("TX002", 250.0))
}