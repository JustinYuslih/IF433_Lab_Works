package oop_00000120765_JustinYuslih.week06

interface PaymentMethod{
    fun pay(amount: Double)
}

class Gopay: PaymentMethod{
    override fun pay(amount: Double){
        println("Processing Rp$amount via gopay server")
    }
}

class CreditCard: PaymentMethod{
    override fun pay(amount: Double){
        println("Contacting bank for Rp$amount")
    }
}