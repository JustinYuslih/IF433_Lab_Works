package oop_00000120765_JustinYuslih.week13
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord?{
    return try{
        val parts = line.split(",")
        return TradeRecord(parts[0].trim().toInt(), parts[1].trim(), parts[2].trim(), parts[3].trim().toDouble(), parts[4].trim().toDouble())
    }catch (e: Exception){
        println("(Log) Data korup diabaikan")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String){
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord>{
    return try{
        File(path).readLines().mapNotNull{fromCsvTrade(it)}
    }catch (e: FileNotFoundException){
        println("File tidak ditemukan")
        emptyList()
    }
}

fun main(){
    val trades = listOf(
        TradeRecord(1,"BTCUSD", "Long", 500.0, 10.0),
        TradeRecord(2,"LTCUSD", "Long", 200.0, 5.0),
        TradeRecord(3,"ETHUSD", "Short", 100.0, 4.0),
    )
    val save = saveTrades(trades, "crypto_trades.csv")
    File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")

    val loadedData = loadTrades("crypto_trades.csv")
    val sum = loadedData.sumOf{it.pnl}
    println("Sum: $sum")
    // Sudah di coba
}