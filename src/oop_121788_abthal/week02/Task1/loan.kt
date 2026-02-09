package oop_121788_abthal.week02.Task1

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1 // Default argument 1 hari
) {

    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}