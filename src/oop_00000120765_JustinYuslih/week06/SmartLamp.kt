package oop_00000120765_JustinYuslih.week06

class SmartLamp(override val id: String, override val name: String): SmartDevice, Switchable{
    override fun turnOn() {
        println("$name nyala")
    }

    override fun turnOff() {
        println("$name lampu")
    }
}