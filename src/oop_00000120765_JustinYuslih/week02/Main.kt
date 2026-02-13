package oop_00000120765_JustinYuslih.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System. `in`)

    println("--- PROGRAM WEEK 2 ---")

    println("Opsi (1. Daftar Mahasiswa Baru, 2. Pinjam Buku)")
    val pick = scanner.nextInt()
    scanner.nextLine()

    if(pick == 1){
        println("Masukkan nama: ")
        val name = scanner.nextLine()

        println("Masukkan NIM (Wajib 5 karakter): ")
        val nim = scanner.next()

        scanner.nextLine()

        if(nim.length != 5){
            println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
        }else{
            println("Masukkan jurusan: ")
            val major = scanner.nextLine()

            val s1 = Student(name,nim,major)
            println("Status: Pendaftaran Selesai")
        }

        print("Pilih jalur (1. Regulasi, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine()

        if (type == 1){
            print("Masukkan jurusan: ")
            val major = scanner.nextLine()

            val s1 = Student(name,nim,major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
        }else if(type == 2){
            val s2 = Student(name,nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
        }else{
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }else if (pick == 2){
        println("Masukkan Judul : ")
        var bookTitle = scanner.nextLine()

        println("Masukkan Nama Peminjam")
        var borrower = scanner.nextLine()

        println("Masukkan Durasi Pinjam (Contoh input : 5)")
        var loanDuration = scanner.nextInt()

        if(loanDuration < 0){
            println("ERROR : Durasi gabisa mines, otomatis menjadi 1")
            loanDuration = 1
        }

        val b1 = Loan(bookTitle,borrower,loanDuration)
        println("Nama buku yang dipinjam : ${b1.bookTitle}")
        println("Nama peminjam : ${b1.borrower}")
        println("Durasi peminjaman : ${b1.loanDuration}")
        println("Total denda : ${b1.calculateFine()}")
    }
}