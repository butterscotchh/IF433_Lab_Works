package oop_121788_abthal.week11

fun main() {
    println("=== TEST EXTENSION FUNCTIONS ===")
    // Testing basic extension functions
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    // Testing nullable receiver extension
    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")
}