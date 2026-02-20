package oop_00000120765_JustinYuslih.week03

class Player(var username: String) {
    private var xp: Int = 0

    val level: Int
        get() = (xp/100) + 1

    fun addXp(amount: Int){
        if(amount < 0){
            println("Amount tidak boleh negatif")
        }
        xp += amount
        if(level == 1){
            println("Kamu masih level $level")
        }else {
            println("Selamat $username kamu naik ke level $level")
        }
    }
}