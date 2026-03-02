package oop_121788_abthal.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {

    // Wajib override karena bekerja() abstract
    override fun bekerja() {
        println("$nama sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    // Fungsi khusus milik Dosen
    fun mengajar() {
        println("$nama sedang mengajar mahasiswa di kelas.")
    }
}