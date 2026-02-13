package oop_00000120765_JustinYuslih.week02

class Hero(
    val name: String,
    val hp: Int = 100,
    val baseDamage: Int
)
{
    fun attack(targetName: String){
        println("$name sedang menenebas $targetName")
    }
    fun damage(damage: Int){
        hp = hp - damage
        if(hp < 0){
            println("Anda metong")
            hp = 0
        }
    }

    fun isAlive(): Boolean{
        if(hp > 0){
            return 1
        }
    }
}
