package oop_00000120765_JustinYuslih.week07

class NetworkClient private constructor(val url: String) {
    fun connect(){
        println("Connecting to $url...")
    }
}