package oop_121788_abthal.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}") // 'this' refers to "Kotlin"
        length * 2 // Returns the result of this calculation
    }
    println("Hasil kalkulasi run: $result")

    // Execute the block only if the object is not null
    val length = name?.let {
        println("Nama terdeteksi: $it") // 'it' refers to 'name'
        it.length // Returns the value of the last expression
    }

    println("Panjang nama: $length")
}