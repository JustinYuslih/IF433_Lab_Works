package oop_00000120765_JustinYuslih.week05

class EWallet(accountName: String, var balance: Double): PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if(balance >= amount){
            balance -= amount
            println("Success")
        }else{
            println("Gagal")
        }
    }

    fun topUp(amount: Double){
        balance += amount
    }
}