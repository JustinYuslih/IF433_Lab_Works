package oop_00000120765_JustinYuslih.week04

open class Vehicle(val brand: String) {
    var speed: Int = 0 2 Usages
    // Method juga bersifat final secara default. Gunakan 'open' agar bisa di-override.
    open fun accelerate() {
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }
    open fun honk() {
        println("Beep beep!")
    }
}