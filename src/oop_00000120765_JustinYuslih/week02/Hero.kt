package oop_00000120765_JustinYuslih.week02

class Hero(
    val name: String,
    var hp: Int = 100,
    val baseDamage: Int
)
{
    fun attack(targetName: String){
        println("$name sedang menenebas $targetName")
    }
    fun damage(damage: Int){
        hp -= damage
        if(hp <= 0){
            hp = 0
            println("Anda metong")
        }
    }

    fun isAlive(): Boolean = hp > 0
}
