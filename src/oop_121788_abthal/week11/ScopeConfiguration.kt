package oop_121788_abthal.week11

data class User(var name: String = "", var age: Int = 0)

fun main() {
    println("=== TEST APPLY ===")
    val user = User().apply {
        name = "Alex" // Implicitly this.name
        age = 25      // Implicitly this.age
    }
    println(user)

    println("\n=== TEST ALSO ===")
    val numbers = mutableListOf(1, 2, 3)
    numbers.also {
        println("Log Sebelum ditambah: $it") // 'it' refers to the list
    }.add(4) // because 'also' returns the list, we can call .add() immediately
    println("Setelah ditambah: $numbers")

    println("\n=== TEST WITH ===")
    with(user) {
        // Access properties directly without 'user.'
        println("User Detail -> Nama: $name, Umur: $age")
    }

    val newUser = User("Budi", 20).apply {
        age = 21 // Changing property using 'this' context
    }.also {
        println("User baru berhasil dibuat: $it") // Logging using 'it' context
    }
}