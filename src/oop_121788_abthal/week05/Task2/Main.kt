package oop_121788_abthal.week05.Task2

fun main() {

    val ewallet = EWallet("Riko", 50000.0)
    val creditCard = CreditCard("Riko", 100000.0)

    val paymentList: List<PaymentMethod> = listOf(ewallet, creditCard)

    println("=== PROSES PEMBAYARAN 75000 ===")

    for (payment in paymentList) {

        payment.processPayment(75000.0)

        // SMART CASTING
        if (payment is EWallet) {
            println("Terdeteksi EWallet → melakukan top up...")
            payment.topUp(50000.0)
            payment.processPayment(75000.0)
        }

        println("----------------------")
    }
}