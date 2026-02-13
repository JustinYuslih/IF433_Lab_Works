package oop_00000120765_JustinYuslih.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System. `in`)

    println("--- PROGRAM WEEK 2 ---")

    println("Opsi (1. Daftar Mahasiswa Baru, 2. Pinjam Buku, 3. Main Game)")
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
    }else if (pick == 3){
        println("Masukkan Nama Hero : ")
        var heroName = scanner.nextLine()

        println("Masukkan Base Damage : ")
        var baseDamage = scanner.nextInt()

        var enemyHp = 100

        var g1 = Hero(heroName, 100 , baseDamage)
        while(g1.isAlive() && enemyHp > 0){
            println("\nHP Kamu: ${g1.hp} | HP Musuh: $enemyHp")
            println("Menu (1. Serang, 2. Kabur)")
            var opsi = scanner.nextInt()
            scanner.nextLine()

            if(opsi == 1){
                g1.attack("Louis")
                enemyHp -= g1.baseDamage

                if(enemyHp > 0){
                    val randomDmg = (10..20).random()
                    g1.damage(randomDmg)
                    println("Musuh membalas! Kamu kena $randomDmg damage.")
                }
            }else if(opsi == 2){
                println("Atut aku kabur ah")
                break
            }

        }
        println("Game Over")
        if(enemyHp <= 0) println("SELAMAT KAMU MENANG!")
        else if (!g1.isAlive()) println("KALAH! $heroName jadi almarhum.")
    }
}