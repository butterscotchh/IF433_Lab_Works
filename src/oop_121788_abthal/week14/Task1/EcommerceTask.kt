package oop_121788_abthal.week14.Task1

import java.io.File

// ==========================================
// ABSTRAKSI & IMPLEMENTASI REPOSITORY (DIP)
// ==========================================
interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository : OrderRepository {
    private val file = File("orders.csv")

    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        // Menggunakan blok .use untuk safe resource handling (BufferedWriter otomatis di-close)
        file.bufferedWriter().use { writer ->
            file.appendText("$itemName,$finalPrice,$customerType\n")
        }
    }
}

// ==========================================
// ABSTRAKSI & IMPLEMENTASI NOTIFIKASI (DIP)
// ==========================================
interface NotificationService {
    fun sendNotification(itemName: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

// ==========================================
// CLASS UTAMA YANG SUDAH FIX SRP & DIP
// ==========================================
class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    // Sementara blok 'when' masih kaku karena OCP baru akan diperbaiki di CP 20
    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        // Memanggil lewat interface, bukan hardcoded lagi
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification(itemName)
    }
}