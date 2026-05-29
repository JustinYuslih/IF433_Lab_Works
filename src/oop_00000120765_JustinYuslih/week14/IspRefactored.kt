package oop_00000120765_JustinYuslih.week14

interface Printable{
    fun print(doc: String)
}

interface Scannable{
    fun scan(doc: String)
}

class ModernSimplifier : Printable{
    override fun print(doc: String) = println("Printing securely: $doc")
}