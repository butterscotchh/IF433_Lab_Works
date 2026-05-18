package oop_121788_abthal.week13.Task1

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {
    val parts = line.split(",")
    return TradeRecord(
        id = parts[0].toInt(),
        symbol = parts[1],
        type = parts[2],
        margin = parts[3].toDouble(),
        pnl = parts[4].toDouble()
    )
}