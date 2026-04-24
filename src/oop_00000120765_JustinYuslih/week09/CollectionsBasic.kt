package oop_00000120765_JustinYuslih.week09

fun main(){
    println("=== TEST LIST ===")
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable list : $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 99
    println("Mutable List : $scores")
}