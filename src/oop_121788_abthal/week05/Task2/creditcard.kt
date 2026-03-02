package oop_121788_abthal.week05.Task2

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("CreditCard ($accountName): Transaksi berhasil. Terpakai: $usedAmount")
        } else {
            println("CreditCard ($accountName): Transaksi ditolak, melebihi limit.")
        }
    }
}