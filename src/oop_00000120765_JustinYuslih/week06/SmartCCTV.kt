package oop_00000120765_JustinYuslih.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable{
    override fun turnOn() {
        println("$name nyala")
        startRecord()
    }

    override fun turnOff() {
        println("$name mati")
    }

    override fun startRecord(){
        println("Memulai rekaman")
    }

    override fun stopRecord(){
        println("Mematikan rekaman")
    }
}