package oop_121788_abthal.week11

data class User(var name: String = "", var age: Int = 0)

fun main() {
    println("=== TEST APPLY ===")
    val user = User().apply {
        name = "Alex" // Implicitly this.name
        age = 25      // Implicitly this.age
    }
    println(user)
}