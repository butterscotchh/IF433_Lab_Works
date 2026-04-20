package oop_121788_abthal.week09.Task1

fun main() {
    // Inisialisasi Data Uji (Minimal 6 TradeLog)
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, 25.0, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 50, 42.3, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 10, -12.5, "CLOSED"),
        TradeLog("BNBUSDT", "LONG", 20, 8.0, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }
}