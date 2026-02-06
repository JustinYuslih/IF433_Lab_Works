package oop_00000120765_JustinYuslih.week01

fun main(){
    val radius: Double = 7.0
    val pi: Double = 3.14

    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")

    println(checkSize(area))
}

fun checkSize(area: Double): String = if (area > 100) "This is a Big Circle" else "This is a Small Circle"
