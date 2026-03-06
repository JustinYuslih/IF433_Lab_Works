package oop_00000120765_JustinYuslih.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama){
    override fun Bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS")
    }

    fun mengajar(){
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}