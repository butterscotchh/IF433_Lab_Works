package oop_121788_abthal.week06.Task

// Main.kt

fun main() {
    // Instansiasi Perangkat
    val lampu = SmartLamp("L01", "Ruang Tamu")
    val speaker = SmartSpeaker("S01", "Google Nest Dapur")
    val cctv = SmartCCTV("C01", "Ezviz Garasi")

    // Instansiasi Hub dan Tambah Perangkat
    val myHub = SmartHomeHub()
    myHub.addDevice(lampu)
    myHub.addDevice(speaker)
    myHub.addDevice(cctv)

    // Eksekusi Logika
    myHub.activateSecurityMode()
    myHub.turnOffAllSwitches()
}