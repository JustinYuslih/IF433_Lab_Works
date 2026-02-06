package oop_00000120765_JustinYuslih.week01

fun main(){
    val gameTitle : String? = "GTA VI"
    val price : Int = 40000

    val title = printReceipt(gameTitle = gameTitle, price = price)
}

fun calculateDiscount(price : Int): Int = if (price > 50000) price - 10000 else price - 5000

fun printReceipt(gameTitle : String?, price : Int){
    val disc = calculateDiscount(price)

    var nameGame : String? = gameTitle

    if (nameGame == null){
        nameGame = "Tidak ada"
    }
    println("--STRUK GAME--")
    println("Name :  $nameGame")
    println("Price : $disc")
}