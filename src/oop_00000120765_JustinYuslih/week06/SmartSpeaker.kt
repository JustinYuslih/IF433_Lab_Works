package oop_00000120765_JustinYuslih.week06

class SmartSpeaker(override val id: String, override val name: String): SmartDevice, Switchable{
    override fun turnOn() {
        println("$name nyala")
    }

    override fun turnOff() {
        println("$name mati")
    }

    fun playMusic(song: String){
        println("Memutar lagu $song dari spotify")
    }
}