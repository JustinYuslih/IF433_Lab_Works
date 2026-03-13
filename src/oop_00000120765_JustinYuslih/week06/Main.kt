package oop_00000120765_JustinYuslih.week06

fun processCheckout(method: PaymentMethod, amount: Double){
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    val smartLamp = SmartLamp("001", "Ruang Tamu")
    val smartSpeaker = SmartSpeaker("002", "Google Nest Dapur")
    val smartCCTV = SmartCCTV("003", "Ezviz Garasi")

    println("\n=== TESTING CHECKOUT ====")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)
}
