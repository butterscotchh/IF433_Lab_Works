package oop_121788_abthal.week05.Task2

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}