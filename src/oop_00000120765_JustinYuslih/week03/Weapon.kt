package oop_00000120765_JustinYuslih.week03

class Weapon (){
    var name: String = ""
        private set
    var damage: Int = 0
        set(value){
            if(value < 0){
                println("Damage tidak boleh negatif")
            }else if(value > 1000){
                println("Kamu terlalu jago anak muda")
                field = 1000
            }else {
                field = value
            }
        }
    var tier: String = ""
        get() = when{
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}