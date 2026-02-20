package oop_00000120765_JustinYuslih.week03

fun main(){
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 500000

    e.increasePerformance()

    println("Pajak yang harus dibayar : ${e.tax}")
}