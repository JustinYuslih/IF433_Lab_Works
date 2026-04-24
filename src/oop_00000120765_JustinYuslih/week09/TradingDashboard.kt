package oop_00000120765_JustinYuslih.week09

fun main(){
    val tradeHistory = listOf(
        TradeLog("BTC/USDT", "LONG", 10, 15.5, "CLOSED"),
        TradeLog("ETH/USDT", "SHORT", 20, -5.2, "OPEN"),
        TradeLog("SOL/USDT", "LONG", 5, 40.0, "CLOSED"),
        TradeLog("BNB/USDT", "SHORT", 15, 12.3, "CLOSED"),
        TradeLog("ADA/USDT", "LONG", 10, -2.0, "OPEN"),
        TradeLog("DOT/USDT", "SHORT", 25, 8.5, "CLOSED")
    )

    val closedTrade = tradeHistory.filter {it.status == "CLOSED"}
    val winningTrades = closedTrade.filter{it.roe > 0}
}