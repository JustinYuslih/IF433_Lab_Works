package oop_00000120765_JustinYuslih.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 65000.0))
    coinRepo.add(Coin("ETH", 3000.0))
    coinRepo.add(Coin("USDT", 1.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("${response.status}")
    response.data.forEach {
        println("Nama Koin: ${it.name}")
        println("Harga: ${it.balance}")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("001", 5000.0))
    txRepo.add(Transaction("002", 100000.0))
    txRepo.add(Transaction("003", 200000.0))

    val response2 = ApiResponse("200 OK", txRepo.getAll())
    println("${response2.status}")
    response2.data.forEach {
        println("Transaction ID: ${it.id}")
        println("Amount: ${it.amount}")
    }
}