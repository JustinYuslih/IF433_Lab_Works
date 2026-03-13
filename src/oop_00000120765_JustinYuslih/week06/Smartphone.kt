package oop_00000120765_JustinYuslih.week06

class Smartphone : camera, Phone{
    override fun turnOn(){
        super<camera>.turnOn()
        super<phone>.turnOn()
        println("Sistem operasi smartphone berhasil booting.")
    }
}