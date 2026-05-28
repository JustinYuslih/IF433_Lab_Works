package oop_00000120765_JustinYuslih.week13
import java.io.File

fun print(){
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisiasi sistem.\n")
    println("File berhasil dibuat dan ditulis.")
    file.appendText("Line 2: Menambahkan konfigurasi baru.\n")
    println("Text berhasil di-append")
    println("\n=== TEST READ TEXT ===")
    val fullContent = file.readText()
    println("Membaca sekaligus:\n$fullContent")

    println("=== TEST READ LINE ===")
    val lines = file.readLines()
    lines.forEachIndexed { index, string ->
        println("Isi index $index: $lines")
    }
}

