package oop_00000120765_JustinYuslih.week09

fun main(){
    println("=== TEST LAMBDA ===")
    val sumLambda = {a: Int, b: Int -> a+b}
    println("Hasil sum: ${sumLambda(5,10)}")

    val squareImplicit: (Int) -> Int = {it * it}
    println("Hasil square = ${squareImplicit(4)}")
}