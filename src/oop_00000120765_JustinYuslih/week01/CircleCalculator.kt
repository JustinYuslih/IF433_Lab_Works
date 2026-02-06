package oop_00000120765_JustinYuslih.week01

fun main(args: Array<String>) {
    // Variable definition
    val radius: Double = 7.0
    val pi: Double = 3.14
    // Calculation
    val area = pi * radius * radius

    // Output Concatenation
    println("Radius: $radius, Area: $area")
    // Logic check
    println(checkSize(area))
}
fun checkSize(area: Double): String = if (area > 100) "This is a Big Circle" else "This is a Small Circle"
