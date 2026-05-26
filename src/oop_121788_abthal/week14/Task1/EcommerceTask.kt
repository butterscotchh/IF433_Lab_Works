package oop_121788_abthal.week14.Task1
import java.io.File

// --- REPOSITORY & NOTIFICATION (DARI CP 19) ---
interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository : OrderRepository {
    private val file = File("orders.csv")
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        file.bufferedWriter().use {
            file.appendText("$itemName,$finalPrice,$customerType\n")
        }
    }
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}


// ==========================================
// FIX OCP: STRATEGI PERHITUNGAN HARGA
// ==========================================
interface PricingStrategy {
    fun calculate(price: Double): Double
    fun getStrategyName(): String // Pendukung untuk pencatatan di CSV
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price
    override fun getStrategyName(): String = "REGULAR"
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price * 0.90
    override fun getStrategyName(): String = "VIP"
}


// ==========================================
// IMPLEMENTASI FINAL ORDER PROCESSOR (SOLID)
// ==========================================
class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    // Menerima interface PricingStrategy secara langsung, blok 'when' sukses dihapus!
    fun processOrder(itemName: String, basePrice: Double, pricingStrategy: PricingStrategy) {
        val finalPrice = pricingStrategy.calculate(basePrice)
        val typeName = pricingStrategy.getStrategyName()

        println("Memproses pesanan $itemName seharga $finalPrice")

        repo.saveOrder(itemName, finalPrice, typeName)
        notifier.sendNotification(itemName)
    }
}