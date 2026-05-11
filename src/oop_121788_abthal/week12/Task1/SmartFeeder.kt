package oop_121788_abthal.week12.Task1

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("=== JADWAL MAKAN 1: EKSEKUSI TRY-CATCH ===")
    try {
        currentKibbleStock = dispenseKibble(80, currentKibbleStock, false)
    } catch (e: DispenserJamException) {
        println("Error: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Error: ${e.message}")
    } catch (e: Exception) {
        println("Terjadi kesalahan umum: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")

        println("\n-------------------------------------------\n")
        println("=== JADWAL MAKAN 2: EKSEKUSI RUNCATCHING ===")
        // Pemilik isi ulang stok jadi 1000
        currentKibbleStock = 1000
        runCatching {
            dispenseKibble(30, currentKibbleStock, false)
        }.onSuccess { newStock ->
            currentKibbleStock = newStock
            println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
        }.onFailure { error ->
        }
    }
}
