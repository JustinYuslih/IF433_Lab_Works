package oop_00000120765_JustinYuslih.week13
import java.io.File

fun print(){
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisiasi sistem.\n")
    println("File berhasil dibuat dan ditulis.")
}