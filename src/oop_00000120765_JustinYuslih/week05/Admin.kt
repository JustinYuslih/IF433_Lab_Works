package oop_00000120765_JustinYuslih.week05

class Admin(nama: String) : Pegawai(nama){
    override fun Bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani administrasi")
    }

    fun doAdminWork(){
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }
}
