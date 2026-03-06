package oop_00000120765_JustinYuslih.week05

fun main(){
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")
    val math = MathHelper()
    val eWallet = EWallet("Justin", 50000.0)
    val creditCard = CreditCard("Justin", 100000.0)

    val daftarPayment: List<PaymentMethod> = listOf(eWallet, creditCard)

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    val luas1 = math.hitungLuas(50)
    println("Luas Pertama : ${luas1}")
    val luas2 = math.hitungLuas(50,60)
    println("Luas Kedua : ${luas2}")
    val luas3 = math.hitungLuas(5.5)
    println("Luas Ketiga : ${luas3}")

    println("=== AKTIVITAS PAYMENT ===")
    for(payment in daftarPayment){
        payment.processPayment(75000.0)
        when(payment){
            is EWallet -> {
                payment.topUp(50000.0)
                payment.processPayment(75000.0)
            }
        }
    }

    println("=== AKTIVITAS PEGAWAI ===")
    for(pegawai in daftarPegawai){
        pegawai.Bekerja()
        when(pegawai){
            is Dosen ->{
                println("Terdeteksi sebagai Dosen (NIDN : ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin ->{
                println("Terdeteksi sebagai admin")
                pegawai.doAdminWork()
            }
        }
        println("---------------------")
    }
}