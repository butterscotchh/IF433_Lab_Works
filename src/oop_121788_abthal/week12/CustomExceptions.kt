package oop_121788_abthal.week12

// Custom exception dengan membawa data tambahan
class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")

class BankAccount(var balance: Double) {
    fun withdraw(amount: Double) {
        if (amount < 0) {
            // Melemparkan exception bawaan Kotlin
            throw IllegalArgumentException("Amount must be positive")
        }

        if (amount > balance) {
            // Melemparkan custom exception yang kita buat di CP 3
            throw InsufficientFundsException(amount, balance)
        }

        balance -= amount
        println("Withdrawal successful. Remaining balance: $balance")
    }
}