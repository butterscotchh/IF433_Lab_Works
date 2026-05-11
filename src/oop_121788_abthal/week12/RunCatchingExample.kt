package oop_121788_abthal.week12

fun main() {
    println("=== TEST RUNCATCHING ===")

    // Alih-alih try-catch, kita gunakan runCatching yang mengembalikan objek Result
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

    // Anda bisa mengecek statusnya nanti (success/failure)
    println("Result is success: ${result.isSuccess}")

    // Pattern: getOrElse (memberikan nilai default jika gagal)
    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safeValue")

    // Pattern: recover (mengubah kegagalan menjadi sukses dengan nilai baru)
    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered Value: $recovered")

    runCatching {
        "100".toInt()
    }.onSuccess { v ->
        println("Berhasil dikonversi: $v")
    }.onFailure { e ->
        println("Gagal konversi: ${e.message}")
    }
}