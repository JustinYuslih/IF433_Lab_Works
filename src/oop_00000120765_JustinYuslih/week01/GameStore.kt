package oop_00000120765_JustinYuslih.week01

fun main(){
    val gameTitle : String = "GTA VI"
    val price : Int = 1000000

    val title = printReceipt(gameTitle = "GTA VI", price = 1000000)
}

fun calculateDiscount(price : Int): Int = if (price > 50000) price - 10000 else price - 5000

fun printReceipt(gameTitle : String, price : Int){
    val disc = calculateDiscount(price)

    println("--STRUK GAME--")
    println("Name :  $gameTitle")
    println("Price : $disc")
}