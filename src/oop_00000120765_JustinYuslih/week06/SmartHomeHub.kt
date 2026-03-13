package oop_00000120765_JustinYuslih.week06

class SmartHomeHub{
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice){
        devices.add(device)
        println("Menambahkan $device ke list")
    }

    fun turnOffAllSwitches(){
        for( device in devices){
            when(device){
                is Switchable -> device.turnOff()
            }
        }
    }

    fun activateSecurityModel(){
        for( device in devices){
            when(device){
                is Recordable -> device.startRecord()
                is SmartSpeaker -> device.playMusic("Sirine Peringatan")
            }
        }
    }
}