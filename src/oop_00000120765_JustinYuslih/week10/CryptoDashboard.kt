package oop_00000120765_JustinYuslih.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 65000.0))
    coinRepo.add(Coin("ETH", 3000.0))
    coinRepo.add(Coin("USDT", 1.0))
}