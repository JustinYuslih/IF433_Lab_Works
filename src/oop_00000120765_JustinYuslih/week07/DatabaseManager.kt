package oop_00000120765_JustinYuslih.week07

object DatabaseManager{
    var connectionStatus: String = "Disconnected"

    fun connect(){
        connectionStatus = "Connected to server"
        println("Database is ready.")
    }
}