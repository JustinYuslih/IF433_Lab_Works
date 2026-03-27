package oop_00000120765_JustinYuslih.week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame(){
        if(isGameRunning){
            println("Game sudah berjalan!")
        }else{
            isGameRunning = true
            println("Memulai Game Engine...")
        }
    }
}