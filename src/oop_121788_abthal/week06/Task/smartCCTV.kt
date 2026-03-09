package oop_121788_abthal.week06.Task

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("CCTV $name aktif.")
        startRecord() // Memanggil otomatis sesuai instruksi
    }

    override fun turnOff() {
        println("CCTV $name nonaktif.")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV $name mulai merekam...")
    }
}